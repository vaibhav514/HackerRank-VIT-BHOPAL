// Check whether a given String S is a palindrome using recursion. Return true or false.

// Input Format

// String S

// Constraints

// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Output Format

// true or false

// Sample Input 0

// racecar
// Sample Output 0

// true
// Sample Input 1

// face
// Sample Output 1

// false
// *****************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = a.length()-1;
        boolean d = true;
        for(int c = 0;c<a.length();c++){
            if(a.charAt(c)!=a.charAt(b)){
                d = false;
            }
            b--;
        }
        System.out.println(d);
    }
}
