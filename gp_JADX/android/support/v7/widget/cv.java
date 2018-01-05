package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Comparator;

final class cv implements Runnable {
    public static final ThreadLocal f3331a = new ThreadLocal();
    public static Comparator f3332f = new cw();
    public ArrayList f3333b = new ArrayList();
    public long f3334c;
    public long f3335d;
    public ArrayList f3336e = new ArrayList();

    cv() {
    }

    final void m3426a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3334c == 0) {
            this.f3334c = RecyclerView.m267s();
            recyclerView.post(this);
        }
        cx cxVar = recyclerView.an;
        cxVar.f3337a = i;
        cxVar.f3338b = i2;
    }

    private static fr m3425a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b = recyclerView.f520n.m3331b();
        for (int i2 = 0; i2 < b; i2++) {
            fr c = RecyclerView.m261c(recyclerView.f520n.m3335c(i2));
            if (c.f3213c == i && !c.m3273j()) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return null;
        }
        fh fhVar = recyclerView.f517k;
        try {
            recyclerView.m311k();
            fr a = fhVar.m3683a(i, j);
            if (a != null) {
                if (!a.m3275l() || a.m3273j()) {
                    fhVar.m3686a(a, false);
                } else {
                    fhVar.m3687a(a.f3211a);
                }
            }
            recyclerView.m289b(false);
            return a;
        } catch (Throwable th) {
            recyclerView.m289b(false);
        }
    }

    public final void run() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r14 = this;
        r2 = "RV Prefetch";	 Catch:{ all -> 0x019c }
        android.support.v4.os.C0330d.m1728a(r2);	 Catch:{ all -> 0x019c }
        r2 = r14.f3333b;	 Catch:{ all -> 0x019c }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x019c }
        if (r2 == 0) goto L_0x0015;
    L_0x000d:
        r2 = 0;
        r14.f3334c = r2;
        android.support.v4.os.C0330d.m1727a();
    L_0x0014:
        return;
    L_0x0015:
        r2 = r14.f3333b;	 Catch:{ all -> 0x019c }
        r7 = r2.size();	 Catch:{ all -> 0x019c }
        r4 = 0;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r6 = r2;	 Catch:{ all -> 0x019c }
    L_0x001f:
        if (r6 >= r7) goto L_0x003c;	 Catch:{ all -> 0x019c }
    L_0x0021:
        r2 = r14.f3333b;	 Catch:{ all -> 0x019c }
        r2 = r2.get(r6);	 Catch:{ all -> 0x019c }
        r2 = (android.support.v7.widget.RecyclerView) r2;	 Catch:{ all -> 0x019c }
        r3 = r2.getWindowVisibility();	 Catch:{ all -> 0x019c }
        if (r3 != 0) goto L_0x01b4;	 Catch:{ all -> 0x019c }
    L_0x002f:
        r2 = r2.getDrawingTime();	 Catch:{ all -> 0x019c }
        r2 = java.lang.Math.max(r2, r4);	 Catch:{ all -> 0x019c }
    L_0x0037:
        r4 = r6 + 1;
        r6 = r4;
        r4 = r2;
        goto L_0x001f;
    L_0x003c:
        r2 = 0;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x004a;
    L_0x0042:
        r2 = 0;
        r14.f3334c = r2;
        android.support.v4.os.C0330d.m1727a();
        goto L_0x0014;
    L_0x004a:
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x019c }
        r2 = r2.toNanos(r4);	 Catch:{ all -> 0x019c }
        r4 = r14.f3335d;	 Catch:{ all -> 0x019c }
        r8 = r2 + r4;	 Catch:{ all -> 0x019c }
        r2 = r14.f3333b;	 Catch:{ all -> 0x019c }
        r10 = r2.size();	 Catch:{ all -> 0x019c }
        r3 = 0;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r4 = r2;	 Catch:{ all -> 0x019c }
    L_0x005d:
        if (r4 >= r10) goto L_0x007d;	 Catch:{ all -> 0x019c }
    L_0x005f:
        r2 = r14.f3333b;	 Catch:{ all -> 0x019c }
        r2 = r2.get(r4);	 Catch:{ all -> 0x019c }
        r2 = (android.support.v7.widget.RecyclerView) r2;	 Catch:{ all -> 0x019c }
        r5 = r2.getWindowVisibility();	 Catch:{ all -> 0x019c }
        if (r5 != 0) goto L_0x01b1;	 Catch:{ all -> 0x019c }
    L_0x006d:
        r5 = r2.an;	 Catch:{ all -> 0x019c }
        r6 = 0;	 Catch:{ all -> 0x019c }
        r5.m3430a(r2, r6);	 Catch:{ all -> 0x019c }
        r2 = r2.an;	 Catch:{ all -> 0x019c }
        r2 = r2.f3340d;	 Catch:{ all -> 0x019c }
        r2 = r2 + r3;	 Catch:{ all -> 0x019c }
    L_0x0078:
        r3 = r4 + 1;	 Catch:{ all -> 0x019c }
        r4 = r3;	 Catch:{ all -> 0x019c }
        r3 = r2;	 Catch:{ all -> 0x019c }
        goto L_0x005d;	 Catch:{ all -> 0x019c }
    L_0x007d:
        r2 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r2.ensureCapacity(r3);	 Catch:{ all -> 0x019c }
        r3 = 0;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r7 = r2;	 Catch:{ all -> 0x019c }
    L_0x0085:
        if (r7 >= r10) goto L_0x00f0;	 Catch:{ all -> 0x019c }
    L_0x0087:
        r2 = r14.f3333b;	 Catch:{ all -> 0x019c }
        r2 = r2.get(r7);	 Catch:{ all -> 0x019c }
        r2 = (android.support.v7.widget.RecyclerView) r2;	 Catch:{ all -> 0x019c }
        r4 = r2.getWindowVisibility();	 Catch:{ all -> 0x019c }
        if (r4 != 0) goto L_0x01ae;	 Catch:{ all -> 0x019c }
    L_0x0095:
        r11 = r2.an;	 Catch:{ all -> 0x019c }
        r4 = r11.f3337a;	 Catch:{ all -> 0x019c }
        r4 = java.lang.Math.abs(r4);	 Catch:{ all -> 0x019c }
        r5 = r11.f3338b;	 Catch:{ all -> 0x019c }
        r5 = java.lang.Math.abs(r5);	 Catch:{ all -> 0x019c }
        r12 = r4 + r5;	 Catch:{ all -> 0x019c }
        r4 = 0;	 Catch:{ all -> 0x019c }
        r6 = r4;	 Catch:{ all -> 0x019c }
        r4 = r3;	 Catch:{ all -> 0x019c }
    L_0x00a8:
        r3 = r11.f3340d;	 Catch:{ all -> 0x019c }
        r3 = r3 * 2;	 Catch:{ all -> 0x019c }
        if (r6 >= r3) goto L_0x00ea;	 Catch:{ all -> 0x019c }
    L_0x00ae:
        r3 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r3 = r3.size();	 Catch:{ all -> 0x019c }
        if (r4 < r3) goto L_0x00de;	 Catch:{ all -> 0x019c }
    L_0x00b6:
        r3 = new android.support.v7.widget.cy;	 Catch:{ all -> 0x019c }
        r3.<init>();	 Catch:{ all -> 0x019c }
        r5 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r5.add(r3);	 Catch:{ all -> 0x019c }
        r5 = r3;	 Catch:{ all -> 0x019c }
    L_0x00c1:
        r3 = r11.f3339c;	 Catch:{ all -> 0x019c }
        r13 = r6 + 1;	 Catch:{ all -> 0x019c }
        r13 = r3[r13];	 Catch:{ all -> 0x019c }
        if (r13 > r12) goto L_0x00e8;	 Catch:{ all -> 0x019c }
    L_0x00c9:
        r3 = 1;	 Catch:{ all -> 0x019c }
    L_0x00ca:
        r5.f3341a = r3;	 Catch:{ all -> 0x019c }
        r5.f3342b = r12;	 Catch:{ all -> 0x019c }
        r5.f3343c = r13;	 Catch:{ all -> 0x019c }
        r5.f3344d = r2;	 Catch:{ all -> 0x019c }
        r3 = r11.f3339c;	 Catch:{ all -> 0x019c }
        r3 = r3[r6];	 Catch:{ all -> 0x019c }
        r5.f3345e = r3;	 Catch:{ all -> 0x019c }
        r4 = r4 + 1;	 Catch:{ all -> 0x019c }
        r3 = r6 + 2;	 Catch:{ all -> 0x019c }
        r6 = r3;	 Catch:{ all -> 0x019c }
        goto L_0x00a8;	 Catch:{ all -> 0x019c }
    L_0x00de:
        r3 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r3 = r3.get(r4);	 Catch:{ all -> 0x019c }
        r3 = (android.support.v7.widget.cy) r3;	 Catch:{ all -> 0x019c }
        r5 = r3;	 Catch:{ all -> 0x019c }
        goto L_0x00c1;	 Catch:{ all -> 0x019c }
    L_0x00e8:
        r3 = 0;	 Catch:{ all -> 0x019c }
        goto L_0x00ca;	 Catch:{ all -> 0x019c }
    L_0x00ea:
        r2 = r4;	 Catch:{ all -> 0x019c }
    L_0x00eb:
        r3 = r7 + 1;	 Catch:{ all -> 0x019c }
        r7 = r3;	 Catch:{ all -> 0x019c }
        r3 = r2;	 Catch:{ all -> 0x019c }
        goto L_0x0085;	 Catch:{ all -> 0x019c }
    L_0x00f0:
        r2 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r3 = f3332f;	 Catch:{ all -> 0x019c }
        java.util.Collections.sort(r2, r3);	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r4 = r2;	 Catch:{ all -> 0x019c }
    L_0x00f9:
        r2 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r2 = r2.size();	 Catch:{ all -> 0x019c }
        if (r4 >= r2) goto L_0x01a5;	 Catch:{ all -> 0x019c }
    L_0x0101:
        r2 = r14.f3336e;	 Catch:{ all -> 0x019c }
        r2 = r2.get(r4);	 Catch:{ all -> 0x019c }
        r0 = r2;	 Catch:{ all -> 0x019c }
        r0 = (android.support.v7.widget.cy) r0;	 Catch:{ all -> 0x019c }
        r3 = r0;	 Catch:{ all -> 0x019c }
        r2 = r3.f3344d;	 Catch:{ all -> 0x019c }
        if (r2 == 0) goto L_0x01a5;	 Catch:{ all -> 0x019c }
    L_0x010f:
        r2 = r3.f3341a;	 Catch:{ all -> 0x019c }
        if (r2 == 0) goto L_0x017e;	 Catch:{ all -> 0x019c }
    L_0x0113:
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x019c }
    L_0x0118:
        r2 = r3.f3344d;	 Catch:{ all -> 0x019c }
        r5 = r3.f3345e;	 Catch:{ all -> 0x019c }
        r2 = m3425a(r2, r5, r6);	 Catch:{ all -> 0x019c }
        if (r2 == 0) goto L_0x0183;	 Catch:{ all -> 0x019c }
    L_0x0122:
        r5 = r2.f3212b;	 Catch:{ all -> 0x019c }
        if (r5 == 0) goto L_0x0183;	 Catch:{ all -> 0x019c }
    L_0x0126:
        r5 = r2.m3275l();	 Catch:{ all -> 0x019c }
        if (r5 == 0) goto L_0x0183;	 Catch:{ all -> 0x019c }
    L_0x012c:
        r5 = r2.m3273j();	 Catch:{ all -> 0x019c }
        if (r5 != 0) goto L_0x0183;	 Catch:{ all -> 0x019c }
    L_0x0132:
        r2 = r2.f3212b;	 Catch:{ all -> 0x019c }
        r2 = r2.get();	 Catch:{ all -> 0x019c }
        r2 = (android.support.v7.widget.RecyclerView) r2;	 Catch:{ all -> 0x019c }
        if (r2 == 0) goto L_0x0183;	 Catch:{ all -> 0x019c }
    L_0x013c:
        r5 = r2.f505M;	 Catch:{ all -> 0x019c }
        if (r5 == 0) goto L_0x014b;	 Catch:{ all -> 0x019c }
    L_0x0140:
        r5 = r2.f520n;	 Catch:{ all -> 0x019c }
        r5 = r5.m3331b();	 Catch:{ all -> 0x019c }
        if (r5 == 0) goto L_0x014b;	 Catch:{ all -> 0x019c }
    L_0x0148:
        r2.bY_();	 Catch:{ all -> 0x019c }
    L_0x014b:
        r6 = r2.an;	 Catch:{ all -> 0x019c }
        r5 = 1;	 Catch:{ all -> 0x019c }
        r6.m3430a(r2, r5);	 Catch:{ all -> 0x019c }
        r5 = r6.f3340d;	 Catch:{ all -> 0x019c }
        if (r5 == 0) goto L_0x0183;
    L_0x0155:
        r5 = "RV Nested Prefetch";	 Catch:{ all -> 0x0197 }
        android.support.v4.os.C0330d.m1728a(r5);	 Catch:{ all -> 0x0197 }
        r5 = r2.ao;	 Catch:{ all -> 0x0197 }
        r7 = r2.f527u;	 Catch:{ all -> 0x0197 }
        r10 = 1;	 Catch:{ all -> 0x0197 }
        r5.f3468e = r10;	 Catch:{ all -> 0x0197 }
        r7 = r7.mo1039a();	 Catch:{ all -> 0x0197 }
        r5.f3469f = r7;	 Catch:{ all -> 0x0197 }
        r7 = 0;	 Catch:{ all -> 0x0197 }
        r5.f3471h = r7;	 Catch:{ all -> 0x0197 }
        r7 = 0;	 Catch:{ all -> 0x0197 }
        r5.f3472i = r7;	 Catch:{ all -> 0x0197 }
        r5 = 0;	 Catch:{ all -> 0x0197 }
    L_0x016e:
        r7 = r6.f3340d;	 Catch:{ all -> 0x0197 }
        r7 = r7 * 2;	 Catch:{ all -> 0x0197 }
        if (r5 >= r7) goto L_0x0180;	 Catch:{ all -> 0x0197 }
    L_0x0174:
        r7 = r6.f3339c;	 Catch:{ all -> 0x0197 }
        r7 = r7[r5];	 Catch:{ all -> 0x0197 }
        m3425a(r2, r7, r8);	 Catch:{ all -> 0x0197 }
        r5 = r5 + 2;
        goto L_0x016e;
    L_0x017e:
        r6 = r8;
        goto L_0x0118;
    L_0x0180:
        android.support.v4.os.C0330d.m1727a();	 Catch:{ all -> 0x019c }
    L_0x0183:
        r2 = 0;	 Catch:{ all -> 0x019c }
        r3.f3341a = r2;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r3.f3342b = r2;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r3.f3343c = r2;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r3.f3344d = r2;	 Catch:{ all -> 0x019c }
        r2 = 0;	 Catch:{ all -> 0x019c }
        r3.f3345e = r2;	 Catch:{ all -> 0x019c }
        r2 = r4 + 1;	 Catch:{ all -> 0x019c }
        r4 = r2;	 Catch:{ all -> 0x019c }
        goto L_0x00f9;	 Catch:{ all -> 0x019c }
    L_0x0197:
        r2 = move-exception;	 Catch:{ all -> 0x019c }
        android.support.v4.os.C0330d.m1727a();	 Catch:{ all -> 0x019c }
        throw r2;	 Catch:{ all -> 0x019c }
    L_0x019c:
        r2 = move-exception;
        r4 = 0;
        r14.f3334c = r4;
        android.support.v4.os.C0330d.m1727a();
        throw r2;
    L_0x01a5:
        r2 = 0;
        r14.f3334c = r2;
        android.support.v4.os.C0330d.m1727a();
        goto L_0x0014;
    L_0x01ae:
        r2 = r3;
        goto L_0x00eb;
    L_0x01b1:
        r2 = r3;
        goto L_0x0078;
    L_0x01b4:
        r2 = r4;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cv.run():void");
    }
}
