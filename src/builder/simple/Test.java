package builder.simple;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

public class Test {

	@org.junit.Test
	public void gros_repas() throws Exception {
		Menu menu = new Menu();
		menu.setEntree("salade");
		menu.setPlat("Filet rossini");
		menu.setDessert("crème brûlée");
		assertEquals("Menu [entree=salade, plat=Filet rossini, dessert=crème brûlée, fromage=false, cafe=false, vin=false]", menu.toString());
	}
	
	@org.junit.Test
	public void mariage_complet() throws Exception {
        Set<String> invites = new HashSet<String>();
        invites.add("moi");
        invites.add("elle");
        invites.add("lui");
        invites.add("l'autre");
        Lieu lieu = new Lieu();
        lieu.setNom("maison");
        lieu.setAdresse("par là");
        Menu menuMariage = new Menu();
        menuMariage.setEntree("entree surprise");
        menuMariage.setPlat("plat suprise");
        menuMariage.setFromage(true);
        menuMariage.setDessert("dessert surprise");
        menuMariage.setVin(true);
        Mariage mariage = new Mariage();
        mariage.setInvites(invites);
        mariage.setLieu(lieu);
        mariage.setMenu(menuMariage);
        
        assertEquals("Mariage [" +
        			 "menu=Menu [entree=entree surprise, plat=plat suprise, dessert=dessert surprise, fromage=true, cafe=false, vin=true], " +
        			 "invites=[moi, lui, l'autre, elle], " +
        			 "lieu=Lieu [nom=maison, adresse=par là]]", mariage.toString());
		
	}


}
