package api;
import javax.crypto.spec.SecretKeySpec;
import mic9bench.annotation.Critical;


public class A {

    @Critical(path="A.pubfield", type=Critical.ViolationType.BOTH)
    public SecretKeySpec pubfield = new SecretKeySpec("text".getBytes(),"AES");


	
}
