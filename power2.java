// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2^x.
// Do this by bit manipultion
// Input Format

// Integer N
// Constraints

// -2^31 <= n <= 2^31 - 1
// Output Format

// true or false
// Sample Input 0

// 3
// Sample Output 0

// false
// Sample Input 1

// 2
// Sample Output 1

// true
// ********************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean a = false;
        while(i>=2){
            if(i==0 || i==2){a=true;}
            i = i/2;
            }
        System.out.println(a);
    }
}
