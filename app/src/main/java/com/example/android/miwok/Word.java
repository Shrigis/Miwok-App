package com.example.android.miwok;

/**
 * Created by JesseRich on 10/15/17.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResId;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Creates a Word object for the Phrases activity that only needs a default translation and
     * Miwok translation, no image
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResId
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResId = audioResId;
    }

    /**
     * Creates a Word object that includes an image for Numbers, Family,
     * and Colors activities
     *
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceID
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResId = audioResId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceID;
    }

    public int getAudioResId() {
        return mAudioResId;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
