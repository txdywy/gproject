package org.chromium.base;

import java.util.List;
import java.util.Map;

public class EarlyTraceEvent {
    public static final Object f40486a = new Object();
    public static volatile int f40487b = 0;
    public static List f40488c;
    public static Map f40489d;

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    static boolean m37792a() {
        int i = f40487b;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    static boolean m37794b() {
        return f40487b == 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m37791a(java.lang.String r3) {
        /*
        r0 = m37794b();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = new org.chromium.base.f;
        r0.<init>(r3);
        r1 = f40486a;
        monitor-enter(r1);
        r2 = m37794b();	 Catch:{ all -> 0x0017 }
        if (r2 != 0) goto L_0x001a;
    L_0x0015:
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        goto L_0x0006;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        throw r0;
    L_0x001a:
        r2 = f40489d;	 Catch:{ all -> 0x0017 }
        r0 = r2.put(r3, r0);	 Catch:{ all -> 0x0017 }
        r0 = (org.chromium.base.C7889f) r0;	 Catch:{ all -> 0x0017 }
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0006;
    L_0x0025:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Multiple pending trace events can't have the same name";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.a(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m37793b(java.lang.String r4) {
        /*
        r0 = m37792a();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r1 = f40486a;
        monitor-enter(r1);
        r0 = m37792a();	 Catch:{ all -> 0x0012 }
        if (r0 != 0) goto L_0x0015;
    L_0x0010:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        goto L_0x0006;
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        throw r0;
    L_0x0015:
        r0 = f40489d;	 Catch:{ all -> 0x0012 }
        r0 = r0.remove(r4);	 Catch:{ all -> 0x0012 }
        r0 = (org.chromium.base.C7889f) r0;	 Catch:{ all -> 0x0012 }
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        goto L_0x0006;
    L_0x0021:
        r2 = org.chromium.base.C7889f.m37813a();	 Catch:{ all -> 0x0012 }
        r0.f40519e = r2;	 Catch:{ all -> 0x0012 }
        r2 = android.os.SystemClock.currentThreadTimeMillis();	 Catch:{ all -> 0x0012 }
        r0.f40520f = r2;	 Catch:{ all -> 0x0012 }
        r2 = f40488c;	 Catch:{ all -> 0x0012 }
        r2.add(r0);	 Catch:{ all -> 0x0012 }
        r0 = f40487b;	 Catch:{ all -> 0x0012 }
        r2 = 2;
        if (r0 != r2) goto L_0x003a;
    L_0x0037:
        m37795c();	 Catch:{ all -> 0x0012 }
    L_0x003a:
        monitor-exit(r1);	 Catch:{ all -> 0x0012 }
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.b(java.lang.String):void");
    }

    static void m37795c() {
        if (!f40488c.isEmpty()) {
            long nativeGetTimeTicksNowUs = (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - C7889f.m37813a();
            for (C7889f c7889f : f40488c) {
                nativeRecordEarlyEvent(c7889f.f40515a, c7889f.f40517c + nativeGetTimeTicksNowUs, c7889f.f40519e + nativeGetTimeTicksNowUs, c7889f.f40516b, c7889f.f40520f - c7889f.f40518d);
            }
            f40488c.clear();
        }
        if (f40489d.isEmpty()) {
            f40487b = 3;
            f40489d = null;
            f40488c = null;
        }
    }
}
