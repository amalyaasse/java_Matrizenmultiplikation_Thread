//Eine Matrize soll mit einer anderen 
//Matrize multipliziert werden. Beide Matrizen sind gleich groß.

//Die Multiplikation soll über Threads auf mehrere Schultern 
//verteilt werden und somit schneller durchgeführt werden. 

package MatrizenRechner;



public class MatrizenRechner extends Thread {

	private int matriz_1[][] ;
	private int matriz_2[][] ;
	private int resault[][];
	private int row_1;
	private int col_2;
	

	public MatrizenRechner(int[][] matriz_1, int[][] matriz_2,  int row_1, int col_2) {
		super();
		this.matriz_1 = matriz_1;
		this.matriz_2 = matriz_2;
		
		this.row_1 = row_1;
		this.col_2 = col_2;
	}


	public void run() {
		for(int i=1; i<=row_1; i++) {
			for(int j=1; j<=col_2; j++) {
				
		resault[i][j]= matriz_1[i][j]*matriz_2[j][i];
		
			}}
		
	}

	
	
	

	

}
