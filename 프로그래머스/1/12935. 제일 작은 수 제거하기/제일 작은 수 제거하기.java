import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        // 제일 작은 수 찾기
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print(min);
        // 제일 작은 수 제거
        int j = 0;
        int[] answer = new int[arr.length - 1];
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[j] = arr[i];
                j++;
            }
         }
        
        // 오름차순
        // Arrays.sort(answer);
        
        // 내림차순
        //Arrays.sort(answer, Collections.reverseOrder());
        
        
        return answer;
    }
}