package com.liu.builder;

public class Director {
	public Product Construct(Builder builder){
		builder.buildPart();//创建前的操作
		return builder.getResult();
	}
}
