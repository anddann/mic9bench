package internal;


import api.BInterface;
import mic9bench.annotation.Critical;

@Critical(path="AInterface.callback(parameter)", type=Critical.ViolationType.CONFIDENTIALITY)
public class BImpl2 implements BInterface{



}