class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int a = 1;
        while(true) {
            num *= a;
            if(num > n) {
                answer = a;
                break;
            }
            a++;
        }
        return answer-1;
    }
}