package Programmers.level1;

class TrinaryDigit {
	public static int solution(int n) {
		String digit = "";
		
		do {
			digit += n % 3;
			n /= 3;
		} while (n > 0);
		
		n = Integer.parseInt(digit, 3);
		
		return n;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(solution(125));
		long end = System.currentTimeMillis()-start;
		System.out.println(end);
	}
}
