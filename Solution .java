import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);
        String sortedP = new String(pArray);
        int n = p.length();

        for (int i = 0; i <= s.length() - n; i++) {
            String c = s.substring(i, i + n);
            char[] cArray = c.toCharArray();
            Arrays.sort(cArray);
            String sortedC = new String(cArray);
            
            if (sortedC.equals(sortedP)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
