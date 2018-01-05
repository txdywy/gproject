package android.support.v4.p037h;

import java.util.Map;

final class C0307b extends C0306j {
    public final /* synthetic */ C0305a f1720a;

    C0307b(C0305a c0305a) {
        this.f1720a = c0305a;
    }

    protected final int mo372a() {
        return this.f1720a.h;
    }

    protected final Object mo374a(int i, int i2) {
        return this.f1720a.g[(i << 1) + i2];
    }

    protected final int mo373a(Object obj) {
        return this.f1720a.m1626a(obj);
    }

    protected final int mo378b(Object obj) {
        return this.f1720a.m1628b(obj);
    }

    protected final Map mo379b() {
        return this.f1720a;
    }

    protected final void mo377a(Object obj, Object obj2) {
        this.f1720a.put(obj, obj2);
    }

    protected final Object mo375a(int i, Object obj) {
        C0304u c0304u = this.f1720a;
        int i2 = (i << 1) + 1;
        Object obj2 = c0304u.f1714g[i2];
        c0304u.f1714g[i2] = obj;
        return obj2;
    }

    protected final void mo376a(int i) {
        this.f1720a.m1631d(i);
    }

    protected final void mo380c() {
        this.f1720a.clear();
    }
}
