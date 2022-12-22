package DoitAlgorithm.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	static class PhyscData {
		private String name;		
		private int    height;		
		private double vision;			

		public PhyscData(String name, int height, double vision) {
			this.name = name;  this.height = height;  this.vision = vision;
		}

		public String toString() {
			return name + " " + height + " " + vision;
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER =
															 new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ?  1 :
						 (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {					
			new PhyscData("�̳���", 162, 0.3),
			new PhyscData("������", 168, 0.4),
			new PhyscData("���Ѱ�", 169, 0.8),
			new PhyscData("ȫ�ر�", 171, 1.5),
			new PhyscData("������", 173, 0.7),
			new PhyscData("��ȣ��", 174, 1.2),
			new PhyscData("�̼���", 175, 2.0),
		};
		System.out.print("�� cm�� ����� ã�� �ֳ���?��");
		int height = stdIn.nextInt();						
		int idx = Arrays.binarySearch(
						x,									
						new PhyscData("", height, 0.0),	
						PhyscData.HEIGHT_ORDER				
					 );

		if (idx < 0)
			System.out.println("��Ұ� �����ϴ�.");
		else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� �����ͣ�" + x[idx]);
		}
		
		stdIn.close();
	}

}
