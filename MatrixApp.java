import java.util.Scanner;
public class MatrixApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Matrix matA = new Matrix ();
		Matrix matB = new Matrix ();

		final int SIZE = 4;
		int x, y, a,b;
		int number1, number2;
		System.out.println ("THIS IS A 4x4 MATRIX APPLICATION");
		for (x = 0; x < SIZE; x++){
			System.out.println ("\nFirst Matrix\nRow [" + (x+1) + "]");
			for (y=0; y<SIZE; y++){
				System.out.print ("Enter a value for " + "[" + x + "]" + "["+y+"] :");
				number1 = sc.nextInt();
				
				matA.setCell (x, y, number1);
				
		}
	}

		for (a = 0; a < SIZE; a++){
			System.out.println ("\nSecond Matrix [2]\nRow [" + (a+1) + "]");
			for (b=0; b<SIZE; b++){				
				System.out.print ("Enter a value for " + "[" + a + "]" + "["+b+"] :");
				number2 = sc.nextInt();
				
				matB.setCell (a, b, number2);			
		}
	}
		Matrix sum = new Matrix ();

		System.out.println ("\n======  Result  ======");
		sum.addMatrices (matA, matB);
		sum.displayMatrix();
		
		for (int q = 0; q < SIZE; q++){
			System.out.println ("FIRST MATRIX");
			for (int r=0; r<SIZE; r++){				
					System.out.print (number1);
							
		}
	}

	}
}