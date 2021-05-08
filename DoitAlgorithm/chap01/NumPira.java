package chap01;

import java.util.Scanner;

public class NumPira {

	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		
		System.out.print("¸î ´Ü ? : ");
		int n = stdId.nextInt();
		
		npira(n);		
		
		stdId.close();
	}

}
