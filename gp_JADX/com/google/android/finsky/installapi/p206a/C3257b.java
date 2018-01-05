package com.google.android.finsky.installapi.p206a;

import com.google.android.finsky.installapi.C3272g;
import com.google.wireless.android.finsky.dfe.nano.fp;

final class C3257b implements Runnable {
    public final /* synthetic */ String f16782a;
    public final /* synthetic */ C3272g f16783b;
    public final /* synthetic */ fp f16784c;
    public final /* synthetic */ C3256a f16785d;

    C3257b(C3256a c3256a, String str, C3272g c3272g, fp fpVar) {
        this.f16785d = c3256a;
        this.f16782a = str;
        this.f16783b = c3272g;
        this.f16784c = fpVar;
    }

    public final void run() {
        C3256a c3256a = this.f16785d;
        String str = this.f16782a;
        C3272g c3272g = this.f16783b;
        fp fpVar = this.f16784c;
        c3256a.f16777b.mo3440a(c3272g.f16843b, c3272g.f16844c.getBoolean("show_progress", true), c3272g.f16844c.getBoolean("show_errors", true), c3272g.f16844c.getBoolean("show_completion", true));
        c3256a.f16777b.mo3433a(fpVar.e.f11833b, fpVar.g, str, fpVar.f, 2, fpVar.i, c3272g.f16842a, c3256a.f16779d.m13184a("arc_install"));
    }
}
