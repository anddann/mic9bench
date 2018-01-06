package api;

import mic9bench.annotation.Critical;
import java.lang.reflect.*;

public class LeakerFactory {

		@Critical
		private static int[] reflectArray = {1,2,3,4};

    public static Object getInstance(){
	Object o  = null;
	try{
	Class c = Class.forName("api.LeakerFactory");
      	// Method m = c.getDeclaredMethod("SomeMethod");
		Field field = c.getDeclaredField("reflectArray");
		field.setAccessible(true);
		 o = field.get(null);
	return o;
	}
	catch(Exception e){
	}
        return o;
    }
}
