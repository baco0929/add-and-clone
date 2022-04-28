package kr.co.ezen.methodTest.run;

import kr.co.ezen.methodTest.Mtest;

public class Run {

	public static void main(String[] args) {
		
		Mtest mt = new Mtest();
		mt.methodA(); // A B C 모두 촐력
		mt.methodB(); // B C 출력
		mt.methodC(); // C 만 출력

	}

}
