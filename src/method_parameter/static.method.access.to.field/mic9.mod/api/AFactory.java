package api;

import internal.InternAImpl2;
import internal.InternAImpl1;



public class AFactory {

	private static String systemProperty = System.getProperty("property");

    public static AInterface getInstance(){

    	if(systemProperty.contains("jo"))
    		return new InternAImpl2();
    	else
    		return new InternAImpl1(); 
    }


    public static byte[] staticGetterMethod(AInterface aObj){

    		if(aObj instanceof InternAImpl2)
    			return ((InternAImpl2) aObj).field;

    		if(aObj instanceof InternAImpl1)
    			return ((InternAImpl1) aObj).field; 
            
    		return  new byte[] {9,9,9,9,9,9,9};


    }

}
