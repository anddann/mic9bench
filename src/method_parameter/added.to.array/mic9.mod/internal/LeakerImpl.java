package internal;

import api.Leaker;

import  mic9bench.annotation.Critical;

public class LeakerImpl implements Leaker{

    @Critical(path="Leaker.leak(parameter), parameter[0]", type=Critical.ViolationType.BOTH)
	private int secret = 666;

    @Override
    public void leak(int[] parameter) {
    		
      		parameter[0] =  this.secret;
    }
}
