package com.app.bankexample.model;

public class Timezone
{
    private String offset_sec;

    private String now_in_dst;

    private String name;

    private String short_name;

    private String offset_string;

    public String getOffset_sec ()
    {
        return offset_sec;
    }

    public void setOffset_sec (String offset_sec)
    {
        this.offset_sec = offset_sec;
    }

    public String getNow_in_dst ()
    {
        return now_in_dst;
    }

    public void setNow_in_dst (String now_in_dst)
    {
        this.now_in_dst = now_in_dst;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getShort_name ()
    {
        return short_name;
    }

    public void setShort_name (String short_name)
    {
        this.short_name = short_name;
    }

    public String getOffset_string ()
    {
        return offset_string;
    }

    public void setOffset_string (String offset_string)
    {
        this.offset_string = offset_string;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [offset_sec = "+offset_sec+", now_in_dst = "+now_in_dst+", name = "+name+", short_name = "+short_name+", offset_string = "+offset_string+"]";
    }
}
