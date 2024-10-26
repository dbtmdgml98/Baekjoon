class Solution {
    public int solution(int num) { 
        int answer = 0;
        long numAgain = (long) num;  
        
        if (numAgain == 1) {
            return 0;
        }
        
        while (numAgain != 1) {
            if (answer == 500){
                return -1;
            } else if (numAgain % 2 == 0) {
                numAgain /= 2;
            } else {
                numAgain = (numAgain * 3) + 1;
            }
            answer++;
        }
        return answer;
    }
}