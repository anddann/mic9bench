package api;



import internal.BImpl1;
import internal.BImpl2;


public class C {


   
   public static void invokeCallback(AInterface parameter) {

   		BInterface servlet = new BImpl2();


        parameter.callback(servlet);
 
    }
}
