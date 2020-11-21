package lab8;

public class Complex implements Numeric{
	private double real;
	private double im;
	
	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}
	
	public Complex() {
		
	}
	
	@Override
	public Numeric add(Numeric x) {
		// TODO Auto-generated method stub
		if(x instanceof Complex) {
			this.real += ((Complex)x).real;
			this.im += ((Complex)x).im;
		}else {
			this.real += ((Fractie)x).getNum();
		}
		return this;
	}

	@Override
	public Numeric sub(Numeric x) {
		if(x instanceof Complex) {
			this.real -= ((Complex)x).real;
			this.im -= ((Complex)x).im;
		}else {
			this.real -= ((Fractie)x).getNum();
		}
		return this;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public String toString() {
		if(this.im > 0) {
			return this.real + " + " + this.im + "i";
		}else if(this.im < 0) {
			return this.real + " " + this.im + "i";
		}else {
			return this.real + "";
		}
	}
}
