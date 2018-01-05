package android.support.v4.p037h;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class C0318n implements Iterator, Entry {
    public int f1757a;
    public int f1758b;
    public boolean f1759c = false;
    public final /* synthetic */ C0306j f1760d;

    C0318n(C0306j c0306j) {
        this.f1760d = c0306j;
        this.f1757a = c0306j.mo372a() - 1;
        this.f1758b = -1;
    }

    public final boolean hasNext() {
        return this.f1758b < this.f1757a;
    }

    public final void remove() {
        if (this.f1759c) {
            this.f1760d.mo376a(this.f1758b);
            this.f1758b--;
            this.f1757a--;
            this.f1759c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object getKey() {
        if (this.f1759c) {
            return this.f1760d.mo374a(this.f1758b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f1759c) {
            return this.f1760d.mo374a(this.f1758b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object setValue(Object obj) {
        if (this.f1759c) {
            return this.f1760d.mo375a(this.f1758b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean equals(Object obj) {
        if (!this.f1759c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Entry)) {
            return false;
        } else {
            Entry entry = (Entry) obj;
            if (C0310e.m1674a(entry.getKey(), this.f1760d.mo374a(this.f1758b, 0)) && C0310e.m1674a(entry.getValue(), this.f1760d.mo374a(this.f1758b, 1))) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i = 0;
        if (this.f1759c) {
            Object a = this.f1760d.mo374a(this.f1758b, 0);
            Object a2 = this.f1760d.mo374a(this.f1758b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            this.f1758b++;
            this.f1759c = true;
            return this;
        }
        throw new NoSuchElementException();
    }
}
