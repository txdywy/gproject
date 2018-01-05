package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class C6943c extends C6942y implements Serializable {
    public transient Map f34277a;
    public transient int f34278b;

    protected C6943c(Map map) {
        C6937m.m31630a(map.isEmpty());
        this.f34277a = map;
    }

    abstract Collection mo5862b();

    public int mo5856c() {
        return this.f34278b;
    }

    public boolean mo5850a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f34277a.get(obj);
        if (collection == null) {
            collection = mo5862b();
            if (collection.add(obj2)) {
                this.f34278b++;
                this.f34277a.put(obj, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f34278b++;
            return true;
        }
    }

    public void mo5857d() {
        for (Collection clear : this.f34277a.values()) {
            clear.clear();
        }
        this.f34277a.clear();
        this.f34278b = 0;
    }

    public Collection mo5855b(Object obj) {
        Collection collection = (Collection) this.f34277a.get(obj);
        if (collection == null) {
            collection = mo5862b();
        }
        return m31672a(obj, collection);
    }

    final Collection m31672a(Object obj, Collection collection) {
        if (collection instanceof NavigableSet) {
            return new C6964u(this, obj, (NavigableSet) collection, null);
        }
        if (collection instanceof SortedSet) {
            return new C6963w(this, obj, (SortedSet) collection, null);
        }
        if (collection instanceof Set) {
            return new C6965v(this, obj, (Set) collection);
        }
        if (collection instanceof List) {
            return m31673a(obj, (List) collection, null);
        }
        return new C6958q(this, obj, collection, null);
    }

    final List m31673a(Object obj, List list, C6958q c6958q) {
        if (list instanceof RandomAccess) {
            return new C6960n(this, obj, list, c6958q);
        }
        return new C6959s(this, obj, list, c6958q);
    }

    final Set mo5858e() {
        if (this.f34277a instanceof NavigableMap) {
            return new C6957m(this, (NavigableMap) this.f34277a);
        }
        if (this.f34277a instanceof SortedMap) {
            return new C6956p(this, (SortedMap) this.f34277a);
        }
        return new C6952j(this, this.f34277a);
    }

    final Iterator mo5859f() {
        return new C6947d(this);
    }

    final Iterator mo5860g() {
        return new C6948e(this);
    }

    final Map mo5861h() {
        if (this.f34277a instanceof NavigableMap) {
            return new C6955l(this, (NavigableMap) this.f34277a);
        }
        if (this.f34277a instanceof SortedMap) {
            return new C6954o(this, (SortedMap) this.f34277a);
        }
        return new C6949f(this, this.f34277a);
    }

    static /* synthetic */ int m31669a(C6943c c6943c, int i) {
        int i2 = c6943c.f34278b + i;
        c6943c.f34278b = i2;
        return i2;
    }

    static /* synthetic */ int m31671b(C6943c c6943c, int i) {
        int i2 = c6943c.f34278b - i;
        c6943c.f34278b = i2;
        return i2;
    }
}
