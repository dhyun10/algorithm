package DoitAlgorithm.chap02;

import java.util.Scanner;

public class LeftDayOfYear {
	// �� ���� �ϼ�
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // ���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // ����
	};
	
	// ����/��� Ȯ��
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int days = d; 
		for(int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		return 365 + isLeap(y) - days;
	}
	
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("�� : "); int year = stdId.nextInt();
			System.out.print("�� : "); int month = stdId.nextInt();
			System.out.print("�� : "); int day = stdId.nextInt();
			
			System.out.printf("�� �� ���� �ϼ��� %d���Դϴ�. \n", leftDayOfYear(year, month, day));
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = stdId.nextInt();
			
		} while (retry == 1);
		
		stdId.close();
	}

}
