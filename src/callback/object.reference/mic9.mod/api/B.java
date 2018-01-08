package api;

import mic9bench.annotation.Critical;


public class B{

	@Critical(path="AInterface.callback(B), B.field", type=Critical.ViolationType.BOTH)
	public byte[] field;



}