package android.p004a.p005a.p006a;

import java.util.Iterator;

abstract class C0008g implements Iterator {
    public C0011e f12a;
    public C0011e f13b;

    C0008g(C0011e c0011e, C0011e c0011e2) {
        this.f12a = c0011e2;
        this.f13b = c0011e;
    }

    abstract C0011e mo2a(C0011e c0011e);

    public boolean hasNext() {
        return this.f13b != null;
    }

    public /* synthetic */ Object next() {
        C0011e c0011e;
        C0011e c0011e2 = this.f13b;
        if (this.f13b == this.f12a || this.f12a == null) {
            c0011e = null;
        } else {
            c0011e = mo2a(this.f13b);
        }
        this.f13b = c0011e;
        return c0011e2;
    }
}
