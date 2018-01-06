package internal;


import api.Servlet;
import mic9bench.annotation.Critical;

@Critical(path="Context.callback(parameter)", type=Critical.ViolationType.CONFIDENTIALITY)
public class CritServlet implements Servlet{


	public void doSomething(){

		System.out.println("Supposed to stay internal");

	}
}