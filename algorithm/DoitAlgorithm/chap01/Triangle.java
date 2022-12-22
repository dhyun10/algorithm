package DoitAlgorithm.chap01;

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
		
		System.out.print("�� �� �ﰢ���Դϱ� ? : ");
		int n = stdIn.nextInt();
		
		System.out.println(n);
		
		System.out.println("���� �Ʒ��� ������ �ﰢ��");
		triangleLB(n);

		System.out.println("���� ���� ������ �ﰢ��");
		triangleLU(n);

		System.out.println("������ ���� ������ �ﰢ��");
		triangleRU(n);

		System.out.println("������ �Ʒ��� ������ �ﰢ��");
		triangleRB(n);
		
		stdIn.close();
	}
}
