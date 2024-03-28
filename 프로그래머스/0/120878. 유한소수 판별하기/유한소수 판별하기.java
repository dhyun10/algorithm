class Solution {
    public int solution(int a, int b) {
        int result = b / getGcd(b, a);
        
        while(result != 1) {
            if(result % 2 == 0) {
                result /= 2;
            } else if(result % 5 == 0) {
                result /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
    
    
    public static int getGcd(int m, int n){
        int r = 0;
        while(true) {
            if(m % n == 0) return n;
            r = m % n;
            m = n;
            n = r;
        }
    }
}