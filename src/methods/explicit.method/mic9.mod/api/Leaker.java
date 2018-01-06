package api;
import  mic9bench.annotation.Critical;

import java.io.File;

public class Leaker {

    @Critical(path="Leaker.test2()", type=Critical.ViolationType.CONFIDENTIALITY)
	public static Integer test2(){

		return new Integer(2);
	}

	
}
