package lab8;

public class Test {
	public static void main(String [] args) {
		Fractie a = new Fractie(1.6);
		Complex z = new Complex(15, 7);
		Fractie b = new Fractie(2.4);
		
		System.out.println(a.add(z));
		System.out.println(a.sub(z));
		System.out.println(a.add(b));
		System.out.println(z.add(z));
		System.out.println(z.sub(b));

		Numeric [][] elem = new Numeric[3][3];
		Numeric [][] num = new Numeric[3][3];
		for(int i = 0; i < elem.length; i++) {
			for(int j = 0; j < elem.length; j++) {
				elem[i][j] = new Complex(2, 2);
				num[i][j] = new Fractie(1.5);
			}
		}
		
		Matrice matrice1 = new Matrice(elem);
		Matrice matrice2 = new Matrice(num);
		
		matrice1.add(matrice2);
		matrice1.printMatrix();
	}
}
