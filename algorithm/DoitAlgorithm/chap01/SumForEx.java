package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumForEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n�� ��  : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) { 
			sum+=i;
			if (i<n) 
				System.out.print(i+"+");
			else
				System.out.print(i+"=");
		}
		
		System.out.print(sum);
		
		stdIn.close();
	}

}
