import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 1.평행 = 기울기가 같다.
        // 2.점을 두 개씩 선택 = 점들은 중복되지 못한다.
        // 3.기울기가 소수점이 될 수 있음 = int가 아닌 double 사용
        int[] a = {};
        int[] b = {};
        for(int i = 0; i < dots.length; i++) {
            // 0 1,2 3 / 0 2,1 3 / 0 3,1 2
            double x = dots[0][0] - dots[i][0];
            double y = dots[0][1] - dots[i][1];

            double k1 = y / x;
            for(int j = 1; j < dots.length; j++) {
                if(i != j) {
                    a = dots[j];
                }
                for(int k = 1; k < dots.length; k++) {
                    if(k != i && k != j) {
                        b = dots[k];
                    }
                }
                x = b[0] - a[0];
                y = b[1] - a[1];
                double k2 = y / x;

                if(k1 == k2) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}