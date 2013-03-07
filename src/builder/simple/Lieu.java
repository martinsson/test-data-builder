package builder.simple;

public class Lieu {
	private String nom;

	private String adresse;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Lieu [nom=" + nom + ", adresse=" + adresse + "]";
	}

	protected static Builder aLa(String nomDuLieu) {
		Builder builder = new Builder();
		builder.nom(nomDuLieu);
		return builder;
	}

	public static class Builder {
		private String nom;
		private String adresse;

		public Builder nom(String nom) {
			this.nom = nom;
			return this;
		}

		public Builder situe(String adresse) {
			this.adresse = adresse;
			return this;
		}

		public Lieu build() {
			Lieu lieu = new Lieu();
			lieu.nom = nom;
			lieu.adresse = adresse;
			return lieu;
		}
	}
}
