class Solution {
    public String solution(int age) {
        String answer = "";
        String[] str = String.valueOf(age).split("");
        for(String a : str) {
            int c = Integer.parseInt(a);
            answer += (char)(c+97);
        }
        return answer;
    }
}