public class Fou extends Piece{
	
	public Fou(int couleur, boolean estPrise, int abscisse, int ordonnee){
		super(couleur, estPrise, abscisse, ordonnee);
	}
	
	public void deplacer(int x, int y) throws DeplacementInvalideException{
		if(Math.abs(x) != Math.abs(y))
			throw new DeplacementInvalideException();
		else{
			this.abscisse += x;
			this.ordonnee += y;
		}
	}

}
