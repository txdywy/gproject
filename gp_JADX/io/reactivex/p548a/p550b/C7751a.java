package io.reactivex.p548a.p550b;

import io.reactivex.C7754h;
import io.reactivex.p548a.p549a.C7750a;
import io.reactivex.p553c.C7770e;
import java.util.concurrent.Callable;

public final class C7751a {
    public static final C7754h f40273a;

    static {
        C7754h a;
        Callable c7752b = new C7752b();
        C7770e c7770e = C7750a.f40271a;
        if (c7770e == null) {
            a = C7750a.m37524a(c7752b);
        } else {
            a = (C7754h) C7750a.m37525a(c7770e, c7752b);
            if (a == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
        }
        f40273a = a;
    }
}
