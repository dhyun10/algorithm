class Solution {
    public String solution(int age) {
        String answer = "";

        while(age > 0) {
            int num = age % 10;
            answer = ((char)(num+'a')) + answer;
            age /= 10;
        }

        return answer;
    }
}