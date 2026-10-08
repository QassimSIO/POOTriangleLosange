package modele;

public class Carre implements Formes {
	
	private float cote;
	
	public Carre(float cote) {
		this.cote=cote;
	}
	
	public float getCote() {
		return this.cote;
	}
	
	@Override
	public float surface() {
		return this.cote*this.cote;
	}
	
	@Override
	public float perimetre() {
		return this.cote*4;
	}
	
	

}
