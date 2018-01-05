package com.caverock.androidsvg;

import org.xml.sax.SAXException;

public class bx extends bg {
    protected bx() {
    }

    public final void mo1096a(bm bmVar) {
        if (bmVar instanceof bw) {
            this.i.add(bmVar);
        } else {
            String valueOf = String.valueOf(bmVar);
            throw new SAXException(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Text content elements cannot contain ").append(valueOf).append(" elements.").toString());
        }
    }
}
