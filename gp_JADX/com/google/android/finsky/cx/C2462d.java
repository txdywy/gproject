package com.google.android.finsky.cx;

final class C2462d implements Runnable {
    public final /* synthetic */ boolean f13282a;
    public final /* synthetic */ String f13283b;
    public final /* synthetic */ C2460b f13284c;

    C2462d(C2460b c2460b, boolean z, String str) {
        this.f13284c = c2460b;
        this.f13282a = z;
        this.f13283b = str;
    }

    public final void run() {
        C2459a.f13276a = System.currentTimeMillis();
        if (this.f13282a) {
            this.f13284c.f13280d.mo3445b(this.f13283b, false);
        }
        C2460b c2460b = this.f13284c;
        String str = this.f13283b;
        for (int i = 0; i < c2460b.f13277a.size(); i++) {
            ((C1000f) c2460b.f13277a.get(i)).mo1208a(str, true);
        }
    }
}
