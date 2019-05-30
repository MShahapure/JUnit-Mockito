package com.app.bankexample.model;

public class Sun
{
    private Set set;

    private Rise rise;

    public Set getSet ()
    {
        return set;
    }

    public void setSet (Set set)
    {
        this.set = set;
    }

    public Rise getRise ()
    {
        return rise;
    }

    public void setRise (Rise rise)
    {
        this.rise = rise;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [set = "+set+", rise = "+rise+"]";
    }
}