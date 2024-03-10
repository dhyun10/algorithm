class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = String.valueOf(order).split("");
        for(String a : arr) {
            if(a.equals("3") || a.equals("6") || a.equals("9")) answer++;
        }
        return answer;
    }
}