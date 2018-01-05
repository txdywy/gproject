package com.google.android.finsky.instantappsquickinstall;

import android.content.Context;
import android.support.v4.p037h.C0313h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.bb;

public final class C3606c implements C1549f {
    public final Context f17934a;
    public final C2495w f17935b;
    public final C1461c f17936c;

    public C3606c(Context context, C1461c c1461c, C2495w c2495w) {
        this.f17934a = context.getApplicationContext();
        this.f17936c = c1461c;
        this.f17935b = c2495w;
    }

    public final void m17204a() {
        bb.m21792a(new C3607d(this.f17934a, this.f17936c, this.f17935b), new Void[0]);
    }

    public final void mo2287a(boolean z) {
    }

    public final void mo2286a(C0313h c0313h, C0313h c0313h2) {
        if (c0313h.m1690c(12639218) >= 0) {
            m17204a();
        } else if (c0313h2.m1690c(12639218) >= 0) {
            m17204a();
        }
    }
}
