package com.liu.facade;

public class Facade {
	public void justDoSthInSimpleWay(){
		ComplicatedThing1 sth1 = new ComplicatedThing1();
		ComplicatedThing2 sth2 = new ComplicatedThing2();
		
		sth1.doSomething();
		sth2.doSomething();
	}
}
