package com.google.android.finsky.instantapps.install;

import android.content.Context;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.p306h.p307a.p308a.C5677n;
import com.google.android.p306h.p307a.p308a.C5678o;
import io.reactivex.d;
import io.reactivex.d.a;
import io.reactivex.e;
import io.reactivex.internal.b.n;
import io.reactivex.internal.d.b;
import io.reactivex.k;
import io.reactivex.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

final class C3518u implements e {
    public final /* synthetic */ List f17755a;
    public final /* synthetic */ af f17756b;
    public final /* synthetic */ String f17757c;
    public final /* synthetic */ k f17758d;
    public final /* synthetic */ C3517t f17759e;

    C3518u(C3517t c3517t, List list, af afVar, String str, k kVar) {
        this.f17759e = c3517t;
        this.f17755a = list;
        this.f17756b = afVar;
        this.f17757c = str;
        this.f17758d = kVar;
    }

    public final void m17095a(d dVar) {
        Throwable th;
        Throwable th2;
        List arrayList = new ArrayList(this.f17755a.size());
        long j = 0;
        for (C3503c c3503c : this.f17755a) {
            arrayList.add(this.f17759e.f17752a.submit(new C3519v(this, c3503c, this.f17756b.mo5135a())));
            j = c3503c.f17727c + j;
        }
        C5678o c5678o = new C5678o();
        c5678o.f28786c = new C5677n();
        c5678o.f28786c.f28778b = Long.valueOf(j);
        dVar.a(C3513o.m17088a(0, j));
        m17094a(1616, c5678o);
        C3437s c3520w = new C3520w(dVar);
        C3510l c3510l = this.f17759e.f17754c;
        af afVar = this.f17756b;
        List list = this.f17755a;
        Context context = (Context) C3510l.m17085a((Context) c3510l.f17740a.mo1a(), 1);
        C3510l.m17085a((C3509k) c3510l.f17741b.mo1a(), 2);
        C3506h c3506h = new C3506h(context, (af) C3510l.m17085a(afVar, 3), (List) C3510l.m17085a(list, 4), (C3437s) C3510l.m17085a(c3520w, 5));
        if (c3506h.m17083a(this.f17757c)) {
            int i;
            C3522y c3522y = new C3522y(j, c3520w);
            List arrayList2 = new ArrayList(this.f17755a.size());
            for (i = 0; i < this.f17755a.size(); i++) {
                arrayList2.add(this.f17759e.f17752a.submit(new C3514p((C3522y) C3515q.m17092a(c3522y, 1), (C3503c) C3515q.m17092a((C3503c) this.f17755a.get(i), 2), (Future) C3515q.m17092a((Future) arrayList.get(i), 3), (C3506h) C3515q.m17092a(c3506h, 4))));
            }
            ArrayList arrayList3 = (ArrayList) arrayList2;
            i = arrayList3.size();
            int i2 = 1;
            Throwable th3 = null;
            int i3 = 0;
            while (i3 < i) {
                int booleanValue;
                Object obj = arrayList3.get(i3);
                i3++;
                try {
                    Throwable th4 = th3;
                    booleanValue = ((Boolean) ((Future) obj).get()).booleanValue() & i2;
                    th = th4;
                } catch (Exception e) {
                    th = e;
                    FinskyLog.m21660a(th, "Could not install split", new Object[0]);
                    booleanValue = i2 & 0;
                }
                if (booleanValue == 0) {
                    m17094a(1621, c5678o);
                }
                i2 = booleanValue;
                th3 = th;
            }
            if (i2 != 0) {
                l lVar;
                m17094a(1655, c5678o);
                dVar.a(C3513o.m17088a(2, j));
                k kVar = this.f17758d;
                b bVar = new b();
                n.a(bVar, "subscriber is null");
                io.reactivex.c.b bVar2 = a.m;
                if (bVar2 != null) {
                    lVar = (l) a.a(bVar2);
                } else {
                    Object obj2 = bVar;
                }
                n.a(lVar, "subscriber returned by the RxJavaPlugins hook is null");
                try {
                    kVar.a(lVar);
                    if (((Boolean) bVar.a()).booleanValue()) {
                        this.f17756b.mo5136a(1656);
                        c3506h.m17082a();
                        return;
                    }
                    this.f17756b.mo5136a(1649);
                    c3506h.m17084b();
                    dVar.a(new InstallFailure("Install abandoned"));
                    return;
                } catch (NullPointerException e2) {
                    throw e2;
                } catch (Throwable th22) {
                    io.reactivex.exceptions.d.a(th22);
                    new NullPointerException("subscribeActual failed").initCause(th22);
                }
            } else {
                c3506h.m17084b();
                if (th3 == null) {
                    th22 = new InstallFailure("Failed to transfer streams");
                } else {
                    th22 = new InstallFailure(th3);
                }
                dVar.a(th22);
                return;
            }
        }
        this.f17756b.mo5136a(1625);
        dVar.a(new InstallFailure("Install session prepare failed"));
    }

    private final void m17094a(int i, C5678o c5678o) {
        af afVar = this.f17756b;
        ad adVar = new ad(i);
        adVar.f28913f = c5678o;
        afVar.mo5139a(adVar.m26987a());
    }
}
