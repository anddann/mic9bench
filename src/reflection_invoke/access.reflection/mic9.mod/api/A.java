package api;

import mic9bench.annotation.Critical;
import java.lang.reflect.*;

public class A {

	@Critical(path = "", type = Critical.ViolationType.BOTH)
	private static int[] privateField = {1,2,3,4};

    public static Object getInstance(){
	Object o  = null;
	try{
		Class c = Class.forName("api.A");
      	// Method m = c.getDeclaredMethod("SomeMethod");
		Field field = c.getDeclaredField("privateField");
		field.setAccessible(true);
		o = field.get(null);
		return o;
	}
	catch(Exception e){
	}
        return o;
    }
    
}
