// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
// Do this recursively.
// Input Format

// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Constraints

// 1 <= N <= 10^3

// Output Format

// true or false

// Sample Input 0

// 3
// 9 8 10
// 8
// Sample Output 0

// true
// Sample Input 1

// 3
// 9 8 10
// 2
// Sample Output 1

// false
// ********************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int c = 0;c<a;c++){
            b[c]=sc.nextInt();
        }
        int d = sc.nextInt();
        boolean e = false;
        for(int c = 0;c<a;c++){
            if(b[c]==d)e = true;;
        }
        System.out.println(e);
    }
}
