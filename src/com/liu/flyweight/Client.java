package com.liu.flyweight;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		Flyweight root = buildTree(new String[]{"a", "b", "c","a","b","c"});
		System.out.println(root.operation());
	}
	//构建一棵节点树，这棵树按照广度优先，一层一层向下
	public Flyweight buildTree(String strs[]){
		return dfs(strs, 0);
	}
	private Flyweight dfs(String strs[], int index){
		Flyweight root = new ConcreteFlyweight(null);
		if(index < strs.length){
			root = new ConcreteFlyweight(strs[index]);
		}
		if(2*index+1 < strs.length){
			root.setLeft(dfs(strs, 2*index+1));
		}
		if(2*index+2 < strs.length){
			root.setRight(dfs(strs, 2*index+2));
		}
		return root;
	}
}
