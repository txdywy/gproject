package p002a.p003a;

import p000c.p001a.C0000a;
import p002a.C0002a;

public final class C0003b implements C0002a, C0000a {
    public static final Object f1a = new Object();
    public volatile C0000a f2b;
    public volatile Object f3c = f1a;

    private C0003b(C0000a c0000a) {
        this.f2b = c0000a;
    }

    public final Object mo1a() {
        Object obj = this.f3c;
        if (obj == f1a) {
            synchronized (this) {
                obj = this.f3c;
                if (obj == f1a) {
                    obj = this.f2b.mo1a();
                    Object obj2 = this.f3c;
                    if (obj2 == f1a || obj2 == obj) {
                        this.f3c = obj;
                        this.f2b = null;
                    } else {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(obj);
                        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length()).append("Scoped provider was invoked recursively returning different results: ").append(valueOf).append(" & ").append(valueOf2).append(". This is likely due to a circular dependency.").toString());
                    }
                }
            }
        }
        return obj;
    }

    public static C0000a m3a(C0000a c0000a) {
        C0004c.m6a(c0000a);
        return c0000a instanceof C0003b ? c0000a : new C0003b(c0000a);
    }

    public static C0002a m4b(C0000a c0000a) {
        if (c0000a instanceof C0002a) {
            return (C0002a) c0000a;
        }
        return new C0003b((C0000a) C0004c.m6a(c0000a));
    }
}
