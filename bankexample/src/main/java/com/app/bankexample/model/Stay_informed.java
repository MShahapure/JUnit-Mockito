package com.app.bankexample.model;

public class Stay_informed
{
    private String twitter;

    private String blog;

    public String getTwitter ()
    {
        return twitter;
    }

    public void setTwitter (String twitter)
    {
        this.twitter = twitter;
    }

    public String getBlog ()
    {
        return blog;
    }

    public void setBlog (String blog)
    {
        this.blog = blog;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [twitter = "+twitter+", blog = "+blog+"]";
    }
}
