// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
// Input Format

// First Line is the number of elemenst you want in array
// Second line, give the array elements
// Constraints

// 1 <= temperatures.length <= 105
// 30 <= temperatures[i] <= 100
// Output Format

// Array within the array
// Sample Input 0

// 8
// 73 74 75 71 69 72 76 73
// Sample Output 0

// 1 1 4 2 1 1 0 0
// Sample Input 1

// 4
// 30 40 50 60
// Sample Output 1

// 1 1 1 0

// **************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int c = 0; c<a ; c++){
            b[c] = sc.nextInt();
        }
        int[] f = new int[a];
        for(int c = 0; c<a ; c++){
            int e = 0;
            for(int d = c; d<a ; d++){
                if(b[d]>b[c]){
                    e = d-c;
                    break;
                }
            }
            f[c]=e;
        }
        for(int c = 0; c<a ; c++){
            System.out.print(f[c] + " ");
        }
    }
}
