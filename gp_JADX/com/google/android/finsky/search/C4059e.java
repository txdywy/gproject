package com.google.android.finsky.search;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.C0656n;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;

public final class C4059e extends C4056i {
    public static Boolean f20389a = null;
    public final int f20390b;
    public final C4065l f20391c;
    public final int f20392d;
    public final int f20393e;
    public final boolean f20394f;
    public final C4058d f20395g;
    public boolean f20396h;
    public C0656n f20397i;
    public C2495w f20398j;

    public C4059e(Context context, int i, int i2, String str, C4065l c4065l, boolean z, C4058d c4058d, C2495w c2495w) {
        super(str, context);
        this.f20392d = i;
        this.f20393e = i2;
        this.f20391c = c4065l;
        this.f20394f = z;
        this.f20390b = context.getResources().getDimensionPixelSize(C7582R.dimen.play_search_suggestion_icon_size);
        this.f20395g = c4058d;
        if (f20389a == null) {
            f20389a = Boolean.valueOf(this.l.getPackageManager().hasSystemFeature("com.google.android.tv"));
        }
        boolean z2 = !f20389a.booleanValue() || ((Boolean) C0955b.f5897m.m28964b()).booleanValue();
        this.f20396h = z2;
        this.f20398j = c2495w;
    }

    protected final void mo3897a(C4063k c4063k) {
        C1254c ap = C1473m.f7980a.ap();
        if ((this.f20394f && TextUtils.isEmpty(this.k)) || ap == null) {
            c4063k.mo3898a();
            return;
        }
        this.f20397i = ap.mo1578a(this.k, this.f20392d, this.f20393e, this.f20390b, this.f20396h, new C4060f(this, c4063k), new C4061g(this, c4063k), new C4062h(this, c4063k));
        this.f20384m = System.currentTimeMillis();
    }

    protected final void mo3896a() {
        if (this.f20397i != null) {
            this.f20397i.mo1057f();
        }
    }
}
