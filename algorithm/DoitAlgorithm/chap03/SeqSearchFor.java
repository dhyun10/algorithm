package DoitAlgorithm.chap03;

import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) 
			if(a[i] == key)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) 
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�.");
		
		stdIn.close();
	}

}
