package android.support.v4.p037h;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C0315k implements Iterator {
    public final int f1750a;
    public int f1751b;
    public int f1752c;
    public boolean f1753d = false;
    public final /* synthetic */ C0306j f1754e;

    C0315k(C0306j c0306j, int i) {
        this.f1754e = c0306j;
        this.f1750a = i;
        this.f1751b = c0306j.mo372a();
    }

    public final boolean hasNext() {
        return this.f1752c < this.f1751b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f1754e.mo374a(this.f1752c, this.f1750a);
            this.f1752c++;
            this.f1753d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f1753d) {
            this.f1752c--;
            this.f1751b--;
            this.f1753d = false;
            this.f1754e.mo376a(this.f1752c);
            return;
        }
        throw new IllegalStateException();
    }
}
