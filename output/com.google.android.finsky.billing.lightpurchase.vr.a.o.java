package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.app.Application;
import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.finsky.cq.b;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.m;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.o extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;
    public final com.google.vr.a.a.a.b f;
    public final com.google.vr.a.a.a.b g;
    public final com.google.vr.a.a.a.b h;
    public final com.google.vr.a.a.a.b i;

    o(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2, int p3) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        this.g = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", this.g, 1);
        this.h = this.a("container", this.g, 1);
        this.a("padding-x-screenwidth", this.h, 1);
        v0 = this.a("vertical-layout", this.h, 1);
        v1 = this.a("container", v0, 1);
        this.a("padding-x-screenwidth", v1, 1);
        this.c = this.a("permissions-title", v1, 2);
        this.a("padding-y-12mm", v0, 1);
        v0 = this.a("container", v0, 1);
        this.a("padding-x-screenwidth", v0, 1);
        this.d = this.a("permissions-subtitle", v0, 2);
        this.a("padding-y-36mm", this.g, 1);
        this.a("line", this.g, 2);
        this.a("padding-y-18mm", this.g, 1);
        this.i = this.a("container", this.g, 1);
        this.a("padding-y-18mm", this.g, 1);
        this.a("line", this.g, 2);
        this.a("padding-y-36mm", this.g, 1);
        v0 = this.a("container", this.g, 1);
        this.a("padding-x-screenwidth", v0, 1);
        this.e = this.a(p3, this.a("button-shadow", v0, 2));
        this.f = this.a("button-label", this.e, 4);
        this.a("play-logo", v0, 2);
        this.a("padding-y-36mm", this.g, 1);
    }

    final int a() {
        return 791;
    }

    public final void a(List p0, Context p1) {
        if (p0.size() >= 3)
            v0 = this.a("permissions-scroll-view", this.i, 2);
        else
            v0 = this.i;
        v1 = this.a("vertical-layout-center-scrollview", v0, 1);
        v2 = p0.iterator();
        while (v2.hasNext()) {
            v0 = (com.google.android.finsky.cq.b)v2.next();
            v3 = this.a("clickable-container", v1, 1);
            v4 = this.a("vertical-layout-center-aligned", v3, 1);
            this.a("padding-y-18mm", v4, 1);
            v5 = this.a("container", v4, 1);
            v6 = this.a("permissions-icon", v5, 3);
            v6.a(BitmapFactory.decodeResource(com.google.android.finsky.m.a.b.getResources(), v0.d));
            v6.a();
            this.a("padding-x-screenwidth", v5, 1);
            this.a("permissions-label", v5, 2).a(p1.getString(v0.b));
            v6 = this.a("padding-y-12mm", v4, 1);
            v7 = this.a("container", v4, 1);
            this.a("padding-x-screenwidth", v7, 1);
            v7 = this.a("permissions-desc", v7, 2);
            v7.a(p1.getString(v0.c));
            this.a("padding-y-18mm", v4, 1);
            v6.b("lull::DisableEvent");
            v7.b("lull::DisableEvent");
            v0 = this.a("permissions-caret-root", v5, 3);
            v4 = this.a("show-more", v0, 4);
            v0 = this.a("show-less", v0, 4);
            v0.b("lull::DisableEvent");
            this.a(v3, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.p(v4, v0, v6, v7));
        }
    }

}
