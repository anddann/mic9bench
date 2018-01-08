package api;

import internal.InternAImpl;

public class AFactory {


    public static AInterface getInstance(){

        return new InternAImpl();
    }
}
