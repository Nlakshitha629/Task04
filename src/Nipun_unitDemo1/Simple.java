package Nipun_unitDemo1;


public class Simple {
	
	// create two variables
	public float ab = 25;
	private float cd = 17;
	
	
	public Simple() {
		
	}
	
	// create constructor
	public Simple(float ab, float cd) {
	    this.ab = ab;
	    this.cd = cd;
	  }

	  public void squareAB(){
	    this.ab = this.ab++;
	  }

	  private void squareCD(){
		  this.cd = this.cd++;
	  }

	  public float getAB() {
	    return ab;
	  }

	  private void setAB(float ab) {
	    this.ab = ab;
	  }

	  public float getCD() {
	    return cd;
	  }

	  public void setCD(float cd) {
	    this.cd = cd;
	  }
	  
	  public String toString() {
	    return String.format("(ab:%f, cd:%f)", ab, cd);
	  }

	}

	
	


 