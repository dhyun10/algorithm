package chap01;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		
		System.out.print("단 수 : ");
		int n = stdId.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) 
				System.out.print("*");
			System.out.println();
		}
	
		stdId.close();

	}

}
