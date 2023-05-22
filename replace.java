// Given a string, compute recursively a new string where all 'x' chars have been removed.

// Input Format

// String S

// Constraints

// 1 <= |S| <= 10^3 where |S| represents the length of string S.

// Output Format

// Modified string

// Sample Input 0

// xaxb
// Sample Output 0

// ab
// Sample Input 1

// abc
// Sample Output 1

// abc
// ***************************************************************************************************************************************************************
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for(int c = 0;c<a.length();c++){
            if(a.charAt(c)!='x'){
                b = b+a.charAt(c);
            }
        }
        System.out.println(b);
    }
}
