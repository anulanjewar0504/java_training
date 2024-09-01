package com.jbk.string;

public class Alternativeltyjoind {
	public static String interleaveStrings(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0, j = 0;

        while (i < len1 && j < len2) {
            output.append(word1.charAt(i));
            output.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append remaining characters from word1 (if any)
        while (i < len1) {
            output.append(word1.charAt(i));
            i++;
        }

        // Append remaining characters from word2 (if any)
        while (j < len2) {
            output.append(word2.charAt(j));
            j++;
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pqrst";
        String outputString = interleaveStrings(word1, word2);
        System.out.println(outputString);
    }
}

