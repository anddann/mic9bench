package api;

import  mic9bench.annotation.Critical;



public interface AInterface {

    @Critical(path="InternAImpl.interfaceMethod()", type=Critical.ViolationType.CONFIDENTIALITY)
    void interfaceMethod(String parameter);
}
