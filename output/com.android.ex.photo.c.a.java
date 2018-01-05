package com.android.ex.photo.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.a.a;
import android.support.v4.a.f;
import com.android.ex.photo.e.b;
import com.android.ex.photo.j;

protected final class com.android.ex.photo.c.a extends android.support.v4.a.a implements com.android.ex.photo.c.b
{

    public String g;
    public Bitmap h;

    a(Context p0, String p1) {
        android.support.v4.a.a(p0);
        this.g = p1;
    }

    public void a(Bitmap p0) {
        if (p0 != 0 && !p0.isRecycled())
            p0.recycle();
    }

    public final void a(com.android.ex.photo.c.c p0) {
        if (p0 != 0)
            v0 = p0.b;
        else
            v0 = 0;
        if (this.u != 0) {
            if (v0 != 0)
                this.a(v0);
        }
        else {
            this.h = v0;
            if (this.s != 0)
                super.b(p0);
            if (this.h != 0 && this.h != v0 && !this.h.isRecycled())
                this.a(this.h);
        }
    }

    public final void a(Object p0) {
        super.a((com.android.ex.photo.c.c)p0);
        if ((com.android.ex.photo.c.c)p0 != 0)
            this.a(((com.android.ex.photo.c.c)p0).b);
    }

    public final void a(String p0) {
        this.g = p0;
    }

    public final void b(Object p0) {
        this.a((com.android.ex.photo.c.c)p0);
    }

    public Object d() {
        return this.f();
    }

    public com.android.ex.photo.c.c f() {
        v0 = new com.android.ex.photo.c.c();
        if (this.r != 0 && this.g != 0) {
            try {
                v0 = com.android.ex.photo.e.b.a(this.r.getContentResolver(), Uri.parse(this.g), com.android.ex.photo.j.b);
                if (v0.b != 0)
                    v0.b.setDensity(160);
            }
            catch (UnsupportedOperationException ex) {
                v0.c = 1;
            }
        }
        return v0;
    }

    protected final void g() {
        if (this.h != 0) {
            v0 = new com.android.ex.photo.c.c();
            v0.c = 0;
            v0.b = this.h;
            this.a(v0);
        }
        if ((this.k()) || this.h == 0)
            this.a();
    }

    protected final void h() {
        this.b();
    }

    protected final void i() {
        super.i();
        this.h();
        if (this.h != 0) {
            this.a(this.h);
            this.h = 0;
        }
    }

}
