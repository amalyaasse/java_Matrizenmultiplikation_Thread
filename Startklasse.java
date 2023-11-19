package MatrizenRechner;


public class Startklasse {

	public static void main(String[] args) {
		int  matriz_1[][]= {{1,-2,4},{-2,3,-5}};
		int matriz_2[][] = {{2,4},{3,6},{1,2}};
		
		MatrizenRechner m1 = new MatrizenRechner(matriz_1,matriz_2,2,3);
		MatrizenRechner m2 = new MatrizenRechner(matriz_1,matriz_2,2,3);
		MatrizenRechner m3 = new MatrizenRechner(matriz_1,matriz_2,2,3);
		
		m1.start();
		m2.start();
		m3.start();
		
		
		
		

	}

	

}
