package api;
import  mic9bench.annotation.Critical;



public class Array1 {


    @Critical(path="Array1.allocArray", type=Critical.ViolationType.BOTH)
	public byte[][] arrayField;


	public String stringField="text";

	public Array1(){

	}


   public void allocArray(String parameter){
    	this.arrayField =  new byte[6][6];
    	byte[] array = new byte[] {1,2,3,4,5,6};
    	this.arrayField[3]  = array;
	}

}
