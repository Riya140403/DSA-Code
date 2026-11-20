/*Given an integer n.Generate all possible combinations of well-formed parentheses of length 2 x N.

Example 1:
Input : n = 3

Output : [ "((()))" , "(()())" , "(())()" , "()(())" , "()()()" ]

Example 2:
Input : 2

Output : [ "(())" , "()()" ] */

import java.util.ArrayList ;
import java.util.List;
public class ParenthesesRecursion {
    public List<String> generateParentheses(int n){
        List <String> ans = new ArrayList <> ();
        solve("", 0, 0, n, ans);
        return ans ;
    }
     public void solve (
            String current,
            int open,
            int close,
            int n,
            List<String> ans
     ) {
        if(open == n && close == n){
            ans.add(current);
            return ;
        }

        if(open < n){
            solve(current + "(", open + 1, close, n, ans);
        }

        if(close < open){
            solve(current + ")", open, close + 1 , n, ans);
        }
     }
}
