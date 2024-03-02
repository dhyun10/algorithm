class Solution {
    public int solution(int[] array) {
        int[] arr = new int[1000];
        for(int a : array) {
            arr[a]++;
        }
        
        int max = 0; //최빈값
        int cnt = 0; //최빈값의 개수
        for(int i = 0; i < arr.length; i++) {
            if(cnt < arr[i]) {
                cnt = arr[i];
                max = i;
            }
        }
        
        int temp = 0; //최빈값의 중복 개수
        for(int b : arr) {
            if(cnt == b) temp++;
        }
        
        return temp == 1 ? max : -1;
    }
}