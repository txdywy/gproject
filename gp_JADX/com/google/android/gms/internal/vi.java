package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class vi implements Iterator {
    public Iterator f27565a;

    public vi(Iterator it) {
        this.f27565a = it;
    }

    public final boolean hasNext() {
        return this.f27565a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f27565a.next();
        if (entry.getValue() instanceof vg) {
            return new vh(entry);
        }
        return entry;
    }

    public final void remove() {
        this.f27565a.remove();
    }
}
