package Day23;

import java.util.*;

public class LC438 {

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {

            List<Integer> ans = new ArrayList<>();

            if (s.length() < p.length())
                return ans;

            int[] count = new int[26];

            for (char c : p.toCharArray())
                count[c - 'a']++;

            int left = 0, right = 0, need = p.length();

            while (right < s.length()) {

                if (count[s.charAt(right) - 'a']-- > 0)
                    need--;

                right++;

                if (need == 0)
                    ans.add(left);

                if (right - left == p.length()) {
                    if (count[s.charAt(left) - 'a']++ >= 0)
                        need++;
                    left++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.findAnagrams("cbaebabacd", "abc"));
    }
}