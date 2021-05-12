package chap02;

import java.util.Scanner;

public class LeftDayOfYear {
	// 각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
	};
	
	// 윤년/평년 확인
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
			System.out.print("년 : "); int year = stdId.nextInt();
			System.out.print("월 : "); int month = stdId.nextInt();
			System.out.print("일 : "); int day = stdId.nextInt();
			
			System.out.printf("그 해 남은 일수는 %d일입니다. \n", leftDayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예/0.아니오) : ");
			retry = stdId.nextInt();
			
		} while (retry == 1);
		
		stdId.close();
	}

}
