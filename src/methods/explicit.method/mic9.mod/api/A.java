package api;
import  mic9bench.annotation.Critical;

public class A {

    @Critical(path="A.explicitMethod()", type=Critical.ViolationType.CONFIDENTIALITY)
	public static Integer explicitMethod(){

		return new Integer(2);
	}

	
}
