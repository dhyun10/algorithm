class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean answer = false;

        for(String word : dic) {
            int cnt = 0;
            for(String s : spell) {
                if(word.contains(s)) {
                    cnt++;
                }
            }
            
            if(cnt == spell.length) {
                answer = true;
                break;
            }
        }

        return answer ? 1 : 2;
    }
}