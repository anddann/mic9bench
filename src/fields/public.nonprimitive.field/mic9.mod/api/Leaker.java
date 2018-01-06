package api;
import java.util.logging.Logger;
import mic9bench.annotation.Critical;


public class Leaker {

    @Critical(path="Leaker.secretField", type=Critical.ViolationType.BOTH)
 	public Logger secretField = Logger.getLogger("Leaker");




	
}
