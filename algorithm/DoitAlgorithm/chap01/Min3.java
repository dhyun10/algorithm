package DoitAlgorithm.chap01;

public class Min3 {

	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(1, 3, 2) = "+min3(1, 3, 2));
	}

}
