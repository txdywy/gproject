package com.google.android.finsky.cj;

import com.google.android.finsky.dk.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ad;
import java.io.File;

public final class com.google.android.finsky.cj.a
{

    public final boolean a;
    public final String b;
    public int c;
    public long d;
    public int e;
    public String f;

    a(boolean p0, String p1, int p2, long p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = 4;
        this.f = com.google.android.finsky.cj.c.a(this.a, this.c, this.b);
    }

    private final void a(int p0) {
        if (p0 == 5) {
            this.c = -1;
            this.d = -1;
            this.f = "";
        }
        this.e = p0;
    }

    private final void a(String p0) {
        v1 = 0;
        try {
            v2 = new Object[2];
            v2[0] = p0;
            v2[1] = this.toString();
            FinskyLog.c("Failure %s while finalizing %s", v2);
            v2 = new Object[2];
            v2[0] = this.f;
            v2[1] = Long.valueOf(this.d);
            FinskyLog.c(" file=%s, size=%d", v2);
            v0 = com.google.android.finsky.cj.c.a(this.b);
            v3 = new Object[1];
            v3[0] = v0.getAbsolutePath();
            FinskyLog.c(" Contents of %s:", v3);
            if (!v0.exists())
                FinskyLog.c(" (Does not exist)", new Object[0]);
            else if (!v0.isDirectory())
                FinskyLog.c(" (Is not a directory)", new Object[0]);
            else {
                v2 = v0.listFiles();
                if (v2 == 0)
                    FinskyLog.c(" (listFiles() returned null)", new Object[0]);
                else {
                    v0 = 0;
                    while (v0 < v2.length) {
                        v6 = new Object[2];
                        v6[0] = v2[v0].getName();
                        v6[1] = Long.valueOf(v2[v0].length());
                        FinskyLog.c("  name=%s size=%d", v6);
                        v0 = v0 + 1;
                    }
                }
            }
            return;
        }
        catch (Exception ex) {
            v1 = new Object[v1];
            FinskyLog.b(ex, "Unexpected exception", v1);
            return;
        }
        try {
            v2 = v0.listFiles();
            if (v2 == 0)
                FinskyLog.c(" (listFiles() returned null)", new Object[0]);
            else {
                v0 = 0;
                while (v0 < v2.length) {
                    v6 = new Object[2];
                    v6[0] = v2[v0].getName();
                    v6[1] = Long.valueOf(v2[v0].length());
                    FinskyLog.c("  name=%s size=%d", v6);
                    v0 = v0 + 1;
                }
            }
        }
        catch (Exception ex) {
            v1 = new Object[v1];
            FinskyLog.b(ex, "Unexpected exception", v1);
            return;
        }
    }

    private final boolean h() {
        v0 = 0;
        v1 = this.b();
        if (v1 == 0)
            this.a("main file null");
        else {
            v2 = this.c();
            if (v2 == 0)
                this.a("temp file null");
            else if (!v2.exists() && v1.length() == this.d)
                v0 = 1;
        }
        return v0;
    }

    public final void a() {
        v0 = 0;
        if (this.e != 5) {
            if (!com.google.android.finsky.dk.g.a())
                this.a(4);
            else {
                v1 = this.b();
                if (v1 != 0 && v1.exists() && v1.length() == this.d)
                    v0 = 1;
                if (v0 == 0)
                    this.a(4);
                else
                    this.a(3);
            }
        }
    }

    public final File b() {
        if ((!com.google.android.finsky.dk.g.a()) || this.d <= 0)
            v0 = 0;
        else {
            v1 = com.google.android.finsky.cj.c.a(this.b);
            if (!v1.exists())
                v1.mkdirs();
            v0 = new File(v1, this.f);
        }
        return v0;
    }

    public final File c() {
        v0 = this.b();
        if (v0 == 0)
            v0 = 0;
        else {
            v2 = v0.getParentFile();
            v0 = String.valueOf(v0.getName());
            if (v0.length() != 0)
                v0 = "temp.".concat(v0);
            else
                v0 = new String("temp.");
            v0 = new File(v2, v0);
        }
        return v0;
    }

    public final boolean d() {
        this.a();
        if (this.e == 4) {
            v0 = this.b();
            if (v0 == 0)
                this.a("main file null");
            else {
                v1 = this.c();
                if (v1 == 0)
                    this.a("temp file null");
                else if (v1.length() != this.d) {
                    v0 = String.valueOf(String.valueOf(v1.length()));
                    if (v0.length() != 0)
                        v0 = "size mismatch: tempfile size=".concat(v0);
                    else
                        v0 = new String("size mismatch: tempfile size=");
                    this.a(v0);
                }
                else if (!v1.renameTo(v0))
                    this.a("renameTo() returned false");
            }
            this.a();
        }
        if (this.e == 5 || this.e == 3)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        v0 = 1;
        if (this.e != 5) {
            this.a();
            if (this.e != 3)
                v0 = 0;
        }
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (this != p0) {
            if (p0 == 0 || this.getClass() != p0.getClass())
                v0 = 0;
            else if ((!com.google.android.finsky.utils.ad.a(this.f, ((com.google.android.finsky.cj.a)p0).f)) || (!com.google.android.finsky.utils.ad.a(this.b, ((com.google.android.finsky.cj.a)p0).b)) || this.a != ((com.google.android.finsky.cj.a)p0).a || this.c != ((com.google.android.finsky.cj.a)p0).c || this.d != ((com.google.android.finsky.cj.a)p0).d || this.e != ((com.google.android.finsky.cj.a)p0).e)
                v0 = 0;
        }
        return v0;
    }

    public final void f() {
        v0 = this.c();
        if (v0 != 0)
            v0.delete();
    }

    public final void g() {
        if (this.h())
            this.b().delete();
    }

    public final String toString() {
        v2 = new Object[4];
        if (this.a != 0)
            v0 = "Patch";
        else
            v0 = "Main";
        v2[0] = v0;
        v2[1] = this.b;
        v2[2] = Integer.valueOf(this.c);
        switch (this.e) {
            case 1:
                v0 = "DOWNLOAD_PENDING";
                break;
            case 2:
                v0 = "DOWNLOADING";
                break;
            case 3:
                v0 = "DOWNLOADED";
                break;
            case 4:
                v0 = "NOT_ON_STORAGE";
                break;
            case 5:
                v0 = "NOT_APPLICABLE";
                break;
            default:
                v0 = Integer.toString(this.e);
                break;
        }
        v2[3] = v0;
        return String.format("%s: %s v:%d %s", v2);
    }

}
