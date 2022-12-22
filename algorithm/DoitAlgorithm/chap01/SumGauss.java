package DoitAlgorithm.chap01;

import java.util.Scanner;

public class SumGauss {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = (n%2==0) ? (1+n)*(n/2) : (1+n)*(n/2)+((1+n)/2);
		// int sum = (n+1)*(n/2) + (n%2==0? 0 : (n+1)/2);
		
		System.out.println(sum);
		
		stdIn.close();
	}

}
