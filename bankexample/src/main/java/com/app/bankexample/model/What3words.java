package com.app.bankexample.model;

public class What3words
{
    private String words;

    public String getWords ()
    {
        return words;
    }

    public void setWords (String words)
    {
        this.words = words;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [words = "+words+"]";
    }
}
