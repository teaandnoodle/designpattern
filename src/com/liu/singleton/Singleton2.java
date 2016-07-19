package com.liu.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton2 {
	protected Singleton2(){}
	
	private static Singleton2 instance = null;
	private static Map<String, Singleton2>  repository= new HashMap<>();
	
	private static Singleton2 lookup(String name){
		return repository.get(name);
	}
	
	public static void register(String name, Singleton2 instance){
		repository.put(name, instance);
	}
	
	public static Singleton2 getInstance(){
		if(instance == null){
			String name = System.getProperty("SINGLETON");
			instance = lookup(name);
		}
		return instance;
	}
}