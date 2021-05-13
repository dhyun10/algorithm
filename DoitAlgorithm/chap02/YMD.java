package chap02;

import java.util.Scanner;

public class YMD {
	int y;
	int m;
	int d;
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
	}
	
	YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	YMD after(int n) {
		YMD ymd = new YMD(this.y, this.m, this.d);
		if(n < 0) {
			return (before(-n));
		}
		
		ymd.d += n;
		
		while(ymd.d > mdays[isLeap(ymd.y)][ymd.m-1]) {
			ymd.d -= mdays[isLeap(ymd.y)][ymd.m-1];
			if(++ymd.m > 12) {
				ymd.y++;
				ymd.m = 1;
			}
		}
		return ymd;
	}
	
	YMD before(int n) {
		YMD ymd = new YMD(this.y, this.m, this.d);
		if(n < 0) {
			return (after(-n));
		}
		
		ymd.d -= n;
		
		while(ymd.d < 1) {
			if(--ymd.m < 1) {
				ymd.y--;
				ymd.m = 12;
			}
			ymd.d += mdays[isLeap(ymd.y)][ymd.m-1];
		}
		
		return ymd;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
		
		stdIn.close();
	}

}
