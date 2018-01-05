package com.google.android.finsky.application;

import android.content.Context;
import com.android.volley.C0657w;
import com.google.android.finsky.api.C1297t;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.play.image.C1454l;
import com.google.android.play.image.C6319q;
import com.google.android.play.image.bt;
import com.google.android.play.image.bu;
import com.google.android.play.image.by;
import com.google.android.play.image.m;
import com.google.android.play.image.o;

final /* synthetic */ class af implements C1454l {
    public final C1475d f7903a;
    public final C2276c f7904b;

    af(C1475d c1475d, C2276c c2276c) {
        this.f7903a = c1475d;
        this.f7904b = c2276c;
    }

    public final bt mo2008a(m mVar, C0657w c0657w, o oVar, C6319q c6319q, by byVar, bu buVar) {
        C1461c c1461c = this.f7903a;
        C2276c c2276c = this.f7904b;
        Context context = c1461c.f7981b;
        C2482j dc = c1461c.dc();
        if (c1461c != null) {
            return new C1297t(context, dc, c1461c, c2276c, mVar, c0657w, oVar, c6319q, byVar, buVar);
        }
        throw null;
    }
}
