package org.silpa.syllabifier;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sujith on 27/5/14.
 */
public class LanguageDetect {

    public static final int HINDI = 1;
    public static final int BENGALI = 2;
    public static final int PUNJABI = 3;
    public static final int GUJARATI = 4;
    public static final int ORIYA = 5;
    public static final int TAMIL = 6;
    public static final int TELUGU = 7;
    public static final int KANNADA = 8;
    public static final int MALAYALAM = 9;
    public static final int ENGLISH_US = 10;

    public static final String PUNCTUATIONS_REGEX = "[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~\\\\]";

    public static Map<String, Integer> detectLanguage(String text) {

        String[] words = text.split(" ");
        int wordCount = words.length;
        int wordIter = 0;
        Map<String, Integer> resultDict = new HashMap<String, Integer>();

        while (wordIter < wordCount) {
            String word = words[wordIter];
            if (word != null && word.length() != 0) {
                String origWord = word;
                word = word.replaceAll(LanguageDetect.PUNCTUATIONS_REGEX, "");
                int length = word.length();
                int index = 0;

                while (index < length) {
                    char letter = word.charAt(index);
                    if (!Character.isLetter(letter)) {
                        index = index + 1;
                        continue;
                    }

                    if (letter >= 0x0D00 && letter <= 0x0D7F) {
                        resultDict.put(origWord, LanguageDetect.MALAYALAM);
                        break;
                    }
                    if (letter >= 0x0980 && letter <= 0x09FF) {
                        resultDict.put(origWord, LanguageDetect.BENGALI);
                        break;
                    }
                    if (letter >= 0x0900 && letter <= 0x097F) {
                        resultDict.put(origWord, LanguageDetect.HINDI);
                        break;
                    }
                    if (letter >= 0x0A80 && letter <= 0x0AFF) {
                        resultDict.put(origWord, LanguageDetect.GUJARATI);
                        break;
                    }
                    if (letter >= 0x0A00 && letter <= 0x0A7F) {
                        resultDict.put(origWord, LanguageDetect.PUNJABI);
                        break;
                    }
                    if (letter >= 0x0C80 && letter <= 0x0CFF) {
                        resultDict.put(origWord, LanguageDetect.KANNADA);
                        break;
                    }
                    if (letter >= 0x0B00 && letter <= 0x0B7F) {
                        resultDict.put(origWord, LanguageDetect.ORIYA);
                        break;
                    }
                    if (letter >= 0x0B80 && letter <= 0x0BFF) {
                        resultDict.put(origWord, LanguageDetect.TAMIL);
                        break;
                    }
                    if (letter >= 0x0C00 && letter <= 0x0C7F) {
                        resultDict.put(origWord, LanguageDetect.TELUGU);
                        break;
                    }
                    if (letter <= 'z') {
                        resultDict.put(origWord, LanguageDetect.ENGLISH_US);
                        break;
                    }
                    index = index + 1;
                }
            }
            wordIter = wordIter + 1;
        }
        return resultDict;
    }
}
