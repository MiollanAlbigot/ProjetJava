public abstract class Piece{
	protected int couleur;
	protected boolean estPrise;
	protected int abscisse;
	protected int ordonnee;
	
	public Piece(){
		this.couleur = 0;
		this.estPrise = false;
		this.abscisse = 0;
		this.ordonnee = 0;
	}

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
	
	public abstract void deplacer(int x, int y);
}
