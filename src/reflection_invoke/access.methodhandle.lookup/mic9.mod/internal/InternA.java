package internal;

import mic9bench.annotation.Critical;

public class InternA  {

	@Critical( path ="MethodHandle.Lookup", type= Critical.ViolationType.BOTH)
	protected static byte[] key; 

	public InternA(){
		//this is the secret key
		key = new byte[]{1,2,3,4,5,6};
	}



	

}