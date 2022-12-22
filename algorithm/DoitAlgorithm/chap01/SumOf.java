package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumOf {

	static int sumof(int a, int b) {
		if (a > b) {
			int n=a;
			a=b;
			b=n;
		}
		
		int sum = 0;
		
		for(int i=a; i<=b; i++) 
			sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("a�� ����");
		int a = stdIn.nextInt();
		System.out.print("b�� ����");
		int b = stdIn.nextInt();

		System.out.println("���� a, b ������ ��� ������ ���� " + sumof(a, b) + "�Դϴ�.");
		
		stdIn.close();
	}

}
