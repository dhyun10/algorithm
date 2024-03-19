class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        board[0] = board[0]/2;
        board[1] = board[1]/2;
        
        for(String a : keyinput) {
            switch(a) {
                case "up":
                    if(board[1] != answer[1]) answer[1]++;
                    break;
                case "down":
                    if(board[1]*(-1) != answer[1]) answer[1]--;
                    break;
                case "left":
                    if(board[0]*(-1) != answer[0]) answer[0]--;
                    break;
                case "right":
                    if(board[0] != answer[0]) answer[0]++;
                    break;
            }
        }
        return answer;
    }
}