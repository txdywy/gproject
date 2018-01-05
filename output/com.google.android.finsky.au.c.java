package com.google.android.finsky.au;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import com.google.android.finsky.cm.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.l.a;
import com.google.wireless.android.finsky.b.a;
import java.io.File;
import java.io.OutputStream;

public final class com.google.android.finsky.au.c extends com.google.android.finsky.au.d
{

    public final com.google.android.finsky.l.a a;
    public final com.google.android.finsky.cm.c b;
    public final Context c;

    c(Context p0, com.google.android.finsky.l.a p1, com.google.android.finsky.cm.c p2, String p3, String p4, com.google.wireless.android.finsky.b.a p5) {
        com.google.android.finsky.au.d(p3, p4, p5.b, p5.d, p5.e, p5.f, com.google.android.finsky.au.e.a(p5), p5.q);
        this.a = p1;
        this.b = p2;
        this.c = p0;
    }

    public final String a(String p0) {
        return p0;
    }

    public final void a(OutputStream p0) {
        this.b.a(p0);
    }

    public final boolean a() {
        return 1;
    }

    public final boolean a(boolean p0) {
        return this.b.a(p0);
    }

    public final File b() {
        v0 = 0;
        try {
            v1 = this.c.getPackageManager().getApplicationInfo(this.f, 0);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return v0;
        }
        if (!TextUtils.isEmpty(v1.sourceDir) && v1.sourceDir.equals(v1.publicSourceDir))
            v0 = new File(v1.sourceDir);
        return v0;
    }

    public final int c() {
        return this.a.c.g(this.f);
    }

    public final boolean d() {
        return 1;
    }

    public final OutputStream e() {
        return this.b.a(this.f, this.f, this.g);
    }

    public final void f() {
        this.b.b(this.f);
    }

    public final boolean g() {
        return 0;
    }

}
