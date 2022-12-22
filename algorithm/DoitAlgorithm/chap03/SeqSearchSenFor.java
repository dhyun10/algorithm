package DoitAlgorithm.chap03;

import java.util.Scanner;

public class SeqSearchSenFor {
	static int seqSearchSen(int[] a , int n , int key) {
		int i; 
		
		a[n] = key;

		for(i=0; a[i] != key; i++) ;
		
		return i==n?-1:i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = stdIn.nextInt();
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) 
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�.");
		
		stdIn.close();
	}

}
