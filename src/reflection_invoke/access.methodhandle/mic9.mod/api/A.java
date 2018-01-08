package api;

import internal.Intern;
import java.lang.invoke.*;
import java.lang.reflect.*;

public class A {


	
    public static MethodHandle getMethodHandleInstance() throws NoSuchMethodException,IllegalAccessException{
  		MethodHandles.Lookup lookup = MethodHandles.lookup();

  		MethodHandle methodHandle = lookup.findStatic(Intern.class, "internalMethod", MethodType.methodType(byte[].class));

    	return methodHandle;
    
    }


}
