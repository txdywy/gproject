package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class vw implements Iterator {
    public int f27579a = -1;
    public boolean f27580b;
    public Iterator f27581c;
    public /* synthetic */ vq f27582d;

    vw(vq vqVar) {
        this.f27582d = vqVar;
    }

    public final boolean hasNext() {
        return this.f27579a + 1 < this.f27582d.f27569b.size() || m25808a().hasNext();
    }

    public final void remove() {
        if (this.f27580b) {
            this.f27580b = false;
            this.f27582d.m25805d();
            if (this.f27579a < this.f27582d.f27569b.size()) {
                vq vqVar = this.f27582d;
                int i = this.f27579a;
                this.f27579a = i - 1;
                vqVar.m25804c(i);
                return;
            }
            m25808a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator m25808a() {
        if (this.f27581c == null) {
            this.f27581c = this.f27582d.f27570c.entrySet().iterator();
        }
        return this.f27581c;
    }

    public final /* synthetic */ Object next() {
        this.f27580b = true;
        int i = this.f27579a + 1;
        this.f27579a = i;
        return i < this.f27582d.f27569b.size() ? (Entry) this.f27582d.f27569b.get(this.f27579a) : (Entry) m25808a().next();
    }
}
