package internal;

import api.Leaker;


public class LeakerImpl implements Leaker{



    @Override
    public void leak(String parameter) {
    		System.out.println(parameter);
    }
}
