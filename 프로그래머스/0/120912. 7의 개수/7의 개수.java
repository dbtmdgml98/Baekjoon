class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            do {
                int k = num % 10;
                num = num / 10; 
                
                if (k == 7) {
                    answer++;
                }
            } while (num != 0);
        
        }
                
        return answer;
    }
}