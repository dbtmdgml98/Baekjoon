class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double num = (double)num1/num2;
        System.out.print(num);
        answer = (int)(num*1000);
        return answer;
    }
}