package com.app.bankexample.model;

public class Timestamp
{
    private String created_unix;

    private String created_http;

    public String getCreated_unix ()
    {
        return created_unix;
    }

    public void setCreated_unix (String created_unix)
    {
        this.created_unix = created_unix;
    }

    public String getCreated_http ()
    {
        return created_http;
    }

    public void setCreated_http (String created_http)
    {
        this.created_http = created_http;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [created_unix = "+created_unix+", created_http = "+created_http+"]";
    }
}
