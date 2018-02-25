package com.bvan.javaoop.lessons9_10.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = langs();
        Map<String, Integer> wordToCount = countWords(langs);
        System.out.println(wordToCount);
    }

    public static List<String> langs() {
        return Arrays.asList(
                "Java",
                "JavaScript",
                "Kotlin",
                "C#",
                "JavaScript",
                "Java",
                "Haskell",
                "JavaScript",
                "Java",
                "JavaScript",
                "Haskell",
                "Java"
        );
    }

    public static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }
        return wordToCount;
    }
}
