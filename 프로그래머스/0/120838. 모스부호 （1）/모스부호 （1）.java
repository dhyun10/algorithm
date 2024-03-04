class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] arr = letter.split(" ");
        for(String a : arr) {
            for(int i = 0; i < morse.length; i++) {
                if(morse[i].equals(a)) {
                    answer += (char)(i+'a');
                }
            }
        }
        
        return answer;
    }
}