package com.youyou.studyjava;

class DataWrap{
	public int a;
	public int b;
}

public class ReferenceTransferTest {
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap�����a ��ֵ��"+ dw.a + "; b ��ֵ��" + dw.b );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("���������󣬱��� a ��ֵ��"+ dw.a + "; ���� b ��ֵ��" + dw.b );
		
		
	}

}
