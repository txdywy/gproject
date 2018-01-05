package com.google.android.finsky.api;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.play.image.bf;
import com.google.android.play.image.k;
import com.google.android.play.image.m;
import com.google.i.a.a;

public class C1293q extends k {
    public final String f7692w;
    public final int f7693x;
    public final int f7694y;

    public C1293q(m mVar, C0660x c0660x, C0657w c0657w) {
        super(mVar, c0660x, c0657w);
        this.f7692w = mVar.a;
        this.f7693x = mVar.d;
        this.f7694y = mVar.e;
    }

    public final String m7707e() {
        if (!mo1545d().equals(this.f7692w) && C1473m.f7980a.dj().mo2294a(12630075) && a.a(this.f7692w)) {
            return bf.a(this.f7692w, this.f7693x, this.f7694y, -1);
        }
        return super.e();
    }
}
