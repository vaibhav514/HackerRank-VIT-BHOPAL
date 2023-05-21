// First line contains the value of size of your array
// Line consists of 'n' space seperated integers representing the values present in the Array
// Third line having the K value, how much you want to rotate
// Constraints

// 1 <= nums.length <= 10^5
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 10^5
// Output Format

// Rotated Array
// Sample Input 0

// 7
// 1 2 3 4 5 6 7
// 3
// Sample Output 0

// 5 6 7 1 2 3 4
// Explanation 0

// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Sample Input 1

// 4
// -1 -100 3 99
// 2
// Sample Output 1

// 3 99 -1 -100
// Explanation 1

// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]

// *****************************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] g = new int[i] ;
        int[] h = new int[i] ;
        int profit = 0;
        for(int f = 0; f<i; f++) {
            g[f] = sc.nextInt();
        }
        int j = sc.nextInt();
        j = j%i;
        if(j>0)j = i-j;
        else if (j<0) j= i+j-1;
        for(int f = 0; f<i; f++) {
            h[f] = g[j];
            j=j+1;
            j=j%i;
        }
        
        for (int f = 0; f < h.length; f++) {
            System.out.print(h[f] + " ");
        }
    }
}
