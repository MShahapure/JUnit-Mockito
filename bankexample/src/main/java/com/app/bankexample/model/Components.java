package com.app.bankexample.model;

public class Components
{
    private String _type;

    private String state;

    private String ISO_3166_1_alpha_2;

    private String country_code;

    private String country;

    public String get_type ()
    {
        return _type;
    }

    public void set_type (String _type)
    {
        this._type = _type;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getISO_3166_1_alpha_2 ()
    {
        return ISO_3166_1_alpha_2;
    }

    public void setISO_3166_1_alpha_2 (String ISO_3166_1_alpha_2)
    {
        this.ISO_3166_1_alpha_2 = ISO_3166_1_alpha_2;
    }

    public String getCountry_code ()
    {
        return country_code;
    }

    public void setCountry_code (String country_code)
    {
        this.country_code = country_code;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [_type = "+_type+", state = "+state+", ISO_3166-1_alpha-2 = "+ISO_3166_1_alpha_2+", country_code = "+country_code+", country = "+country+"]";
    }
}
