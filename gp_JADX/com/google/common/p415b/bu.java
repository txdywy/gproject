package com.google.common.p415b;

import java.util.AbstractCollection;
import java.util.Map.Entry;

abstract class bu extends AbstractCollection {
    bu() {
    }

    abstract bt mo5849a();

    public int size() {
        return mo5849a().mo5856c();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return mo5849a().mo5851b(entry.getKey(), entry.getValue());
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return mo5849a().mo5852c(entry.getKey(), entry.getValue());
    }

    public void clear() {
        mo5849a().mo5857d();
    }
}
