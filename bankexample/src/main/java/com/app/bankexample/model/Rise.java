package com.app.bankexample.model;

public class Rise
{
    private String astronomical;

    private String apparent;

    private String civil;

    private String nautical;

    public String getAstronomical ()
    {
        return astronomical;
    }

    public void setAstronomical (String astronomical)
    {
        this.astronomical = astronomical;
    }

    public String getApparent ()
    {
        return apparent;
    }

    public void setApparent (String apparent)
    {
        this.apparent = apparent;
    }

    public String getCivil ()
    {
        return civil;
    }

    public void setCivil (String civil)
    {
        this.civil = civil;
    }

    public String getNautical ()
    {
        return nautical;
    }

    public void setNautical (String nautical)
    {
        this.nautical = nautical;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [astronomical = "+astronomical+", apparent = "+apparent+", civil = "+civil+", nautical = "+nautical+"]";
    }
}
