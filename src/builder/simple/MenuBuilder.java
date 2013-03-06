package builder.simple;

public class MenuBuilder {
	private Menu menu;

	


    public MenuBuilder(Menu menu) {
		super();
		this.menu = menu;
	}


	public MenuBuilder() {
    	menu = new Menu();
	}


	public MenuBuilder setEntree(String entree) {
		menu.setEntree(entree);
        return this;
    }


    public MenuBuilder setPlat(String plat) {
    	menu.setPlat(plat);
        return this;
    }


    public MenuBuilder setFromage(boolean fromage) {
    	menu.setFromage(fromage);
        return this;
    }


    public MenuBuilder setDessert(String dessert) {
    	menu.setDessert(dessert);
        return this;
    }

    public MenuBuilder setCafe(boolean cafe) {
    	menu.setCafe(cafe);
        return this;
    }


    public MenuBuilder setVin(boolean vin) {
        menu.setVin(vin);
        return this;
    }
	
	public Menu preparerMenu() {
		return menu;
		
	}
	
	
	

}
