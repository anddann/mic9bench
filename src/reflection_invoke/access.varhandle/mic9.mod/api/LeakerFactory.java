package api;

import internal.LeakerImpl;
import internal.InternA;
import java.lang.invoke.*;
import java.lang.reflect.*;

public class LeakerFactory {

	private static MethodHandles.Lookup lookup = MethodHandles.lookup();

    public static Leaker getInstance(){

    
    		return new LeakerImpl();
    
    }


    public static VarHandle getFieldValue(Object obj, String fieldName) throws Exception{
        Field f = obj.getClass().getDeclaredField(fieldName);
        VarHandle handle = lookup.unreflectVarHandle(f);
        return handle;

    }

}
