// Given two integers a and b, return the sum of the two integers without using the operators + and -.
// Input Format

// First Line Integer num1
// Second Line Integer num2
// Constraints

// -1000 <= a, b <= 1000
// Output Format

// addition of two numbers
// Sample Input 0

// 1
// 3
// Sample Output 0

// 4
// Sample Input 1

// 2
// 3
// Sample Output 1

// 5
// ***************************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        for(int k = 1 ; k < i+1;k++){
            j++;
        }
        System.out.println(j);
}
}
