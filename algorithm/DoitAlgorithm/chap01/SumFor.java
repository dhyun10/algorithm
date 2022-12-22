package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdId.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) 
			sum += i;
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		
		stdId.close();
	}

}
