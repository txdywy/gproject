package android.support.v4.p037h;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class C0317m implements Set {
    public final /* synthetic */ C0306j f1756a;

    C0317m(C0306j c0306j) {
        this.f1756a = c0306j;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f1756a.mo380c();
    }

    public final boolean contains(Object obj) {
        return this.f1756a.mo373a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f1756a.mo379b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f1756a.mo372a() == 0;
    }

    public final Iterator iterator() {
        return new C0315k(this.f1756a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f1756a.mo373a(obj);
        if (a < 0) {
            return false;
        }
        this.f1756a.mo376a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.f1756a.mo379b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        return C0306j.m1633a(this.f1756a.mo379b(), collection);
    }

    public final int size() {
        return this.f1756a.mo372a();
    }

    public final Object[] toArray() {
        return this.f1756a.m1644b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f1756a.m1641a(objArr, 0);
    }

    public final boolean equals(Object obj) {
        return C0306j.m1634a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a = this.f1756a.mo372a() - 1; a >= 0; a--) {
            Object a2 = this.f1756a.mo374a(a, 0);
            i += a2 == null ? 0 : a2.hashCode();
        }
        return i;
    }
}
