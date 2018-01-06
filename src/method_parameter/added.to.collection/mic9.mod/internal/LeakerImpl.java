package internal;

import api.Leaker;


import java.util.Collection;
import  mic9bench.annotation.Critical;

public class LeakerImpl implements Leaker{

    @Critical(path="Leaker.leak(parameter), parameter.get()", type=Critical.ViolationType.BOTH)
    byte[] secret = new byte[]{1,2,3,4,5,6};

    @Override
    public void leak(Collection<Object> parameter) {
    	
      	parameter.add(secret);
    	
    }
}
