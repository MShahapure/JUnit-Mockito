package com.app.bankexample.model;

public class Results
{
    private Bounds bounds;

    private String formatted;

    private String confidence;

    private Components components;

    private Annotations annotations;

    private Geometry geometry;

    public Bounds getBounds ()
    {
        return bounds;
    }

    public void setBounds (Bounds bounds)
    {
        this.bounds = bounds;
    }

    public String getFormatted ()
    {
        return formatted;
    }

    public void setFormatted (String formatted)
    {
        this.formatted = formatted;
    }

    public String getConfidence ()
    {
        return confidence;
    }

    public void setConfidence (String confidence)
    {
        this.confidence = confidence;
    }

    public Components getComponents ()
    {
        return components;
    }

    public void setComponents (Components components)
    {
        this.components = components;
    }

    public Annotations getAnnotations ()
    {
        return annotations;
    }

    public void setAnnotations (Annotations annotations)
    {
        this.annotations = annotations;
    }

    public Geometry getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (Geometry geometry)
    {
        this.geometry = geometry;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [bounds = "+bounds+", formatted = "+formatted+", confidence = "+confidence+", components = "+components+", annotations = "+annotations+", geometry = "+geometry+"]";
    }
}
