public class Pion extends Piece {
	
	public Pion(int couleur, boolean estPrise, int abscisse, int ordonnee){
		super(couleur, estPrise, abscisse, ordonnee);
	}
	
	public void deplacer(int x, int y) //throws DeplacementInvalideException
	{
		//if(x > 0 && )
		
		this.abscisse += x;
		this.ordonnee += y;
	}

}
