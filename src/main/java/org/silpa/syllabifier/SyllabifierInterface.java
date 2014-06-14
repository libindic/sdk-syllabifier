package org.silpa.syllabifier;

import java.util.List;

/**
 * Created by sujith on 14/6/14.
 */
public interface SyllabifierInterface {

    /**
     * This function returns syllabified text from given view
     *
     * @return syllabified text
     */
    public String getSyllabifiedText();

    /**
     * This function returns list of syllables of text from given view
     *
     * @return list of syllables
     */
    public List<String> getSyllables();

    /**
     * This function returns module name
     *
     * @return module name
     */
    public String getModuleName();

    /**
     * This function returns module information
     *
     * @return module information
     */
    public String getModuleInformation();
}
