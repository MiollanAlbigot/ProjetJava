public class Echiquier {
	
	private Piece echiquier[][] = new Piece[8][8];
	
	public Echiquier(){
		this.echiquier = new Piece[8][8];
	}

	public void init (){
		for(int x =1 ; x<2; x++){
			for(int y = 0; y<8; y++){
				echiquier[x][y] = new Pion(0,false,x,y);
			}
		}
		for(int x =6 ; x<7; x++){
			for(int y = 0; y<8; y++){
				echiquier[x][y] = new Pion(1,false,x,y);
			}
		}
		echiquier[0][0] = new Tour(0, false,0,0);
		echiquier[0][7] = new Tour(0,false,0,7);
		echiquier[7][0] = new Tour(1,false,7,0);
		echiquier[7][7] = new Tour(1,false,7,7);
		
		echiquier[0][1] = new Cavalier(0,false,0,1);
		echiquier[0][6] = new Cavalier(0,false,0,6);
		echiquier[7][1] = new Cavalier(1,false,7,1);
		echiquier[7][6] = new Cavalier(1,false,7,6);
		
		echiquier[0][2] = new Fou(0,false,0,2);
		echiquier[0][5] = new Fou(0,false,0,5);
		echiquier[7][2] = new Fou(1,false,7,2);
		echiquier[7][5] = new Fou(1,false,7,5);
		
		echiquier[0][4]= new Dame(0,false,0,4);
		echiquier[7][4]= new Dame(1,false,7,4);
		
		echiquier[0][3] = new Roi(0,false,0,3);
		echiquier[7][3] = new Roi(1,false,7,3);

		
	}
	
	public void affiche(){
		for(int x = 0 ; x < 8 ; x++){
			System.out.println("");
			for(int y = 0 ; y < 8 ; y++){
				System.out.print( "|| "+echiquier[x][y]+" ||");
			}
		}
	}
}
