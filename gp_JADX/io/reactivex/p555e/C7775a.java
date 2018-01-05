package io.reactivex.p555e;

import io.reactivex.C7754h;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.p553c.C7770e;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.Callable;

public final class C7775a {
    public static final C7754h f40299a;

    static {
        C7754h a;
        Callable c7783i = new C7783i();
        C7811n.m37615a((Object) c7783i, "Scheduler Callable can't be null");
        C7770e c7770e = C7773a.f40287d;
        if (c7770e == null) {
            a = C7773a.m37563a(c7783i);
        } else {
            a = C7773a.m37562a(c7770e, c7783i);
        }
        f40299a = a;
        c7783i = new C7777c();
        C7811n.m37615a((Object) c7783i, "Scheduler Callable can't be null");
        c7770e = C7773a.f40286c;
        if (c7770e == null) {
            C7773a.m37563a(c7783i);
        } else {
            C7773a.m37562a(c7770e, c7783i);
        }
        c7783i = new C7778d();
        C7811n.m37615a((Object) c7783i, "Scheduler Callable can't be null");
        c7770e = C7773a.f40288e;
        if (c7770e == null) {
            C7773a.m37563a(c7783i);
        } else {
            C7773a.m37562a(c7770e, c7783i);
        }
        c7783i = new C7781g();
        C7811n.m37615a((Object) c7783i, "Scheduler Callable can't be null");
        c7770e = C7773a.f40289f;
        if (c7770e == null) {
            C7773a.m37563a(c7783i);
        } else {
            C7773a.m37562a(c7770e, c7783i);
        }
    }
}
