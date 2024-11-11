import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int j = 0;
        int count = 0;
        
        // 나누어 떨어지는 원소 갯수 세기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
               count++;
            }
        }
        
        // 나누어 떨어지는 원소 없으면 -1 리턴
        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        // 나누어 떨어지는 원소 배열에 넣기
        int[] answer = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
               answer[j] = arr[i];
                j++;
            }
        }
        
        // 배열 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}