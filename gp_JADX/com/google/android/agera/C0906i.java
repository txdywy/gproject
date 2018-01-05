package com.google.android.agera;

import java.util.concurrent.Executor;

final class C0906i extends C0894b implements ac, am, Runnable {
    public final Object f5673i;
    public final C0893t f5674j;
    public final Object[] f5675k;
    public final C0904p f5676l;
    public final int f5677m;
    public final int f5678n;
    public final C0895z f5679o;
    public final ao f5680p;
    public int f5681q = 0;
    public boolean f5682r;
    public int f5683s = -1;
    public Object f5684t;
    public Object f5685u;
    public Thread f5686v;

    C0906i(Object obj, C0893t c0893t, Object[] objArr, C0904p c0904p, int i, int i2, C0895z c0895z) {
        this.f5673i = obj;
        this.f5684t = obj;
        this.f5685u = obj;
        this.f5674j = c0893t;
        this.f5675k = objArr;
        this.f5676l = c0904p;
        this.f5677m = i;
        this.f5678n = i2;
        this.f5679o = c0895z;
        this.f5680p = ao.m5599a();
    }

    protected final void mo1158b() {
        this.f5674j.mo1144a(this);
        m5623e();
    }

    protected final void mo1159c() {
        this.f5674j.mo1145b(this);
        m5613a(this.f5677m, false);
    }

    public final void ad_() {
        m5613a(this.f5678n, true);
        m5623e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m5623e() {
        /*
        r3 = this;
        r2 = 0;
        monitor-enter(r3);
        r0 = r3.f5681q;	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x000b;
    L_0x0006:
        r0 = r3.f5681q;	 Catch:{ all -> 0x0027 }
        r1 = 4;
        if (r0 != r1) goto L_0x001d;
    L_0x000b:
        r0 = 1;
        r3.f5681q = r0;	 Catch:{ all -> 0x0027 }
        r0 = -1;
        r3.f5683s = r0;	 Catch:{ all -> 0x0027 }
        r0 = 0;
        r3.f5682r = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        r0 = r3.f5684t;
        r3.f5685u = r0;
        r3.m5616b(r2, r2);
    L_0x001c:
        return;
    L_0x001d:
        r0 = r3.f5681q;	 Catch:{ all -> 0x0027 }
        r1 = 2;
        if (r0 != r1) goto L_0x0025;
    L_0x0022:
        r0 = 1;
        r3.f5682r = r0;	 Catch:{ all -> 0x0027 }
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x001c;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.agera.i.e():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5613a(int r4, boolean r5) {
        /*
        r3 = this;
        r2 = 3;
        monitor-enter(r3);
        r0 = r3.f5681q;	 Catch:{ all -> 0x0031 }
        r1 = 1;
        if (r0 == r1) goto L_0x000b;
    L_0x0007:
        r0 = r3.f5681q;	 Catch:{ all -> 0x0031 }
        if (r0 != r2) goto L_0x0024;
    L_0x000b:
        r3.f5682r = r5;	 Catch:{ all -> 0x0031 }
        r0 = r4 & 1;
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = 2;
        r3.f5681q = r0;	 Catch:{ all -> 0x0031 }
        r0 = r4 & 5;
        r1 = 5;
        if (r0 != r1) goto L_0x0024;
    L_0x001b:
        r0 = r3.f5686v;	 Catch:{ all -> 0x0031 }
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r3.f5686v;	 Catch:{ all -> 0x0031 }
        r0.interrupt();	 Catch:{ all -> 0x0031 }
    L_0x0024:
        if (r5 != 0) goto L_0x002f;
    L_0x0026:
        r0 = r4 & 3;
        if (r0 != r2) goto L_0x002f;
    L_0x002a:
        r0 = r3.f5673i;	 Catch:{ all -> 0x0031 }
        r3.m5617b(r0);	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        goto L_0x0012;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0031 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.agera.i.a(int, boolean):void");
    }

    private final boolean m5618f() {
        if (this.f5681q != 2) {
            return false;
        }
        this.f5680p.obtainMessage(5, this).sendToTarget();
        return true;
    }

    private final void m5619g() {
        if (this.f5682r) {
            this.f5680p.obtainMessage(4, this).sendToTarget();
        }
    }

    private final void m5616b(int i, boolean z) {
        Object[] objArr = this.f5675k;
        int length = objArr.length;
        int i2 = i;
        while (i2 >= 0 && i2 < length) {
            int intValue = ((Integer) objArr[i2]).intValue();
            if (z || intValue == 5 || intValue == 6) {
                synchronized (this) {
                    if (m5618f()) {
                        return;
                    } else if (intValue == 5) {
                        this.f5683s = i2;
                        this.f5681q = 3;
                    } else if (intValue == 6) {
                        this.f5683s = i2;
                        this.f5681q = 4;
                        m5570a();
                        m5619g();
                        return;
                    }
                }
            }
            switch (intValue) {
                case 0:
                    if (!((Boolean) objArr[i2 + 1]).booleanValue()) {
                        m5614a(this.f5685u);
                        break;
                    } else {
                        m5620h();
                        break;
                    }
                case 1:
                    this.f5685u = C0917x.m5639a(((al) objArr[i2 + 1]).i_());
                    i2 += 2;
                    continue;
                case 2:
                    this.f5685u = C0917x.m5639a(((C0904p) objArr[i2 + 2]).mo1157a(this.f5685u, ((al) objArr[i2 + 1]).i_()));
                    i2 += 3;
                    continue;
                case 3:
                    this.f5685u = C0917x.m5639a(((C0899j) objArr[i2 + 1]).mo1154a(this.f5685u));
                    i2 += 2;
                    continue;
                case 4:
                    C0902y c0902y = (C0902y) objArr[i2 + 2];
                    C0899j c0899j = (C0899j) objArr[i2 + 3];
                    Object a = ((C0899j) objArr[i2 + 1]).mo1154a(this.f5685u);
                    if (c0902y.mo1156a()) {
                        intValue = i2 + 4;
                    } else {
                        m5615a(a, c0899j);
                        intValue = -1;
                    }
                    i2 = intValue;
                    continue;
                case 5:
                    ((Executor) objArr[i2 + 1]).execute(this);
                    break;
                case 7:
                    ((C0895z) objArr[i2 + 1]).mo1146b(this.f5685u);
                    i2 += 2;
                    continue;
                case 8:
                    C0897c c0897c = (C0897c) objArr[i2 + 2];
                    ((al) objArr[i2 + 1]).i_();
                    c0897c.mo1155a();
                    i2 += 3;
                    continue;
                case 9:
                    C0899j c0899j2 = (C0899j) objArr[i2 + 1];
                    ak akVar = (ak) this.f5685u;
                    if (akVar.m5595a()) {
                        this.f5685u = akVar.m5596b();
                        intValue = i2 + 2;
                    } else {
                        m5615a(akVar.m5598d(), c0899j2);
                        intValue = -1;
                    }
                    i2 = intValue;
                    continue;
                case 10:
                    ak akVar2 = (ak) this.f5685u;
                    if (akVar2.m5595a()) {
                        m5615a(akVar2.m5596b(), C0907k.m5624a());
                        intValue = -1;
                    } else {
                        this.f5685u = akVar2.m5598d();
                        intValue = i2 + 1;
                    }
                    i2 = intValue;
                    continue;
                default:
                    intValue = i2;
                    break;
            }
            intValue = -1;
            i2 = intValue;
        }
    }

    private final void m5615a(Object obj, C0899j c0899j) {
        if (c0899j == null) {
            m5620h();
        } else {
            m5614a(C0917x.m5639a(c0899j.mo1154a(obj)));
        }
    }

    private final void m5620h() {
        Object obj = null;
        synchronized (this) {
            this.f5681q = 0;
            if (this.f5685u != this.f5684t) {
                obj = this.f5685u;
                this.f5685u = this.f5684t;
            }
            m5619g();
        }
        if (obj != null) {
            this.f5679o.mo1146b(obj);
        }
    }

    private final synchronized void m5614a(Object obj) {
        Object obj2 = null;
        synchronized (this) {
            Object obj3 = null;
            synchronized (this) {
                if (this.f5681q == 5) {
                    obj2 = 1;
                }
                this.f5681q = 0;
                if (this.f5685u != obj) {
                    obj3 = this.f5685u;
                    this.f5685u = obj;
                }
                if (obj2 != null) {
                    this.f5684t = obj;
                } else {
                    m5617b(obj);
                }
                m5619g();
            }
        }
        if (obj3 != null) {
            this.f5679o.mo1146b(obj3);
        }
    }

    private final void m5617b(Object obj) {
        boolean booleanValue = ((Boolean) this.f5676l.mo1157a(this.f5684t, obj)).booleanValue();
        this.f5684t = obj;
        if (booleanValue) {
            m5570a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r5 = this;
        r1 = 1;
        r2 = java.lang.Thread.currentThread();
        monitor-enter(r5);
        r3 = r5.f5683s;	 Catch:{ all -> 0x0052 }
        r0 = r5.f5681q;	 Catch:{ all -> 0x0052 }
        r4 = 3;
        if (r0 == r4) goto L_0x0012;
    L_0x000d:
        r0 = r5.f5681q;	 Catch:{ all -> 0x0052 }
        r4 = 2;
        if (r0 != r4) goto L_0x0023;
    L_0x0012:
        r0 = r1;
    L_0x0013:
        r4 = "Illegal call of Runnable.run()";
        com.google.android.agera.C0917x.m5640a(r0, r4);	 Catch:{ all -> 0x0052 }
        r0 = -1;
        r5.f5683s = r0;	 Catch:{ all -> 0x0052 }
        r0 = r5.m5618f();	 Catch:{ all -> 0x0052 }
        if (r0 == 0) goto L_0x0025;
    L_0x0021:
        monitor-exit(r5);	 Catch:{ all -> 0x0052 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = 0;
        goto L_0x0013;
    L_0x0025:
        r0 = 1;
        r5.f5681q = r0;	 Catch:{ all -> 0x0052 }
        r5.f5686v = r2;	 Catch:{ all -> 0x0052 }
        monitor-exit(r5);	 Catch:{ all -> 0x0052 }
        r0 = r5.f5675k;
        r0 = r0[r3];
        r4 = 5;
        r4 = java.lang.Integer.valueOf(r4);
        r0 = r0.equals(r4);
        r4 = "Inconsistent directive state for goTo";
        com.google.android.agera.C0917x.m5640a(r0, r4);
        r0 = r3 + 2;
        r5.m5616b(r0, r1);
        java.lang.Thread.interrupted();
        monitor-enter(r5);
        r0 = r5.f5686v;	 Catch:{ all -> 0x004f }
        if (r0 != r2) goto L_0x004d;
    L_0x004a:
        r0 = 0;
        r5.f5686v = r0;	 Catch:{ all -> 0x004f }
    L_0x004d:
        monitor-exit(r5);	 Catch:{ all -> 0x004f }
        goto L_0x0022;
    L_0x004f:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x004f }
        throw r0;
    L_0x0052:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0052 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.agera.i.run():void");
    }

    public final synchronized Object i_() {
        if (this.f5681q == 4) {
            int i = this.f5683s;
            this.f5681q = 5;
            C0917x.m5640a(this.f5675k[i].equals(Integer.valueOf(6)), "Inconsistent directive state for goLazy");
            m5616b(i + 1, false);
        }
        return this.f5684t;
    }
}
