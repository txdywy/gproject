package com.google.android.finsky.p110p;

import android.os.Handler;

final class C3838d implements C1004h {
    public final /* synthetic */ Handler f19213a;
    public final /* synthetic */ C3837c f19214b;

    C3838d(C3837c c3837c, Handler handler) {
        this.f19214b = c3837c;
        this.f19213a = handler;
    }

    public final void mo1210b(int i) {
        for (C1004h c3839e : this.f19214b.f19207c) {
            this.f19213a.post(new C3839e(c3839e, i));
        }
    }
}
