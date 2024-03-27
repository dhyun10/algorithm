class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        String a = "0";
        for(int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])) {
                a += arr[i];
            } else {
                answer += Integer.parseInt(a);
                a = "0";
            }
            
            if(i == arr.length-1) answer += Integer.parseInt(a);
            
        }
        return answer;
    }
}