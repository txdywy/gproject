package com.google.android.finsky.au;

import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.utils.C4671b;
import com.google.wireless.android.finsky.b.ae;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class C1526i extends C1519a {
    public final File f8233c;

    public C1526i(String str, C3646a c3646a, String str2, String str3, ae aeVar) {
        super(str, c3646a, str2, aeVar);
        this.f8233c = new File(str3, this.b);
    }

    public final OutputStream mo2280e() {
        this.f8233c.delete();
        return new FileOutputStream(this.f8233c);
    }

    public final void mo2278a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    public final void mo2281f() {
        this.f8233c.delete();
    }

    public final boolean mo2279a(boolean z) {
        return true;
    }

    public final File mo2283h() {
        return this.f8233c;
    }

    public final boolean mo2282g() {
        return !C4671b.m21787d();
    }
}
