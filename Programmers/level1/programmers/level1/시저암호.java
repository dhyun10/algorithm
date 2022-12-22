package programmers.level1;

class CaesarCipher {
	public static String solution(String s, int n) {
		String result = "";
		
		for(char ch : s.toCharArray()) {
			
			if(Character.isLowerCase(ch)) {
				ch = (char)((ch - 'a' + n) % 26 + 'a');
			} else if(Character.isUpperCase(ch)) {
				ch = (char)((ch - 'A' + n) % 26 + 'A');
			}

			result += ch;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println(solution("a B z Z", 3));
		long end = System.currentTimeMillis()-start;
		System.out.println(end);
	}
}