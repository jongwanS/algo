import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_131 {
    /**
     Given a string s, partition s such that every
     substring
     of the partition is a
     palindrome
     . Return all possible palindrome partitioning of s.
     */

    /**
     Example 1:
     Input: s = "aab"
     Output: [["a","a","b"],["aa","b"]]
     Example 2:
     Input: s = "a"
     Output: [["a"]]

     Constraints:
     1 <= s.length <= 16
     s contains only lowercase English letters.
     */

    static class Solution {
        public List<List<String>> partition(String s) {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aab";
        solution.partition(s);
    }
}
