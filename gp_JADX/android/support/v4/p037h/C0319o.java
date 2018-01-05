package android.support.v4.p037h;

import java.util.Collection;
import java.util.Iterator;

final class C0319o implements Collection {
    public final /* synthetic */ C0306j f1761a;

    C0319o(C0306j c0306j) {
        this.f1761a = c0306j;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f1761a.mo380c();
    }

    public final boolean contains(Object obj) {
        return this.f1761a.mo378b(obj) >= 0;
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
        return this.f1761a.mo372a() == 0;
    }

    public final Iterator iterator() {
        return new C0315k(this.f1761a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f1761a.mo378b(obj);
        if (b < 0) {
            return false;
        }
        this.f1761a.mo376a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i = 0;
        int a = this.f1761a.mo372a();
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f1761a.mo374a(i, 1))) {
                this.f1761a.mo376a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int i = 0;
        int a = this.f1761a.mo372a();
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f1761a.mo374a(i, 1))) {
                this.f1761a.mo376a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f1761a.mo372a();
    }

    public final Object[] toArray() {
        return this.f1761a.m1644b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f1761a.m1641a(objArr, 1);
    }
}
