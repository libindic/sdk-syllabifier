package org.smc.silpamodules.syllabifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by sujith on 27/5/14.
 */
public class Syllabifier {

    public static final String SYLLABIFIER_MODULE_NAME = "Syllabifier";
    public static final String SYLLABIFIER_MODULE_INFORMATION = "Split words into Syllables";

    private static final String LOG_TAG = Syllabifier.SYLLABIFIER_MODULE_NAME;


    /**
     * This function syllabifies Malayalam text
     *
     * @param text malayalam text
     * @return syllabified malayalam text
     */
    public List<String> syllabifyMalayalam(String text) {

        final List<Character> SIGNS = Arrays.asList('\u0d02', '\u0d03',
                '\u0d3e', '\u0d3f', '\u0d40', '\u0d41', '\u0d42', '\u0d43',
                '\u0d44', '\u0d46', '\u0d47', '\u0d48', '\u0d4a', '\u0d4b',
                '\u0d4c', '\u0d4d', '\u0d57');
        final List<Character> LIMITERS = Arrays.asList('.', '\"', '\'', '`',
                '!', ';', ',', '?');

        char chandrakkala = '\u0d4d';

        List<String> lstChars = new ArrayList<String>();

        for (char ch : text.toCharArray()) {

            if (LIMITERS.contains(ch)) {
                lstChars.add("" + ch);
            } else if (SIGNS.contains(ch)) {
                lstChars.set(lstChars.size() - 1,
                        lstChars.get(lstChars.size() - 1) + ch);
            } else {
                try {

                    int listSize = lstChars.size();
                    String lastElement = lstChars.get(lstChars.size() - 1);

                    if (lastElement.charAt(lastElement.length() - 1) == chandrakkala) {
                        lstChars.set(listSize - 1, lastElement + ch);
                    } else {
                        lstChars.add("" + ch);
                    }
                } catch (IndexOutOfBoundsException e) {
                    lstChars.add("" + ch);
                }
            }
        }
        return lstChars;
    }

    /**
     * This function syllabifies Kannada text
     *
     * @param text Kannada text
     * @return syllabified Kannada text
     */
    public List<String> syllabifyKannada(String text) {

        final List<Character> SIGNS = Arrays.asList('\u0c82', '\u0c83', '\u0cbd',
                '\u0cbe', '\u0cbf', '\u0cc0', '\u0cc1', '\u0cc2',
                '\u0cc3', '\u0cc4', '\u0cc6', '\u0cc7', '\u0cc8',
                '\u0cca', '\u0ccb', '\u0ccc', '\u0ccd');
        final List<Character> LIMITERS = Arrays.asList('.', '\"', '\'', '`',
                '!', ';', ',', '?');

        char halant = '\u0ccd';

        List<String> lstChars = new ArrayList<String>();

        for (char ch : text.toCharArray()) {

            if (LIMITERS.contains(ch)) {
                lstChars.add("" + ch);
            } else if (SIGNS.contains(ch)) {
                lstChars.set(lstChars.size() - 1,
                        lstChars.get(lstChars.size() - 1) + ch);
            } else {
                try {

                    int listSize = lstChars.size();
                    String lastElement = lstChars.get(lstChars.size() - 1);

                    if (lastElement.charAt(lastElement.length() - 1) == halant) {
                        lstChars.set(listSize - 1, lastElement + ch);
                    } else {
                        lstChars.add("" + ch);
                    }
                } catch (IndexOutOfBoundsException e) {
                    lstChars.add("" + ch);
                }
            }
        }
        return lstChars;
    }

    /**
     * This function syllabifies Bengali text
     *
     * @param text Bengali text
     * @return syllabified Bengali text
     */
    public List<String> syllabifyBengali(String text) {

        final List<Character> SIGNS = Arrays.asList('\u0981', '\u0982', '\u0983',
                '\u09bd', '\u09be', '\u09bf', '\u09c0', '\u09c1',
                '\u09c2', '\u09c3', '\u09c4', '\u09c6', '\u09c7',
                '\u09c8', '\u09ca', '\u09cb', '\u09cc', '\u09cd',
                '\u09d7');
        final List<Character> LIMITERS = Arrays.asList('.', '\"', '\'', '`',
                '!', ';', ',', '?');

        char halant = '\u09cd';

        List<String> lstChars = new ArrayList<String>();

        for (char ch : text.toCharArray()) {

            if (LIMITERS.contains(ch)) {
                lstChars.add("" + ch);
            } else if (SIGNS.contains(ch)) {
                lstChars.set(lstChars.size() - 1,
                        lstChars.get(lstChars.size() - 1) + ch);
            } else {
                try {

                    int listSize = lstChars.size();
                    String lastElement = lstChars.get(lstChars.size() - 1);

                    if (lastElement.charAt(lastElement.length() - 1) == halant) {
                        lstChars.set(listSize - 1, lastElement + ch);
                    } else {
                        lstChars.add("" + ch);
                    }
                } catch (IndexOutOfBoundsException e) {
                    lstChars.add("" + ch);
                }
            }
        }
        return lstChars;
    }

    /**
     * This function syllabifies Hindi text
     *
     * @param text Hindi text
     * @return syllabified Hindi text
     */
    public List<String> syllabifyHindi(String text) {

        final List<Character> SIGNS = Arrays.asList('\u0902', '\u0903', '\u093e',
                '\u093f', '\u0940', '\u0941', '\u0942', '\u0943',
                '\u0944', '\u0946', '\u0947', '\u0948', '\u094a',
                '\u094b', '\u094c', '\u094d');
        final List<Character> LIMITERS = Arrays.asList('.', '\"', '\'', '`',
                '!', ';', ',', '?');

        char virama = '\u094d';

        List<String> lstChars = new ArrayList<String>();

        for (char ch : text.toCharArray()) {

            if (LIMITERS.contains(ch)) {
                lstChars.add("" + ch);
            } else if (SIGNS.contains(ch)) {
                lstChars.set(lstChars.size() - 1,
                        lstChars.get(lstChars.size() - 1) + ch);
            } else {
                try {

                    int listSize = lstChars.size();
                    String lastElement = lstChars.get(lstChars.size() - 1);

                    if (lastElement.charAt(lastElement.length() - 1) == virama) {
                        lstChars.set(listSize - 1, lastElement + ch);
                    } else {
                        lstChars.add("" + ch);
                    }
                } catch (IndexOutOfBoundsException e) {
                    lstChars.add("" + ch);
                }
            }
        }
        return lstChars;
    }

    /**
     * This function syllabifies Tamil text
     *
     * @param text Tamil text
     * @return syllabified Tamil text
     */
    public List<String> syllabifyTamil(String text) {

        final List<Character> SIGNS = Arrays.asList('\u0b81', '\u0b82', '\u0b83',
                '\u0bbd', '\u0bbe', '\u0bbf', '\u0bc0', '\u0bc1',
                '\u0bc2', '\u0bc3', '\u0bc4', '\u0bc6', '\u0bc7',
                '\u0bc8', '\u0bca', '\u0bcb', '\u0bcc', '\u0bcd',
                '\u0bd7');
        final List<Character> LIMITERS = Arrays.asList('.', '\"', '\'', '`',
                '!', ';', ',', '?');

        char virama = '\u0bcd';

        List<String> lstChars = new ArrayList<String>();

        for (char ch : text.toCharArray()) {

            if (LIMITERS.contains(ch)) {
                lstChars.add("" + ch);
            } else if (SIGNS.contains(ch)) {
                lstChars.set(lstChars.size() - 1,
                        lstChars.get(lstChars.size() - 1) + ch);
            } else {
                try {

                    int listSize = lstChars.size();
                    String lastElement = lstChars.get(lstChars.size() - 1);

                    if (lastElement.charAt(lastElement.length() - 1) == virama) {
                        lstChars.set(listSize - 1, lastElement + ch);
                    } else {
                        lstChars.add("" + ch);
                    }
                } catch (IndexOutOfBoundsException e) {
                    lstChars.add("" + ch);
                }
            }
        }
        return lstChars;
    }

    /**
     * This function syllabifies English text
     *
     * @param text English text
     * @return syllabified English text
     */
    public String syllabifyEnglish(String text) {

        //text = " " + text + " ";

        final List<String> VOWEL_LIST = Arrays.asList("a", "e", "i", "o", "u", "y");
        final List<String> VOWEL_PAIRS = Arrays.asList("ai", "au", "aw", "ee", "ea",
                "oa", "oi", "ou", "oo", "ow", "oy", "uu");
        final List<String> CONSONANT_PAIRS = Arrays.asList("b", "c", "d", "f", "g",
                "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v",
                "w", "x", "z");
        final List<String> CONSONANT_BLENDS = Arrays.asList("bl", "br", "ch", "chr",
                "cl", "cr", "dr", "fl", "fr", "gl", "gr", "kn", "pl", "pr",
                "sc", "sh", "sk", "sl", "sm", "sn", "sp", "spr", "squ", "st",
                "str", "sw", "th", "tr", "thr", "nt", "wh");

        for (int i = 0; i < 2; i++) {
            text = (Pattern.compile("([0-9])([0-9])", Pattern.CASE_INSENSITIVE)
                    .matcher(text)).replaceAll("$1#$2");
        }

        text = (Pattern.compile("i([aeiuy])([bcdfghjklmnpqrstvwxz])",
                Pattern.CASE_INSENSITIVE).matcher(text)).replaceAll("i+$1+$2");

        text = (Pattern.compile("the([aeiouy])([bcdfghjklmnpqrstvwxz])",
                Pattern.CASE_INSENSITIVE).matcher(text))
                .replaceAll("the+$1+$2");

        text = (Pattern.compile("([bcdfghjklmnpqrstvwxz])$1([^ ])",
                Pattern.CASE_INSENSITIVE).matcher(text)).replaceAll("$1-$1$2");

        int position = 0;
        while (position < text.length() - 1) {
            if (VOWEL_LIST.contains("" + text.charAt(position))
                    && VOWEL_LIST.contains("" + text.charAt(position + 1))) {
                if (!(VOWEL_PAIRS.contains(text.substring(position,
                        position + 2)))) {
                    if (!(Arrays.asList("tion", "dual", "nion", "quir", "tiou")
                            .contains(text
                                    .substring(position - 1, position + 3)))) {
                        text = text.substring(0, position + 1) + "_"
                                + text.substring(position + 1);
                    }
                }
            }
            position = position + 1;
        }

        int start = 0;
        int end = 0;

        while (start < text.length() - 1) {
            if (VOWEL_LIST.contains("" + text.charAt(start))
                    && CONSONANT_PAIRS.contains("" + text.charAt(start + 1))) {
                end = start + 1;
                while (end <= text.length() - 1
                        && CONSONANT_PAIRS.contains("" + text.charAt(end))) {
                    end = end + 1;
                }

                if (end <= text.length() - 1
                        && (CONSONANT_PAIRS.contains(text.substring(start + 1,
                        end)) || CONSONANT_BLENDS.contains(text
                        .substring(start + 1, end)))
                        && VOWEL_LIST.contains("" + text.charAt(end))
                        && !(text.substring(end, end + 2).equals("e "))) {
                    text = text.substring(0, start + 1) + "/"
                            + text.substring(start + 1);
                }
            }
            start = start + 1;
        }

        start = 0;
        end = 0;

        while (start < text.length() - 1) {
            if (VOWEL_LIST.contains("" + text.charAt(start))
                    && CONSONANT_PAIRS.contains("" + text.charAt(start + 1))) {
                end = start + 2;
                while (end <= text.length() - 1
                        && CONSONANT_PAIRS.contains("" + text.charAt(end))) {
                    end = end + 1;
                }

                if (end <= text.length() - 1 && end > start + 2
                        && VOWEL_LIST.contains("" + text.charAt(end))) {
                    if (!(CONSONANT_BLENDS.contains(text.substring(start + 1,
                            end)))) {
                        text = text.substring(0, start + 2) + "-"
                                + text.substring(start + 2);
                    }
                }
            }
            start = start + 1;
        }
        return text;
    }

    public List<String> getSyllables(String text) {
        int language = LanguageDetect.detectLanguage(text.split(" ")[0]).get(text.split(" ")[0]);

        List<String> syllables;

        if (language == LanguageDetect.MALAYALAM) {
            syllables = syllabifyMalayalam(text);
        } else if (language == LanguageDetect.HINDI) {
            syllables = syllabifyHindi(text);
        } else if (language == LanguageDetect.KANNADA) {
            syllables = syllabifyKannada(text);
        } else if (language == LanguageDetect.BENGALI) {
            syllables = syllabifyBengali(text);
        } else if (language == LanguageDetect.TAMIL) {
            syllables = syllabifyTamil(text);
        } else if (language == LanguageDetect.ENGLISH_US) {
            String str = syllabifyEnglish(text);
            syllables = new ArrayList<String>();
            for (char ch : str.toCharArray()) {
                syllables.add("" + ch);
            }
        } else {
            syllables = new ArrayList<String>();
            for (char ch : text.toCharArray()) {
                syllables.add("" + ch);
            }
        }
        return syllables;
    }

    /**
     * This function accepts text, detects language and outputs syllabified text
     *
     * @param text English, Malayalam, Hindi, Bengali, Kannada, Tamil text
     * @return syllabified text
     */
    public String syllabify(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }

        List<String> syllables = getSyllables(text);

        String syllabifiedText = "";
        for (String str : syllables) {
            syllabifiedText = syllabifiedText + str;
        }
        return syllabifiedText;
    }

    /**
     * This function returns module name
     *
     * @return
     */
    public String getModuleName() {
        return Syllabifier.SYLLABIFIER_MODULE_NAME;
    }

    /**
     * This function returns module information
     *
     * @return
     */
    public String getModuleInformation() {
        return SYLLABIFIER_MODULE_INFORMATION;
    }
}
