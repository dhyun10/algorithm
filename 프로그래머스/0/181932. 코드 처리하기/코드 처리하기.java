class Solution {
    public String solution(String code) {
        String result = "";
		String[] arr = code.split("");
		int mode = 0;
		
		for(int i = 0; i < code.length(); i++) {
			if(code.charAt(i) != '1') {
				result += i % 2 == mode ? code.charAt(i) : "";	
			} else {
				mode = 1 - mode;
			}
		}
		return "".equals(result) ? "EMPTY" : result;
    }
}