package com.google.android.finsky.au;

import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.p107l.C3646a;
import com.google.wireless.android.finsky.b.ae;
import java.io.OutputStream;

public final class C1525h extends C1519a {
    public final C2296c f8232c;

    public C1525h(String str, C3646a c3646a, C2296c c2296c, String str2, ae aeVar) {
        super(str, c3646a, str2, aeVar);
        this.f8232c = c2296c;
    }

    public final OutputStream mo2280e() {
        return this.f8232c.mo2839a(this.f, this.b, this.g);
    }

    public final void mo2278a(OutputStream outputStream) {
        this.f8232c.mo2840a(outputStream);
    }

    public final void mo2281f() {
        this.f8232c.mo2853b(this.f);
    }

    public final boolean mo2279a(boolean z) {
        return this.f8232c.mo2852a(z);
    }

    public final boolean mo2282g() {
        return false;
    }
}
