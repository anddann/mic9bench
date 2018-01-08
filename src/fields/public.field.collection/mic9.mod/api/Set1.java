package api;


import java.util.HashSet;
import java.util.Collection;

import  mic9bench.annotation.Critical;

public class Set1 {


	public Collection<byte[]> collectionField;

    @Critical(path="Set1.secret", type=Critical.ViolationType.BOTH)
	private byte[] privatefield = new byte[]{1,2,3,4,5,6};


	public Set1(){
		this.collectionField = new HashSet<>();
	}


   public void addToCollection(String parameter){
   		
	    this.collectionField.add(this.privatefield);
	}

}
