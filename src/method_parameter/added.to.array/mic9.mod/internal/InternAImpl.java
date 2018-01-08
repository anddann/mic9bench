package internal;

import api.AInterface;

import  mic9bench.annotation.Critical;

public class InternAImpl implements AInterface{

    @Critical(path="InternAImpl.addToArray(parameterArray), parameterArray[0]", type=Critical.ViolationType.BOTH)
	private int privateField = 42;

    @Override
    public void addToArray(int[] parameterArray) {
    		
      		parameterArray[0] =  this.privateField;
    }
}
