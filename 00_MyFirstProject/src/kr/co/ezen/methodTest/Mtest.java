package kr.co.ezen.methodTest;

public class Mtest {  // class : 설계도
	
	public void methodA() {  // 메소드?  -> 기능, 메소드는 호출되야 일을 한다
		
		System.out.println("나 메소드 A야");
		methodB(); // methodB 호출 
	}
	
	public void methodB() {
		
		System.out.println("나 메소드 B야");
		methodC(); // methodC 호출
	}
	public void methodC() {
	
		System.out.println("나 메소드 C야");
	}	

}
