
public class Student implements Cloneable{
	String nume;
	String prenume;
	Masina masina;
	
	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}
	
	public Student(String nume, String prenume) {
		this.nume = nume;
		this.prenume = prenume;
	}
	
	protected Object clone() throws CloneNotSupportedException {
	    Student cloned = (Student) super.clone();
	    cloned.setMasina((Masina)cloned.getMasina().clone());   
	    return cloned;
	}
    
    public String toString() {
    	return nume + " " + prenume + ": " + masina.toString();
    }

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMasina() {
		return masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}
    
    
}
