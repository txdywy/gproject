package com.google.android.finsky.billing.addresschallenge.placesapi;

import java.util.HashMap;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public final class com.google.android.finsky.billing.addresschallenge.placesapi.c extends DefaultHandler
{

    public LinkedList a;
    public com.google.android.finsky.billing.addresschallenge.placesapi.d b;
    public StringBuilder c;

    c() {
        DefaultHandler();
        this.a = new LinkedList();
        this.b = com.google.android.finsky.billing.addresschallenge.placesapi.d.g;
        this.c = new StringBuilder();
    }

    private final void a() {
        if (this.c.length() > 0) {
            this.a.add(new com.google.android.finsky.billing.addresschallenge.placesapi.b(this.c.toString(), this.b));
            this.c = new StringBuilder();
        }
    }

    public final void characters(char[] p0, int p1, int p2) {
        this.c.append(p0, p1, p2);
    }

    public final void endDocument() {
        this.a();
    }

    public final void endElement(String p0, String p1, String p2) {
        if (this.b != com.google.android.finsky.billing.addresschallenge.placesapi.d.g) {
            this.a();
            this.b = com.google.android.finsky.billing.addresschallenge.placesapi.d.g;
        }
    }

    public final void startElement(String p0, String p1, String p2, Attributes p3) {
        if (this.b != com.google.android.finsky.billing.addresschallenge.placesapi.d.g)
            throw new SAXException("Invalid nested element.");
        v0 = p3.getValue("class");
        if (v0 != 0) {
            v0 = (com.google.android.finsky.billing.addresschallenge.placesapi.d)com.google.android.finsky.billing.addresschallenge.placesapi.a.a.get(v0);
            if (v0 == 0)
                v0 = com.google.android.finsky.billing.addresschallenge.placesapi.d.f;
            this.a();
            this.b = v0;
        }
    }

}
