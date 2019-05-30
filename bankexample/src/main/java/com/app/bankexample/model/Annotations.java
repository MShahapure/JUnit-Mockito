package com.app.bankexample.model;

public class Annotations
{
    private Mercator Mercator;

    private String wikidata;

    private DMS DMS;

    private String MGRS;

    private Sun sun;

    private Currency currency;

    private String geohash;

    private OSM OSM;

    private String qibla;

    private Timezone timezone;

    private What3words what3words;

    private String flag;

    private String callingcode;

    private String Maidenhead;

    public Mercator getMercator ()
    {
        return Mercator;
    }

    public void setMercator (Mercator Mercator)
    {
        this.Mercator = Mercator;
    }

    public String getWikidata ()
    {
        return wikidata;
    }

    public void setWikidata (String wikidata)
    {
        this.wikidata = wikidata;
    }

    public DMS getDMS ()
    {
        return DMS;
    }

    public void setDMS (DMS DMS)
    {
        this.DMS = DMS;
    }

    public String getMGRS ()
    {
        return MGRS;
    }

    public void setMGRS (String MGRS)
    {
        this.MGRS = MGRS;
    }

    public Sun getSun ()
    {
        return sun;
    }

    public void setSun (Sun sun)
    {
        this.sun = sun;
    }

    public Currency getCurrency ()
    {
        return currency;
    }

    public void setCurrency (Currency currency)
    {
        this.currency = currency;
    }

    public String getGeohash ()
    {
        return geohash;
    }

    public void setGeohash (String geohash)
    {
        this.geohash = geohash;
    }

    public OSM getOSM ()
    {
        return OSM;
    }

    public void setOSM (OSM OSM)
    {
        this.OSM = OSM;
    }

    public String getQibla ()
    {
        return qibla;
    }

    public void setQibla (String qibla)
    {
        this.qibla = qibla;
    }

    public Timezone getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (Timezone timezone)
    {
        this.timezone = timezone;
    }

    public What3words getWhat3words ()
    {
        return what3words;
    }

    public void setWhat3words (What3words what3words)
    {
        this.what3words = what3words;
    }

    public String getFlag ()
    {
        return flag;
    }

    public void setFlag (String flag)
    {
        this.flag = flag;
    }

    public String getCallingcode ()
    {
        return callingcode;
    }

    public void setCallingcode (String callingcode)
    {
        this.callingcode = callingcode;
    }

    public String getMaidenhead ()
    {
        return Maidenhead;
    }

    public void setMaidenhead (String Maidenhead)
    {
        this.Maidenhead = Maidenhead;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Mercator = "+Mercator+", wikidata = "+wikidata+", DMS = "+DMS+", MGRS = "+MGRS+", sun = "+sun+", currency = "+currency+", geohash = "+geohash+", OSM = "+OSM+", qibla = "+qibla+", timezone = "+timezone+", what3words = "+what3words+", flag = "+flag+", callingcode = "+callingcode+", Maidenhead = "+Maidenhead+"]";
    }
}
