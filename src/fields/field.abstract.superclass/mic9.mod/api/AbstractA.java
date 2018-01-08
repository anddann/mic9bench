package api;




public abstract class AbstractA {


	protected byte[] protectedField = new byte[]{0,0,0,0,0,};

  	public abstract Object getInternBField();

 	public Object getProtectedField(){
    	return this.protectedField;
    }
}
