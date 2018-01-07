package api;
import javax.crypto.spec.SecretKeySpec;
import mic9bench.annotation.Critical;


public class Leaker {

    @Critical(path="Leaker.secretField", type=Critical.ViolationType.BOTH)
    public SecretKeySpec key = new SecretKeySpec("hi".getBytes(),"AES");




	
}
