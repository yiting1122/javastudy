package com.youyou.studyjava;

class Creature{
	public Creature(){
		System.out.println("Creature �޲����Ĺ�����");
	}
}

class Animal extends Creature{
	public Animal(String name){
		System.out.println("Animal��һ�������Ĺ�������"+ "�ö����nameΪ"+ name);
	}
	
	public Animal (String name, int age){
		this(name);
		System.out.println("Animal�����������Ĺ�������"+ "��ageΪ"+ age);
	}
}

public class Wolf extends Animal {
	public Wolf()
	{
		super("��̫��",3);
		System.out.println("�޲����Ĺ�����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wolf();
	}

}
