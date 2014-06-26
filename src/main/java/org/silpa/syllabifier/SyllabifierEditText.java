package org.silpa.syllabifier;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.silpa.render.IndicEditText;

import java.util.List;

/**
 * Created by sujith on 15/6/14.
 */
public class SyllabifierEditText extends IndicEditText implements SyllabifierInterface {

    /**
     * Syllabifier object
     */
    private Syllabifier syllabifier;

    /**
     * Specified output field from layout
     */
    private int mOutputResourceId;

    /**
     * View specified from layout to output results
     */
    private View mOutputView;

    /**
     * For Syllabified Text
     */
    private String mSyllabifiedText;

    // Log tag
    private static final String LOG_TAG = "SyllabifierEditText";

    public SyllabifierEditText(Context context) {
        super(context);
        init(null, 0);
        initView();
    }

    public SyllabifierEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
        initView();
    }

    public SyllabifierEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
        initView();
    }

    /**
     * Initialize data members
     *
     * @param attrs    attribute set
     * @param defStyle default style
     */
    private void init(AttributeSet attrs, int defStyle) {

        this.syllabifier = new Syllabifier();
        initAttrs(attrs, defStyle);
    }

    /**
     * Initialize attributes used
     *
     * @param attrs    attribute set
     * @param defStyle default style
     */
    private void initAttrs(AttributeSet attrs, int defStyle) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.SyllabifierEditText,
                defStyle, defStyle
        );

        try {
            this.mOutputResourceId = a.getResourceId(R.styleable.SyllabifierEditText_syllabifierOutputTo, -1);

        } catch (Exception e) {
            Log.e(LOG_TAG, "Error : " + e.getMessage());
        } finally {
            a.recycle();
        }
    }

    /**
     * Initialize view function
     */
    private void initView() {
        this.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (mOutputView == null && mOutputResourceId != -1) {
                    mOutputView = getRootView().findViewById(mOutputResourceId);
                }
                if (mOutputView != null) {
                    mSyllabifiedText = syllabifier.syllabify(getText().toString());
                    if (mOutputView instanceof EditText) {
                        ((EditText) mOutputView).setText(mSyllabifiedText);
                    } else if (mOutputView instanceof TextView) {
                        ((TextView) mOutputView).setText(mSyllabifiedText);
                    }
                }
            }
        });
    }

    /**
     * Explicitly set output field
     *
     * @param resourceId resource id of output field
     */
    public void setOutputField(int resourceId) {
        this.mOutputResourceId = resourceId;
    }

    /**
     * This function returns syllabified text from given view
     *
     * @return syllabified text
     */
    @Override
    public String getSyllabifiedText() {
        return this.mSyllabifiedText;
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
