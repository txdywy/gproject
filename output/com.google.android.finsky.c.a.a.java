package com.google.android.finsky.c.a;

import a.a;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.i;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.ads.b.b;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.bo;

public final class com.google.android.finsky.c.a.a implements com.google.android.finsky.c.a
{

    public a.a a;
    public com.google.android.finsky.d.g b;
    public com.google.android.finsky.ba.c c;
    public String d;
    public Boolean e;
    public String f;
    public final Context g;
    public final boolean h;

    a(ContentResolver p0, Context p1) {
        this.g = p1;
        this.f = Settings$Secure.getString(p0, "android_id");
        ((com.google.android.finsky.c.a.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.c.a.d)).a(this);
        this.h = this.c.dj().a(12635427);
        new Handler(Looper.getMainLooper()).post(new com.google.android.finsky.c.a.b(this));
    }

    private final synchronized void a(com.google.android.gms.ads.b.b p0, int p1) {
        v0 = 0;
        enter this;
        try {
            v2 = this.d();
            if (p0 == 0) {
                v3 = new Object[1];
                v3[0] = Integer.valueOf(p1);
                FinskyLog.c("AdId result returned null. Refresh reason: [%s].", v3);
                this.a("null-result", p1);
                v1 = 0;
            }
            else {
                try {
                    v1 = p0.a;
                    if (v1 == 0) {
                        v4 = new Object[1];
                        v4[0] = Integer.valueOf(p1);
                        FinskyLog.c("AdId getId from ad listener returned null. Refresh reason: [%s].", v4);
                        this.a("null-adid", p1);
                    }
                    else {
                        try {
                            if (v1.length() == 0) {
                                v4 = new Object[1];
                                v4[0] = Integer.valueOf(p1);
                                FinskyLog.c("AdId getId from ad listener returned empty string. Refresh reason: [%s].", v4);
                                this.a("empty-adid", p1);
                            }
                            else {
                                this.a(0, p1);
                                v0 = Boolean.valueOf(p0.b);
                                if (v2 != 0) {
                                    com.google.android.finsky.aa.a.au.a(v1);
                                    com.google.android.finsky.aa.a.av.a(v0);
                                    com.google.android.finsky.aa.a.aw.a(Long.valueOf(com.google.android.finsky.utils.i.a()));
                                }
                                else {
                                    com.google.android.finsky.aa.a.au.c();
                                    com.google.android.finsky.aa.a.av.c();
                                    com.google.android.finsky.aa.a.aw.c();
                                }
                            }
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            if (TextUtils.isEmpty(v1)) {
                if (v2 != 0) {
                    v1 = this.e();
                    v0 = (Boolean)com.google.android.finsky.aa.a.av.a();
                }
            }
            if (!TextUtils.isEmpty(v1)) {
                this.d = v1;
                this.e = v0;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    private final void a(String p0, int p1) {
        if (this.c.dj().a(12602796)) {
            v0 = new com.google.android.finsky.d.c(6);
            v0.g(p1);
            if (!TextUtils.isEmpty(p0))
                v0.a.c(p0);
            this.b.dc().a(v0.a, 0);
        }
    }

    private final boolean d() {
        v2 = (long)((Integer)com.google.android.finsky.aa.b.fm.b()).intValue();
        if (v2 > 0) {
            v0 = ((com.google.android.finsky.cn.a)this.a.a()).a("com.google.android.gms");
            if (v0 != 0 && v0.j == 0 && (long)v0.d >= v2)
                v0 = 1;
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    private final synchronized String e() {
  2:    enter this;
  9:    v0 = (String)com.google.android.finsky.aa.a.au.a();
 15:    if (TextUtils.isEmpty(v0)) goto 76;
 25:    v2 = ((Long)com.google.android.finsky.aa.a.aw.a()).longValue();
 37:    v4 = ((Long)com.google.android.finsky.aa.b.fn.b()).longValue();
 43:    if (v2 == 0) goto 61;
 47:    if (v4 == 0) goto 61;
 57:    if (com.google.android.finsky.utils.i.a() - v2 >= v4) goto 61;
 59:    exit this;
 60:    return v0;
 63:    com.google.android.finsky.aa.a.au.c();
 68:    com.google.android.finsky.aa.a.av.c();
 73:    com.google.android.finsky.aa.a.aw.c();
 76:    v0 = "";
 78:    goto 59;
 80:    exit this;
 81:    throw ex;
 82:    try
            run 61...78
        catch (Throwable ex) {
 61:        goto 79;
        }
 83:    try
            run 3...52
        catch (Throwable ex) {
  3:        goto 79;
        }
    }

    private final synchronized String f() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.d;
    }

    public final String a() {
        StrictMode.noteSlowCall("AdIdProviderImpl.getAdIdBlocking");
        if (!TextUtils.isEmpty(this.f()))
            v0 = this.f();
        else {
            this.b(2303);
            v0 = this.f();
        }
        return v0;
    }

    public final void a(int p0) {
        if (this.c.dj().a(12602796))
            this.b.dc().a(new com.google.android.finsky.d.c(1112).a, 0);
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.c.a.c(this, p0), new Void[0]);
    }

    public final synchronized Boolean b() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.e;
    }

    final void b(int p0) {
        v1 = this.c.dj().a(12602796);
        if (this.h != 0 && this.d()) {
            if (p0 == 2304 || p0 == 2302)
                v0 = 1;
            else
                v0 = 0;
            if (v0 == 0) {
                v0 = this.e();
                if (!TextUtils.isEmpty(v0)) {
                    this.d = v0;
                    this.e = (Boolean)com.google.android.finsky.aa.a.av.a();
                    if (v1 != 0)
                        this.b.dc().a(new com.google.android.finsky.d.c(1111).g(p0).a, 0);
                    return;
                }
            }
        }
        if (v1 != 0)
            this.b.dc().a(new com.google.android.finsky.d.c(1102).a, 0);
        try {
            this.a(com.google.android.gms.ads.b.a.a(this.g), p0);
        }
        catch (Exception ex) {
            v0 = ex.getClass().getSimpleName();
            if (!TextUtils.isEmpty(ex.getMessage())) {
                v1 = ex.getMessage();
                v0 = (String.valueOf(v0).length() + 2 + String.valueOf(v1).length()) + v0 + ": " + v1;
            }
            v3 = new Object[1];
            v3[0] = v0;
            FinskyLog.c("Wasn't able to fetch the adId: %s", v3);
            this.a(v0, p0);
        }
    }

    public final String c() {
        return this.f;
    }

}
