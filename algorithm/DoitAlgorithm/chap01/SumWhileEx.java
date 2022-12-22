package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumWhileEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n�� ���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}

		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		System.out.println("while���� ������ i�� ���� "+i+"�Դϴ�.");
		
		stdIn.close();
	}

}
