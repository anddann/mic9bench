package internal;

import api.Leaker;
import mic9bench.annotation.Critical;

public class InternA implements Leaker{


	//this is the secret key
    @Critical(path="LeakerFactory.getKey(InternA)", type=Critical.ViolationType.BOTH)
	public byte[] key = new byte[]{1,2,3,4,5,6};

	    


	public	Object leak(String parameter){
	    	return "Hi";
	    }


}