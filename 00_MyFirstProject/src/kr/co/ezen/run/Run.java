package kr.co.ezen.run;

import kr.co.ezen.first.A_MethodPrinter;
import kr.co.ezen.first.B_ValuePrinter;
import kr.co.ezen.first.Hello;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹٿ����� Ŭ������ ���� �޼ҵ带 �����Ϸ��� Ŭ������ ����� �̸�(������ �ڷ��� ����) =new Ŭ������
		Hello hello = new Hello();
		hello.helloworld();  // �޼ҵ� ȣ��
		
		A_MethodPrinter ap = new A_MethodPrinter();
		ap.methodA();
		ap.methodB();  // �޼ҵ� ȣ��
		ap.methodC();
		
		B_ValuePrinter bp = new B_ValuePrinter();
		bp.printValue1();
		bp.printValue2();
		bp.printValue3();
		
	}

}
