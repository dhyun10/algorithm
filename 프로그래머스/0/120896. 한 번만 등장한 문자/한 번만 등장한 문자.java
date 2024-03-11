import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        int cnt = 0;
        Arrays.sort(arr);
        for(String a : arr) {
            cnt = 0;
            for(String b : arr) {
                if(a.equals(b)) cnt++;
            }
            if(cnt == 1) answer += a;
        }
        
        return answer;
    }
}