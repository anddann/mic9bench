package internal;

import api.AInterface;
import mic9bench.annotation.Critical;


public class InternAImpl implements AInterface{

    @Critical(path="AInterface.getterMethod()", type=Critical.ViolationType.CONFIDENTIALITY)
    byte[] field = new byte[]{1,2,3,4,5};
	

    @Override
    public Object getterMethod() {
            return this.field;
    }


}
