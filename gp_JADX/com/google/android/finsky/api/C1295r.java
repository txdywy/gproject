package com.google.android.finsky.api;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.play.image.ag;
import com.google.android.play.image.ap;
import com.google.android.play.image.by;

public final class C1295r extends ag {
    public final C2482j f7709a;
    public C2276c f7710b;

    public C1295r(C2482j c2482j, C2276c c2276c, C0700r c0700r, int i, int i2, by byVar) {
        super(c0700r, i, i2, byVar);
        this.f7709a = c2482j;
        this.f7710b = c2276c;
    }

    protected final ap mo1679a(String str, int i, int i2, int i3, C0660x c0660x, C0657w c0657w) {
        return new C1296s(this.f7709a, this.f7710b, str, c0660x, i, i2, i3, c0657w);
    }
}
