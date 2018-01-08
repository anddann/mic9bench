package internal;

import mic9bench.annotation.Critical;

public class Intern  {


	@Critical(path = "A.getMethodHandleInstance().methodHandle.invoke()", type=Critical.ViolationType.CONFIDENTIALITY)
	public static void internalMethod(){
		System.out.println("Internal Method");
	}
	    

	

}