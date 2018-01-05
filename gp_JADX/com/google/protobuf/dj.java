package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class dj implements Iterator {
    public int f35350a = this.f35352c.f35344b.size();
    public Iterator f35351b;
    public final /* synthetic */ dh f35352c;

    dj(dh dhVar) {
        this.f35352c = dhVar;
    }

    public final boolean hasNext() {
        return (this.f35350a > 0 && this.f35350a <= this.f35352c.f35344b.size()) || m33297a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator m33297a() {
        if (this.f35351b == null) {
            this.f35351b = this.f35352c.f35348f.entrySet().iterator();
        }
        return this.f35351b;
    }

    public final /* synthetic */ Object next() {
        if (m33297a().hasNext()) {
            return (Entry) m33297a().next();
        }
        List list = this.f35352c.f35344b;
        int i = this.f35350a - 1;
        this.f35350a = i;
        return (Entry) list.get(i);
    }
}
