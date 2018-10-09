package com.android.djordje.beoquiz;

import java.io.Serializable;

public class Question implements Serializable{
//implements serializable to save disabled buttons after rotation

    private int mTextResId;
    private boolean mAnswerTrue;

    private boolean mAlreadyAnswered;

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


    public boolean isAlreadyAnswered() {
        return mAlreadyAnswered;
    }

    public void setAlreadyAnswered(boolean alreadyAnswered) {
        mAlreadyAnswered = alreadyAnswered;
    }
}
