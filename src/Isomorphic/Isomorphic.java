package Isomorphic;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Create a HashMap to store the character mappings from s to t
        HashMap<Character, Character> mp = new HashMap<>();
        // Create a HashMap to store the character mappings from t to s
        HashMap<Character, Character> reverseMp = new HashMap<>();

        // Iterate through each character in the strings
        for (int i = 0; i < s.length(); i++) {
            // Get the current characters from both strings
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            // Check if there is already a mapping for sCh
            if (mp.containsKey(sCh)) {
                // If the existing mapping does not match tCh, return false
                if (!mp.get(sCh).equals(tCh)) {
                    return false;
                }
            } else {
                // Check if tCh is already mapped to a different character
                if (reverseMp.containsKey(tCh)) {
                    return false;
                }
                // Create new mappings in both HashMaps
                mp.put(sCh, tCh);
                reverseMp.put(tCh, sCh);
            }
        }
        // If all characters can be mapped consistently, return true
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add")); // should return true
        System.out.println(solution.isIsomorphic("foo", "bar")); // should return false
        System.out.println(solution.isIsomorphic("paper", "title")); // should return true
    }
}
