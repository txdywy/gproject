package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class C6958q extends AbstractCollection {
    public final Object f34347a;
    public Collection f34348b;
    public final C6958q f34349c;
    public final Collection f34350d;
    public final /* synthetic */ C6943c f34351e;

    C6958q(C6943c c6943c, Object obj, Collection collection, C6958q c6958q) {
        Collection collection2;
        this.f34351e = c6943c;
        this.f34347a = obj;
        this.f34348b = collection;
        this.f34349c = c6958q;
        if (c6958q == null) {
            collection2 = null;
        } else {
            collection2 = c6958q.f34348b;
        }
        this.f34350d = collection2;
    }

    final void m31806a() {
        if (this.f34349c != null) {
            this.f34349c.m31806a();
            if (this.f34349c.f34348b != this.f34350d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f34348b.isEmpty()) {
            Collection collection = (Collection) this.f34351e.f34277a.get(this.f34347a);
            if (collection != null) {
                this.f34348b = collection;
            }
        }
    }

    final void m31807b() {
        while (this.f34349c != null) {
            this = this.f34349c;
        }
        if (this.f34348b.isEmpty()) {
            this.f34351e.f34277a.remove(this.f34347a);
        }
    }

    final void m31808c() {
        while (this.f34349c != null) {
            this = this.f34349c;
        }
        this.f34351e.f34277a.put(this.f34347a, this.f34348b);
    }

    public int size() {
        m31806a();
        return this.f34348b.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m31806a();
        return this.f34348b.equals(obj);
    }

    public int hashCode() {
        m31806a();
        return this.f34348b.hashCode();
    }

    public String toString() {
        m31806a();
        return this.f34348b.toString();
    }

    public Iterator iterator() {
        m31806a();
        return new C6961r(this);
    }

    public boolean add(Object obj) {
        m31806a();
        boolean isEmpty = this.f34348b.isEmpty();
        boolean add = this.f34348b.add(obj);
        if (add) {
            this.f34351e.f34278b = this.f34351e.f34278b + 1;
            if (isEmpty) {
                m31808c();
            }
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f34348b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        C6943c.m31669a(this.f34351e, this.f34348b.size() - size);
        if (size != 0) {
            return addAll;
        }
        m31808c();
        return addAll;
    }

    public boolean contains(Object obj) {
        m31806a();
        return this.f34348b.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        m31806a();
        return this.f34348b.containsAll(collection);
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.f34348b.clear();
            C6943c.m31671b(this.f34351e, size);
            m31807b();
        }
    }

    public boolean remove(Object obj) {
        m31806a();
        boolean remove = this.f34348b.remove(obj);
        if (remove) {
            this.f34351e.f34278b = this.f34351e.f34278b - 1;
            m31807b();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f34348b.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        C6943c.m31669a(this.f34351e, this.f34348b.size() - size);
        m31807b();
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        C6937m.m31623a((Object) collection);
        int size = size();
        boolean retainAll = this.f34348b.retainAll(collection);
        if (retainAll) {
            C6943c.m31669a(this.f34351e, this.f34348b.size() - size);
            m31807b();
        }
        return retainAll;
    }
}
