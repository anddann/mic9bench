package api;

import  mic9bench.annotation.Critical;



public interface Leaker {

    @Critical(path="LeakerImpl.leak()", type=Critical.ViolationType.CONFIDENTIALITY)
    void leak(String parameter);
}
