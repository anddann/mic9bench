package internal;

import api.Leaker;



public class LeakerImpl extends Leaker{



    @Override
    public void leak(String parameter) {
    	System.out.println(parameter);
    }
}
