package com.google.android.finsky.au;

import com.google.android.finsky.l.a;
import com.google.android.finsky.utils.b;
import com.google.wireless.android.finsky.b.ae;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class com.google.android.finsky.au.i extends com.google.android.finsky.au.a
{

    public final File c;

    i(String p0, com.google.android.finsky.l.a p1, String p2, String p3, com.google.wireless.android.finsky.b.ae p4) {
        com.google.android.finsky.au.a(p0, p1, p2, p4);
        this.c = new File(p3, this.b);
    }

    public final void a(OutputStream p0) {
        p0.flush();
        p0.close();
    }

    public final boolean a(boolean p0) {
        return 1;
    }

    public final OutputStream e() {
        this.c.delete();
        return new FileOutputStream(this.c);
    }

    public final void f() {
        this.c.delete();
    }

    public final boolean g() {
        if (!com.google.android.finsky.utils.b.d())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final File h() {
        return this.c;
    }

}
