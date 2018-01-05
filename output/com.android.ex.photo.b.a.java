package com.android.ex.photo.b;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.a.f;
import android.support.v4.app.Fragment;
import android.support.v4.app.bw;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ex.photo.a.d;
import com.android.ex.photo.aa;
import com.android.ex.photo.ac;
import com.android.ex.photo.ad;
import com.android.ex.photo.c.b;
import com.android.ex.photo.c.c;
import com.android.ex.photo.g;
import com.android.ex.photo.r;
import com.android.ex.photo.views.PhotoView;
import com.android.ex.photo.views.b;
import com.android.ex.photo.views.c;
import com.android.ex.photo.views.d;
import com.android.ex.photo.views.e;
import com.android.ex.photo.views.f;
import com.android.ex.photo.w;
import com.android.ex.photo.z;

public final class com.android.ex.photo.b.a extends Fragment implements android.support.v4.app.bx, View$OnClickListener, com.android.ex.photo.h, com.android.ex.photo.i
{

    public String a;
    public TextView af;
    public com.android.ex.photo.views.f ag;
    public int ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public View am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public String b;
    public String c;
    public Intent d;
    public com.android.ex.photo.g e;
    public com.android.ex.photo.a.d f;
    public BroadcastReceiver g;
    public PhotoView h;
    public ImageView i;

    a() {
        Fragment();
        this.al = 1;
    }

    private final void X() {
        if (this.h != 0)
            this.h.a();
    }

    private final void Y() {
        if (this.e == 0)
            v0 = 0;
        else
            v0 = this.e.b(this);
        this.ai = v0;
    }

    public static void a(Intent p0, int p1, boolean p2, com.android.ex.photo.b.a p3) {
        v0 = new Bundle();
        v0.putParcelable("arg-intent", p0);
        v0.putInt("arg-position", p1);
        v0.putBoolean("arg-show-spinner", p2);
        p3.f(v0);
    }

    private final void a(boolean p0) {
        this.h.b(p0);
    }

    public final boolean W() {
        v0 = 1;
        if (this.h != 0) {
            if (this.h.h != 0)
                v2 = 1;
            else
                v2 = 0;
            if (v2 != 0)
                return v0;
        }
        v0 = 0;
        return v0;
    }

    public final android.support.v4.a.f a(int p0, Bundle p1) {
        v0 = 0;
        if (this.ak == 0) {
            switch (p0) {
                case 2:
                    v0 = this.b;
                    break;
                case 3:
                    v0 = this.a;
                    break;
                default:
                    break;
            }
            v0 = this.e.a(p0, v0);
        }
        return v0;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = p0.inflate(com.android.ex.photo.ac.photo_fragment_view, p1, 0);
        this.h = (PhotoView)v2.findViewById(com.android.ex.photo.aa.photo_view);
        this.h.setMaxInitialScale(this.d.getFloatExtra("max_scale", 1065353216));
        this.h.setOnClickListener(this);
        if (this.ai != this.h.n) {
            this.h.n = this.ai;
            this.h.requestLayout();
            this.h.invalidate();
        }
        this.h.b(0);
        this.h.setContentDescription(this.c);
        this.am = v2.findViewById(com.android.ex.photo.aa.photo_preview);
        this.i = (ImageView)v2.findViewById(com.android.ex.photo.aa.photo_preview_image);
        this.an = 0;
        this.ag = new com.android.ex.photo.views.f((ProgressBar)v2.findViewById(com.android.ex.photo.aa.determinate_progress), (ProgressBar)v2.findViewById(com.android.ex.photo.aa.indeterminate_progress));
        this.af = (TextView)v2.findViewById(com.android.ex.photo.aa.empty_text);
        v2.findViewById(com.android.ex.photo.aa.retry_button);
        this.Y();
        return v2;
    }

    public final void a() {
        this.e = 0;
        super.a();
    }

    public final void a(Cursor p0) {
        if (this.f != 0 && p0.moveToPosition(this.ah) && !this.W()) {
            this.e.e();
            v1 = this.o();
            v0 = v1.b(3);
            if (v0 != 0) {
                this.a = this.f.a(p0, "contentUri");
                ((com.android.ex.photo.c.b)v0).a(this.a);
                ((com.android.ex.photo.c.b)v0).j();
            }
            if (this.an == 0) {
                v0 = v1.b(2);
                if (v0 != 0) {
                    this.b = this.f.a(p0, "thumbnailUri");
                    ((com.android.ex.photo.c.b)v0).a(this.b);
                    ((com.android.ex.photo.c.b)v0).j();
                }
            }
        }
    }

    public final void a(android.support.v4.a.f p0, Object p1) {
        if (this.R == 0)
            return;
        if (!this.k())
            return;
        v3 = ((com.android.ex.photo.c.c)p1).a(this.i());
        switch (p0.o) {
            case 2:
                if (this.ap == 0) {
                    if (this.W())
                        return;
                    if (v3 == 0) {
                        this.i.setImageResource(com.android.ex.photo.z.default_image);
                        this.an = 0;
                    }
                    else {
                        this.i.setImageDrawable(v3);
                        this.an = 1;
                    }
                    this.i.setVisibility(0);
                    if (this.i().getBoolean(com.android.ex.photo.w.force_thumbnail_no_scaling))
                        this.i.setScaleType(ImageView$ScaleType.CENTER);
                    this.a(0);
                }
                else if (((com.android.ex.photo.c.c)p1).c == 1) {
                    this.al = 0;
                    this.af.setText(com.android.ex.photo.ad.failed);
                    this.af.setVisibility(0);
                    this.e.a(this, 0);
                }
                else {
                    this.af.setVisibility(8);
                    v0 = ((com.android.ex.photo.c.c)p1).a(this.i());
                    if (v0 != 0) {
                        if (this.h != 0) {
                            if (v0 != 0 && v0 != this.h.h) {
                                if (this.h.h != 0)
                                    this.h.h.setCallback(0);
                                this.h.h = v0;
                                this.h.C = 0;
                                this.h.h.setCallback(this.h);
                                v0 = 1;
                            }
                            else
                                v0 = 0;
                            this.h.c(v0);
                            this.h.invalidate();
                        }
                        this.a(1);
                        this.am.setVisibility(8);
                        this.al = 0;
                    }
                    this.e.a(this, 1);
                }
                break;
            case 3:
                if (((com.android.ex.photo.c.c)p1).c == 1) {
                    this.al = 0;
                    this.af.setText(com.android.ex.photo.ad.failed);
                    this.af.setVisibility(0);
                    this.e.a(this, 0);
                }
                else {
                    this.af.setVisibility(8);
                    v0 = ((com.android.ex.photo.c.c)p1).a(this.i());
                    if (v0 != 0) {
                        if (this.h != 0) {
                            if (v0 != 0 && v0 != this.h.h) {
                                if (this.h.h != 0)
                                    this.h.h.setCallback(0);
                                this.h.h = v0;
                                this.h.C = 0;
                                this.h.h.setCallback(this.h);
                                v0 = 1;
                            }
                            else
                                v0 = 0;
                            this.h.c(v0);
                            this.h.invalidate();
                        }
                        this.a(1);
                        this.am.setVisibility(8);
                        this.al = 0;
                    }
                    this.e.a(this, 1);
                }
                break;
            default:
                break;
        }
        if (this.al == 0)
            this.ag.a(8);
        if (v3 != 0)
            this.e.a();
        this.Y();
    }

    public final void b() {
    }

    public final void b(Bundle p0) {
        super.b(p0);
        if (this.q != 0) {
            this.d = (Intent)this.q.getParcelable("arg-intent");
            this.ap = this.d.getBooleanExtra("display_thumbs_fullscreen", 0);
            this.ah = this.q.getInt("arg-position");
            this.ak = this.q.getBoolean("arg-show-spinner");
            this.al = 1;
            if (p0 != 0) {
                v0 = p0.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT");
                if (v0 != 0)
                    this.d = new Intent().putExtras(v0);
            }
            if (this.d != 0) {
                this.a = this.d.getStringExtra("resolved_photo_uri");
                this.b = this.d.getStringExtra("thumbnail_uri");
                this.c = this.d.getStringExtra("content_description");
                this.aj = this.d.getBooleanExtra("watch_network", 0);
            }
        }
    }

    public final void c() {
        this.Y();
    }

    public final void c_() {
        this.X();
    }

    public final void d() {
        if (this.h != 0) {
            this.h.u = 0;
            this.h.v = 0;
            this.h.h = 0;
            this.h.B.a();
            this.h.B = 0;
            this.h.E.a();
            this.h.E = 0;
            this.h.F.a();
            this.h.F = 0;
            this.h.G.f = 1;
            this.h.G = 0;
            this.h.setOnClickListener(0);
            this.h.w = 0;
            this.h.M = 0;
            this.h = 0;
        }
        super.d();
    }

    public final void d(Bundle p0) {
        super.d(p0);
        this.e = ((com.android.ex.photo.r)this.h()).l();
        if (this.e == 0)
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        this.f = this.e.f();
        if (this.f == 0)
            throw new IllegalStateException("Callback reported null adapter");
        this.Y();
    }

    public final void d_() {
        if (!this.e.a(this))
            this.X();
        else {
            if (!this.W())
                this.o().a(2, this);
            this.e.d();
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        if (this.d != 0)
            p0.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", this.d.getExtras());
    }

    public final boolean e_() {
        v0 = 0;
        if (this.e.a(this) && this.h != 0) {
            if (this.h.x == 0)
                v2 = 0;
            else if (this.h.E.g == 0) {
                this.h.j.getValues(this.h.L);
                this.h.K.set(this.h.I);
                this.h.j.mapRect(this.h.K);
                if (this.h.x == 0 || this.h.K.right - this.h.K.left <= (float)this.h.getWidth())
                    v2 = 0;
                else if (this.h.L[2] == 0)
                    v2 = 0;
                else
                    v2 = 1;
            }
            else
                v2 = 1;
            if (v2 != 0)
                v0 = 1;
        }
        return v0;
    }

    public final boolean f_() {
        v0 = 0;
        if (this.e.a(this) && this.h != 0) {
            if (this.h.x == 0)
                v2 = 0;
            else if (this.h.E.g == 0) {
                this.h.j.getValues(this.h.L);
                this.h.K.set(this.h.I);
                this.h.j.mapRect(this.h.K);
                v3 = (float)this.h.getWidth();
                if (this.h.x == 0 || this.h.K.right - this.h.K.left <= v3)
                    v2 = 0;
                else if (this.h.L[2] != 0) {
                    if (v3 >= this.h.K.right - this.h.K.left + this.h.L[2])
                        v2 = 0;
                    else
                        v2 = 1;
                }
                else
                    v2 = 1;
            }
            else
                v2 = 1;
            if (v2 != 0)
                v0 = 1;
        }
        return v0;
    }

    public void onClick(View p0) {
        this.e.c();
    }

    public final void u() {
        super.u();
        this.e.a(this.ah, this);
        this.e.a(this);
        if (this.aj != 0) {
            if (this.g == 0)
                this.g = new com.android.ex.photo.b.b(this);
            this.h().registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            v0 = ((ConnectivityManager)this.h().getSystemService("connectivity")).getActiveNetworkInfo();
            if (v0 != 0)
                this.ao = v0.isConnected();
            else
                this.ao = 0;
        }
        if (!this.W()) {
            this.al = 1;
            this.am.setVisibility(0);
            this.o().a(2, 0, this);
            this.o().a(3, 0, this);
        }
    }

    public final void v() {
        if (this.aj != 0)
            this.h().unregisterReceiver(this.g);
        this.e.b(this);
        this.e.c(this.ah);
        super.v();
    }

}
