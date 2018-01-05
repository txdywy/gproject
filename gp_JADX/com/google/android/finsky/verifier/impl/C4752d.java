package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.os.Looper;
import com.google.android.finsky.providers.C3947d;
import java.util.ArrayList;
import java.util.List;

public final class C4752d {
    public static C4752d f24570b;
    public Context f24571a;
    public final C4755g f24572c = new C4755g(this, Looper.getMainLooper());
    public final List f24573d = new ArrayList();
    public ConsentDialog f24574e;

    public C4752d() {
        ((ac) C3947d.m18649a(ac.class)).mo1989a(this);
    }

    public static synchronized C4752d m22288a() {
        C4752d c4752d;
        synchronized (C4752d.class) {
            if (f24570b == null) {
                f24570b = new C4752d();
            }
            c4752d = f24570b;
        }
        return c4752d;
    }

    private static synchronized void m22289b() {
        synchronized (C4752d.class) {
            f24570b = null;
        }
    }

    public final synchronized C4754f m22290a(C4749e c4749e) {
        return m22291a(c4749e, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.finsky.verifier.impl.C4754f m22291a(com.google.android.finsky.verifier.impl.C4749e r7, boolean r8) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        monitor-enter(r6);
        if (r8 == 0) goto L_0x000f;
    L_0x0005:
        r0 = com.google.android.finsky.verifier.impl.bg.m22121a();	 Catch:{ all -> 0x009c }
        r0 = r0.m22129d();	 Catch:{ all -> 0x009c }
        if (r0 != 0) goto L_0x0045;
    L_0x000f:
        if (r8 != 0) goto L_0x001f;
    L_0x0011:
        r0 = com.google.android.finsky.verifier.impl.bg.m22121a();	 Catch:{ all -> 0x009c }
        r0 = r0.m22128c();	 Catch:{ all -> 0x009c }
        r0 = r0.mo4351d();	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x0045;
    L_0x001f:
        r0 = com.google.android.finsky.aa.C0955b.bE;	 Catch:{ all -> 0x009c }
        r0 = r0.m28964b();	 Catch:{ all -> 0x009c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x009c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x009c }
        if (r0 != 0) goto L_0x0068;
    L_0x002d:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x009c }
        r3 = 17;
        if (r0 < r3) goto L_0x0055;
    L_0x0033:
        r0 = r6.f24571a;	 Catch:{ all -> 0x009c }
        r0 = r0.getContentResolver();	 Catch:{ all -> 0x009c }
        r3 = "device_provisioned";
        r4 = 0;
        r0 = android.provider.Settings.Global.getInt(r0, r3, r4);	 Catch:{ all -> 0x009c }
        if (r0 <= 0) goto L_0x0053;
    L_0x0042:
        r0 = r1;
    L_0x0043:
        if (r0 != 0) goto L_0x0068;
    L_0x0045:
        r0 = com.google.android.finsky.verifier.impl.bg.m22121a();	 Catch:{ all -> 0x009c }
        r0 = r0.m22129d();	 Catch:{ all -> 0x009c }
        r7.mo4372a(r0);	 Catch:{ all -> 0x009c }
        r0 = 0;
    L_0x0051:
        monitor-exit(r6);
        return r0;
    L_0x0053:
        r0 = r2;
        goto L_0x0043;
    L_0x0055:
        r0 = r6.f24571a;	 Catch:{ all -> 0x009c }
        r0 = r0.getContentResolver();	 Catch:{ all -> 0x009c }
        r3 = "device_provisioned";
        r4 = 0;
        r0 = android.provider.Settings.Secure.getInt(r0, r3, r4);	 Catch:{ all -> 0x009c }
        if (r0 <= 0) goto L_0x0066;
    L_0x0064:
        r0 = r1;
        goto L_0x0043;
    L_0x0066:
        r0 = r2;
        goto L_0x0043;
    L_0x0068:
        if (r8 != 0) goto L_0x0091;
    L_0x006a:
        r0 = r6.f24573d;	 Catch:{ all -> 0x009c }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x009c }
        if (r0 == 0) goto L_0x0091;
    L_0x0072:
        r0 = r6.f24571a;	 Catch:{ all -> 0x009c }
        r1 = new android.content.Intent;	 Catch:{ all -> 0x009c }
        r2 = com.google.android.finsky.verifier.impl.ConsentDialog.class;
        r1.<init>(r0, r2);	 Catch:{ all -> 0x009c }
        r2 = 1342177280; // 0x50000000 float:8.5899346E9 double:6.631236847E-315;
        r1.setFlags(r2);	 Catch:{ all -> 0x009c }
        r0.startActivity(r1);	 Catch:{ all -> 0x009c }
        r0 = r6.f24572c;	 Catch:{ all -> 0x009c }
        r1 = 1;
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x009c }
        r4 = 10;
        r2 = r2.toMillis(r4);	 Catch:{ all -> 0x009c }
        r0.sendEmptyMessageDelayed(r1, r2);	 Catch:{ all -> 0x009c }
    L_0x0091:
        r0 = new com.google.android.finsky.verifier.impl.f;	 Catch:{ all -> 0x009c }
        r0.<init>(r6, r7);	 Catch:{ all -> 0x009c }
        r1 = r6.f24573d;	 Catch:{ all -> 0x009c }
        r1.add(r0);	 Catch:{ all -> 0x009c }
        goto L_0x0051;
    L_0x009c:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.d.a(com.google.android.finsky.verifier.impl.e, boolean):com.google.android.finsky.verifier.impl.f");
    }

    final synchronized boolean m22293a(ConsentDialog consentDialog) {
        boolean z = true;
        synchronized (this) {
            this.f24572c.removeMessages(1);
            if (this.f24573d.isEmpty()) {
                z = false;
            } else {
                this.f24574e = consentDialog;
            }
        }
        return z;
    }

    final synchronized void m22292a(boolean z) {
        this.f24572c.removeMessages(1);
        for (C4754f c4754f : this.f24573d) {
            c4754f.f24675a.mo4372a(z);
        }
        this.f24573d.clear();
        this.f24574e = null;
        C4752d.m22289b();
    }
}
