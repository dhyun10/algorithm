class Solution {
    public int solution(int n) {
        int a = 0;
        int b = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) a += Math.pow(i, 2);
            else b++;
        }
        
        return n % 2 == 0 ? a : b*b;
    }
}