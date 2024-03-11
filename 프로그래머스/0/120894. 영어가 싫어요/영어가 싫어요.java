class Solution {
    public long solution(String numbers) {
        String[] str_eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i <= 9; i++) {
            numbers = numbers.replaceAll(str_eng[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}