package kr.co.ezen.first;

public class B_ValuePrinter {
	
	//  여러가지 형태의 값을 출력해 뵈기
	//  숫자 출력
	public void printValue1() {
		
		System.out.println(123);	// 메소드들은 클래스안에 있어야 실행가능하다
		System.out.println(1.23);
		
		// 문자 출력
		// char 2byte A를 저장한 다음 println() 호출
		// println()은 A를 받아서 출력한다
		
		System.out.println('A'); // ;은 명령문의 끝을 의미한다
		System.out.println('B');
		
		// 문자열 출력
		
		System.out.println("해윙");
		System.out.println("AaBbCcDd");
		System.out.println(123 + 456); // 579
		System.out.println(1.23 - 0.12);
		
		System.out.println('a' + 1); // 98
		System.out.println("Hello" + 123); // 문자열 + 숫자 == 연결
	
	}
	
	public void printValue2(){
		
		// 문자열과 숫자의 '+' 연산
		System.out.println(9 + 9);
		System.out.println(9 + "9");
		System.out.println("9" + 9);
		System.out.println("9" + "9");
		
		System.out.println(9 + 9 + "9"); // 18 + 9
		System.out.println(9 + "9" + 9); // 99 + 9
		System.out.println("9" + 9 + 9); // 99 + 9
		System.out.println("9" + (9 + 9)); // 9 + (18)
	}
	
	public void printValue3() {
		
		System.out.println("변수 사용전");
		System.out.println(100 + 10);
		System.out.println(((100 + 10) * 10) - 10);
		
		// 변수의 타입 (type) 변수명  -> int 4byte
		int point = 100;  // 대입 연산자 : =          ->     메모리 공간 이름 = 값
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println("변수 사용후");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
	}

}
