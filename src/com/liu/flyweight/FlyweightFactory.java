package com.liu.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, Flyweight> pool = new HashMap<>();
	public static Flyweight getFlyweight(String key){
		if(pool.containsKey(key)){
			return pool.get(key);
		} else {
			Flyweight fw = new internalFlyweight(key);
			pool.put(key, fw);
			return fw;
		}
	}
	private static class internalFlyweight implements Flyweight{
		private String value = null;
		
		public internalFlyweight(String value){
			this.value = value;
		}
		@Override
		public String operation() {
			return value;
		}
		
		@Override
		public void setLeft(Flyweight node) {
			throw new RuntimeException("unsupport!");
		}
		@Override
		public void setRight(Flyweight node) {
			throw new RuntimeException("unsupport!");
		}
		@Override
		public Flyweight getLeft() {
			throw new RuntimeException("unsupport!");
		}
		@Override
		public Flyweight getRight() {
			throw new RuntimeException("unsupport!");
		}
	}
}
