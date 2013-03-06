package builder.inheritance;

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

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public boolean isFromage() {
        return fromage;
    }

    public void setFromage(boolean fromage) {
        this.fromage = fromage;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    public boolean isVin() {
        return vin;
    }

    public void setVin(boolean vin) {
        this.vin = vin;
    }

}
