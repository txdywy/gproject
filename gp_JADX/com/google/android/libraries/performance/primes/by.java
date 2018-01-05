package com.google.android.libraries.performance.primes;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p333b.C5969i;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import com.google.android.libraries.performance.primes.p337d.C5987a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

final class by extends C5949a {
    public static volatile by f29838e;
    public final eo f29839c;
    public final C6018r f29840f;
    public final double f29841g;
    public final C5987a f29842h;
    public int f29843i;
    public final ReentrantLock f29844j = new ReentrantLock();
    public final AtomicLong f29845k = new AtomicLong();
    public volatile ScheduledFuture f29846l;
    public final C5952o f29847m = new bz(this);
    public final C5974p f29848n = new cb(this);

    private by(C5984a c5984a, Application application, C6018r c6018r, double d, C5987a c5987a, C5969i c5969i, eo eoVar) {
        super(c5984a, application, eoVar, bv.BACKGROUND_THREAD);
        this.f29840f = c6018r;
        this.f29841g = d;
        this.f29842h = (C5987a) C5916a.m27406a((Object) c5987a);
        C5916a.m27406a((Object) c5969i);
        this.f29839c = (eo) C5916a.m27406a((Object) eoVar);
    }

    static synchronized by m27752a(C5984a c5984a, Application application, eo eoVar, SharedPreferences sharedPreferences, double d) {
        by byVar;
        synchronized (by.class) {
            if (f29838e == null) {
                String str = ((bw) bw.m27748b(application).mo5221a()).f29832c;
                f29838e = new by(c5984a, application, C6018r.m27894a(application), d, new C5987a(sharedPreferences, str != null ? str.hashCode() : 0), new C5969i(), eoVar);
            }
            byVar = f29838e;
        }
        return byVar;
    }

    final void m27756d() {
        if (this.f29846l != null) {
            this.f29846l.cancel(true);
            this.f29846l = null;
        }
    }

    final void mo5222c() {
        m27756d();
        this.f29840f.m27897b(this.f29847m);
        this.f29840f.m27897b(this.f29848n);
        dl.m27820c(this.f29613b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m27754a(java.io.File r20, java.io.File r21) {
        /*
        r19 = this;
        r6 = new d.a.a.a.a.a.ay;
        r6.<init>();
        r0 = r19;
        r2 = r0.f29842h;
        r4 = r2.f29935a;
        r2 = r4.size();
        r2 = new int[r2];
        r6.c = r2;
        r2 = 0;
        r3 = r2;
    L_0x0015:
        r2 = r4.size();
        if (r3 >= r2) goto L_0x002d;
    L_0x001b:
        r5 = r6.c;
        r2 = r4.get(r3);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r5[r3] = r2;
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x0015;
    L_0x002d:
        r7 = new d.a.a.a.a.a.bp;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r7.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r8 = com.google.android.libraries.performance.primes.p333b.C5970j.m27704a(r20);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = java.util.Collections.emptyList();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r4 = 0;
        r5 = "java.lang.Class";
        r3[r4] = r5;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = java.util.Arrays.asList(r3);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r4 = java.util.Collections.emptyList();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r4 = com.google.android.libraries.performance.primes.p333b.C5966f.m27698a(r8, r2, r3, r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r9 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r4.f29757a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.f29709d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r9.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r10 = new com.google.android.libraries.performance.primes.b.a.a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r10.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r4.f29757a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r2.m27666b();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
    L_0x0062:
        r2 = r3.m27667a();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x00b6;
    L_0x0068:
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.p333b.C5964c) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = r3.f29713d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r11 = r9.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r10.m27657a(r5, r11);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = new d.a.a.a.a.a.m;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.m27691b(r8);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.c = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r9.add(r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x0062;
    L_0x0084:
        r2 = move-exception;
        java.lang.System.gc();	 Catch:{ all -> 0x0120 }
        r3 = "MiniHeapDumpMetric";
        r4 = "Ran out of memory serializing heap dump";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0120 }
        com.google.android.libraries.performance.primes.C5989do.m27826a(r3, r4, r2, r5);	 Catch:{ all -> 0x0120 }
        r2 = 2;
        r6.a = r2;	 Catch:{ all -> 0x0120 }
        r2 = new d.a.a.a.a.a.bp;
        r2.<init>();
        r3 = new d.a.a.a.a.a.ba;
        r3.<init>();
        r2.h = r3;
        r3 = r2.h;
        r4 = new d.a.a.a.a.a.bb;
        r4.<init>();
        r3.c = r4;
        r3 = r2.h;
        r3 = r3.c;
        r3.b = r6;
        r0 = r19;
        r0.m27577a(r2);
    L_0x00b5:
        return;
    L_0x00b6:
        r2 = r4.f29757a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = r2.m27666b();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
    L_0x00bc:
        r2 = r5.m27667a();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x0142;
    L_0x00c2:
        r2 = r5.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.p333b.C5964c) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r5.f29713d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r10.m27659b(r3);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r9.get(r3);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = (d.a.a.a.a.a.m) r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r11 = r2.f29731g;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r11 == 0) goto L_0x0118;
    L_0x00d6:
        r2 = r2.f29731g;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.m27680d(r8);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r10.m27659b(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2 + 1;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.b = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x00bc;
    L_0x00e9:
        r2 = move-exception;
        r3 = "MiniHeapDumpMetric";
        r4 = "Error serializing heap dump";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0120 }
        com.google.android.libraries.performance.primes.C5989do.m27826a(r3, r4, r2, r5);	 Catch:{ all -> 0x0120 }
        r2 = 0;
        r6.a = r2;	 Catch:{ all -> 0x0120 }
        r2 = new d.a.a.a.a.a.bp;
        r2.<init>();
        r3 = new d.a.a.a.a.a.ba;
        r3.<init>();
        r2.h = r3;
        r3 = r2.h;
        r4 = new d.a.a.a.a.a.bb;
        r4.<init>();
        r3.c = r4;
        r3 = r2.h;
        r3 = r3.c;
        r3.b = r6;
        r0 = r19;
        r0.m27577a(r2);
        goto L_0x00b5;
    L_0x0118:
        r2 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.b = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x00bc;
    L_0x0120:
        r2 = move-exception;
        r3 = new d.a.a.a.a.a.bp;
        r3.<init>();
        r4 = new d.a.a.a.a.a.ba;
        r4.<init>();
        r3.h = r4;
        r4 = r3.h;
        r5 = new d.a.a.a.a.a.bb;
        r5.<init>();
        r4.c = r5;
        r4 = r3.h;
        r4 = r4.c;
        r4.b = r6;
        r0 = r19;
        r0.m27577a(r3);
        throw r2;
    L_0x0142:
        r11 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r11.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r12 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r12.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r13 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r13.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r4.f29758b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r2.m27666b();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
    L_0x0157:
        r2 = r3.m27667a();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x01f1;
    L_0x015d:
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5965d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x018b;
    L_0x0163:
        r2 = r3.f29713d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = r11.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r10.m27657a(r2, r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.p333b.C5965d) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = new d.a.a.a.a.a.n;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.f29733a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.m27680d(r8);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r10.m27659b(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2 + 1;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.b = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r11.add(r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x0157;
    L_0x018b:
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5963b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x01b9;
    L_0x0191:
        r2 = r3.f29713d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = r12.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r10.m27657a(r2, r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.p333b.C5963b) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = new d.a.a.a.a.a.f;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.f29724a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.m27680d(r8);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r10.m27659b(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2 + 1;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.b = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r12.add(r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x0157;
    L_0x01b9:
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5968h;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x0157;
    L_0x01bf:
        r2 = r3.f29713d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = r13.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r10.m27657a(r2, r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r3.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.p333b.C5968h) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = new d.a.a.a.a.a.bd;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r14 = r2.i;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r15 = r8.f29753b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r14 = r14 + r15;
        r14 = r14 + 4;
        r14 = r14 + 4;
        r15 = r8.f29752a;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r14 = r15.get(r14);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.b = r14;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.mo5235a(r8);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5.c = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r13.add(r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x0157;
    L_0x01f1:
        r14 = r4.f29758b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r15 = r14.m27666b();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
    L_0x01f7:
        r2 = r15.m27667a();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x02c5;
    L_0x01fd:
        r2 = r15.f29714e;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.p333b.C5962e) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5968h;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r3 != 0) goto L_0x01f7;
    L_0x0205:
        r3 = r2.mo5235a(r8);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r0 = new int[r3];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r16 = r0;
        r4 = 0;
        r3 = 0;
        r5 = r3;
    L_0x0210:
        r0 = r16;
        r3 = r0.length;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r5 >= r3) goto L_0x028d;
    L_0x0215:
        r17 = r2.mo5236a(r8, r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r17 == 0) goto L_0x0378;
    L_0x021b:
        r0 = r17;
        r3 = r14.m27663a(r0);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = (com.google.android.libraries.performance.primes.p333b.C5962e) r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r0 = r17;
        r17 = r10.m27659b(r0);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r3 == 0) goto L_0x0378;
    L_0x022b:
        r18 = -1;
        r0 = r17;
        r1 = r18;
        if (r0 == r1) goto L_0x0378;
    L_0x0233:
        r0 = r3 instanceof com.google.android.libraries.performance.primes.p333b.C5964c;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r18 = r0;
        if (r18 == 0) goto L_0x0244;
    L_0x0239:
        r3 = r4 + 1;
        r17 = r17 + 1;
        r16[r4] = r17;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
    L_0x023f:
        r4 = r5 + 1;
        r5 = r4;
        r4 = r3;
        goto L_0x0210;
    L_0x0244:
        r0 = r3 instanceof com.google.android.libraries.performance.primes.p333b.C5965d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r18 = r0;
        if (r18 == 0) goto L_0x0257;
    L_0x024a:
        r3 = r4 + 1;
        r18 = r9.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r17 = r17 + r18;
        r17 = r17 + 1;
        r16[r4] = r17;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x023f;
    L_0x0257:
        r0 = r3 instanceof com.google.android.libraries.performance.primes.p333b.C5963b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r18 = r0;
        if (r18 == 0) goto L_0x0270;
    L_0x025d:
        r3 = r4 + 1;
        r18 = r9.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r17 = r17 + r18;
        r18 = r11.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r17 = r17 + r18;
        r17 = r17 + 1;
        r16[r4] = r17;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x023f;
    L_0x0270:
        r3 = r3 instanceof com.google.android.libraries.performance.primes.p333b.C5968h;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r3 == 0) goto L_0x0378;
    L_0x0274:
        r3 = r4 + 1;
        r18 = r9.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r17 = r17 + r18;
        r18 = r11.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r17 = r17 + r18;
        r18 = r12.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r17 = r17 + r18;
        r17 = r17 + 1;
        r16[r4] = r17;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x023f;
    L_0x028d:
        r0 = r16;
        r3 = java.util.Arrays.copyOf(r0, r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r4 = r15.f29713d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r4 = r10.m27659b(r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r4 < 0) goto L_0x01f7;
    L_0x029b:
        r5 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5965d;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r5 == 0) goto L_0x02a9;
    L_0x029f:
        r2 = r11.get(r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.n) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2.c = r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x01f7;
    L_0x02a9:
        r5 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5964c;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r5 == 0) goto L_0x02b7;
    L_0x02ad:
        r2 = r9.get(r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.m) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2.d = r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x01f7;
    L_0x02b7:
        r2 = r2 instanceof com.google.android.libraries.performance.primes.p333b.C5963b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x01f7;
    L_0x02bb:
        r2 = r12.get(r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.f) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2.c = r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x01f7;
    L_0x02c5:
        r3 = new d.a.a.a.a.a.ax;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.<init>();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r9.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = new d.a.a.a.a.a.m[r2];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r9.toArray(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.m[]) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.a = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r11.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = new d.a.a.a.a.a.n[r2];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r11.toArray(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.n[]) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.b = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r12.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = new d.a.a.a.a.a.f[r2];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r12.toArray(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.f[]) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.c = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r13.size();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = new d.a.a.a.a.a.bd[r2];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r13.toArray(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (d.a.a.a.a.a.bd[]) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.d = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r0 = r19;
        r2 = r0.f29843i;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3.e = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r7.v = r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r0 = r19;
        r2 = r0.f29613b;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = com.google.android.libraries.performance.primes.bw.m27748b(r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = r2.mo5221a();	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = (com.google.android.libraries.performance.primes.bw) r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2.m27750a(r7);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = com.google.protobuf.nano.C0757i.m4909a(r7);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r2.length;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = r3 / 1000;
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        if (r3 <= r4) goto L_0x0364;
    L_0x032a:
        r2 = java.lang.Integer.valueOf(r3);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r6.b = r2;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r2 = "MiniHeapDumpMetric";
        r4 = "Serialized heap dump too large. serializedSizeKb = %d";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r7 = 0;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5[r7] = r3;	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r3 = 3;
        com.google.android.libraries.performance.primes.C5989do.m27824a(r3, r2, r4, r5);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
    L_0x0342:
        r2 = new d.a.a.a.a.a.bp;
        r2.<init>();
        r3 = new d.a.a.a.a.a.ba;
        r3.<init>();
        r2.h = r3;
        r3 = r2.h;
        r4 = new d.a.a.a.a.a.bb;
        r4.<init>();
        r3.c = r4;
        r3 = r2.h;
        r3 = r3.c;
        r3.b = r6;
        r0 = r19;
        r0.m27577a(r2);
        goto L_0x00b5;
    L_0x0364:
        r0 = r21;
        r2 = m27753a(r0, r2);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        if (r2 == 0) goto L_0x0342;
    L_0x036c:
        r2 = "MiniHeapDumpMetric";
        r3 = "Successfully saved serialized heap dump";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        r5 = 3;
        com.google.android.libraries.performance.primes.C5989do.m27824a(r5, r2, r3, r4);	 Catch:{ OutOfMemoryError -> 0x0084, Exception -> 0x00e9 }
        goto L_0x0342;
    L_0x0378:
        r3 = r4;
        goto L_0x023f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.by.a(java.io.File, java.io.File):void");
    }

    private static boolean m27753a(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (Throwable e) {
            C5989do.m27826a("MiniHeapDumpMetric", "Failed to write mini heap dump to file.", e, new Object[0]);
            if (!file.exists()) {
                return false;
            }
            file.delete();
            return false;
        }
    }
}
