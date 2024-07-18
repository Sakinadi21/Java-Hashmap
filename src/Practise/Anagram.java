package Practise;

import java.util.HashMap;

public class Anagram {
    /**
     * This method creates a frequency map of characters in the given string.
     * @param str The input string.
     * @return A HashMap where the key is a character and the value is the frequency of that character in the string.
     */
    static HashMap<Character, Integer> makeFreqMap(String str) {
        // Initialize an empty HashMap to store the character frequencies.
        HashMap<Character, Integer> mp = new HashMap<>();

        // Iterate through each character in the string.
        for (int i = 0; i < str.length(); i++) {
            // Get the current character.
            Character ch = str.charAt(i);
            // Update the frequency of the character in the map.
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        // Return the completed frequency map.
        return mp;
    }

    /**
     * This method checks if two strings are anagrams of each other.
     * @param s The first input string.
     * @param t The second input string.
     * @return true if the strings are anagrams, false otherwise.
     */
    public static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they cannot be anagrams.
        if (s.length() != t.length())
            return false;

        // Create frequency maps for both strings.
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);

        // Check if the frequency maps are equal.
        return mp1.equals(mp2);
    }

    public static void main(String[] args) {
        // Test the isAnagram method with example strings.
        System.out.println(isAnagram("listen", "silent")); // should return true
        System.out.println(isAnagram("hello", "billion")); // should return false
    }
}
