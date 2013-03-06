package builder.simple;

import java.util.Set;

public class Mariage {
    private Menu menu;
    private Set<String> invites;
    private Lieu lieu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Set<String> getInvites() {
        return invites;
    }

    public void setInvites(Set<String> invites) {
        this.invites = invites;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

	@Override
	public String toString() {
		return "Mariage [menu=" + menu + ", invites=" + invites + ", lieu="
				+ lieu + "]";
	}


}
