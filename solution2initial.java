import java.util.*;

class Solution {
    int solution(int[] A) {
        int N = A.length;
        int result = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));
        return result;
    }
}
