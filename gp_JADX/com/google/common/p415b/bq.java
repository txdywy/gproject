package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Iterator;
import java.util.Map;

class bq extends cb {
    public final Map f34314b;

    bq(Map map) {
        this.f34314b = (Map) C6937m.m31623a((Object) map);
    }

    public Iterator iterator() {
        return bb.m31755a(this.f34314b.entrySet().iterator(), bm.f34311a);
    }

    public int size() {
        return this.f34314b.size();
    }

    public boolean isEmpty() {
        return this.f34314b.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.f34314b.containsKey(obj);
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f34314b.remove(obj);
        return true;
    }

    public void clear() {
        this.f34314b.clear();
    }
}
