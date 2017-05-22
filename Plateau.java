public class Plateau {
	
	private Piece plateau[][] = new Piece[8][8];
	
	public Plateau(){
		this.plateau = new Piece[8][8];
	}

	public void init (){
		for(int x =1 ; x<2; x++){
			for(int y = 0; y<8; y++){
				plateau[x][y] = new Pion(0,false,x,y);
			}
		}
		for(int x =6 ; x<7; x++){
			for(int y = 0; y<8; y++){
				plateau[x][y] = new Pion(1,false,x,y);
			}
		}
		plateau[0][0] = new Tour(0, false,0,0);
		plateau[0][7] = new Tour(0,false,0,7);
		plateau[7][0] = new Tour(1,false,7,0);
		plateau[7][7] = new Tour(1,false,7,7);
		
		plateau[0][1] = new Cavalier(0,false,0,1);
		plateau[0][6] = new Cavalier(0,false,0,6);
		plateau[7][1] = new Cavalier(1,false,7,1);
		plateau[7][6] = new Cavalier(1,false,7,6);
		
		plateau[0][2] = new Fou(0,false,0,2);
		plateau[0][5] = new Fou(0,false,0,5);
		plateau[7][2] = new Fou(1,false,7,2);
		plateau[7][5] = new Fou(1,false,7,5);
		
		plateau[0][4]= new Dame(0,false,0,4);
		plateau[7][4]= new Dame(1,false,7,4);
		
		plateau[0][3] = new Roi(0,false,0,3);
		plateau[7][3] = new Roi(1,false,7,3);

		
	}
	
	public void affiche(){
		for(int x = 0 ; x < 8 ; x++){
			System.out.println("");
			for(int y = 0 ; y < 8 ; y++){
				System.out.print( "|| "+plateau[x][y]+" ||");
			}
		}
	}
}
