import java.util.Arrays;

public class Test {
	public static void main(String [] args) {
		Persoana p1 = new Persoana("Rus", "Simona", 19);
		Persoana p2 = new Persoana("Pasca", "Maria", 20);
		Persoana p3 = new Persoana("John", "Doe", 23);
		Persoana p4 = new Persoana("Presley", "Elvis", 75);
		
		Persoana [] persoane = new Persoana[] {p1, p2, p3, p4};
		
		for(int i = 0; i < persoane.length; i++) {
			System.out.println(persoane[i].toString());
		}
		
		Arrays.sort(persoane);
		System.out.println("Vectorul de persoane sortat: ");
		
		for(int i = 0; i < persoane.length; i++) {
			System.out.println(persoane[i].toString());
		}
	}
}
