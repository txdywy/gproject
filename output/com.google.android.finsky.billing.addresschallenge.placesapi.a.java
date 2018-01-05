package com.google.android.finsky.billing.addresschallenge.placesapi;

import android.content.Context;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

static class com.google.android.finsky.billing.addresschallenge.placesapi.a
{

    public static final HashMap a;
    public Context b;

    static {
        com.google.android.finsky.billing.addresschallenge.placesapi.a.a = new HashMap();
        v1 = com.google.android.finsky.billing.addresschallenge.placesapi.d.values();
        v0 = 0;
        while (v0 < v1.length) {
            if (v1[v0].h != 0)
                com.google.android.finsky.billing.addresschallenge.placesapi.a.a.put(v1[v0].h, v1[v0]);
            v0 = v0 + 1;
        }
    }

    a(Context p0) {
        this.b = p0;
    }

    static String a(LinkedList p0, com.google.android.finsky.billing.addresschallenge.placesapi.d p1) {
        v2 = p0.iterator();
        while (true) {
            if (!v2.hasNext()) {
                v0 = 0;
                return v0;
            }
            v0 = (com.google.android.finsky.billing.addresschallenge.placesapi.b)v2.next();
            if (v0.b == p1) {
                v2.remove();
                if (v2.hasNext() && ((com.google.android.finsky.billing.addresschallenge.placesapi.b)v2.next()).b == com.google.android.finsky.billing.addresschallenge.placesapi.d.g)
                    v2.remove();
                v0 = v0.a;
                return v0;
            }
        }
    }

    static LinkedList a(String p0) {
        try {
            v1 = new com.google.android.finsky.billing.addresschallenge.placesapi.c();
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader((String.valueOf(p0).length() + 34) + "<?xml version=\"1.0\"?><root>" + p0 + "</root>")), v1);
        }
        catch (ParserConfigurationException ex) {
            throw new AdrMicroformatParserException(ex);
        }
        catch (SAXException ex) {
            throw new AdrMicroformatParserException(ex);
        }
        catch (IOException ex) {
            throw new AdrMicroformatParserException(ex);
        }
        return v1.a;
    }

}
