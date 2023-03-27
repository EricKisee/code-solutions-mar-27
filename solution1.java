// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Random;

class Solution {
    public String solution(String riddle) {
        // Implement your solution here
        String result = "";

        if (riddle.length()>100000){
            return result;
        }else{
            char[] chars = riddle.toCharArray();
        Random rand = new Random();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char c;
                do {
                    c = (char) ('a' + rand.nextInt(26));
                } while (i > 0 && c == chars[i-1] || i < chars.length - 1 && c == chars[i+1]);
                chars[i] = c;
            }
        }

        result = new String(chars);
        return result;
    }



    }

    
}
