// Given an integer n, return true if it is a power of four. Otherwise, return false.
// An integer n is a power of four, if there exists an integer x such that n == 4^x.
// Input Format

// Take a number input
// Constraints

// -2^31 <= n <= 2^31 - 1
// Output Format

// true or false
// Sample Input 0

// 13
// Sample Output 0

// false
// Sample Input 1

// 4
// Sample Output 1

// true

//***************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean a = false;
        while(i>=4){
            if(i==0 || i==4){a=true;}
            i = i/4;
            }
        System.out.println(a);
    }
}
