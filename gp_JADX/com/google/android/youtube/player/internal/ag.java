package com.google.android.youtube.player.internal;

import com.google.android.youtube.player.C6825f;
import com.google.android.youtube.player.C6856j;

final class ag extends C6835n {
    public final /* synthetic */ C6856j f33844a;

    ag(C6856j c6856j) {
        this.f33844a = c6856j;
    }

    public final void mo5689a() {
        this.f33844a.cz_();
    }

    public final void mo5690a(String str) {
        this.f33844a.m31218a(str);
    }

    public final void mo5691b() {
        this.f33844a.cA_();
    }

    public final void mo5692b(String str) {
        C6825f valueOf;
        try {
            valueOf = C6825f.valueOf(str);
        } catch (IllegalArgumentException e) {
            valueOf = C6825f.UNKNOWN;
        } catch (NullPointerException e2) {
            valueOf = C6825f.UNKNOWN;
        }
        this.f33844a.m31217a(valueOf);
    }

    public final void mo5693c() {
        this.f33844a.cB_();
    }

    public final void mo5694d() {
        this.f33844a.cC_();
    }
}
