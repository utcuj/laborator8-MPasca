package lab8;

public class Matrice {
	Numeric [][] elemente = new Numeric[10][10];
	
	public Matrice(Numeric [][] x) {
		this.elemente = x;
	}
	
	public void add(Matrice matrice) {
		for(int i = 0; i < matrice.elemente[0].length; i++) {
			for(int j = 0; j < matrice.elemente[0].length; j++) {
				this.elemente[i][j].add(matrice.getElemente(i, j));
			}
		}
	}

	public Numeric getElemente(int i, int j) {
		return elemente[i][j];
	}

	public void setElemente(Numeric[][] elemente) {
		this.elemente = elemente;
	}
	
	public void printMatrix() {
		for(int i = 0; i < elemente[0].length; i++) {
			for(int j = 0; j < elemente[0].length; j++) {
				System.out.print(this.elemente[i][j] + " ");
			}
			System.out.println();
		}
	}
}
