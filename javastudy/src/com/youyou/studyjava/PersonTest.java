package com.youyou.studyjava;

class Person{
	public String name;
	public static int eyeNum;
}

public class PersonTest {
	public static void main(String[] args){
		System.out.println("person �� eyeNum �� Fieldֵ��" +Person.eyeNum);
		
		Person p = new Person();
		System.out.println("p ������name Fieldֵ�ǣ�" + p.name + " ; p �����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
		
		p.name = "�����";
		p.eyeNum = 2;
		System.out.println("p ������name Fieldֵ�ǣ�" + p.name + " ; p �����eyeNum Fieldֵ�ǣ�" + p.eyeNum);
		System.out.println("person �� eyeNum �� Fieldֵ��" +Person.eyeNum);
		
		Person p2 = new Person();
		System.out.println( "p2 �����eyeNum Fieldֵ�ǣ�" + p2.eyeNum);
		
	}
}
