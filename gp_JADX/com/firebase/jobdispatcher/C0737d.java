package com.firebase.jobdispatcher;

import android.content.Context;
import android.support.v4.p037h.C0304u;

final class C0737d {
    public static final C0304u f4675a = new C0304u();
    public final C0738n f4676b = new C0740e(this);
    public final Context f4677c;
    public final C0731f f4678d;

    C0737d(Context context, C0731f c0731f) {
        this.f4677c = context;
        this.f4678d = c0731f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m4840a(com.firebase.jobdispatcher.C0755x r7) {
        /*
        r6 = this;
        if (r7 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r2 = f4675a;
        monitor-enter(r2);
        r0 = f4675a;	 Catch:{ all -> 0x0026 }
        r1 = r7.f4713b;	 Catch:{ all -> 0x0026 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0026 }
        r0 = (com.firebase.jobdispatcher.af) r0;	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0029;
    L_0x0012:
        r1 = r0.m4823a();	 Catch:{ all -> 0x0026 }
        if (r1 != 0) goto L_0x0029;
    L_0x0018:
        r1 = r0.m4827c(r7);	 Catch:{ all -> 0x0026 }
        if (r1 == 0) goto L_0x007b;
    L_0x001e:
        r1 = r0.m4824b();	 Catch:{ all -> 0x0026 }
        if (r1 != 0) goto L_0x007b;
    L_0x0024:
        monitor-exit(r2);	 Catch:{ all -> 0x0026 }
        goto L_0x0002;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        r0 = new com.firebase.jobdispatcher.af;	 Catch:{ all -> 0x0026 }
        r1 = r6.f4676b;	 Catch:{ all -> 0x0026 }
        r3 = r6.f4677c;	 Catch:{ all -> 0x0026 }
        r0.<init>(r1, r3);	 Catch:{ all -> 0x0026 }
        r1 = f4675a;	 Catch:{ all -> 0x0026 }
        r3 = r7.f4713b;	 Catch:{ all -> 0x0026 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0026 }
        r1 = r0;
    L_0x003a:
        r0 = r1.m4825b(r7);	 Catch:{ all -> 0x0026 }
        if (r0 != 0) goto L_0x0073;
    L_0x0040:
        r0 = r6.f4677c;	 Catch:{ all -> 0x0026 }
        r3 = new android.content.Intent;	 Catch:{ all -> 0x0026 }
        r4 = "com.firebase.jobdispatcher.ACTION_EXECUTE";
        r3.<init>(r4);	 Catch:{ all -> 0x0026 }
        r4 = r6.f4677c;	 Catch:{ all -> 0x0026 }
        r5 = r7.mo1126i();	 Catch:{ all -> 0x0026 }
        r3.setClassName(r4, r5);	 Catch:{ all -> 0x0026 }
        r4 = 1;
        r0 = r0.bindService(r3, r1, r4);	 Catch:{ all -> 0x0026 }
        if (r0 != 0) goto L_0x0073;
    L_0x0059:
        r3 = "FJD.ExternalReceiver";
        r4 = "Unable to bind to ";
        r0 = r7.f4713b;	 Catch:{ all -> 0x0026 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0026 }
        r5 = r0.length();	 Catch:{ all -> 0x0026 }
        if (r5 == 0) goto L_0x0075;
    L_0x0069:
        r0 = r4.concat(r0);	 Catch:{ all -> 0x0026 }
    L_0x006d:
        android.util.Log.e(r3, r0);	 Catch:{ all -> 0x0026 }
        r1.m4826c();	 Catch:{ all -> 0x0026 }
    L_0x0073:
        monitor-exit(r2);	 Catch:{ all -> 0x0026 }
        goto L_0x0002;
    L_0x0075:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0026 }
        r0.<init>(r4);	 Catch:{ all -> 0x0026 }
        goto L_0x006d;
    L_0x007b:
        r1 = r0;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.d.a(com.firebase.jobdispatcher.x):void");
    }

    static void m4839a(C0755x c0755x, boolean z) {
        synchronized (f4675a) {
            af afVar = (af) f4675a.get(c0755x.f4713b);
            if (afVar != null) {
                afVar.m4822a(c0755x, z);
                if (afVar.m4823a()) {
                    f4675a.remove(c0755x.f4713b);
                }
            }
        }
    }
}
