class Solution {
    public int solution(int num) {  // int형이라서 626331일 때는 범위가 초과되는 문제 발생함
        int answer = 0;
        
        if (num == 1) {
            return 0;
        }
        
        while (num != 1) {
            if (answer == 400){
                return -1;
            } else if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
        }
        return answer;
    }
}