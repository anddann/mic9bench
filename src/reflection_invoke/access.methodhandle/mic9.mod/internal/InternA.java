package internal;

import mic9bench.annotation.Critical;

public class InternA  {

	private static byte[] key = new byte[]{1,2,3,4,5,6};; 


	@Critical(path = "MethodHandle", type=Critical.ViolationType.CONFIDENTIALITY)
	public static byte[] getKey(){
		return key;
	}
	    

	

}