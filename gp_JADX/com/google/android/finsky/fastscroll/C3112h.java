package com.google.android.finsky.fastscroll;

import com.google.android.finsky.ba.C1461c;
import com.google.android.play.headerlist.PlayHeaderListLayout;

final class C3112h extends C3111u {
    public final C1461c f16063a;
    public final PlayHeaderListLayout f16064b;
    public float f16065c;
    public boolean f16066d;
    public boolean f16067e;

    public C3112h(PlayHeaderListLayout playHeaderListLayout, C1461c c1461c) {
        this.f16064b = playHeaderListLayout;
        this.f16063a = c1461c;
    }

    public final void mo3323a(float f) {
        int i;
        this.f16065c = f;
        PlayHeaderListLayout playHeaderListLayout = this.f16064b;
        if (this.f16064b.getVisibleHeaderHeight() == this.f16064b.getFullFloatingHeaderHeight()) {
            i = 1;
        } else {
            i = 3;
        }
        playHeaderListLayout.a(i, true);
    }

    public final void mo3325b(float f) {
        this.f16066d = f > this.f16065c;
        this.f16065c = f;
        this.f16067e = true;
    }

    public final void mo3324a(float f, float f2) {
        if (this.f16063a.dj().mo2294a(12638391) && f2 < this.f16064b.getFullFloatingHeaderHeight()) {
            m15944a();
        } else if (!this.f16067e) {
            this.f16064b.a(0, false);
        } else if (this.f16066d) {
            this.f16064b.a(2, true);
            this.f16064b.a(0, false);
        } else {
            m15944a();
        }
    }

    private final void m15944a() {
        this.f16064b.a(1, true);
        this.f16064b.a(0, false);
    }
}
