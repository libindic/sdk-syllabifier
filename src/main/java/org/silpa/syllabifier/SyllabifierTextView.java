package org.silpa.syllabifier;

import android.content.Context;
import android.util.AttributeSet;

import org.silpa.render.IndicTextView;

import java.util.List;

/**
 * Created by sujith on 15/6/14.
 */
public class SyllabifierTextView extends IndicTextView implements SyllabifierInterface {

    /**
     * Syllabifier object
     */
    private Syllabifier syllabifier;

    /**
     * For Syllabified Text
     */
    private String mSyllabifiedText;

    /**
     * Constructor
     *
     * @param context context of application
     */
    public SyllabifierTextView(Context context) {
        super(context);
        init();
    }

    /**
     * Constructor
     *
     * @param context context of application
     * @param attrs   attribute set
     */
    public SyllabifierTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    /**
     * Constructor
     *
     * @param context  context of application
     * @param attrs    attribute set
     * @param defStyle default style
     */
    public SyllabifierTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        this.syllabifier = new Syllabifier();
    }


    /**
     * This function returns syllabified text from given view
     *
     * @return syllabified text
     */
    @Override
    public String getSyllabifiedText() {
        return this.syllabifier.syllabify(getText().toString());
    }

    /**
     * This function returns list of syllables of text from given view
     *
     * @return list of syllables
     */
    @Override
    public List<String> getSyllables() {
        return this.syllabifier.getSyllables(getText().toString());
    }

    /**
     * This function returns module name
     *
     * @return module name
     */
    @Override
    public String getModuleName() {
        return this.syllabifier.getModuleName();
    }

    /**
     * This function returns module information
     *
     * @return module information
     */
    @Override
    public String getModuleInformation() {
        return this.syllabifier.getModuleInformation();
    }
}
