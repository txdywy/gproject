package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import android.os.Handler;
import android.util.Log;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.by.C0981m;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ab implements C2199l {
    public final C1287h f10996a;
    public final al f10997b;
    public final C2207f f10998c;
    public final Handler f10999d;
    public final Handler f11000e;
    public final Map f11001f = new HashMap();
    public final List f11002g = new ArrayList();
    public final boolean f11003h;

    public ab(C1287h c1287h, al alVar, C2207f c2207f, Handler handler, Handler handler2, boolean z) {
        this.f10996a = c1287h;
        this.f10997b = alVar;
        this.f10998c = c2207f;
        this.f10999d = handler;
        this.f11000e = handler2;
        this.f11003h = z;
        mo2795a();
    }

    public final synchronized void mo2798a(C0981m c0981m) {
        this.f11002g.add(c0981m);
    }

    public final synchronized void mo2795a() {
        this.f11001f.clear();
        for (C2198a c2198a : this.f10998c.m11613l()) {
            Account account = c2198a.f10992f;
            C2219r c2219r = new C2219r(this.f10996a.mo2016a(account.name), this.f10997b, c2198a, this.f10999d, this.f11000e, this.f11003h);
            c2219r.m11627a(new ac(this));
            this.f11001f.put(account, c2219r);
        }
    }

    final synchronized void m11538a(String str) {
        for (C0981m a : this.f11002g) {
            a.mo1173a(str);
        }
    }

    public final void mo2799a(Runnable runnable, String str) {
        this.f10998c.mo2815a(new ad(this, runnable, str));
    }

    public final void mo2797a(Account account, String[] strArr, Runnable runnable, String str) {
        this.f10998c.mo2815a(new af(this, account, strArr, runnable, str));
    }

    public final void mo2796a(Account account, String str, Runnable runnable, w... wVarArr) {
        this.f10998c.mo2815a(new ag(this, account, str, wVarArr, runnable));
    }

    public final void mo2800b() {
        Log.d("FinskyLibrary", "| LibraryReplicators {");
        for (C2219r c2219r : this.f11001f.values()) {
            String str = "|   ";
            String a = FinskyLog.m21655a(c2219r.f11077g.f10992f.name);
            Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(a).length()).append(str).append("LibraryReplicator (account=").append(a).append(") {").toString());
            if (c2219r.f11083m != null) {
                Log.d("FinskyLibrary", new StringBuilder(String.valueOf(str).length() + 25).append(str).append("  eventsCount=").append(c2219r.f11083m.size()).toString());
                for (C2223v a2 : c2219r.f11083m) {
                    a2.m11630a(str);
                }
            } else {
                Log.d("FinskyLibrary", String.valueOf(str).concat("  eventsCount=0"));
            }
            Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(a).length()).append(str).append("} (account=").append(a).append(")").toString());
        }
        Log.d("FinskyLibrary", "| }");
    }
}
