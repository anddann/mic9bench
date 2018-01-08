package api;
import mic9bench.annotation.Critical;


public class A {

    @Critical(path="A.privatePrimitiveField", type=Critical.ViolationType.BOTH)
 	public int privatePrimitiveField = 1;
	
}
