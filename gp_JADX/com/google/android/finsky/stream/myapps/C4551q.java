package com.google.android.finsky.stream.myapps;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.cv.p177a.C2453z;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.p167r.C3960a;

final class C4551q implements OnSharedPreferenceChangeListener, C1054h, ad {
    public final boolean f23269a;
    public final C3960a f23270b;
    public final SharedPreferences f23271c;
    public final C2910a f23272d;
    public C4549n f23273e;

    C4551q(C2453z c2453z, C3960a c3960a, C2910a c2910a) {
        this(c2453z, c3960a, C0954a.f5831a.m5749a(), c2910a);
    }

    private C4551q(C2453z c2453z, C3960a c3960a, SharedPreferences sharedPreferences, C2910a c2910a) {
        this.f23269a = c2453z.f13229b;
        this.f23270b = c3960a;
        this.f23271c = sharedPreferences;
        this.f23272d = c2910a;
        this.f23271c.registerOnSharedPreferenceChangeListener(this);
        this.f23272d.m15182a((C1054h) this);
    }

    public final void mo4258a(C4549n c4549n) {
        this.f23273e = c4549n;
    }

    public final boolean mo4259a() {
        return !this.f23270b.m18670c() && this.f23270b.m18668a() == this.f23269a;
    }

    public final void mo4260b() {
        this.f23271c.unregisterOnSharedPreferenceChangeListener(this);
        this.f23272d.m15191b((C1054h) this);
        this.f23273e = null;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f23273e != null && str.equals(C0954a.f5854x.f5915b)) {
            this.f23273e.m21163a();
        }
    }

    public final void P_() {
        if (this.f23273e != null) {
            this.f23273e.m21163a();
        }
    }

    public final void ce_() {
    }
}
