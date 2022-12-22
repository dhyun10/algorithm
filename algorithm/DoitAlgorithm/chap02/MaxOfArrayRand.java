package DoitAlgorithm.chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] > max) 
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}
		
		System.out.println("�ִ��� "+maxOf(height)+"�Դϴ�.");
		
		stdIn.close();
	}

}
