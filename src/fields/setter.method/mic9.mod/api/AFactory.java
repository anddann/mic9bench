package api;

import internal.InternAImpl;


public class AFactory {


	
    public static AbstractA getInstance(){
  
    	return new InternAImpl();
    
    }


}
