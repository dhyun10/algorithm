class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        
        int a = x * y;
        
        return x > 0 ? (a > 0 ? 1 : 4) : (a > 0 ? 3 : 2);
    }
}