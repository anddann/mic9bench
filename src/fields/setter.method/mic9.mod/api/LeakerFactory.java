package api;

import internal.LeakerImpl;


public class LeakerFactory {


	
    public static Leaker getInstance(){
  
    	return new LeakerImpl();
    
    }


}
