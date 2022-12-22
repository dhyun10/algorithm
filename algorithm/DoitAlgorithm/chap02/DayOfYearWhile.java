package DoitAlgorithm.chap02;

import java.util.Scanner;

public class DayOfYearWhile {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // ���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // ����
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		while(--m != 0) {
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("�� : "); int year = stdId.nextInt();
			System.out.print("�� : "); int month = stdId.nextInt();
			System.out.print("�� : "); int day = stdId.nextInt();
			
			System.out.printf("�� �� %d��°�Դϴ�. \n", dayOfYear(year, month, day));
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = stdId.nextInt();
			
		} while (retry == 1);
		
		stdId.close();
	}
}
