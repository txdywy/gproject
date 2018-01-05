package com.google.android.finsky.layout.play;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.caverock.androidsvg.C0722q;
import com.google.android.finsky.bg.C1608h;
import com.google.android.play.drawer.C3692j;

final class ae implements C3692j {
    public final int f18759a;
    public final int f18760b;

    public ae(int i) {
        this.f18759a = i;
        this.f18760b = 0;
    }

    public ae() {
        this.f18759a = 3;
        this.f18760b = 1;
    }

    public final Drawable mo3616a(Resources resources, boolean z) {
        int i = this.f18759a;
        return C0722q.m4781a(resources, C1608h.m9242a(i, this.f18760b), i == 13 ? 0 : C1608h.m9251b(i));
    }
}
