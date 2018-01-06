package api;

import  mic9bench.annotation.Critical;



public abstract class Leaker {

    @Critical(path="LeakerImpl.leak()", type=Critical.ViolationType.CONFIDENTIALITY)
    public abstract void leak(String parameter);
}
