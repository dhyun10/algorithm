package chap01;

import java.util.Scanner;

public class SumWhileEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n의 값을 입력하세요.");
		int n = stdIn.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}

		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		System.out.println("while문이 끝날때 i의 값은 "+i+"입니다.");
		
		stdIn.close();
	}

}
