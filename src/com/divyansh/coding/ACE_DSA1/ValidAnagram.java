package com.divyansh.coding.ACE_DSA1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if t is an anagram of s.
 * Anagram - it is a word formed by rearranging the letters of different word and phrase.
 * eg: 1) input s="anagram" t="nagaram" output: true [as t is anagram of s]
 *     2) input s="car" t="rat" output: false [as t is not a valid anagram of s]
 * Observations"
 * For a string to a anagram of other string:
 *  1) Length of two string should be equal.
 *  2) Frequency of the characters present in both the string should be equal.
 *
 *  Approach:
 *  1) Sorting:
 *     Sort both the strings and compare them if they are equal then they are anagram of each other else not.
 *     T.C = O(NlogN)
 *     S.C = O(1)
 *
 *  2) Hashing Approach:
 *      Iterate over the string s and store the frequency of each character at in a array at their ASCII value's index.
 *      Then iterate over the string t and try to decrement the frequency of the characters at their ASCII value's index.
 *      if in the end all the values present in the array is zero then return true else return false.
 *      T.C = O(N)
 *      S.C = 0(1) because we require a fix space that is O(256) with alphabets and special characters included. it will
 *      not change based upon the input
 *
 *
 **/

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "aa";
        String t = "aa";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {

        // Checking if the length of the strings are not equal then return false.
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Iterating over the string and storing the frequency of the characters.
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }

        // Iterating over the string and decrementing the frequency of the characters.
        for (char ch : t.toCharArray()) if (map.containsKey(ch)) map.put(ch, map.get(ch) - 1);

        // Checking if there is any value which is not zero, if yes then return false.
        for (Map.Entry<Character, Integer> entry : map.entrySet()) if (entry.getValue() != 0) return false;

        return true;
    }
}
