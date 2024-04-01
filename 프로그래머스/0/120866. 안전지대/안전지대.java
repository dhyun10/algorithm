class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        // 1.지뢰의 위, 아래, 좌, 우 대각선 구역을 구하는 배열
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        // 2.배열의 최댓값
        int maxX = board.length;
        int maxY = board[0].length;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int k = 0; k < dx.length; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if(x >= 0 && y >= 0 && x < maxX && y < maxY && board[x][y] == 0) board[x][y] = 2;
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}