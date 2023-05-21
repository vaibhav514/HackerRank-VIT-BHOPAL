// Given a string s which represents an expression, evaluate this expression and return its value.
// The integer division should truncate toward zero.
// You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
// Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
// Input Format

// Take a string input
// Constraints

// 1 <= s.length <= 3 * 105
// s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
// s represents a valid expression.
// All the integers in the expression are non-negative integers in the range [0, 231 - 1].
// The answer is guaranteed to fit in a 32-bit integer.
// Output Format

// Integer having solution of our string
// Sample Input 0

// 3+2*2
// Sample Output 0

// 7
// Sample Input 1

// 3/2
// Sample Output 1

// 1
// ************************************************************************************************************************************************************

public class StringToIntExample1 {
    
    public static void main(String args[]) {
//Declaring String variable
        String s = "200+100";
        int g = 0;
        int j = 0;
        int k = 1;
        char l ;
        while (s.length > 0){
            if(s.charAt(i) =='+' || s.charAt(i) =='-' || s.charAt(i) =='*' || s.charAt(i) =='/') {
                l = s.charAt(i);
                g = Integer.parseInt(s.substring(0, i));
                s = s.substring(i+1);
                
            }
        }
        System.out.println(s);
        System.out.println(g);
    }
}
