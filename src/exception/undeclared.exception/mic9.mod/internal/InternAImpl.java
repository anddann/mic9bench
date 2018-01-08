package internal;

import api.AInterface;

import api.Exception1;


import mic9bench.annotation.Critical;

public class InternAImpl implements AInterface{

    @Critical(path="LeakException.o", type=Critical.ViolationType.CONFIDENTIALITY)
    private byte[] secret = new byte[]{1,2,3,4,5,6};

    @Override
    public void methodThrowingException(String parameter){
        internalMethod();
    }


    private void internalMethod(){
    	System.out.println("internal Method called!");
    	
    	throw new Exception1(this.secret);
    }
}
