package com.google.android.finsky.layout.play;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.squareup.haha.perflib.HprofParser;

final class C3700i implements Runnable {
    public final /* synthetic */ Context f18781a;
    public final /* synthetic */ FinskyDrawerLayout f18782b;

    C3700i(FinskyDrawerLayout finskyDrawerLayout, Context context) {
        this.f18782b = finskyDrawerLayout;
        this.f18781a = context;
    }

    public final void run() {
        this.f18782b.m17537b((int) HprofParser.ROOT_REFERENCE_CLEANUP);
        C1473m.f7980a.bp().mo4363b(this.f18781a);
    }
}
