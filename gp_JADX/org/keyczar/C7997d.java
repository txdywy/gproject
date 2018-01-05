package org.keyczar;

import org.keyczar.exceptions.UnsupportedTypeException;
import org.keyczar.p571c.C7991c;

final class C7997d implements C7991c {
    public final /* synthetic */ C7994c f41010a;

    C7997d(C7994c c7994c) {
        this.f41010a = c7994c;
    }

    public final C7983p mo6654a(String str) {
        switch (this.f41010a.ordinal()) {
            case 0:
                return C7984a.m38173a(str);
            case 1:
                return C8003i.m38218a(str);
            case 2:
                return C7998e.m38200a(str);
            case 3:
                return C8001g.m38209a(str);
            case 4:
                return C8010r.m38237a(str);
            case 5:
                return C8012t.m38246a(str);
            default:
                throw new UnsupportedTypeException(this.f41010a);
        }
    }
}
