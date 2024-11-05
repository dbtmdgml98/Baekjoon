class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = Long.toString(n);
        char[] array = s.toCharArray();
        
        int check;
        do {
            check = 0;
            for (int i = 0; i < s.length()-1; i++) {
                    if (array[i] < array[i+1]) {
                        char temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        check++;
                    }
            }
        } while (check != 0);
        
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        
        answer = Long.parseLong(str);
        return answer;
    }
}