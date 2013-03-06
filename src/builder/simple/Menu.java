package builder.simple;

public class Menu {
    private String entree;
    private String plat;
    private String dessert;
    private boolean fromage;
    private boolean cafe;
    private boolean vin;
    
    
	
	public String getEntree() {
		return entree;
	}
	public String getPlat() {
		return plat;
	}
	public String getDessert() {
		return dessert;
	}
	public boolean isFromage() {
		return fromage;
	}
	public boolean isCafe() {
		return cafe;
	}
	public boolean isVin() {
		return vin;
	}
	
	public static MenuBuilder createMenu() {
		return new MenuBuilder(new Menu());
	}
	
	public static MenuBuilder createMenu(Menu menu) {
		return new MenuBuilder(menu);
	}
	
	




	public static class MenuBuilder {
		
		private Menu menu;
		
		public MenuBuilder() {
			this.menu = new Menu();
		}

		public MenuBuilder(Menu menu) {
			super();
			this.menu = menu;
		}


		public MenuBuilder setEntree(String entree) {
			menu.entree = entree;
	        return this;
	    }


	    public MenuBuilder setPlat(String plat) {
	    	menu.plat = plat;
	        return this;
	    }


	    public MenuBuilder setFromage(boolean fromage) {
	    	menu.fromage = fromage;
	        return this;
	    }


	    public MenuBuilder setDessert(String dessert) {
	    	menu.dessert = dessert;
	        return this;
	    }

	    public MenuBuilder setCafe(boolean cafe) {
	    	menu.cafe = cafe;
	        return this;
	    }


	    public MenuBuilder setVin(boolean vin) {
	    	menu.vin = vin;
	        return this;
	    }
		
		public Menu preparerMenu() {
			return menu;
		}
		
	}

    
}
