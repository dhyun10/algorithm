package programmers.level1;

import java.util.Arrays;

class budget {
	public static int solution(int[] d, int budget) {
		int result = 0;
		int sum = 0;
		
		Arrays.sort(d);
		
		for(int a : d) {
			if(budget <= sum+a) break;
			sum+=a;
			result++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {1, 3, 2, 5, 4};
		
		long start = System.currentTimeMillis();
		System.out.println(solution(d, 9));
		long end = System.currentTimeMillis()-start;
		System.out.println(end);
	}
}