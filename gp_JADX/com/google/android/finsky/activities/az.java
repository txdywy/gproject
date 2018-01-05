package com.google.android.finsky.activities;

import android.content.Context;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.p238b.C4023a;

final /* synthetic */ class az implements C0978f {
    public final ba f6472a;
    public final C4023a f6473b;
    public final Context f6474c;

    az(ba baVar, C4023a c4023a, Context context) {
        this.f6472a = baVar;
        this.f6473b = c4023a;
        this.f6474c = context;
    }

    public final void mo1172a(C4809e c4809e) {
        this.f6472a.m18888a(1, "debug-job", ay.class, this.f6473b, null).mo4398a(new bb(this.f6474c));
    }
}
