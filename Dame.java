public class Dame extends Piece {
	
	public Dame(int couleur, boolean estPrise, int abscisse, int ordonnee){
		super(couleur, estPrise, abscisse, ordonnee);
	}
	
	public void deplacer(int x, int y) throws DeplacementInvalideException{
		if((x > 0 && y > 0) || (Math.abs(x) != Math.abs(y)))
			throw new DeplacementInvalideException();
		else{
			this.abscisse = x;
			this.ordonnee = y;
		}
		
	}

}
