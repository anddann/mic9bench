package api;



import internal.CritServlet;
import internal.PubServlet;


public class LeakerFactory {


   
   public static void leak(CallbackInterface parameter, boolean value) {

   		Servlet servlet = new CritServlet();


        parameter.callbackMethod(servlet);
 
    }
}
