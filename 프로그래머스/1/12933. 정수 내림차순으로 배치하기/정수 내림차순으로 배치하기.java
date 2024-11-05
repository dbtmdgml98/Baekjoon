import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // Long값인 n을 string으로 변경하여 배열에 한글자씩 담음
        String[] array = String.valueOf(n).split("");
        
        // 오름차순 정렬
        Arrays.sort(array);
    
        // 내림차순 정렬
        String newstr = "";
        for(int i = array.length-1; i>=0; i--)
            newstr+=array[i];
        
        // Long형으로 변환
        answer = Long.parseLong(newstr);
        
        return answer;
    }
}