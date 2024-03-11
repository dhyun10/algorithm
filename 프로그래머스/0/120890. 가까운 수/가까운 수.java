class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(n-array[0]);
        
        for(int a : array) {
            int abs = Math.abs(n-a);
            if(min > abs) {
                min = abs;
                answer = a;
            } else if(min == abs) {
                answer = a > answer ? answer : a;
            }
        }
        
        return answer;
    }
}