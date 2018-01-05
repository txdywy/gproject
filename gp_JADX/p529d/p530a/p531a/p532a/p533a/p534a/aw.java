package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aw extends b {
    public static volatile aw[] f39919a;

    public static aw[] m37133d() {
        if (f39919a == null) {
            synchronized (C7219h.f35465b) {
                if (f39919a == null) {
                    f39919a = new aw[0];
                }
            }
        }
        return f39919a;
    }

    public aw() {
        this.aP = -1;
    }

    public final /* synthetic */ i m37134a(C7213a c7213a) {
        int a;
        do {
            a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                default:
                    break;
            }
            return this;
        } while (super.a(c7213a, a));
        return this;
    }
}
