package android.p004a.p005a.p006a;

import java.util.Iterator;

public final class C0012f implements Iterator {
    public C0011e f16a;
    public boolean f17b = true;
    public final /* synthetic */ C0006b f18c;

    public C0012f(C0006b c0006b) {
        this.f18c = c0006b;
    }

    public final boolean hasNext() {
        if (this.f17b) {
            if (this.f18c.f7b != null) {
                return true;
            }
            return false;
        } else if (this.f16a == null || this.f16a.f14a == null) {
            return false;
        } else {
            return true;
        }
    }

    public final /* synthetic */ Object next() {
        C0011e c0011e;
        C0012f c0012f;
        if (this.f17b) {
            this.f17b = false;
            c0011e = this.f18c.f7b;
            c0012f = this;
        } else if (this.f16a != null) {
            c0011e = this.f16a.f14a;
            c0012f = this;
        } else {
            c0011e = null;
            c0012f = this;
        }
        c0012f.f16a = c0011e;
        return this.f16a;
    }
}
