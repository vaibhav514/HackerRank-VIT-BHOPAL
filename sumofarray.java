// Given an array of length N, you need to find and return the sum of all elements of the array.
// Do this recursively.
// Input Format

// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Constraints

// 1 <= N <= 10^3

// Output Format

// sum

// Sample Input 0

// 3
// 9 8 9
// Sample Output 0

// 26
// Sample Input 1

// 3
// 0 0 0
// Sample Output 1

// 0
// *****************************************************************************************************************************************************************
  
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] g = new int[i] ;
        int sum = 0;
        for(int f = 0; f<i;f++){
            g[f] = sc.nextInt();
            sum = sum + g[f];
        }
        System.out.println(sum);
    }
}
