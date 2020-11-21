import java.awt.Color;

public class Masina implements Cloneable{
	String marca;
	Color colour;
	
	public Masina(String marca, Color colour) {
		this.marca = marca;
		this.colour = colour;
	}
	
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
	
	public String toString() {
		return marca + " " + colour.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Color getColour() {
		return colour;
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	
}
