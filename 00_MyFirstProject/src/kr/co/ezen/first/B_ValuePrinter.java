package kr.co.ezen.first;

public class B_ValuePrinter {
	
	//  �������� ������ ���� ����� �Ʊ�
	//  ���� ���
	public void printValue1() {
		
		System.out.println(123);	// �޼ҵ���� Ŭ�����ȿ� �־�� ���డ���ϴ�
		System.out.println(1.23);
		
		// ���� ���
		// char 2byte A�� ������ ���� println() ȣ��
		// println()�� A�� �޾Ƽ� ����Ѵ�
		
		System.out.println('A'); // ;�� ��ɹ��� ���� �ǹ��Ѵ�
		System.out.println('B');
		
		// ���ڿ� ���
		
		System.out.println("����");
		System.out.println("AaBbCcDd");
		System.out.println(123 + 456); // 579
		System.out.println(1.23 - 0.12);
		
		System.out.println('a' + 1); // 98
		System.out.println("Hello" + 123); // ���ڿ� + ���� == ����
	
	}
	
	public void printValue2(){
		
		// ���ڿ��� ������ '+' ����
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
		
		System.out.println("���� �����");
		System.out.println(100 + 10);
		System.out.println(((100 + 10) * 10) - 10);
		
		// ������ Ÿ�� (type) ������  -> int 4byte
		int point = 100;  // ���� ������ : =          ->     �޸� ���� �̸� = ��
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println("���� �����");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
	}

}
