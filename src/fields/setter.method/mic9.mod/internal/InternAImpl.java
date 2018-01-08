package internal;

import api.AbstractA;
import mic9bench.annotation.Critical;


public class InternAImpl extends AbstractA{

    @Critical(path="AbstractA.setterMethod()", type=Critical.ViolationType.INTEGRITY)
	private byte[] privateField = new byte[]{0,0,0,0,0,};

    @Override
    public void setterMethod(byte[] parameter) {
        	this.privateField = parameter;
    }




}
