package api;

import internal.InternAImpl;

public class AFactory {


    public static AAbstract getInstance(){

        return new InternAImpl();
    }
}
