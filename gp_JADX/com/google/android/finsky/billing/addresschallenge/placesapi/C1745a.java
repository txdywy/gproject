package com.google.android.finsky.billing.addresschallenge.placesapi;

import android.content.Context;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

public final class C1745a {
    public static final HashMap f9049a = new HashMap();
    public Context f9050b;

    public C1745a(Context context) {
        this.f9050b = context;
    }

    static String m9651a(LinkedList linkedList, C1748d c1748d) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C1746b c1746b = (C1746b) it.next();
            if (c1746b.f9052b == c1748d) {
                it.remove();
                if (it.hasNext() && ((C1746b) it.next()).f9052b == C1748d.SEPARATOR) {
                    it.remove();
                }
                return c1746b.f9051a;
            }
        }
        return null;
    }

    static LinkedList m9652a(String str) {
        try {
            SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
            DefaultHandler c1747c = new C1747c();
            newSAXParser.parse(new InputSource(new StringReader(new StringBuilder(String.valueOf(str).length() + 34).append("<?xml version=\"1.0\"?><root>").append(str).append("</root>").toString())), c1747c);
            return c1747c.f9053a;
        } catch (Throwable e) {
            throw new AdrMicroformatParserException(e);
        } catch (Throwable e2) {
            throw new AdrMicroformatParserException(e2);
        } catch (Throwable e22) {
            throw new AdrMicroformatParserException(e22);
        }
    }

    static {
        for (C1748d c1748d : C1748d.values()) {
            if (c1748d.f9064h != null) {
                f9049a.put(c1748d.f9064h, c1748d);
            }
        }
    }
}
