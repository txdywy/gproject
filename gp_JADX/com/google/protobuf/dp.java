package com.google.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

final class dp implements Iterator {
    public int f35360a = -1;
    public boolean f35361b;
    public Iterator f35362c;
    public final /* synthetic */ dh f35363d;

    dp(dh dhVar) {
        this.f35363d = dhVar;
    }

    public final boolean hasNext() {
        return this.f35360a + 1 < this.f35363d.f35344b.size() || (!this.f35363d.f35345c.isEmpty() && m33299a().hasNext());
    }

    public final void remove() {
        if (this.f35361b) {
            this.f35361b = false;
            this.f35363d.m33295e();
            if (this.f35360a < this.f35363d.f35344b.size()) {
                dh dhVar = this.f35363d;
                int i = this.f35360a;
                this.f35360a = i - 1;
                dhVar.m33293c(i);
                return;
            }
            m33299a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator m33299a() {
        if (this.f35362c == null) {
            this.f35362c = this.f35363d.f35345c.entrySet().iterator();
        }
        return this.f35362c;
    }

    public final /* synthetic */ Object next() {
        this.f35361b = true;
        int i = this.f35360a + 1;
        this.f35360a = i;
        if (i < this.f35363d.f35344b.size()) {
            return (Entry) this.f35363d.f35344b.get(this.f35360a);
        }
        return (Entry) m33299a().next();
    }
}
