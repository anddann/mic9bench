package internal;

import api.Leaker;
import mic9bench.annotation.Critical;


public class LeakerImpl extends Leaker{

    @Critical(path="Leaker.modify()", type=Critical.ViolationType.INTEGRITY)
	private byte[] key = new byte[]{0,0,0,0,0,};

    @Override
    public Object modify(byte[] parameter) {
        	this.key = parameter;
        	return null;
    }




}
