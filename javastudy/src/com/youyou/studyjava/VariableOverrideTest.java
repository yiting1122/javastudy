package com.youyou.studyjava;

public class VariableOverrideTest {
	private String name  = "���";
	private static double price = 78.0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price  =65;
		System.out.println(price);
		System.out.println(VariableOverrideTest.price);
	
		new VariableOverrideTest().info();
	}

	public void info(){
		String name = "�����";
		System.out.println(name);
		System.out.println(this.name);
	}
}
