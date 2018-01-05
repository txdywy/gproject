package com.google.android.finsky.instantapps.install;

import android.annotation.TargetApi;
import com.google.android.instantapps.common.p221d.p222a.af;
import io.reactivex.b.a;
import io.reactivex.c;
import io.reactivex.c.e;
import io.reactivex.f;
import io.reactivex.h;
import io.reactivex.internal.b.n;
import io.reactivex.internal.e.a.b;
import io.reactivex.internal.e.b.d;
import io.reactivex.internal.g.g;
import io.reactivex.k;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

@TargetApi(26)
public final class ab implements C3500d {
    public final C3517t f17709a;
    public final h f17710b;

    ab(ExecutorService executorService, C3517t c3517t) {
        this.f17709a = c3517t;
        this.f17710b = new g(executorService);
    }

    @TargetApi(26)
    public final C3501e mo3537a(String str, List list, af afVar, C3437s c3437s) {
        a aVar = new a();
        afVar.mo5136a(1654);
        CompletableFuture completableFuture = new CompletableFuture();
        C3517t c3517t = this.f17709a;
        k bVar = new b(io.reactivex.b.a(completableFuture));
        e eVar = io.reactivex.d.a.j;
        if (eVar != null) {
            bVar = (k) io.reactivex.d.a.a(eVar, bVar);
        }
        io.reactivex.e c3518u = new C3518u(c3517t, list, afVar, str, bVar);
        n.a(c3518u, "source is null");
        f a = io.reactivex.d.a.a(new io.reactivex.internal.e.b.b(c3518u));
        h hVar = this.f17710b;
        n.a(hVar, "scheduler is null");
        f a2 = io.reactivex.d.a.a(new io.reactivex.internal.e.b.f(a, hVar));
        h hVar2 = io.reactivex.a.b.a.a;
        if (hVar2 == null) {
            throw new NullPointerException("scheduler == null");
        }
        e eVar2 = io.reactivex.a.a.a.b;
        if (eVar2 != null) {
            hVar2 = (h) io.reactivex.a.a.a.a(eVar2, hVar2);
        }
        int i = io.reactivex.b.a;
        n.a(hVar2, "scheduler is null");
        n.a(i, "bufferSize");
        c a3 = io.reactivex.d.a.a(new d(a2, hVar2, i));
        io.reactivex.c.d acVar = new ac(c3437s);
        io.reactivex.c.d adVar = new ad(c3437s, aVar);
        io.reactivex.c.a aeVar = new ae(c3437s, aVar);
        io.reactivex.c.d dVar = io.reactivex.internal.b.a.b;
        n.a(acVar, "onNext is null");
        n.a(adVar, "onError is null");
        n.a(aeVar, "onComplete is null");
        n.a(dVar, "onSubscribe is null");
        Object cVar = new io.reactivex.internal.d.c(acVar, adVar, aeVar, dVar);
        a3.a(cVar);
        aVar.a(cVar);
        return new af(completableFuture);
    }
}
