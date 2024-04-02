class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};

        // 1. 점수의 평균값 배열 (소수점인 경우가 존재할 수 있음)
        double[] avg = new double[score.length];
        for(int i = 0; i < score.length; i++) {
            int tot = 0;
            for(int j : score[i]) {
                tot += j;
            }
            avg[i] = (double) tot / score[i].length;
        }

        // 2. 평균값 비교
        answer = new int[score.length];
        for(int i = 0; i < avg.length; i++) {
            answer[i]++;
            for(int j = 0; j < avg.length; j++) {
                if(avg[i] > avg[j]) answer[j]++;
            }
        }
        
        return answer;
    }
}