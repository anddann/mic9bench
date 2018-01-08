package api;

import internal.InternAImpl;
import java.lang.invoke.*;
import java.lang.reflect.*;

public class AFactory {

	private static MethodHandles.Lookup lookup = MethodHandles.lookup();

    public static AInterface getInstance(){

    
    		return new InternAImpl();
    
    }


    public static VarHandle getFieldValue(Object obj, String fieldName) throws Exception{
        Field f = obj.getClass().getDeclaredField(fieldName);
        VarHandle handle = lookup.unreflectVarHandle(f);
        return handle;

    }

}
