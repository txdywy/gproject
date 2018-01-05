package com.google.android.play.dfe.api;

import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.google.android.finsky.cv.p177a.hb;
import com.google.android.finsky.cv.p177a.le;
import com.google.android.play.utils.p354b.C6322j;

public final class C6289f implements C6287d {
    public static final int f31365d = ((Integer) C6322j.f31596j.m28964b()).intValue();
    public static final int f31366e = ((Integer) C6322j.f31597k.m28964b()).intValue();
    public static final float f31367f = ((Float) C6322j.f31598l.m28964b()).floatValue();
    public final C0700r f31368g;
    public final C6288e f31369h;

    public C6289f(C0700r c0700r, C6288e c6288e) {
        this.f31368g = c0700r;
        this.f31369h = c6288e;
    }

    public final C0656n mo5376a(C0660x c0660x, C0657w c0657w) {
        return this.f31368g.m4510a(new C6285b(b.toString(), this.f31369h, hb.class, c0660x, c0657w));
    }

    public final C0656n mo5377a(C0660x c0660x, C0657w c0657w, boolean z) {
        C0656n c6285b = new C6285b(c.toString(), this.f31369h, le.class, c0660x, c0657w);
        if (!z) {
            c6285b.f4038m = new C6286c(f31365d, f31366e, f31367f, this.f31369h);
        }
        return this.f31368g.m4510a(c6285b);
    }

    public final void mo5378a() {
        this.f31368g.m4510a(new C6284a(this.f31369h.f31360d, new C6285b(b.toString(), this.f31369h, hb.class, null, null).mo1546e()));
    }

    static {
        ((Integer) C6322j.f31593g.m28964b()).intValue();
        ((Integer) C6322j.f31594h.m28964b()).intValue();
        ((Float) C6322j.f31595i.m28964b()).floatValue();
    }
}
