package com.youyou.studyjava;

public class PrimitiveTransfferTest {
	public static void swap(int c, int e)
	{
		int tmp;
		tmp =c;
		c =e;
		e = tmp;
		
	//	System.out.println("swap�����a ��ֵ��"+ a + "; b ��ֵ��" + b );
	}
	
	public static void main(String[] args){
		int a = 6;
		int b = 9;
		swap(a, b);
		System.out.println("���������󣬱��� a ��ֵ��"+ a + "; ���� b ��ֵ��" + b );
	}
}
