package api;

import  mic9bench.annotation.Critical;



public abstract class AAbstract {

    @Critical(path="InternAImpl.abstractMethod()", type=Critical.ViolationType.CONFIDENTIALITY)
    public abstract void abstractMethod();
}
