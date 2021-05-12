package chap02;

import java.util.Scanner;

public class DayOfYearWhile {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
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
			System.out.print("년 : "); int year = stdId.nextInt();
			System.out.print("월 : "); int month = stdId.nextInt();
			System.out.print("일 : "); int day = stdId.nextInt();
			
			System.out.printf("그 해 %d일째입니다. \n", dayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예/0.아니오) : ");
			retry = stdId.nextInt();
			
		} while (retry == 1);
		
		stdId.close();
	}
}
