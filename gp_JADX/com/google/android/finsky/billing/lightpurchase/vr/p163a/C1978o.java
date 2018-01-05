package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cq.C2361b;
import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;
import java.util.List;

public final class C1978o extends C1964a {
    public final b f10064c;
    public final b f10065d;
    public final b f10066e;
    public final b f10067f;
    public final b f10068g = m10455a("vertical-layout", this.a, 1);
    public final b f10069h;
    public final b f10070i;

    public C1978o(c cVar, aq aqVar, ad adVar, int i) {
        super(cVar, aqVar, adVar, "background");
        m10455a("padding-y-48mm", this.f10068g, 1);
        this.f10069h = m10455a("container", this.f10068g, 1);
        m10455a("padding-x-screenwidth", this.f10069h, 1);
        b a = m10455a("vertical-layout", this.f10069h, 1);
        b a2 = m10455a("container", a, 1);
        m10455a("padding-x-screenwidth", a2, 1);
        this.f10064c = m10455a("permissions-title", a2, 2);
        m10455a("padding-y-12mm", a, 1);
        a = m10455a("container", a, 1);
        m10455a("padding-x-screenwidth", a, 1);
        this.f10065d = m10455a("permissions-subtitle", a, 2);
        m10455a("padding-y-36mm", this.f10068g, 1);
        m10455a("line", this.f10068g, 2);
        m10455a("padding-y-18mm", this.f10068g, 1);
        this.f10070i = m10455a("container", this.f10068g, 1);
        m10455a("padding-y-18mm", this.f10068g, 1);
        m10455a("line", this.f10068g, 2);
        m10455a("padding-y-36mm", this.f10068g, 1);
        a = m10455a("container", this.f10068g, 1);
        m10455a("padding-x-screenwidth", a, 1);
        this.f10066e = m10454a(i, m10455a("button-shadow", a, 2));
        this.f10067f = m10455a("button-label", this.f10066e, 4);
        m10455a("play-logo", a, 2);
        m10455a("padding-y-36mm", this.f10068g, 1);
    }

    public final void m10483a(List list, Context context) {
        b a;
        if (list.size() >= 3) {
            a = m10455a("permissions-scroll-view", this.f10070i, 2);
        } else {
            a = this.f10070i;
        }
        b a2 = m10455a("vertical-layout-center-scrollview", a, 1);
        for (C2361b c2361b : list) {
            b a3 = m10455a("clickable-container", a2, 1);
            b a4 = m10455a("vertical-layout-center-aligned", a3, 1);
            m10455a("padding-y-18mm", a4, 1);
            b a5 = m10455a("container", a4, 1);
            a a6 = m10455a("permissions-icon", a5, 3);
            a6.a(BitmapFactory.decodeResource(C1473m.f7980a.f7981b.getResources(), c2361b.f11586d));
            a6.a();
            m10455a("padding-x-screenwidth", a5, 1);
            m10455a("permissions-label", a5, 2).a(context.getString(c2361b.f11584b));
            a6 = m10455a("padding-y-12mm", a4, 1);
            b a7 = m10455a("container", a4, 1);
            m10455a("padding-x-screenwidth", a7, 1);
            a a8 = m10455a("permissions-desc", a7, 2);
            a8.a(context.getString(c2361b.f11585c));
            m10455a("padding-y-18mm", a4, 1);
            a6.b("lull::DisableEvent");
            a8.b("lull::DisableEvent");
            a = m10455a("permissions-caret-root", a5, 3);
            a4 = m10455a("show-more", a, 4);
            a a9 = m10455a("show-less", a, 4);
            a9.b("lull::DisableEvent");
            m10457a(a3, "lull::ClickEvent", new C1979p(a4, a9, a6, a8));
        }
    }

    final int mo2562a() {
        return 791;
    }
}
