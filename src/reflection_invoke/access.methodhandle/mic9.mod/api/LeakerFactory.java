package api;

import internal.InternA;
import java.lang.invoke.*;
import java.lang.reflect.*;

public class LeakerFactory {


	
    public static MethodHandle getInstance() throws NoSuchMethodException,IllegalAccessException{
  		MethodHandles.Lookup lookup = MethodHandles.lookup();

  		MethodHandle methodHandle = lookup.findStatic(InternA.class, "getKey", MethodType.methodType(byte[].class));

    	return methodHandle;
    
    }


}
