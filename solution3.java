class Solution {
    public int solution(int[] S) {
      //change.. initial code
      //int max_sum = 0;
      int max_sum = -1;
      int current_sum = 0;
      boolean positive = false;
      int n = S.length;
      for (int i = 0; i < n; ++i) {
          int item = S[i];
          if (item < 0) {
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                    current_sum = 0;
                }
          } else {
                positive = true;
                current_sum += item;
          }
      }
      if (current_sum > max_sum) {
          max_sum = current_sum;
      }
      if (positive) {
          return max_sum;
      }
      return -1;
    }
}
