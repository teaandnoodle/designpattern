package com.liu.composite;

import org.junit.Test;

public class Client {
	/**构成结构为
	 * <pre>
	 *        root
	 *     ____|____
	 *     |       |
	 *   node    leaf1
	 *   __|__
	 *   |   |
	 * leaf2 leaf3
	 * </pre>
	 * */
	@Test
	public void test() {
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		Component leaf3 = new Leaf("leaf3");
		
		Component root = new Composite("root");
		Component node = new Composite("node");
		
		root.add(leaf1);
		root.add(node);
		node.add(leaf2);
		node.add(leaf3);
		
		System.out.println(root.operation());
	}
}
