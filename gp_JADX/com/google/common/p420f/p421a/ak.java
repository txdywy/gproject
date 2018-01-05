package com.google.common.p420f.p421a;

import com.google.common.p414a.C6930e;
import com.google.common.p414a.C6937m;
import com.google.common.p415b.at;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class ak extends ao {
    public static au m31876a(Object obj) {
        if (obj == null) {
            return ar.f34395b;
        }
        return new ar(obj);
    }

    public static au m31877a(Throwable th) {
        C6937m.m31623a((Object) th);
        return new aq(th);
    }

    public static au m31875a(au auVar, C6983y c6983y, Executor executor) {
        return C6996o.m31924a(auVar, c6983y, executor);
    }

    public static au m31874a(au auVar, C6930e c6930e, Executor executor) {
        return C6996o.m31923a(auVar, c6930e, executor);
    }

    @SafeVarargs
    public static au m31878a(au... auVarArr) {
        return new ab(at.m31738a((Object[]) auVarArr));
    }

    public static void m31880a(au auVar, aj ajVar, Executor executor) {
        C6937m.m31623a((Object) ajVar);
        auVar.mo5927a(new am(auVar, ajVar), executor);
    }

    public static Object m31879a(Future future) {
        String str = "Future was expected to be done: %s";
        if (future.isDone()) {
            return bi.m31906a(future);
        }
        throw new IllegalStateException(C6937m.m31628a(str, future));
    }

    static {
        al alVar = new al();
    }
}
