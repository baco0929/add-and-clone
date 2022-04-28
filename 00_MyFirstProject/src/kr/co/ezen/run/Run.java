package kr.co.ezen.run;

import kr.co.ezen.first.A_MethodPrinter;
import kr.co.ezen.first.B_ValuePrinter;
import kr.co.ezen.first.Hello;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바에서는 클래스가 가진 메소드를 실행하려면 클래스명 사용할 이름(참조형 자료형 변수) =new 클래스명
		Hello hello = new Hello();
		hello.helloworld();  // 메소드 호출
		
		A_MethodPrinter ap = new A_MethodPrinter();
		ap.methodA();
		ap.methodB();  // 메소드 호출
		ap.methodC();
		
		B_ValuePrinter bp = new B_ValuePrinter();
		bp.printValue1();
		bp.printValue2();
		bp.printValue3();
		
	}

}
