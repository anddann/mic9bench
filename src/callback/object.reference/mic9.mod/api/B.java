package api;

import mic9bench.annotation.Critical;


public class B{

	@Critical(path="A.callback(B), B.secret", type=Critical.ViolationType.BOTH)
	public byte[] secret;



}