public class Cavalier extends Piece {
	
	public Cavalier(int couleur, boolean estPrise, int abscisse, int ordonnee){
		super(couleur, estPrise, abscisse, ordonnee);
	}
	
	public void deplacer(int x , int y){/* throws DeplacementInvalideException {
		if((	x != 2 && y != 1) || (x != 2 && y != -1) || (x != 1 && y !=2) || (x != 1 && y != -2) || 
				(x != -2 && y != 1) || (x != -2 && y !=-1) || (x != -1 && y != 2) || (x != -1 && y != -2)){
			throw new DeplacementInvalideException();
		}
		else{*/
			this.abscisse += x;
			this.ordonnee += y;
		//}
	}

}
