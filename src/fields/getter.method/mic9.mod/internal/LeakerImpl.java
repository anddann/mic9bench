package internal;

import api.Leaker;
import mic9bench.annotation.Critical;


public class LeakerImpl implements Leaker{

    @Critical(path="Leaker.leak()", type=Critical.ViolationType.CONFIDENTIALITY)
    byte[] secretKey = new byte[]{1,2,3,4,5};
	

    @Override
    public Object leak() {
      //  if(parameter == "hi")
            return this.secretKey;
     //  else
      //      return null;
      //  return internalMethod(true);
    }


    private byte[] internalMethod(boolean value){   
        
    	if(value)
    		return this.secretKey;
    	else
    		return null;
    }
}
