package internal;

import api.Leaker;

import api.B;
import api.A;
import mic9bench.annotation.Critical;

public class LeakerImpl implements Leaker {



    @Override
    public void leak(A parameter, boolean value) {

        //if(value)
        byte[] secret = new byte[] {1, 2, 3, 4, 5, 6};
        B myB = new B();
        myB.secret = secret;

        parameter.callback(myB);
        //  else
        //  parameter.callback(null);
    }
}
