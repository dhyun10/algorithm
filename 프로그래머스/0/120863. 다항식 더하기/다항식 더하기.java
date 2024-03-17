class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split("\\s\\+\\s");
        int x = 0;
        int p = 0;
        for(String a : arr) {
            if(a.indexOf("x") > 0) {
                x += Integer.parseInt(a.replace("x", ""));
            } else if(a.equals("x")) {
                x += 1;
            } else {
                p += Integer.parseInt(a);
            }
        }

        answer = x > 0 ? x == 1 ? "x" : x+"x" : "";
        answer += p > 0 ? answer == "" ? p : " + "+ p : "";

        return answer;
    }
}