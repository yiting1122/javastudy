package com.youyou.studyjava;


public class PersonTest {
	public static void main(String[] args){
		Person p = new Person();
		p.setAge(1000);
		 System.out.println("δ������age Fieldʱ��" + p.getAge());
		 
		p.setAge(30);
		 System.out.println("�ɹ�����age Field��" + p.getAge());
		 
		p.setName("���");
		 System.out.println("�ɹ�����name Field��" + p.getName());

	}
}
