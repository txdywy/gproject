package com.google.android.play.image;

import com.android.volley.f;
import com.android.volley.n;

final class ai implements aq {
    public final /* synthetic */ int f31986a;
    public final /* synthetic */ int f31987b;
    public final /* synthetic */ String f31988c;
    public final /* synthetic */ String f31989d;
    public final /* synthetic */ int f31990e;
    public final /* synthetic */ boolean f31991f;
    public final /* synthetic */ ag f31992g;

    ai(ag agVar, int i, int i2, String str, String str2, int i3, boolean z) {
        this.f31992g = agVar;
        this.f31986a = i;
        this.f31987b = i2;
        this.f31988c = str;
        this.f31989d = str2;
        this.f31990e = i3;
        this.f31991f = z;
    }

    public final n mo5398a() {
        this.f31992g.k.a((this.f31986a * this.f31987b) * 2);
        n a = this.f31992g.a(this.f31988c, this.f31986a, this.f31987b, this.f31990e, new aj(this), new ak(this));
        if (this.f31992g.m != null) {
            a.m = new f(this.f31992g.m.a(), 2, 2.0f);
        }
        return a;
    }
}
