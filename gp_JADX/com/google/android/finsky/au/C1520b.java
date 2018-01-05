package com.google.android.finsky.au;

import com.google.android.finsky.cm.C2296c;
import com.google.wireless.android.finsky.b.a;
import java.io.File;
import java.io.OutputStream;

public final class C1520b extends C1518d {
    public final C2296c f8217a;
    public final File f8218b;
    public final int f8219c;
    public final boolean f8220d;

    public C1520b(String str, String str2, a aVar, C2296c c2296c, File file, int i, boolean z) {
        super(str, str2, aVar.b, aVar.d, aVar.e, aVar.f, C1522e.m8908a(aVar), aVar.q);
        this.f8217a = c2296c;
        this.f8218b = file;
        this.f8219c = i;
        this.f8220d = z;
    }

    public final boolean mo2274a() {
        return true;
    }

    public final File mo2275b() {
        return this.f8218b;
    }

    public final int mo2276c() {
        return this.f8219c;
    }

    public final OutputStream mo2280e() {
        return this.f8217a.mo2839a(this.f, this.f, this.g);
    }

    public final void mo2278a(OutputStream outputStream) {
        this.f8217a.mo2840a(outputStream);
    }

    public final void mo2281f() {
        this.f8217a.mo2853b(this.f);
    }

    public final boolean mo2279a(boolean z) {
        return true;
    }

    public final String mo2273a(String str) {
        return str;
    }

    public final boolean mo2282g() {
        return false;
    }

    public final boolean mo2277d() {
        return this.f8220d;
    }
}
