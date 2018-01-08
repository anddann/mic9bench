package internal;

import api.AInterface;
import mic9bench.annotation.Critical;

public class InternAImpl implements AInterface {


	@Critical(path="AFactory.getInstance().getFieldValue(InternAImpl,'field').getValue()", type=Critical.ViolationType.BOTH)
	public byte[] field = new byte[]{1,2,3,4,5,6};

	    


}