package api;

import mic9bench.annotation.Critical;

public class A {

	public static native int passToNativeCode( Object obj );
	
  	@Critical( path ="A.passKeyToJNI().passToNativeCode()", type= Critical.ViolationType.BOTH)
	private static byte[] privateStaticField = new byte[]{1,2,3,4,5,6};; 

	

	public static void passKeyToJNI(){
		A.passToNativeCode(A.privateStaticField);
	}

}
