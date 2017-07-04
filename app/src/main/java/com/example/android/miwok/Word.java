package com.example.android.miwok;

/**
 * Created by ayush on 30/6/17.
 */

public class Word {

    private String mEnglishTransition;
    private String mMiwokTransition;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public Word(String englishTransition, String miwokTransition, int audioResourceId){
        mEnglishTransition=englishTransition;
        mMiwokTransition=miwokTransition;
        mAudioResourceId = audioResourceId;
    }

    public Word(String englishTransition, String miwokTransition, int imageResourceId, int audioResourceId){
        mEnglishTransition=englishTransition;
        mMiwokTransition=miwokTransition;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getmEnglishTransition(){
        return mEnglishTransition;
    }

    public String getmMiwokTransition(){
        return mMiwokTransition;
    }



    public int getmImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){return mImageResourceId!=NO_IMAGE_PROVIDED;}

    public int getmAudioResourceId(){return mAudioResourceId;}
}
