package com.google.android.finsky.billing.addresschallenge.placesapi;

import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

final class C1747c extends DefaultHandler {
    public LinkedList f9053a = new LinkedList();
    public C1748d f9054b = C1748d.SEPARATOR;
    public StringBuilder f9055c = new StringBuilder();

    C1747c() {
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.f9054b != C1748d.SEPARATOR) {
            throw new SAXException("Invalid nested element.");
        }
        String value = attributes.getValue("class");
        if (value != null) {
            C1748d c1748d = (C1748d) C1745a.f9049a.get(value);
            if (c1748d == null) {
                c1748d = C1748d.UNKNOWN;
            }
            m9653a();
            this.f9054b = c1748d;
        }
    }

    public final void endElement(String str, String str2, String str3) {
        if (this.f9054b != C1748d.SEPARATOR) {
            m9653a();
            this.f9054b = C1748d.SEPARATOR;
        }
    }

    public final void endDocument() {
        m9653a();
    }

    public final void characters(char[] cArr, int i, int i2) {
        this.f9055c.append(cArr, i, i2);
    }

    private final void m9653a() {
        if (this.f9055c.length() > 0) {
            this.f9053a.add(new C1746b(this.f9055c.toString(), this.f9054b));
            this.f9055c = new StringBuilder();
        }
    }
}
