package com.google.common.p415b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class C6942y implements bt {
    public transient Collection f34273c;
    public transient Set f34274d;
    public transient Collection f34275e;
    public transient Map f34276f;

    C6942y() {
    }

    abstract Iterator mo5860g();

    abstract Map mo5861h();

    public boolean mo5865c(Object obj) {
        for (Collection contains : mo5854l().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean mo5851b(Object obj, Object obj2) {
        Collection collection = (Collection) mo5854l().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean mo5852c(Object obj, Object obj2) {
        Collection collection = (Collection) mo5854l().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public boolean mo5850a(Object obj, Object obj2) {
        return mo5855b(obj).add(obj2);
    }

    public Collection mo5868i() {
        Collection collection = this.f34273c;
        if (collection == null) {
            if (this instanceof bz) {
                collection = new aa(this);
            } else {
                collection = new C6941z(this);
            }
            this.f34273c = collection;
        }
        return collection;
    }

    public Set mo5869j() {
        Set set = this.f34274d;
        if (set != null) {
            return set;
        }
        set = mo5858e();
        this.f34274d = set;
        return set;
    }

    Set mo5858e() {
        return new bq(mo5854l());
    }

    public Collection mo5853k() {
        Collection collection = this.f34275e;
        if (collection != null) {
            return collection;
        }
        collection = new ab(this);
        this.f34275e = collection;
        return collection;
    }

    Iterator mo5859f() {
        return bb.m31755a(mo5868i().iterator(), bm.f34312b);
    }

    public Map mo5854l() {
        Map map = this.f34276f;
        if (map != null) {
            return map;
        }
        map = mo5861h();
        this.f34276f = map;
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        return mo5854l().equals(((bt) obj).mo5854l());
    }

    public int hashCode() {
        return mo5854l().hashCode();
    }

    public String toString() {
        return mo5854l().toString();
    }
}
