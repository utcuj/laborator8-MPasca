import java.awt.Color;

public class Test {
	public static void main(String [] args) throws CloneNotSupportedException {
		Masina masina1 = new Masina("Volkswagen", Color.GRAY);
		Student student1 = new Student("Maria", "Pasca", masina1);
		
		System.out.println(student1.toString());
		
		Student student2 = (Student) student1.clone();
		
		System.out.println(student2.toString());
		
		student2.getMasina().setMarca("Ford");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());

	}
}
