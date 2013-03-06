package builder.simple;

import java.util.HashSet;
import java.util.Set;

import builder.simple.Menu.MenuBuilder;

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
	
	public static MariageBuilder createMariage() {
		return new MariageBuilder();
	}

	public static class MariageBuilder {

		private Mariage mariage;
		
		
		
		public MariageBuilder() {
			this.mariage = new Mariage();
		}

		public MariageBuilder chez(String chez) {
			if(mariage.getLieu() == null) {
				mariage.setLieu(new Lieu());
			}
			mariage.getLieu().setNom(chez);
			return this;
		}

		public MariageBuilder au(String au) {
			if(mariage.getLieu() == null) {
				mariage.setLieu(new Lieu());
			}
			mariage.getLieu().setAdresse(au);
			return this;
		}

		public MariageBuilder avecMenu(Menu menu) {
			mariage.setMenu(menu);
			return this;
		}

		public MariageBuilder avec(String avec) {
			if(mariage.getInvites() == null) {
				mariage.setInvites(new HashSet<String>());
			}
			mariage.getInvites().add(avec);
			return this;
		}


		
		public Mariage preparerMariage() {
			return mariage;
		}
	    
	}
}
