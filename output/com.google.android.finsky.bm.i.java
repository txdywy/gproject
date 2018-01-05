package com.google.android.finsky.bm;

import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.e;
import com.google.android.youtube.player.f;
import com.google.android.youtube.player.k;

final class com.google.android.finsky.bm.i implements com.google.android.libraries.play.entertainment.media.d, com.google.android.youtube.player.h, com.google.android.youtube.player.i, com.google.android.youtube.player.j
{

    public int a;
    public final android.support.v4.app.ab b;
    public final int c;
    public final com.google.android.finsky.bm.j d;
    public com.google.android.finsky.bm.h e;
    public com.google.android.youtube.player.e f;
    public String g;
    public int h;

    i(android.support.v4.app.ab p0, com.google.android.finsky.bm.j p1) {
        this.a = -2;
        this.h = -1;
        this.b = p0;
        this.c = 2131756397;
        this.d = p1;
    }

    private final void m() {
        if (this.f != 0 || this.a != -2) {
            this.f = 0;
            this.b(-2);
            if (this.d != 0)
                this.d.d();
        }
    }

    public final void a(int p0) {
        (new Object[1])[0] = Integer.valueOf(p0);
    }

    public final void a(com.google.android.youtube.player.b p0) {
        v1 = new Object[1];
        v1[0] = p0.name();
        FinskyLog.c("Youtube error", v1);
        this.f = 0;
        this.g = 0;
        this.b(-2);
        if (this.d != 0)
            this.d.a(p0);
    }

    public final void a(com.google.android.youtube.player.e p0) {
        if (this.a == -1) {
            this.f = p0;
            p0.f();
            p0.a(this.g);
            p0.a(com.google.android.youtube.player.k.b);
            p0.a(this);
            p0.a(this);
            this.b(0);
            if (this.d != 0)
                this.d.c();
        }
    }

    public final void a(com.google.android.youtube.player.f p0) {
        v1 = new Object[1];
        v1[0] = p0.name();
        FinskyLog.d("Youtube error: %s", v1);
        this.g = 0;
        this.b(0);
        this.m();
    }

    public final void a(String p0) {
    }

    public final void a(boolean p0) {
        if (p0 != 0) {
            switch (this.a) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    this.b(4);
                    break;
                case 4:
                    (new Object[1])[0] = Integer.valueOf(this.a);
                    break;
                case 5:
                    break;
                default:
                    (new Object[1])[0] = Integer.valueOf(this.a);
                    break;
            }
            return;
        }
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                this.b(3);
                break;
            case 3:
                this.b(3);
                break;
            case 4:
                this.b(3);
                break;
            case 5:
                break;
            default:
                (new Object[1])[0] = Integer.valueOf(this.a);
                break;
        }
    }

    public final boolean a() {
        v0 = 0;
        if (this.e == 0)
            FinskyLog.d("Cannot determine if video is playing with uninitialized fragment", new Object[0]);
        else if (this.a == 3 || this.a == 4)
            v0 = 1;
        return v0;
    }

    final int b() {
        if (this.e == 0 || this.f == 0) {
            FinskyLog.d("Cannot determine video play position with uninitialized fragment or YouTube player", new Object[0]);
            v0 = -1;
        }
        else
            v0 = this.f.c();
        return v0;
    }

    final void b(int p0) {
        if (this.a != p0) {
            (new Object[1])[0] = Integer.valueOf(p0);
            this.a = p0;
        }
    }

    public final float c() {
        v0 = 0;
        if (this.e != 0 && this.f != 0) {
            try {
                v1 = (float)this.f.d();
                if (v1 > 0)
                    v0 = (float)this.f.c() / v1;
            }
            catch (RuntimeException ex) {
                if (ex instanceof IllegalStateException) {
                    if (ex.getMessage() != 0) {
                        if (ex.getMessage().contains("has been released")) {
                            v3 = new Object[1];
                            v3[0] = ex;
                            FinskyLog.c("Unexpected youtube release: %s", v3);
                            this.m();
                        }
                    }
                }
            }
        }
        return v0;
    }

    public final void cA_() {
    }

    public final void cB_() {
        if (this.a == 1) {
            this.b(2);
            if (this.h >= 0 && this.f != 0) {
                this.f.a(this.h);
                this.h = -1;
            }
        }
        else {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.a);
            FinskyLog.c("unexpected onVideoStarted() when not LOADING (state: %d)", v1);
        }
    }

    public final void cC_() {
        if (this.a > 0 && this.a <= 5) {
            this.b(6);
            if (this.d != 0 && !TextUtils.isEmpty(this.g))
                this.d.a(this.g);
        }
        else {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.a);
            FinskyLog.c("unexpected onVideoEnded() when state not between LOADING and PAUSED (state: %d)", v1);
        }
        this.h = -1;
    }

    public final void cD_() {
        this.b(3);
    }

    public final void cE_() {
        if (this.a == 3 || this.a == 4)
            this.b(5);
        else {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.a);
            FinskyLog.c("unexpected onPaused() when not playing (state: %d)", v1);
        }
    }

    public final void cF_() {
        if (this.a == 3 || this.a == 4 || this.a == 5) {
            this.b(6);
            if (this.d != 0)
                this.d.b();
        }
    }

    public final void cz_() {
        this.b(1);
    }

    public final float d() {
        return 0;
    }

    final void l() {
        try {
            this.b.a().a(this.e).d();
        }
        catch (IllegalStateException ex) {
        }
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = -1;
        this.b(-2);
        (new Object[1])[0] = Integer.valueOf(this.e.hashCode());
    }

}
