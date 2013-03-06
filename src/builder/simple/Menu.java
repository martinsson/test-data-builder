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
	public void setEntree(String entree) {
		this.entree = entree;
	}
	public void setPlat(String plat) {
		this.plat = plat;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	public void setFromage(boolean fromage) {
		this.fromage = fromage;
	}
	public void setCafe(boolean cafe) {
		this.cafe = cafe;
	}
	public void setVin(boolean vin) {
		this.vin = vin;
	}
	@Override
	public String toString() {
		return "Menu [entree=" + entree + ", plat=" + plat + ", dessert="
				+ dessert + ", fromage=" + fromage + ", cafe=" + cafe
				+ ", vin=" + vin + "]";
	}
	
    
}
