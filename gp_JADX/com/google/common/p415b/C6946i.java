package com.google.common.p415b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

abstract class C6946i implements Iterator {
    public final Iterator f34327a;
    public Object f34328b = null;
    public Collection f34329c = null;
    public Iterator f34330d = bg.f34305a;
    public final /* synthetic */ C6943c f34331e;

    C6946i(C6943c c6943c) {
        this.f34331e = c6943c;
        this.f34327a = c6943c.f34277a.entrySet().iterator();
    }

    abstract Object mo5901a(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f34327a.hasNext() || this.f34330d.hasNext();
    }

    public Object next() {
        if (!this.f34330d.hasNext()) {
            Entry entry = (Entry) this.f34327a.next();
            this.f34328b = entry.getKey();
            this.f34329c = (Collection) entry.getValue();
            this.f34330d = this.f34329c.iterator();
        }
        return mo5901a(this.f34328b, this.f34330d.next());
    }

    public void remove() {
        this.f34330d.remove();
        if (this.f34329c.isEmpty()) {
            this.f34327a.remove();
        }
        this.f34331e.f34278b = this.f34331e.f34278b - 1;
    }
}
