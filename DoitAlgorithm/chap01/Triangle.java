package chap01;

import java.util.Scanner;

public class Triangle {	
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) { 
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i=1; i<=n; i++) { 
			for(int j=n-i+1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i=1; i<=n; i++) { 
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=n-i+1; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) { 
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 단 삼각형입니까 ? : ");
		int n = stdIn.nextInt();
		
		System.out.println(n);
		
		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangleLB(n);

		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleLU(n);

		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleRU(n);

		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleRB(n);
		
		stdIn.close();
	}
}
