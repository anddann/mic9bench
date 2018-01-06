package api;

public class LeakException extends RuntimeException{

	public Object o;

	public LeakException(Object o){
		this.o = o;
	}


}