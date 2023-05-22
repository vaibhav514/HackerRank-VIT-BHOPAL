// You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. If the element is not present in the array/list, then return -1.

// Input Format

// Value representing size of the array
// Line consists of 'n' space seperated integers representing the values present in the Array
// Target Element which we needs to find
// Constraints

// No

// Output Format

// Index of that target element

// Sample Input 0

// 3
// 1 2 3
// 0
// Sample Output 0

// -1
// Explanation 0

// 0 is not present in the array, so give -1 as answer
// **************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int c = 0 ; c <a;c++){
            b[c] = sc.nextInt();
        }
        int d = sc.nextInt();
        int e = -1;
        for(int c = 0 ; c <a;c++){
            if(d==b[c]){
                e = c;
            }
        }
        System.out.println(e);
    }
}
