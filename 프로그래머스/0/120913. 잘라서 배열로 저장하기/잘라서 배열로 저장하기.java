class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int) Math.ceil((double)my_str.length()/n);
        String[] answer = new String[length];
        
        int idx = 0;
        for(int i = 0; i < length-1; i++) {                         
            answer[i] = my_str.substring(idx, n*(i+1));
            idx += n;
        }
        answer[length-1] = my_str.substring(idx);
        
        return answer;
    }
}