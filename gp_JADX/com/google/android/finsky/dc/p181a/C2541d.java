package com.google.android.finsky.dc.p181a;

import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.os.C0327a;
import com.google.android.finsky.ba.C1552e;

final class C2541d implements Runnable {
    public final /* synthetic */ Uri f13613a;
    public final /* synthetic */ C2538b f13614b;

    C2541d(C2538b c2538b, Uri uri) {
        this.f13614b = c2538b;
        this.f13613a = uri;
    }

    public final void run() {
        C2545h c2549l;
        this.f13614b.m13501a(106);
        C2546i c2546i = this.f13614b.f13608o;
        C1552e c1552e = this.f13614b.f13596c;
        C2538b c2538b = this.f13614b;
        Object obj = (C0327a.m1721a() || (VERSION.SDK_INT >= 21 && c1552e.mo2294a(12606982))) ? 1 : null;
        if (obj != null) {
            c2549l = new C2549l(c2538b);
        } else {
            c2549l = new C2547j(c2538b, c2546i.f13623a);
        }
        c2549l.mo2941a(this.f13613a, new C2542e(this));
    }
}
