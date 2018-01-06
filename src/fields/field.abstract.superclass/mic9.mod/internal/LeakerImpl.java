package internal;

import api.Leaker;


public class LeakerImpl extends Leaker{

    private InternA internalA = new InternA();

    

    @Override
    public Object leak(String parameter) {
        return internalA.key = new byte[]{0,0,0,0,0,0};
    }




}
