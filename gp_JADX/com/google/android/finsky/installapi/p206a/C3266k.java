package com.google.android.finsky.installapi.p206a;

import android.content.Intent;
import com.google.android.finsky.installapi.C3272g;
import com.google.wireless.android.finsky.dfe.nano.fi;

final class C3266k implements Runnable {
    public final /* synthetic */ C3272g f16819a;
    public final /* synthetic */ fi f16820b;
    public final /* synthetic */ C3265j f16821c;

    C3266k(C3265j c3265j, C3272g c3272g, fi fiVar) {
        this.f16821c = c3265j;
        this.f16819a = c3272g;
        this.f16820b = fiVar;
    }

    public final void run() {
        C3265j c3265j = this.f16821c;
        C3272g c3272g = this.f16819a;
        fi fiVar = this.f16820b;
        if (c3265j.f16816f.dj().mo2294a(12628004)) {
            c3265j.f16815e.mo3440a(c3272g.f16843b, true, false, true);
        } else {
            c3265j.f16815e.mo3440a(c3272g.f16843b, false, false, false);
        }
        c3265j.f16815e.mo3450d(c3272g.f16843b);
        c3265j.f16815e.mo3437a(c3272g.f16843b, fiVar.b);
        c3265j.f16815e.mo3436a(c3272g.f16843b, (Intent) c3272g.f16844c.getParcelable("notification_intent"));
        c3265j.f16815e.mo3433a(c3272g.f16843b, c3272g.f16844c.getInt("version_number"), c3265j.f16814d, c3272g.f16844c.getString("title"), 2, fiVar.c, c3272g.f16842a, c3265j.f16817g.m13184a("webapk_install"));
    }
}
