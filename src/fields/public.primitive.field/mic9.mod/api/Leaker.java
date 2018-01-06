package api;
import mic9bench.annotation.Critical;

import java.io.File;

public class Leaker {

    @Critical(path="Leaker.secretField", type=Critical.ViolationType.BOTH)
 	public int secretField = 1;



	public static Integer test2(){

		return new Integer(2);
	}

	
}
