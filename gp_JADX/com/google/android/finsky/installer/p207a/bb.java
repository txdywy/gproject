package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.installer.C3283a;
import com.google.android.finsky.installer.C3284c;
import java.io.File;

public final class bb implements C3283a {
    public final int f16995a;
    public final int f16996b;
    public final String f16997c;
    public final File f16998d;
    public final C3284c f16999e;

    bb(int i, int i2, String str, File file, C3284c c3284c) {
        this.f16995a = i;
        this.f16996b = i2;
        this.f16997c = str;
        this.f16998d = file;
        this.f16999e = c3284c;
    }

    public final int mo3416c() {
        return this.f16995a;
    }

    public final int mo3417d() {
        return this.f16996b;
    }

    public final String mo3418e() {
        return this.f16997c;
    }

    public final C3284c mo3419f() {
        return this.f16999e;
    }

    public final String mo3414a() {
        return this.f16998d.toURI().toString();
    }

    public final File mo3415b() {
        return this.f16998d;
    }

    public final void mo3420g() {
    }
}
