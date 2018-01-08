package internal;

import mic9bench.annotation.Critical;

public class Intern  {

	@Critical( path ="A.lookup", type= Critical.ViolationType.BOTH)
	protected static byte[] privateStaticField = new byte[]{1,2,3,4,5,6};; 


}