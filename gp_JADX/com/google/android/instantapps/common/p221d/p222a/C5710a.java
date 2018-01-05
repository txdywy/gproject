package com.google.android.instantapps.common.p221d.p222a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.instantapps.common.C5765e;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.p306h.p307a.p308a.C5684u;
import com.google.protobuf.nano.C0757i;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p002a.C0002a;

public final class C5710a implements af {
    public final Context f28877a;
    public final C5765e f28878b;
    public final ExecutorService f28879c;
    public final C5718h f28880d;
    public final C0002a f28881e;
    public final C5720j f28882f;
    public final boolean f28883g;
    public final bf f28884h;
    public final bf f28885i;
    public final bf f28886j;
    public final C0002a f28887k;
    public final ConnectivityManager f28888l;
    public final C0002a f28889m;
    public final C0002a f28890n;
    public final ae f28891o;
    public boolean f28892p;
    public long f28893q;
    public volatile byte[] f28894r;
    public final Queue f28895s;
    public boolean f28896t;

    public C5710a(Context context, C5765e c5765e, ExecutorService executorService, C5718h c5718h, C0002a c0002a, C5720j c5720j, boolean z, bf bfVar, bf bfVar2, bf bfVar3, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4, ae aeVar) {
        this.f28895s = new ArrayDeque();
        this.f28877a = context;
        this.f28878b = c5765e;
        this.f28879c = executorService;
        this.f28880d = c5718h;
        this.f28881e = c0002a;
        this.f28882f = c5720j;
        this.f28883g = z;
        this.f28884h = bfVar;
        this.f28885i = bfVar2;
        this.f28886j = bfVar3;
        this.f28887k = c0002a2;
        this.f28888l = (ConnectivityManager) context.getSystemService("connectivity");
        this.f28889m = c0002a3;
        this.f28890n = c0002a4;
        this.f28891o = aeVar;
    }

    public C5710a(C5710a c5710a, boolean z, long j) {
        this(c5710a.f28877a, c5710a.f28878b, c5710a.f28879c, c5710a.f28880d, c5710a.f28881e, c5710a.f28882f, c5710a.f28883g, c5710a.f28884h, c5710a.f28885i, c5710a.f28886j, c5710a.f28887k, c5710a.f28889m, c5710a.f28890n, c5710a.f28891o);
        if (z) {
            if (j <= 0) {
                j = c5710a.f28893q;
            }
            this.f28893q = j;
            this.f28892p = true;
        }
        this.f28894r = c5710a.f28894r;
    }

    public C5710a(C5710a c5710a, Bundle bundle) {
        this(c5710a.f28877a, c5710a.f28878b, c5710a.f28879c, c5710a.f28880d, c5710a.f28881e, c5710a.f28882f, c5710a.f28883g, c5710a.f28884h, c5710a.f28885i, c5710a.f28886j, c5710a.f28887k, c5710a.f28889m, c5710a.f28890n, c5710a.f28891o);
        this.f28893q = bundle.getLong("logging.odyssey.BaseLoggingContext.currentId");
        this.f28892p = bundle.getBoolean("logging.odyssey.BaseLoggingContext.hasParentEvent", false);
        byte[] byteArray = bundle.getByteArray("logging.odyssey.BaseLoggingContext.whDimension");
        if (byteArray != null) {
            this.f28894r = byteArray;
        }
    }

    public final af mo5135a() {
        return new C5710a(this, true, 0);
    }

    public final C5710a m26982b() {
        return new C5710a(this, false, 0);
    }

    public final synchronized long m26983c() {
        return this.f28893q;
    }

    public final synchronized void mo5138a(C5684u c5684u) {
        String d = mo5140d();
        Object obj = null;
        if (d != null && c5684u.f28831k == null) {
            c5684u.f28831k = d;
            obj = 1;
        }
        this.f28894r = C0757i.m4909a((C0757i) c5684u);
        if (obj != null) {
            c5684u.f28831k = null;
        }
    }

    public final synchronized String mo5140d() {
        String str = null;
        synchronized (this) {
            if (this.f28894r != null) {
                try {
                    str = C5684u.m26922a(this.f28894r).f28831k;
                } catch (Throwable e) {
                    Log.e("LoggingContext", "Could not read launch token", e);
                }
            }
        }
        return str;
    }

    public final void mo5139a(ac acVar) {
        long j;
        if (acVar.f28903d > 0) {
            j = acVar.f28903d;
        } else {
            j = System.currentTimeMillis();
        }
        synchronized (this.f28895s) {
            this.f28895s.add(new C5716f(acVar, j));
        }
        m26985e();
    }

    public final void mo5136a(int i) {
        mo5139a(new ad(i).m26987a());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m26985e() {
        /*
        r4 = this;
        r1 = r4.f28895s;
        monitor-enter(r1);
        r0 = r4.f28896t;	 Catch:{ all -> 0x0037 }
        if (r0 != 0) goto L_0x000f;
    L_0x0007:
        r0 = r4.f28895s;	 Catch:{ all -> 0x0037 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
    L_0x0010:
        return;
    L_0x0011:
        r0 = 1;
        r4.f28896t = r0;	 Catch:{ all -> 0x0037 }
        r0 = r4.f28895s;	 Catch:{ all -> 0x0037 }
        r0 = r0.remove();	 Catch:{ all -> 0x0037 }
        r0 = (com.google.android.instantapps.common.p221d.p222a.C5716f) r0;	 Catch:{ all -> 0x0037 }
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        r1 = r4.f28882f;
        r2 = r1.f28963d;
        r3 = new com.google.android.instantapps.common.d.a.l;
        r3.<init>(r1);
        r1 = com.google.common.f.a.ba.a;
        r1 = com.google.common.f.a.ak.a(r2, r3, r1);
        r2 = new com.google.android.instantapps.common.d.a.c;
        r2.<init>(r4, r0);
        r0 = com.google.common.f.a.ba.a;
        com.google.common.f.a.ak.a(r1, r2, r0);
        goto L_0x0010;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.instantapps.common.d.a.a.e():void");
    }

    public final synchronized void mo5137a(Bundle bundle) {
        bundle.putLong("logging.odyssey.BaseLoggingContext.currentId", this.f28893q);
        bundle.putBoolean("logging.odyssey.BaseLoggingContext.hasParentEvent", this.f28892p);
        if (this.f28894r != null) {
            bundle.putByteArray("logging.odyssey.BaseLoggingContext.whDimension", this.f28894r);
        }
    }

    public final void m26981a(Runnable runnable) {
        ((C5727q) this.f28881e.mo1a()).m27027a(new C5715e(this, runnable));
    }
}
