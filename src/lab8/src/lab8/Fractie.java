package lab8;

public class Fractie implements Numeric{
	private double num;
	
	public Fractie(double num) {
		this.num = num;
	}
	
	public Fractie() {
		
	}
	@Override
	public Numeric add(Numeric x) {
		// TODO Auto-generated method stub
		if(x instanceof Fractie) {
			this.num += ((Fractie)x).num;
			return this;
		}
		else {
			Complex result = new Complex();
			result.setReal(this.num + ((Complex)x).getReal());
			result.setIm(((Complex)x).getIm());
			return result;
		}
	}

	@Override
	public Numeric sub(Numeric x) {
		if(x instanceof Fractie) {
			this.num -= ((Fractie)x).num;
			return this;
		}else {
			Complex result = new Complex();
			result.setReal(this.num - ((Complex)x).getReal());
			result.setIm(((Complex)x).getIm());
			return result;
		}
	}
	
	public String toString() {
		return num + " ";
	}
	
	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}
}
