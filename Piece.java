public class Piece {
	protected int couleur;
	protected boolean estPrise;
	protected int abscisse;
	protected int ordonnee;

	public Piece(int couleur, boolean estPrise, int abscisse, int ordonnee){
		this.couleur =couleur;
		this.estPrise = estPrise;
		this.abscisse =abscisse;
		this.ordonnee = ordonnee;
	}
	
	public boolean getEtat(Piece p){
		return this.estPrise;
	}
	
	public void prendre(Piece p){
		this.estPrise = false;
	}
}
