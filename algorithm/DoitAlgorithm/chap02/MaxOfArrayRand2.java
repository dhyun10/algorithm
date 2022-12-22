package DoitAlgorithm.chap02;

import java.util.Random;

public class MaxOfArrayRand2 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] > max) 
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		
		int num = 1+rand.nextInt(10);
		System.out.println("��� �� : "+num);
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}
		
		System.out.println("�ִ��� "+maxOf(height)+"�Դϴ�.");
	}

}
