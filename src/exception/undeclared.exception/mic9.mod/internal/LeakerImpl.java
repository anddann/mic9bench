package internal;

import api.Leaker;

import api.LeakException;


import mic9bench.annotation.Critical;

public class LeakerImpl implements Leaker{

    @Critical(path="LeakException.o", type=Critical.ViolationType.CONFIDENTIALITY)
    private byte[] secret = new byte[]{1,2,3,4,5,6};

    @Override
    public void leak(String parameter) throws LeakException{
        internalMethod();
    }


    private void internalMethod() throws LeakException{
    	System.out.println("internal Method called!");
    	
    	throw new LeakException(this.secret);
    }
}
