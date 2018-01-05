package android.support.v4.p037h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class C0316l implements Set {
    public final /* synthetic */ C0306j f1755a;

    C0316l(C0306j c0306j) {
        this.f1755a = c0306j;
    }

    public final boolean addAll(Collection collection) {
        int a = this.f1755a.mo372a();
        for (Entry entry : collection) {
            this.f1755a.mo377a(entry.getKey(), entry.getValue());
        }
        return a != this.f1755a.mo372a();
    }

    public final void clear() {
        this.f1755a.mo380c();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f1755a.mo373a(entry.getKey());
        if (a >= 0) {
            return C0310e.m1674a(this.f1755a.mo374a(a, 1), entry.getValue());
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f1755a.mo372a() == 0;
    }

    public final Iterator iterator() {
        return new C0318n(this.f1755a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f1755a.mo372a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        return C0306j.m1634a((Set) this, obj);
    }

    public final int hashCode() {
        int a = this.f1755a.mo372a() - 1;
        int i = 0;
        while (a >= 0) {
            int i2;
            Object a2 = this.f1755a.mo374a(a, 0);
            Object a3 = this.f1755a.mo374a(a, 1);
            int hashCode = a2 == null ? 0 : a2.hashCode();
            if (a3 == null) {
                i2 = 0;
            } else {
                i2 = a3.hashCode();
            }
            a--;
            i += i2 ^ hashCode;
        }
        return i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
