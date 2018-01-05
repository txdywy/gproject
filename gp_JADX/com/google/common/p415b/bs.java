package com.google.common.p415b;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

abstract class bs extends AbstractMap {
    public transient Set f34316d;
    public transient Set f34317e;
    public transient Collection f34318f;

    bs() {
    }

    abstract Set mo5902a();

    public Set entrySet() {
        Set set = this.f34316d;
        if (set != null) {
            return set;
        }
        set = mo5902a();
        this.f34316d = set;
        return set;
    }

    public Set keySet() {
        Set set = this.f34317e;
        if (set != null) {
            return set;
        }
        set = mo5910e();
        this.f34317e = set;
        return set;
    }

    Set mo5910e() {
        return new bq(this);
    }

    public Collection values() {
        Collection collection = this.f34318f;
        if (collection != null) {
            return collection;
        }
        collection = new br(this);
        this.f34318f = collection;
        return collection;
    }
}
