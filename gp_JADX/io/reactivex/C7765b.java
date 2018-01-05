package io.reactivex;

import io.reactivex.internal.p557b.C7811n;
import io.reactivex.internal.p559e.p560a.C7817a;
import io.reactivex.p553c.C7770e;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.Future;
import org.p561a.C7820a;

public abstract class C7765b {
    public static final int f40283a = Math.max(16, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void mo6552a(C7820a c7820a);

    public static C7765b m37551a(Future future) {
        C7811n.m37615a((Object) future, "future is null");
        Object c7817a = new C7817a(future);
        C7770e c7770e = C7773a.f40291h;
        if (c7770e != null) {
            return (C7765b) C7773a.m37565a(c7770e, c7817a);
        }
        return c7817a;
    }
}
