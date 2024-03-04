class Solution {
    public String solution(int age) {
        String answer = "";
        String[] str = String.valueOf(age).split("");
        for(String a : str) {
            answer += (char)(Integer.parseInt(a)+'a');
        }
        return answer;
    }
}