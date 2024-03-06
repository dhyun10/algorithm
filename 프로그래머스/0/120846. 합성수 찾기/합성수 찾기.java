class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int j = 2; j <= n; j++) {
            int d = 0;
            for(int i = 1; i <= j; i++) {
                if(j % i == 0) d++;
            }
            if(d >= 3) answer++;
        }
        return answer;
    }
}