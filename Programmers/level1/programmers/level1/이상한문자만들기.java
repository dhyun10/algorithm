package programmers.level1;

class StrangeWord {
	public static String solution1(String s) {
		int index = 0;
		String[] words = s.split(" ", -1);
		for(String w : words) {
			String[] al = w.split("");
			for(int i = 0; i < al.length; i++) {
				al[i] = i%2 == 0 ? al[i].toUpperCase() : al[i].toLowerCase();
			}
			words[index] = String.join("", al);
			index++;
		}

		return String.join(" ", words);
	}
	
	public static String solution2(String s) {
		int index = 0;
		String answer = "";
		String[] words = s.split("");
		for(String w : words) {
			if(w.contains(" ")) index = 0;
			else w = index++ % 2 == 0 ? w.toUpperCase() : w.toLowerCase();
			answer += w;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(solution1("try hello world"));
		long end = System.currentTimeMillis()-start;
		System.out.println(end);
		
		start = System.currentTimeMillis();
		System.out.println(solution2("try hello world"));
		end = System.currentTimeMillis()-start;
		System.out.println(end);
	}
}


