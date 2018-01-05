package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.af;
import com.squareup.okhttp.internal.C7615d;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.util.Arrays;
import p526e.C7725i;
import p526e.C7726f;
import p526e.C7728j;

final class C7626p extends C7615d implements C7613c {
    public final C7610b f39500b;
    public final /* synthetic */ C7614e f39501c;

    C7626p(C7614e c7614e, C7610b c7610b) {
        this.f39501c = c7614e;
        super("OkHttp %s", c7614e.f39452f);
        this.f39500b = c7610b;
    }

    protected final void mo6443a() {
        C7609a c7609a;
        Throwable th;
        C7609a c7609a2 = C7609a.INTERNAL_ERROR;
        C7609a c7609a3 = C7609a.INTERNAL_ERROR;
        try {
            if (!this.f39501c.f39449c) {
                this.f39500b.mo6426a();
            }
            do {
            } while (this.f39500b.mo6427a(this));
            try {
                this.f39501c.m36792a(C7609a.NO_ERROR, C7609a.CANCEL);
            } catch (IOException e) {
            }
            k.a(this.f39500b);
        } catch (IOException e2) {
            c7609a = C7609a.PROTOCOL_ERROR;
            try {
                this.f39501c.m36792a(c7609a, C7609a.PROTOCOL_ERROR);
            } catch (IOException e3) {
            }
            k.a(this.f39500b);
        } catch (Throwable th2) {
            th = th2;
            this.f39501c.m36792a(c7609a, c7609a3);
            k.a(this.f39500b);
            throw th;
        }
    }

    public final void mo6450a(boolean z, int i, C7725i c7725i, int i2) {
        int i3 = (this.f39501c.f39448b == af.d && i != 0 && (i & 1) == 0) ? 1 : 0;
        if (i3 != 0) {
            C7614e c7614e = this.f39501c;
            C7726f c7726f = new C7726f();
            c7725i.mo6485a((long) i2);
            c7725i.mo6423a(c7726f, (long) i2);
            if (c7726f.f40188c != ((long) i2)) {
                throw new IOException(c7726f.f40188c + " != " + i2);
            }
            c7614e.f39456j.execute(new C7621k(c7614e, "OkHttp %s Push Data[%s]", new Object[]{c7614e.f39452f, Integer.valueOf(i)}, i, c7726f, i2));
            return;
        }
        C7630t a = this.f39501c.m36787a(i);
        if (a == null) {
            this.f39501c.m36790a(i, C7609a.INVALID_STREAM);
            c7725i.mo6497f((long) i2);
            return;
        }
        a.f39512f.m36839a(c7725i, (long) i2);
        if (z) {
            a.m36830e();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6452a(boolean r9, boolean r10, int r11, java.util.List r12, com.squareup.okhttp.internal.p525a.C7637y r13) {
        /*
        r8 = this;
        r6 = 2;
        r2 = 0;
        r0 = 1;
        r1 = r8.f39501c;
        r1 = r1.f39448b;
        r3 = com.squareup.okhttp.af.d;
        if (r1 != r3) goto L_0x002f;
    L_0x000b:
        if (r11 == 0) goto L_0x002f;
    L_0x000d:
        r1 = r11 & 1;
        if (r1 != 0) goto L_0x002f;
    L_0x0011:
        r1 = r0;
    L_0x0012:
        if (r1 == 0) goto L_0x0031;
    L_0x0014:
        r1 = r8.f39501c;
        r3 = r1.f39456j;
        r4 = new com.squareup.okhttp.internal.a.j;
        r5 = "OkHttp %s Push Headers[%s]";
        r6 = new java.lang.Object[r6];
        r7 = r1.f39452f;
        r6[r2] = r7;
        r2 = java.lang.Integer.valueOf(r11);
        r6[r0] = r2;
        r4.<init>(r1, r5, r6, r11);
        r3.execute(r4);
    L_0x002e:
        return;
    L_0x002f:
        r1 = r2;
        goto L_0x0012;
    L_0x0031:
        r6 = r8.f39501c;
        monitor-enter(r6);
        r1 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r1 = r1.f39455i;	 Catch:{ all -> 0x003c }
        if (r1 == 0) goto L_0x003f;
    L_0x003a:
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        goto L_0x002e;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r1 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r3 = r1.m36787a(r11);	 Catch:{ all -> 0x003c }
        if (r3 != 0) goto L_0x00a8;
    L_0x0047:
        r1 = com.squareup.okhttp.internal.p525a.C7637y.SPDY_REPLY;	 Catch:{ all -> 0x003c }
        if (r13 == r1) goto L_0x004f;
    L_0x004b:
        r1 = com.squareup.okhttp.internal.p525a.C7637y.SPDY_HEADERS;	 Catch:{ all -> 0x003c }
        if (r13 != r1) goto L_0x0050;
    L_0x004f:
        r2 = r0;
    L_0x0050:
        if (r2 == 0) goto L_0x005b;
    L_0x0052:
        r0 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r1 = com.squareup.okhttp.internal.p525a.C7609a.INVALID_STREAM;	 Catch:{ all -> 0x003c }
        r0.m36790a(r11, r1);	 Catch:{ all -> 0x003c }
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        goto L_0x002e;
    L_0x005b:
        r0 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r0 = r0.f39453g;	 Catch:{ all -> 0x003c }
        if (r11 > r0) goto L_0x0063;
    L_0x0061:
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        goto L_0x002e;
    L_0x0063:
        r0 = r11 % 2;
        r1 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r1 = r1.f39454h;	 Catch:{ all -> 0x003c }
        r1 = r1 % 2;
        if (r0 != r1) goto L_0x006f;
    L_0x006d:
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        goto L_0x002e;
    L_0x006f:
        r0 = new com.squareup.okhttp.internal.a.t;	 Catch:{ all -> 0x003c }
        r2 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r1 = r11;
        r3 = r9;
        r4 = r10;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x003c }
        r1 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r1.f39453g = r11;	 Catch:{ all -> 0x003c }
        r1 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r1 = r1.f39451e;	 Catch:{ all -> 0x003c }
        r2 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x003c }
        r1.put(r2, r0);	 Catch:{ all -> 0x003c }
        r1 = com.squareup.okhttp.internal.p525a.C7614e.f39447a;	 Catch:{ all -> 0x003c }
        r2 = new com.squareup.okhttp.internal.a.q;	 Catch:{ all -> 0x003c }
        r3 = "OkHttp %s stream %d";
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x003c }
        r5 = 0;
        r7 = r8.f39501c;	 Catch:{ all -> 0x003c }
        r7 = r7.f39452f;	 Catch:{ all -> 0x003c }
        r4[r5] = r7;	 Catch:{ all -> 0x003c }
        r5 = 1;
        r7 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x003c }
        r4[r5] = r7;	 Catch:{ all -> 0x003c }
        r2.<init>(r8, r3, r4, r0);	 Catch:{ all -> 0x003c }
        r1.execute(r2);	 Catch:{ all -> 0x003c }
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        goto L_0x002e;
    L_0x00a8:
        monitor-exit(r6);	 Catch:{ all -> 0x003c }
        r1 = com.squareup.okhttp.internal.p525a.C7637y.SPDY_SYN_STREAM;
        if (r13 != r1) goto L_0x00bc;
    L_0x00ad:
        r1 = r0;
    L_0x00ae:
        if (r1 == 0) goto L_0x00be;
    L_0x00b0:
        r0 = com.squareup.okhttp.internal.p525a.C7609a.PROTOCOL_ERROR;
        r3.m36825b(r0);
        r0 = r8.f39501c;
        r0.m36793b(r11);
        goto L_0x002e;
    L_0x00bc:
        r1 = r2;
        goto L_0x00ae;
    L_0x00be:
        r1 = 0;
        monitor-enter(r3);
        r4 = r3.f39511e;	 Catch:{ all -> 0x00e4 }
        if (r4 != 0) goto L_0x00e7;
    L_0x00c4:
        r4 = com.squareup.okhttp.internal.p525a.C7637y.SPDY_HEADERS;	 Catch:{ all -> 0x00e4 }
        if (r13 != r4) goto L_0x00c9;
    L_0x00c8:
        r2 = r0;
    L_0x00c9:
        if (r2 == 0) goto L_0x00da;
    L_0x00cb:
        r1 = com.squareup.okhttp.internal.p525a.C7609a.PROTOCOL_ERROR;	 Catch:{ all -> 0x00e4 }
    L_0x00cd:
        monitor-exit(r3);	 Catch:{ all -> 0x00e4 }
        if (r1 == 0) goto L_0x0101;
    L_0x00d0:
        r3.m36825b(r1);
    L_0x00d3:
        if (r10 == 0) goto L_0x002e;
    L_0x00d5:
        r3.m36830e();
        goto L_0x002e;
    L_0x00da:
        r3.f39511e = r12;	 Catch:{ all -> 0x00e4 }
        r0 = r3.m36824a();	 Catch:{ all -> 0x00e4 }
        r3.notifyAll();	 Catch:{ all -> 0x00e4 }
        goto L_0x00cd;
    L_0x00e4:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00e4 }
        throw r0;
    L_0x00e7:
        r4 = com.squareup.okhttp.internal.p525a.C7637y.SPDY_REPLY;	 Catch:{ all -> 0x00e4 }
        if (r13 != r4) goto L_0x00ec;
    L_0x00eb:
        r2 = r0;
    L_0x00ec:
        if (r2 == 0) goto L_0x00f1;
    L_0x00ee:
        r1 = com.squareup.okhttp.internal.p525a.C7609a.STREAM_IN_USE;	 Catch:{ all -> 0x00e4 }
        goto L_0x00cd;
    L_0x00f1:
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x00e4 }
        r2.<init>();	 Catch:{ all -> 0x00e4 }
        r4 = r3.f39511e;	 Catch:{ all -> 0x00e4 }
        r2.addAll(r4);	 Catch:{ all -> 0x00e4 }
        r2.addAll(r12);	 Catch:{ all -> 0x00e4 }
        r3.f39511e = r2;	 Catch:{ all -> 0x00e4 }
        goto L_0x00cd;
    L_0x0101:
        if (r0 != 0) goto L_0x00d3;
    L_0x0103:
        r0 = r3.f39510d;
        r1 = r3.f39509c;
        r0.m36793b(r1);
        goto L_0x00d3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.a.p.a(boolean, boolean, int, java.util.List, com.squareup.okhttp.internal.a.y):void");
    }

    public final void mo6447a(int i, C7609a c7609a) {
        int i2 = (this.f39501c.f39448b == af.d && i != 0 && (i & 1) == 0) ? 1 : 0;
        if (i2 != 0) {
            C7614e c7614e = this.f39501c;
            c7614e.f39456j.execute(new C7622l(c7614e, "OkHttp %s Push Reset[%s]", new Object[]{c7614e.f39452f, Integer.valueOf(i)}, i));
            return;
        }
        C7630t b = this.f39501c.m36793b(i);
        if (b != null) {
            b.m36828c(c7609a);
        }
    }

    public final void mo6451a(boolean z, ap apVar) {
        C7630t[] c7630tArr;
        long j;
        synchronized (this.f39501c) {
            int i;
            int b = this.f39501c.f39462p.m36756b();
            if (z) {
                ap apVar2 = this.f39501c.f39462p;
                apVar2.f39436c = 0;
                apVar2.f39435b = 0;
                apVar2.f39434a = 0;
                Arrays.fill(apVar2.f39437d, 0);
            }
            ap apVar3 = this.f39501c.f39462p;
            for (i = 0; i < 10; i++) {
                if (apVar.m36755a(i)) {
                    apVar3.m36754a(i, apVar.m36757b(i), apVar.f39437d[i]);
                }
            }
            if (this.f39501c.f39448b == af.d) {
                C7614e.f39447a.execute(new C7629s(this, "OkHttp %s ACK Settings", new Object[]{this.f39501c.f39452f}, apVar));
            }
            i = this.f39501c.f39462p.m36756b();
            if (i == -1 || i == b) {
                c7630tArr = null;
                j = 0;
            } else {
                long j2 = (long) (i - b);
                if (!this.f39501c.f39463q) {
                    C7614e c7614e = this.f39501c;
                    c7614e.f39460n += j2;
                    if (j2 > 0) {
                        c7614e.notifyAll();
                    }
                    this.f39501c.f39463q = true;
                }
                if (this.f39501c.f39451e.isEmpty()) {
                    j = j2;
                    c7630tArr = null;
                } else {
                    j = j2;
                    c7630tArr = (C7630t[]) this.f39501c.f39451e.values().toArray(new C7630t[this.f39501c.f39451e.size()]);
                }
            }
            C7614e.f39447a.execute(new C7628r(this, "OkHttp %s settings", this.f39501c.f39452f));
        }
        if (c7630tArr != null && j != 0) {
            for (C7630t c7630t : c7630tArr) {
                synchronized (c7630t) {
                    c7630t.m36822a(j);
                }
            }
        }
    }

    public final void mo6449a(boolean z, int i, int i2) {
        if (z) {
            am c = this.f39501c.m36796c(i);
            if (c == null) {
                return;
            }
            if (c.f39432c != -1 || c.f39431b == -1) {
                throw new IllegalStateException();
            }
            c.f39432c = System.nanoTime();
            c.f39430a.countDown();
            return;
        }
        C7614e c7614e = this.f39501c;
        C7614e.f39447a.execute(new C7618h(c7614e, "OkHttp %s ping %08x%08x", new Object[]{c7614e.f39452f, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
    }

    public final void mo6448a(int i, C7728j c7728j) {
        c7728j.mo6522e();
        synchronized (this.f39501c) {
            C7630t[] c7630tArr = (C7630t[]) this.f39501c.f39451e.values().toArray(new C7630t[this.f39501c.f39451e.size()]);
            this.f39501c.f39455i = true;
        }
        for (C7630t c7630t : c7630tArr) {
            if (c7630t.f39509c > i && c7630t.m36826b()) {
                c7630t.m36828c(C7609a.REFUSED_STREAM);
                this.f39501c.m36793b(c7630t.f39509c);
            }
        }
    }

    public final void mo6446a(int i, long j) {
        if (i == 0) {
            synchronized (this.f39501c) {
                C7614e c7614e = this.f39501c;
                c7614e.f39460n += j;
                this.f39501c.notifyAll();
            }
            return;
        }
        C7630t a = this.f39501c.m36787a(i);
        if (a != null) {
            synchronized (a) {
                a.m36822a(j);
            }
        }
    }

    public final void mo6453b() {
    }

    public final void mo6445a(int i) {
        C7614e c7614e = this.f39501c;
        synchronized (c7614e) {
            if (c7614e.f39468v.contains(Integer.valueOf(i))) {
                c7614e.m36790a(i, C7609a.PROTOCOL_ERROR);
                return;
            }
            c7614e.f39468v.add(Integer.valueOf(i));
            c7614e.f39456j.execute(new C7619i(c7614e, "OkHttp %s Push Request[%s]", new Object[]{c7614e.f39452f, Integer.valueOf(i)}, i));
        }
    }
}
