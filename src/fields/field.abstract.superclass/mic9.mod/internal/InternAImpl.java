package internal;

import api.AbstractA;


public class InternAImpl extends AbstractA{

    private InternB internalB = new InternB();

    
    @Override
    public Object getInternBField() {
    	internalB.field = new byte[]{0,0,0,0,0,0};
        return internalB.field;
    }




}
