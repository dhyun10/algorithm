package chap01;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("양의 정수 n : ");
		int n;
		
		do {
			n = stdId.nextInt();
		} while (n<=0);
		
		int no = 0;
		
		while (n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는 "+no+"자리입니다.");
		
		stdId.close();
		
	}

}
