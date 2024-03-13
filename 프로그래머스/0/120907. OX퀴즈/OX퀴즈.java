class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int oper = 1;
        int result = 0;
        
        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            oper = arr[1].equals("+") ? 1 : -1;
            result = Integer.parseInt(arr[0])+(Integer.parseInt(arr[2])*oper);
            
            answer[i] = result == Integer.parseInt(arr[4]) ? "O" : "X";
        }
        return answer;
    }
}