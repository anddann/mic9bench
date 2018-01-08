package internal;

import api.AInterface;


import java.util.Collection;
import mic9bench.annotation.Critical;

public class InternAImpl implements AInterface{

    @Critical(path="InternAImpl.addToCollection(parameterCollection), parameterCollection.get()", type=Critical.ViolationType.CONFIDENTIALITY)
    private byte[] privateField = new byte[]{1,2,3,4,5,6};

    @Override
    public void addToCollection(Collection<Object> parameterCollection) {
    	
      	parameterCollection.add(privateField);
    	
    }
}
