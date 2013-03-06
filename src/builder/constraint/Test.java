package builder.constraint;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        menu1.setEntree("salade");
        menu1.setPlat("poisson");

        Menu menu11 = new Menu();
        menu11.setEntree("salade");
        menu11.setPlat("poisson");
        menu11.setCafe(true);

        Menu menu12 = new Menu();
        menu12.setEntree("salade");
        menu12.setPlat("poisson");
        menu12.setVin(true);

        Menu menu13 = new Menu();
        menu13.setEntree("salade");
        menu13.setPlat("poisson");
        menu13.setCafe(true);
        menu13.setVin(true);

        Menu menu2 = new Menu();
        menu2.setPlat("viande");
        menu2.setFromage(true);
        menu2.setCafe(true);

        Menu menuInterdit = new Menu();
        menuInterdit.setFromage(true);
        menuInterdit.setDessert("fruits");
        menu2.setCafe(true);
    }

}
