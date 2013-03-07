package builder.simple;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import builder.simple.Lieu.Builder;

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

	public static class Builder {
		private builder.simple.Menu.Builder menu;
		private Set<String> invites = new HashSet<String>();
		private builder.simple.Lieu.Builder lieu;

		public Builder ouLOnMange(builder.simple.Menu.Builder menu) {
			this.menu = menu;
			return this;
		}

		public Builder invites(Set<String> invites) {
			this.invites = invites;
			return this;
		}

		public Builder lieu(Lieu.Builder lieu) {
			this.lieu = lieu;
			return this;
		}

		public Mariage preparer() {
			return new Mariage(this);
		}

		public Builder avec(String...invites) {
			this.invites.addAll(asList(invites));
			return this;
		}
	}

	private Mariage(Builder builder) {
		this.menu = builder.menu.commander();
		this.invites = builder.invites;
		this.lieu = builder.lieu.build();
	}

	public Mariage() {
	}

	public static Builder unMariage() {
		return new Builder();
		
	}
}
