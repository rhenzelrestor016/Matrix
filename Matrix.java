class Matrix {
	private int SIZE= 4;
	private int  [][] squares = new  int [SIZE][SIZE];

	public int getCell (int x,  int y) {
		return this.squares [x][y];

	}

	public void setCell (int x, int y, int value) {
			squares [x][y] = value;
	}

	public void addMatrices (Matrix a, Matrix b) {
		int x,y;

		for (x = 0; x < SIZE; x++){
			for (y=0; y<SIZE; y++){
				squares [x][y] = a.getCell(x,y) + b.getCell(x,y);
			}
		}
	}


	public void displayMatrix () {
		int x, y;
		for (x = 0; x < SIZE; x++){
			for (y=0; y<SIZE; y++){
				System.out.print (this.getCell(x,y) + "\t");
			}
			System.out.println();
		}
	}
}