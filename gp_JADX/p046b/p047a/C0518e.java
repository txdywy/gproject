package p046b.p047a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class C0518e extends C0517z implements Iterator {
    public final ak f3691a;

    public C0518e(ak akVar) {
        super(akVar);
        this.f3691a = akVar;
    }

    protected abstract Object mo944a(int i);

    public Object next() {
        int a = mo943a();
        this.f3690e = a;
        if (a >= 0) {
            return mo944a(this.e);
        }
        throw new NoSuchElementException();
    }

    protected final int mo943a() {
        if (this.d != this.c.size()) {
            throw new ConcurrentModificationException();
        }
        int i;
        Object[] objArr = this.f3691a.f3686i;
        int i2 = this.e;
        while (true) {
            i = i2 - 1;
            if (i2 <= 0 || (objArr[i] != ak.f3685l && objArr[i] != ak.f3684k)) {
                return i;
            }
            i2 = i;
        }
        return i;
    }
}
