package kr.co.ezen.methodTest.run;

import kr.co.ezen.methodTest.Mtest;

public class Run {

	public static void main(String[] args) {
		
		Mtest mt = new Mtest();
		mt.methodA(); // A B C ��� �ͷ�
		mt.methodB(); // B C ���
		mt.methodC(); // C �� ���

	}

}
