package com.example.codetribe.soshatourguide;

/**
 * Created by CodeTribe on 8/1/2017.
 */

public class Word {
    private String mName;
    private String mAddress;
    private String mContactNumber;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static  final int NO_IMAGE_PROVIDED= -1;
    private String mMore;
    private String mSepitoriTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceId;

    public Word(String mName, String mAddress, String mContactNumber) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mContactNumber = mContactNumber;
    }

    public String getmSepitoriTranslation() {
        return mSepitoriTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public Word(String mSepitoriTranslation, String mDefaultTranslation, int mAudioResourceId) {
        this.mSepitoriTranslation = mSepitoriTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word() {
    }

    public Word(String mName, String mAddress, String mContactNumber, int mImageResourceId, String mMore) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mContactNumber = mContactNumber;
        this.mImageResourceId = mImageResourceId;
        this.mMore = mMore;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmContactNumber() {
        return mContactNumber;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public static int getNoImageProvided() {
        return NO_IMAGE_PROVIDED;
    }

    public boolean hasImage()

    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getmMore() {
        return mMore;
    }


}
