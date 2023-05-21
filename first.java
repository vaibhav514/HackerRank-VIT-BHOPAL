// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Input Format

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.
// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Constraints

// No

// Output Format

// Integer representing the answer of the problem statement.

// Sample Input 0

// 6
// 7 1 5 3 6 4

// Sample Output 0

// 5

// Explanation 0

// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Sample Input 1

// 5
// 7 6 4 3 1

// Sample Output 1

// 0

// *****************************************************************************************************************************************

import java.io.*;
import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] g;
        g = new int[i] ;
        int profit = 0;
        for(int f = 0; f<i;f++){
            g[f] = sc.nextInt();
        }
        for(int f = 0;f<i;f++){
            for(int d = f+1;d<i;d++){
                if((g[d] - g[f])>profit){
                    profit = (g[d] - g[f]);
                }
            }
        }
        System.out.println(profit);
    }
}
