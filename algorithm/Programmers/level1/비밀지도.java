package Programmers.level1;

class SecertMap {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);			
			answer[i] = answer[i].replaceAll("1", "#");
			answer[i] = answer[i].replaceAll("0", " ");
			answer[i] = String.format("%16s", answer[i]);
			answer[i] = answer[i].substring(16-n);
		}
		
		return answer;
	}
	
	public static String[] solution2(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			String a = Integer.toBinaryString(arr1[i] | arr2[i]);
			for(int j = 0; j < n-a.length(); j++) {
				sb.append("0");
			}
			sb.append(a);
			
			answer[i] = sb.toString().replaceAll("1", "#").replaceAll("0", " ");
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {46, 33, 33, 22, 31, 50};
		int[] arr2 =  {27, 56, 19, 14, 14, 10};
		long start = System.nanoTime();
		solution2(6, arr1, arr2);
		long end = System.nanoTime()-start;
		System.out.println(end);		

		start = System.nanoTime();
		solution(6, arr1, arr2);
		end = System.nanoTime()-start;
		System.out.println(end);
	}
}