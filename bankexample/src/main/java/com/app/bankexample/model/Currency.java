package com.app.bankexample.model;

public class Currency
{
    private String thousands_separator;

    private String subunit;

    private String iso_code;

    private String smallest_denomination;

    private String symbol;

    private String subunit_to_unit;

    private String name;

    private String iso_numeric;

    private String html_entity;

    private String decimal_mark;

    private String symbol_first;

    private String[] alternate_symbols;

    public String getThousands_separator ()
    {
        return thousands_separator;
    }

    public void setThousands_separator (String thousands_separator)
    {
        this.thousands_separator = thousands_separator;
    }

    public String getSubunit ()
    {
        return subunit;
    }

    public void setSubunit (String subunit)
    {
        this.subunit = subunit;
    }

    public String getIso_code ()
    {
        return iso_code;
    }

    public void setIso_code (String iso_code)
    {
        this.iso_code = iso_code;
    }

    public String getSmallest_denomination ()
    {
        return smallest_denomination;
    }

    public void setSmallest_denomination (String smallest_denomination)
    {
        this.smallest_denomination = smallest_denomination;
    }

    public String getSymbol ()
    {
        return symbol;
    }

    public void setSymbol (String symbol)
    {
        this.symbol = symbol;
    }

    public String getSubunit_to_unit ()
    {
        return subunit_to_unit;
    }

    public void setSubunit_to_unit (String subunit_to_unit)
    {
        this.subunit_to_unit = subunit_to_unit;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getIso_numeric ()
    {
        return iso_numeric;
    }

    public void setIso_numeric (String iso_numeric)
    {
        this.iso_numeric = iso_numeric;
    }

    public String getHtml_entity ()
    {
        return html_entity;
    }

    public void setHtml_entity (String html_entity)
    {
        this.html_entity = html_entity;
    }

    public String getDecimal_mark ()
    {
        return decimal_mark;
    }

    public void setDecimal_mark (String decimal_mark)
    {
        this.decimal_mark = decimal_mark;
    }

    public String getSymbol_first ()
    {
        return symbol_first;
    }

    public void setSymbol_first (String symbol_first)
    {
        this.symbol_first = symbol_first;
    }

    public String[] getAlternate_symbols ()
    {
        return alternate_symbols;
    }

    public void setAlternate_symbols (String[] alternate_symbols)
    {
        this.alternate_symbols = alternate_symbols;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [thousands_separator = "+thousands_separator+", subunit = "+subunit+", iso_code = "+iso_code+", smallest_denomination = "+smallest_denomination+", symbol = "+symbol+", subunit_to_unit = "+subunit_to_unit+", name = "+name+", iso_numeric = "+iso_numeric+", html_entity = "+html_entity+", decimal_mark = "+decimal_mark+", symbol_first = "+symbol_first+", alternate_symbols = "+alternate_symbols+"]";
    }
}
