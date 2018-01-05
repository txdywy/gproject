package com.google.android.finsky.bm;

import android.app.Activity;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.i;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.media.TimeBar;
import com.google.android.libraries.play.entertainment.story.MediaPlayerOverlayView;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.c;
import com.google.android.youtube.player.d;
import com.google.android.youtube.player.e;
import com.google.android.youtube.player.internal.ar;
import com.google.android.youtube.player.internal.t;
import com.google.android.youtube.player.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.bm.e extends android.support.v7.widget.fe implements com.google.android.finsky.bm.b, com.google.android.finsky.bm.j
{

    public final List a;
    public final Activity b;
    public final MediaPlayerOverlayView c;
    public final ViewGroup d;
    public final int e;
    public com.google.android.finsky.bm.g f;
    public final com.google.android.finsky.bm.i g;
    public final com.google.android.finsky.bm.a h;
    public String i;
    public long j;
    public com.google.android.finsky.bm.d k;
    public com.google.android.finsky.d.w l;
    public byte[] m;

    e(Activity p0, Resources p1, android.support.v4.app.ab p2, com.google.android.finsky.bm.f p3, ViewGroup p4, com.google.android.finsky.d.w p5, com.google.android.finsky.bm.g p6) {
        android.support.v7.widget.fe();
        this.a = new ArrayList();
        this.j = 0;
        this.b = p0;
        this.c = p3.G();
        this.c.x.setElevation(0);
        this.d = p4;
        this.e = 54;
        this.l = p5;
        this.f = p6;
        this.g = new com.google.android.finsky.bm.i(p2, this);
        this.k = new com.google.android.finsky.bm.d(this.g, this.l);
        this.h = new com.google.android.finsky.bm.a(this, this.c, p1.getDimensionPixelSize(2131625002));
    }

    public final void a() {
        this.c.setVisibility(0);
        if (this.e()) {
            if (this.g.e == 0) {
                this.g.e = (com.google.android.finsky.bm.h)this.g.b.a(this.g.c);
                if (this.g.e != 0)
                    (new Object[1])[0] = Integer.valueOf(this.g.e.hashCode());
            }
            if (this.g.e != 0 && !this.i.equals(this.g.g))
                this.g.l();
            if (this.g.e == 0) {
                this.g.e = new com.google.android.finsky.bm.h();
                this.g.b.a().b(this.g.c, this.g.e).c();
            }
            v0 = new Object[2];
            v0[0] = this.i;
            v0[1] = Integer.valueOf(this.g.e.hashCode());
            this.g.g = this.i;
            if (this.g.f != 0)
                this.g.f.a(this.g.g);
            else if (this.g.a == -2) {
                this.g.b(-1);
                this.g.e.a("AIzaSyCpphGplamUhCCEIcum1VyDXBt0i1nOqac", this.g);
            }
            this.c.A.setTimeProvider(this.g);
        }
    }

    public final void a(RecyclerView p0, int p1, int p2) {
        super.a(p0, p1, p2);
        this.h.b();
    }

    public final void a(com.google.android.youtube.player.b p0) {
        if (this.e()) {
            this.f();
            v3 = new AlertDialog$Builder(this.b);
            switch (com.google.android.youtube.player.c.a[p0.ordinal()]) {
                case 1:
                    v0 = com.google.android.youtube.player.internal.ar.b(com.google.android.youtube.player.internal.ar.a(this.b));
                    break;
                case 2:
                    v0 = com.google.android.youtube.player.internal.ar.a(com.google.android.youtube.player.internal.ar.a(this.b));
                    break;
                case 3:
                    v0 = com.google.android.youtube.player.internal.ar.b(com.google.android.youtube.player.internal.ar.a(this.b));
                    break;
                default:
                    v0 = 0;
                    break;
            }
            v4 = new com.google.android.youtube.player.d(this.b, v0, this.e);
            v0 = new com.google.android.youtube.player.internal.t(this.b);
            switch (com.google.android.youtube.player.c.a[p0.ordinal()]) {
                case 1:
                    v0 = v3.setTitle(v0.b).setMessage(v0.c).setPositiveButton(v0.d, v4).create();
                    break;
                case 2:
                    v0 = v3.setTitle(v0.e).setMessage(v0.f).setPositiveButton(v0.g, v4).create();
                    break;
                case 3:
                    v0 = v3.setTitle(v0.h).setMessage(v0.i).setPositiveButton(v0.j, v4).create();
                    break;
                default:
                    v0 = String.valueOf(p0.name());
                    if (v0.length() != 0)
                        v0 = "Unexpected errorReason: ".concat(v0);
                    else
                        v0 = new String("Unexpected errorReason: ");
                    throw new IllegalArgumentException(v0);
            }
            v0.show();
        }
    }

    public final void a(String p0) {
        if (TextUtils.equals(this.i, p0)) {
            this.k.a(1, this.j, this.i, this.m);
            this.f();
        }
    }

    public final void a(boolean p0) {
        if (this.g.a()) {
            if (p0 != 0)
                this.k.a(3, this.j, this.i, this.m);
            else
                this.k.a(4, this.j, this.i, this.m);
        }
        this.f();
    }

    public final void b() {
        if (this.e())
            this.f();
    }

    public final void c() {
        if (this.f.a == 0) {
            this.f.b = com.google.android.finsky.utils.i.a() ^ System.nanoTime();
            this.f.a = 1;
        }
        this.f.b = this.f.b + 1;
        if (!(this.f.b + 1))
            this.f.b = this.f.b + 1;
        this.j = this.f.b;
        this.k.a(this.j, this.i, this.m);
    }

    public final void d() {
        if (this.e()) {
            this.k.a(7, this.j, this.i, this.m);
            this.f();
        }
    }

    public final boolean e() {
        if (!TextUtils.isEmpty(this.i))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void f() {
        if (this.e()) {
            this.i = 0;
            this.m = 0;
            this.j = 0;
            if (this.g.e != 0)
                this.g.l();
            this.c.A.setTimeProvider(0);
            this.c.a(0);
        }
        v1 = this.a.iterator();
        while (v1.hasNext())
            ((RecyclerView)v1.next()).b(this);
        this.a.clear();
        this.h.a();
    }

}
