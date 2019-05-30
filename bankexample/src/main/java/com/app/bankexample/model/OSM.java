package com.app.bankexample.model;

public class OSM
{
    private String edit_url;

    private String url;

    public String getEdit_url ()
    {
        return edit_url;
    }

    public void setEdit_url (String edit_url)
    {
        this.edit_url = edit_url;
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
        return "ClassPojo [edit_url = "+edit_url+", url = "+url+"]";
    }
}