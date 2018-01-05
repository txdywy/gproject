package com.google.android.finsky.fastscroll;

import android.view.View;
import java.util.Set;

final class C3127y implements C3114j {
    public final View f16119a;
    public final Set f16120b;
    public final int f16121c;

    C3127y(View view, Set set, int i) {
        this.f16119a = view;
        this.f16120b = set;
        this.f16121c = i;
    }

    public final int mo3327a() {
        return ((this.f16119a.getHeight() - this.f16119a.getPaddingTop()) - this.f16119a.getPaddingBottom()) - m16000c();
    }

    public final int mo3328b() {
        return this.f16119a.getPaddingTop() + m16000c();
    }

    private final int m16000c() {
        int i = 0;
        for (C3108k a : this.f16120b) {
            i = a.mo3322a() + i;
        }
        return this.f16121c + i;
    }
}
