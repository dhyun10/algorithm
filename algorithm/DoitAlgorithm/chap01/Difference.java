package DoitAlgorithm.chap01;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("a�� �� : ");
		int a = stdId.nextInt();
		int b = 0;
		
		while(true) {
			System.out.print("b�� �� : ");
			b = stdId.nextInt();
			if (b > a)
				break;
			System.out.println("a���� ū ���� �Է��ϼ���.");
		}
		
		System.out.println("b-a�� "+(b-a)+"�Դϴ�. ");
		
		stdId.close();
	}

}
