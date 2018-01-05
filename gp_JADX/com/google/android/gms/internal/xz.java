package com.google.android.gms.internal;

@C5302b
public final class xz {
    public static final Object f27730a = new Object();
    public static xz f27731b;
    public final al f27732c = new al();
    public final xw f27733d;

    static {
        xz xzVar = new xz();
        synchronized (f27730a) {
            f27731b = xzVar;
        }
    }

    protected xz() {
        xv xvVar = new xv();
        xu xuVar = new xu();
        yj yjVar = new yj();
        yz yzVar = new yz();
        C5308g c5308g = new C5308g();
        this.f27733d = new xw(new ze());
    }

    public static xz m25997a() {
        xz xzVar;
        synchronized (f27730a) {
            xzVar = f27731b;
        }
        return xzVar;
    }
}
