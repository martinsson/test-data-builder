test-data-builder
=================

A kata for training test data builders

The goal is to transform the current test code into something like

  @org.junit.Test
	public void gros_repas() throws Exception {
		Menu menu = new MenuBuilder()
					.entree("salade")
					.plat("Filet rossini")
					.dessert("crème brûlée")
					.commander();
		
		assertEquals("Menu [entree=salade, plat=Filet rossini, dessert=crème brûlée, fromage=false, cafe=false, vin=false]", menu.toString());
	}

Then introduce static factory methods to hide the technical "new MenuBuilder",
also handle variations in the menu.
	
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

Eventually build a nested object. Note tha that we're passing LieuBuilder and MenuBuilder NOT a Lieu and Menu object to the MariageBuilder (http://nat.truemesh.com/archives/000726.html)

	@org.junit.Test
	public void mariage_complet() throws Exception {
		Mariage mariage = unMariage()
							.avec("moi", "elle", "lui", "l'autre")
							.lieu(aLa("maison")
								  .situe("par là"))
							.ouLOnMange(unMenuAvec()
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

Builders are stateful so we cannot use them for two variations, unless we introduce a copying method (http://nat.truemesh.com/archives/000724.html)

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
	
