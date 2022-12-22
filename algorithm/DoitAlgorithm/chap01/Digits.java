package DoitAlgorithm.chap01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
	 Scanner stdIn = new Scanner(System.in);
	 int no;
	 
	 System.out.println("2�ڸ��� ������ �Է��ϼ���.");
	 
	 do {
		 System.out.print("�Է� : ");
		 no = stdIn.nextInt();
	 } while (no < 10 || no > 99);
	 
	 System.out.println("���� no�� ���� "+no+"��(��) �Ǿ����ϴ�.");
	 
	 stdIn.close();
	}

}
