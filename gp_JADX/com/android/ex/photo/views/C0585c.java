package com.android.ex.photo.views;

public final class C0585c implements Runnable {
    public final PhotoView f3899a;
    public float f3900b;
    public float f3901c;
    public boolean f3902d;
    public float f3903e;
    public float f3904f;
    public float f3905g;
    public long f3906h;
    public boolean f3907i;
    public boolean f3908j;

    public C0585c(PhotoView photoView) {
        this.f3899a = photoView;
    }

    public final boolean m4182a(float f, float f2, float f3, float f4) {
        if (this.f3907i) {
            return false;
        }
        this.f3900b = f3;
        this.f3901c = f4;
        this.f3903e = f2;
        this.f3906h = System.currentTimeMillis();
        this.f3904f = f;
        this.f3902d = this.f3903e > this.f3904f;
        this.f3905g = (this.f3903e - this.f3904f) / 200.0f;
        this.f3907i = true;
        this.f3908j = false;
        this.f3899a.post(this);
        return true;
    }

    public final void m4181a() {
        this.f3907i = false;
        this.f3908j = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r4 = this;
        r0 = r4.f3908j;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r4.f3906h;
        r0 = r0 - r2;
        r2 = r4.f3904f;
        r3 = r4.f3905g;
        r0 = (float) r0;
        r0 = r0 * r3;
        r0 = r0 + r2;
        r1 = r4.f3899a;
        r2 = r4.f3900b;
        r3 = r4.f3901c;
        r1.m4175a(r0, r2, r3);
        r1 = r4.f3903e;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x002d;
    L_0x0022:
        r1 = r4.f3902d;
        r2 = r4.f3903e;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0045;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        if (r1 != r0) goto L_0x003b;
    L_0x002d:
        r0 = r4.f3899a;
        r1 = r4.f3903e;
        r2 = r4.f3900b;
        r3 = r4.f3901c;
        r0.m4175a(r1, r2, r3);
        r4.m4181a();
    L_0x003b:
        r0 = r4.f3908j;
        if (r0 != 0) goto L_0x0004;
    L_0x003f:
        r0 = r4.f3899a;
        r0.post(r4);
        goto L_0x0004;
    L_0x0045:
        r0 = 0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.views.c.run():void");
    }
}
