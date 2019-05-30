package com.app.bankexample.model;

public class Location
{
    private Timestamp timestamp;

    private String thanks;

    private Rate rate;

    private Results[] results;

    private Status status;

    private String documentation;

    private Stay_informed stay_informed;

    private Licenses[] licenses;

    private String total_results;

    public Timestamp getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getThanks ()
    {
        return thanks;
    }

    public void setThanks (String thanks)
    {
        this.thanks = thanks;
    }

    public Rate getRate ()
    {
        return rate;
    }

    public void setRate (Rate rate)
    {
        this.rate = rate;
    }

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public Status getStatus ()
    {
        return status;
    }

    public void setStatus (Status status)
    {
        this.status = status;
    }

    public String getDocumentation ()
    {
        return documentation;
    }

    public void setDocumentation (String documentation)
    {
        this.documentation = documentation;
    }

    public Stay_informed getStay_informed ()
    {
        return stay_informed;
    }

    public void setStay_informed (Stay_informed stay_informed)
    {
        this.stay_informed = stay_informed;
    }

    public Licenses[] getLicenses ()
    {
        return licenses;
    }

    public void setLicenses (Licenses[] licenses)
    {
        this.licenses = licenses;
    }

    public String getTotal_results ()
    {
        return total_results;
    }

    public void setTotal_results (String total_results)
    {
        this.total_results = total_results;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", thanks = "+thanks+", rate = "+rate+", results = "+results+", status = "+status+", documentation = "+documentation+", stay_informed = "+stay_informed+", licenses = "+licenses+", total_results = "+total_results+"]";
    }
}
			
