package internal;

import api.AInterface;

import api.Exception1;


import mic9bench.annotation.Critical;

public class InternAImpl implements AInterface{

    @Critical(path="LeakException.o", type=Critical.ViolationType.CONFIDENTIALITY)
    private byte[] privateField = new byte[]{1,2,3,4,5,6};

    @Override
    public void methodThrowingException(String parameter) throws Exception1{
        internalMethod();
    }


    private void internalMethod() throws Exception1{
    	System.out.println("internal Method called!");
    	
    	throw new Exception1(this.privateField);
    }
}
