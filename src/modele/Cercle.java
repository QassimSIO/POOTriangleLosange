package modele;

public class Cercle implements Formes {

	private float rayon;
	
	public Cercle(float rayon) {
		this.rayon=rayon;
	}
	
	public float getRayon() {
		return this.rayon;
	}
	
	@Override
	public float surface() {
		return (float)(Math.PI*this.rayon*this.rayon);
	}
	
	@Override
	public float perimetre() {
		return (float)(2*Math.PI*this.rayon);
	}
}

