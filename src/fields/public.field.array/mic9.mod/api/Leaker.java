package api;
import  mic9bench.annotation.Critical;



public class Leaker {


    @Critical(path="Leaker.testArray", type=Critical.ViolationType.BOTH)
	public byte[][] testArray;


	public String text="hi";

	public Leaker(){
		this("");

	}


	public Leaker(String text){
		this.text = text;
	}



   public void leak(String parameter){
    	this.testArray =  new byte[6][6];
    	byte[] array = new byte[] {1,2,3,4,5,6};
    	this.testArray[3]  = array;
	}

}
