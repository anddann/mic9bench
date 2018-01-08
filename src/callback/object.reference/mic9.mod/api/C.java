package api;




public class C {


	public C(){

	}

    
    public void invokeCallback(AInterface parameter) {

        byte[] value = new byte[] {1, 2, 3, 4, 5, 6};
        B myB = new B();
        myB.field = value;

        parameter.callback(myB);

    }
}
