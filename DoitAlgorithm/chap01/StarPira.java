package chap01;

import java.util.Scanner;

public class StarPira {

	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("¸î ´Ü ? : ");
		int n = stdId.nextInt();
		
		spira(n);		
		
		stdId.close();
	}

}
