package com.google.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

final class bl implements Iterator {
    public Iterator f35229a;

    public bl(Iterator it) {
        this.f35229a = it;
    }

    public final boolean hasNext() {
        return this.f35229a.hasNext();
    }

    public final void remove() {
        this.f35229a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f35229a.next();
        if (entry.getValue() instanceof bj) {
            return new bk(entry);
        }
        return entry;
    }
}
