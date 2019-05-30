package com.app.bankexample.model;

public class Licenses
{
    private String name;

    private String url;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", url = "+url+"]";
    }
}
