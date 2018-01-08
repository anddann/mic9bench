package internal;

import api.AInterface;
import mic9bench.annotation.Critical;

public class InternAImpl1 implements AInterface{


    @Critical(path="AFactory.staticGetterMethod(InternA)", type=Critical.ViolationType.BOTH)
	public byte[] field = new byte[]{1,2,3,4,5,6};

	    



}