package android.support.v7.widget;

import android.support.v4.view.ai;

final class fj extends eo {
    public final /* synthetic */ RecyclerView f3456a;

    fj(RecyclerView recyclerView) {
        this.f3456a = recyclerView;
    }

    public final void mo872a() {
        this.f3456a.m282a(null);
        this.f3456a.ao.f3470g = true;
        this.f3456a.m316p();
        if (!this.f3456a.f519m.m3917d()) {
            this.f3456a.requestLayout();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo874a(int r5, int r6, java.lang.Object r7) {
        /*
        r4 = this;
        r0 = 1;
        r1 = r4.f3456a;
        r2 = 0;
        r1.m282a(r2);
        r1 = r4.f3456a;
        r1 = r1.f519m;
        if (r6 <= 0) goto L_0x002b;
    L_0x000d:
        r2 = r1.f3660b;
        r3 = 4;
        r3 = r1.mo930a(r3, r5, r6, r7);
        r2.add(r3);
        r2 = r1.f3666h;
        r2 = r2 | 4;
        r1.f3666h = r2;
        r1 = r1.f3660b;
        r1 = r1.size();
        if (r1 != r0) goto L_0x002b;
    L_0x0025:
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r4.m3696b();
    L_0x002a:
        return;
    L_0x002b:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fj.a(int, int, java.lang.Object):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo875b(int r5, int r6) {
        /*
        r4 = this;
        r3 = 0;
        r0 = 1;
        r1 = r4.f3456a;
        r1.m282a(r3);
        r1 = r4.f3456a;
        r1 = r1.f519m;
        if (r6 <= 0) goto L_0x002a;
    L_0x000d:
        r2 = r1.f3660b;
        r3 = r1.mo930a(r0, r5, r6, r3);
        r2.add(r3);
        r2 = r1.f3666h;
        r2 = r2 | 1;
        r1.f3666h = r2;
        r1 = r1.f3660b;
        r1 = r1.size();
        if (r1 != r0) goto L_0x002a;
    L_0x0024:
        if (r0 == 0) goto L_0x0029;
    L_0x0026:
        r4.m3696b();
    L_0x0029:
        return;
    L_0x002a:
        r0 = 0;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fj.b(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo876c(int r6, int r7) {
        /*
        r5 = this;
        r4 = 0;
        r0 = 1;
        r1 = r5.f3456a;
        r1.m282a(r4);
        r1 = r5.f3456a;
        r1 = r1.f519m;
        if (r7 <= 0) goto L_0x002b;
    L_0x000d:
        r2 = r1.f3660b;
        r3 = 2;
        r3 = r1.mo930a(r3, r6, r7, r4);
        r2.add(r3);
        r2 = r1.f3666h;
        r2 = r2 | 2;
        r1.f3666h = r2;
        r1 = r1.f3660b;
        r1 = r1.size();
        if (r1 != r0) goto L_0x002b;
    L_0x0025:
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r5.m3696b();
    L_0x002a:
        return;
    L_0x002b:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fj.c(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo873a(int r6, int r7, int r8) {
        /*
        r5 = this;
        r4 = 0;
        r0 = 1;
        r1 = r5.f3456a;
        r1.m282a(r4);
        r1 = r5.f3456a;
        r1 = r1.f519m;
        if (r6 == r7) goto L_0x0036;
    L_0x000d:
        if (r8 == r0) goto L_0x0017;
    L_0x000f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Moving more than 1 item is not supported yet";
        r0.<init>(r1);
        throw r0;
    L_0x0017:
        r2 = r1.f3660b;
        r3 = 8;
        r3 = r1.mo930a(r3, r6, r7, r4);
        r2.add(r3);
        r2 = r1.f3666h;
        r2 = r2 | 8;
        r1.f3666h = r2;
        r1 = r1.f3660b;
        r1 = r1.size();
        if (r1 != r0) goto L_0x0036;
    L_0x0030:
        if (r0 == 0) goto L_0x0035;
    L_0x0032:
        r5.m3696b();
    L_0x0035:
        return;
    L_0x0036:
        r0 = 0;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fj.a(int, int, int):void");
    }

    private final void m3696b() {
        if (RecyclerView.f488e && this.f3456a.f494B && this.f3456a.f493A) {
            ai.m1830a(this.f3456a, this.f3456a.f523q);
            return;
        }
        this.f3456a.f502J = true;
        this.f3456a.requestLayout();
    }
}
