package builder.simple;

import static builder.simple.Mariage.unMariage;
import static builder.simple.Menu.unMenuAvec;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

import builder.simple.Menu.Builder;


public class Test {

	@org.junit.Test
	public void gros_repas() throws Exception {
		Menu menu = unMenuAvec()
					.entree("salade")
					.plat("Filet rossini")
					.dessert("crème brûlée")
					.commander();
		
		assertEquals("Menu [entree=salade, plat=Filet rossini, dessert=crème brûlée, fromage=false, cafe=false, vin=false]", menu.toString());
	}
	
	@org.junit.Test
	public void petit_repas_gourmand() throws Exception {
		Menu menu = unMenuAvec()
					.entree("salade")
					.plat("Filet rossini")
					.dessert("crème brûlée")
					.vin()
					.fromage()
					.commander();
		
		assertEquals("Menu [entree=salade, plat=Filet rossini, dessert=crème brûlée, fromage=true, cafe=false, vin=true]", menu.toString());
	}


	@org.junit.Test
	public void mariage_complet() throws Exception {
		Mariage mariage = unMariage()
							.avec("moi")
							.avec("elle")
							.avec("lui")
							.avec("l'autre")
							.lieu(aLa("maison")
								  .situe("par là"))
							.menu(unMenuAvec()
									.entree("entree surprise")
									.plat("plat suprise")
									.dessert("dessert surprise")
									.fromage()
									.vin())
							.preparer();

        assertEquals("Mariage [" +
        		"menu=Menu [entree=entree surprise, plat=plat suprise, dessert=dessert surprise, fromage=true, cafe=false, vin=true], " +
        		"invites=[moi, lui, l'autre, elle], " +
        		"lieu=Lieu [nom=maison, adresse=par là]]", mariage.toString());
		
	}

	protected builder.simple.Lieu.Builder aLa(String nomDuLieu) {
		Lieu.Builder builder = new Lieu.Builder();
		builder.nom(nomDuLieu);
		return builder;
	}

	@org.junit.Test @Ignore //TODO faire passer le test
	public void reutiliser_un_builder() throws Exception {
		Builder menuDeBase = unMenuAvec()
							 .entree("salade")
							 .plat("Filet rossini");
		
		Menu menuAvecDessert = menuDeBase.dessert("mousse au chocolat").commander();
		Menu menuAvecCafe    = menuDeBase.cafe().commander();
		
		assertEquals("Menu [entree=salade, plat=Filet rossini, dessert=mousse au chocolat, fromage=false, cafe=false, vin=false]", menuAvecDessert.toString());
		assertEquals("Menu [entree=salade, plat=Filet rossini, dessert=null, fromage=false, cafe=true, vin=false]", menuAvecCafe.toString());
	}
	

}
