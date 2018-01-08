package internal;

import mic9bench.annotation.Critical;

public class InternB  {

	@Critical(path="AbstractA.getInternBField()", type=Critical.ViolationType.CONFIDENTIALITY)
	protected byte[] field; 


	public InternB(){
		field = new byte[]{1,2,3,4,5,6};
	}


}