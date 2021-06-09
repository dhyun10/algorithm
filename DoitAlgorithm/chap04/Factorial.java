package chap04;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		if(n>0) 
			return n * factorial(n-1);
		else 
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int x = stdIn.nextInt();
		
		System.err.println(x + "�� ���丮���� "+factorial(x)+"�Դϴ�.");
		
		stdIn.close();
	}

}
