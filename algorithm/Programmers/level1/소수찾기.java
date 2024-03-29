package Programmers.level1;
/**
소수 찾기

문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
 */
class FindPrimeNumber {
    public int solution(int n) {
      int answer = 0;
      int[] arr = new int[n+1];      
      arr[0] = arr[1] = 0; 
      for (int i = 2; i <= n; i++) {  arr[i] = i;  }
 
      for (int i = 2; i <= (int)Math.sqrt(n); i++) {
         if(arr[i] == 0) continue; 
         for (int j = i+i ; j <= n; j+=i) {  arr[j] = 0; }
      }
      
      for (int i = 0; i < arr.length; i++) {
        if(arr[i] != 0) answer++;
      }
    
     return answer;
    }
}