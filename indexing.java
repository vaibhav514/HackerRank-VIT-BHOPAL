// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format

// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Constraints

// 1 <= N <= 10^3
// Output Format

// indexes where x is present in the array (separated by space)
// Sample Input 0

// 5
// 9 8 10 8 8
// 8
// Sample Output 0

// 1 3 4
// Sample Input 1

// 5
// 9 8 10 8 8
// 9
// Sample Output 1

// 0
// *********************************************************************************************************************************************************************

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
        for(int c = 0;c<a;c++){
            if(b[c]==d)System.out.print(c +" ");
        }
    }
}
