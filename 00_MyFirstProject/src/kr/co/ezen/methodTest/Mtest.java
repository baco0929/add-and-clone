package kr.co.ezen.methodTest;

public class Mtest {  // class : ���赵
	
	public void methodA() {  // �޼ҵ�?  -> ���, �޼ҵ�� ȣ��Ǿ� ���� �Ѵ�
		
		System.out.println("�� �޼ҵ� A��");
		methodB(); // methodB ȣ�� 
	}
	
	public void methodB() {
		
		System.out.println("�� �޼ҵ� B��");
		methodC(); // methodC ȣ��
	}
	public void methodC() {
	
		System.out.println("�� �޼ҵ� C��");
	}	

}
