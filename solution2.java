import java.util.*;

class Solution {
    int solution(int[] A) {
       int N = A.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            if (map.containsKey(A[i])) {
                int j = map.get(A[i]);
                result = Math.max(result, Math.abs(i - j));
            } else {
                map.put(A[i], i);
            }
        }
        
        return result;
    }
}
