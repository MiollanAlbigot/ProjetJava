public class Roi extends Piece {

	public Roi(int couleur, boolean estPrise, int abscisse, int ordonnee){
		super(couleur, estPrise, abscisse, ordonnee);
	}
	
	public void deplacer(int x, int y) throws DeplacementInvalideException{
		if(Math.abs(x) > 1 && Math.abs(y) > 1)
			throw new DeplacementInvalideException();
		else{
			this.abscisse = x;
			this.ordonnee = y;
		}
	}
}
