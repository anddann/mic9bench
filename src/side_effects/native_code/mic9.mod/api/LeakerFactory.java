package api;

import mic9bench.annotation.Critical;

public class LeakerFactory {

	public static native int passToNativeCode( Object obj );
	
  	@Critical( path ="passToNativeCode", type= Critical.ViolationType.BOTH)
	private static byte[] key = new byte[]{1,2,3,4,5,6};; 

	

	public static void passKeyToJNI(){
		LeakerFactory.passToNativeCode(LeakerFactory.key);
	}

}
