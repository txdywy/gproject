package com.google.android.finsky.installer.p207a;

import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v4.p037h.C0305a;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class C3289h {
    public final Object f17029a = new Object();
    public Map f17030b = new C0305a();
    public final Handler f17031c = new Handler(Looper.getMainLooper());
    public final C3279g f17032d;
    public C1552e f17033e;

    public C3289h(C3279g c3279g, C1552e c1552e) {
        this.f17032d = c3279g;
        this.f17033e = c1552e;
        if (this.f17033e.mo2294a(12641376)) {
            long longValue = ((Long) C0955b.jt.m28964b()).longValue();
            if (((Boolean) C0954a.bI.m5760a()).booleanValue() && longValue >= 0) {
                C0954a.bI.m5763a(Boolean.valueOf(false));
                FinskyLog.m21659a("Detected we are recovering from a previous holdoff, will hold off for %d ms", Long.valueOf(longValue));
                if (m16524a("com.android.vending", "recovery_holdoff", new ResultReceiver(this.f17031c))) {
                    this.f17031c.postDelayed(new C3295n(this), longValue);
                    return;
                } else {
                    FinskyLog.m21669e("Could not pause for holdoff recovery", new Object[0]);
                    return;
                }
            }
            return;
        }
        FinskyLog.m21659a("Not checking if recovering from paused session because experiment is off", new Object[0]);
    }

    public final boolean m16522a() {
        boolean z;
        synchronized (this.f17029a) {
            z = !this.f17030b.isEmpty();
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m16524a(java.lang.String r11, java.lang.String r12, android.os.ResultReceiver r13) {
        /*
        r10 = this;
        r2 = 1;
        r1 = 0;
        r3 = new com.google.android.finsky.installer.a.o;
        r3.<init>(r11, r12);
        r4 = r10.f17029a;
        monitor-enter(r4);
        r0 = r10.f17030b;	 Catch:{ all -> 0x006b }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x006b }
        if (r0 == 0) goto L_0x0020;
    L_0x0012:
        r0 = "Pause called with caller %s already called for pause";
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x006b }
        r5 = 0;
        r2[r5] = r3;	 Catch:{ all -> 0x006b }
        com.google.android.finsky.utils.FinskyLog.m21667d(r0, r2);	 Catch:{ all -> 0x006b }
        monitor-exit(r4);	 Catch:{ all -> 0x006b }
        r0 = r1;
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = r10.f17030b;	 Catch:{ all -> 0x006b }
        r0.put(r3, r13);	 Catch:{ all -> 0x006b }
        monitor-exit(r4);	 Catch:{ all -> 0x006b }
        r0 = "com.android.vending";
        r0 = r0.equals(r11);
        if (r0 == 0) goto L_0x006e;
    L_0x002e:
        r0 = "recovery_holdoff";
        r0 = r0.equals(r12);
        if (r0 == 0) goto L_0x006e;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        if (r0 != 0) goto L_0x0042;
    L_0x0039:
        r0 = com.google.android.finsky.aa.C0954a.bI;
        r4 = java.lang.Boolean.valueOf(r2);
        r0.m5763a(r4);
    L_0x0042:
        r0 = r10.f17031c;
        r4 = new com.google.android.finsky.installer.a.i;
        r4.<init>(r10, r3, r13);
        r0.post(r4);
        r4 = r3.f17051a;
        r3 = r3.f17052b;
        r0 = com.google.android.finsky.aa.C0955b.jv;
        r0 = r0.m28964b();
        r0 = (java.lang.Long) r0;
        r6 = r0.longValue();
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0070;
    L_0x0062:
        r0 = "Install holdoff timeout was negative, will not automatically resume";
        r1 = new java.lang.Object[r1];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
    L_0x0069:
        r0 = r2;
        goto L_0x001f;
    L_0x006b:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x006b }
        throw r0;
    L_0x006e:
        r0 = r1;
        goto L_0x0037;
    L_0x0070:
        r0 = r10.f17031c;
        r1 = new com.google.android.finsky.installer.a.m;
        r1.<init>(r10, r4, r3);
        r0.postDelayed(r1, r6);
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.installer.a.h.a(java.lang.String, java.lang.String, android.os.ResultReceiver):boolean");
    }

    public final boolean m16523a(String str, String str2) {
        synchronized (this.f17029a) {
            C3296o b = m16525b(str, str2);
            if (b == null) {
                FinskyLog.m21667d("Resume called with caller %s:%s without a corresponding pause", str, str2);
                return false;
            }
            ResultReceiver resultReceiver = (ResultReceiver) this.f17030b.remove(b);
            boolean isEmpty = this.f17030b.isEmpty();
            boolean z = !b.f17053c;
            b.f17054d = true;
            this.f17031c.post(new C3291j(this, b, resultReceiver, isEmpty, z));
            return true;
        }
    }

    final void m16521a(int i, C3296o c3296o, ResultReceiver resultReceiver) {
        FinskyLog.m21659a("Sending %d to caller %s", Integer.valueOf(i), c3296o);
        this.f17031c.post(new C3293l(resultReceiver, i));
    }

    final C3296o m16525b(String str, String str2) {
        synchronized (this.f17029a) {
            for (C3296o c3296o : this.f17030b.keySet()) {
                if (str.equals(c3296o.f17051a) && str2.equals(c3296o.f17052b)) {
                    return c3296o;
                }
            }
            return null;
        }
    }
}
