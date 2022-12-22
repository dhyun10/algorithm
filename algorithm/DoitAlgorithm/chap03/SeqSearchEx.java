package DoitAlgorithm.chap03;

import java.util.Scanner;

public class SeqSearchEx {

	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int i = 0; i < n; i++)
			System.out.printf("%4d", i);
		System.out.println();

		System.out.print("---+");
		for (int i = 0; i < 4 * n + 2; i++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int j = 0; j < n; j++)
				System.out.printf("%4d", a[j]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // �˻�����
		}
		return -1; // �˻�����
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ���");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // ��ڼ� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}

		System.out.print("ã�� ����"); // Ű ���� �Է� ����
		int ky = stdIn.nextInt();

		int idx = seqSearchEx(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� " + "x[" + idx + "]�� �ֽ��ϴ�.");
		
		stdIn.close();
	}

}
