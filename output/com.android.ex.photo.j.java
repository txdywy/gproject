package com.android.ex.photo;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.a.f;
import android.support.v4.app.Fragment;
import android.support.v4.app.bw;
import android.support.v4.view.ViewPager;
import android.support.v4.view.a.a;
import android.support.v4.view.a.i;
import android.support.v4.view.af;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.ex.photo.a.a;
import com.android.ex.photo.a.d;
import com.android.ex.photo.b.a;
import com.android.ex.photo.c.a;
import com.android.ex.photo.c.d;
import com.android.ex.photo.e.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class com.android.ex.photo.j implements android.support.v4.app.bx, android.support.v4.view.bi, com.android.ex.photo.b, com.android.ex.photo.g, com.android.ex.photo.v
{

    public static int a;
    public static int b;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final AccessibilityManager J;
    public com.android.ex.photo.s K;
    public final Handler L;
    public long M;
    public int N;
    public final Runnable O;
    public final com.android.ex.photo.r c;
    public int d;
    public final View$OnSystemUiVisibilityChangeListener e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String[] j;
    public int k;
    public boolean l;
    public View m;
    public View n;
    public PhotoViewPager o;
    public ImageView p;
    public com.android.ex.photo.a.d q;
    public boolean r;
    public final Map s;
    public final Set t;
    public boolean u;
    public boolean v;
    public boolean w;
    public float x;
    public String y;
    public String z;

    j(com.android.ex.photo.r p0) {
        this.k = -1;
        this.s = new HashMap();
        this.t = new HashSet();
        this.w = 1;
        this.L = new Handler();
        this.N = -1;
        this.O = new com.android.ex.photo.l(this);
        this.c = p0;
        if (Build$VERSION.SDK_INT < 11)
            this.e = 0;
        else
            this.e = new com.android.ex.photo.k(this);
        this.J = (AccessibilityManager)p0.m().getSystemService("accessibility");
    }

    static int a(int p0, int p1, int p2, float p3) {
        return p0 - Math.round(((float)p2 - (float)p2 * p3) / 1073741824) - Math.round(((float)p2 * p3 - (float)p1) / 1073741824);
    }

    private static final String a(String p0) {
        if (p0 == 0)
            p0 = "";
        return p0;
    }

    private final synchronized void a(Cursor p0) {
        enter this;
        try {
            v1 = this.t.iterator();
            while (v1.hasNext())
                ((com.android.ex.photo.h)v1.next()).a(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    private final void e(int p0) {
        v0 = this.s.get(Integer.valueOf(p0));
        if ((com.android.ex.photo.i)v0 != 0)
            ((com.android.ex.photo.i)v0).d_();
        v0 = this.p();
        this.h = p0;
        this.i = v0.getString(v0.getColumnIndex("uri"));
        v3 = this.o.getCurrentItem() + 1;
        if (this.k >= 0)
            v0 = 1;
        else
            v0 = 0;
        v4 = this.p();
        if (v4 != 0)
            this.y = v4.getString(v4.getColumnIndex("_display_name"));
        else
            this.y = 0;
        if (this.l != 0 || v0 == 0 || v3 <= 0)
            this.z = 0;
        else {
            v5 = new Object[2];
            v5[0] = Integer.valueOf(v3);
            v5[1] = Integer.valueOf(this.k);
            this.z = this.c.getResources().getString(com.android.ex.photo.ad.photo_view_count, v5);
        }
        this.a(this.c.n());
        if (this.J.isEnabled() && this.N != p0) {
            if (this.z != 0) {
                v4 = new Object[2];
                v4[0] = this.y;
                v4[1] = this.z;
                v1 = this.c.m().getResources().getString(com.android.ex.photo.ad.titles, v4);
            }
            else
                v1 = this.y;
            if (v1 != 0) {
                v0 = this.J;
                if (Build$VERSION.SDK_INT >= 16)
                    this.m.announceForAccessibility(v1);
                else {
                    v3 = this.m.getContext().getApplicationContext();
                    if (v0 == 0)
                        v0 = (AccessibilityManager)v3.getSystemService("accessibility");
                    if (v0.isEnabled()) {
                        v4 = AccessibilityEvent.obtain(8);
                        v4.getText().add(v1);
                        v4.setEnabled(this.m.isEnabled());
                        v4.setClassName(this.m.getClass().getName());
                        v4.setPackageName(v3.getPackageName());
                        android.support.v4.view.a.a.a(v4).a(this.m);
                        if (Build$VERSION.SDK_INT >= 14)
                            this.m.getParent().requestSendAccessibilityEvent(this.m, v4);
                        else
                            v0.sendAccessibilityEvent(v4);
                    }
                }
                this.N = p0;
            }
        }
        this.o();
        this.n();
    }

    private final void n() {
        if (this.G != 0)
            this.L.postDelayed(this.O, this.M);
    }

    private final void o() {
        this.L.removeCallbacks(this.O);
    }

    private final Cursor p() {
        v0 = 0;
        if (this.o != 0 && this.q.d != 0) {
            this.q.d.moveToPosition(this.o.getCurrentItem());
            v0 = this.q.d;
        }
        return v0;
    }

    public android.support.v4.a.f a(int p0, Bundle p1) {
        if (p0 == 100)
            v0 = new com.android.ex.photo.c.d(this.c.m(), Uri.parse(this.f), this.j);
        else
            v0 = 0;
        return v0;
    }

    public android.support.v4.a.f a(int p0, String p1) {
        switch (p0) {
            case 1:
                v0 = new com.android.ex.photo.c.a(this.c.m(), p1);
                break;
            case 2:
                v0 = new com.android.ex.photo.c.a(this.c.m(), p1);
                break;
            case 3:
                v0 = new com.android.ex.photo.c.a(this.c.m(), p1);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final void a() {
    }

    public final void a(int p0, float p1, int p2) {
        if ((double)p1 < 4547007122018943789) {
            v0 = this.s.get(Integer.valueOf(p0 - 1));
            if ((com.android.ex.photo.i)v0 != 0)
                ((com.android.ex.photo.i)v0).c_();
            v0 = this.s.get(Integer.valueOf(p0 + 1));
            if ((com.android.ex.photo.i)v0 != 0)
                ((com.android.ex.photo.i)v0).c_();
        }
    }

    public final void a(int p0, com.android.ex.photo.i p1) {
        this.s.put(Integer.valueOf(p0), p1);
    }

    public final void a(android.support.v4.a.f p0, Object p1) {
 11:    if (p0.o != 100)
 28:        return;
 13:    if ((Cursor)p1 == 0) {
 21:        this.l = 1;
 25:        this.q.a(0);
 28:        return;
        }
 19:    if (((Cursor)p1).getCount() == 0) {
 21:        this.l = 1;
 25:        this.q.a(0);
 28:        return;
        }
 33:    this.k = ((Cursor)p1).getCount();
 37:    if (this.i == 0) {
114:        if (this.w != 0) {
116:            this.u = 1;
120:            this.q.a(0);
            }
            else {
165:            this.l = 0;
169:            this.q.a((Cursor)p1);
178:            if (this.o.getAdapter() == 0)
184:                this.o.setAdapter(this.q);
187:            this.a((Cursor)p1);
192:            if (this.h < 0)
194:                this.h = 0;
200:            this.o.a(this.h, 0);
203:            if (this.l != 0)
207:                this.e(this.h);
            }
123:        return;
        }
 47:    if (Build$VERSION.SDK_INT >= 11)
 63:        v0 = Uri.parse(this.i).buildUpon().clearQuery().build();
        else
138:        v0 = Uri.parse(this.i).buildUpon().query(0).build();
 68:    ((Cursor)p1).moveToPosition(-1);
 71:    v1 = 0;
 72:    while (true) {
 76:        if (!((Cursor)p1).moveToNext()) {
114:            if (this.w != 0) {
116:                this.u = 1;
120:                this.q.a(0);
                }
                else {
165:                this.l = 0;
169:                this.q.a((Cursor)p1);
178:                if (this.o.getAdapter() == 0)
184:                    this.o.setAdapter(this.q);
187:                this.a((Cursor)p1);
192:                if (this.h < 0)
194:                    this.h = 0;
200:                this.o.a(this.h, 0);
203:                if (this.l != 0)
207:                    this.e(this.h);
                }
123:            return;
            }
 78:        v3 = ((Cursor)p1).getString(((Cursor)p1).getColumnIndex("uri"));
 84:        if (Build$VERSION.SDK_INT >= 11)
 98:            v3 = Uri.parse(v3).buildUpon().clearQuery().build();
            else
155:            v3 = Uri.parse(v3).buildUpon().query(0).build();
102:        if (v0 != 0)
102:            break;
160:        v1 = v1 + 1;
        }
108:    if (!v0.equals(v3)) goto 160;
110:    this.h = v1;
114:    if (this.w != 0) {
116:        this.u = 1;
120:        this.q.a(0);
        }
        else {
165:        this.l = 0;
169:        this.q.a((Cursor)p1);
178:        if (this.o.getAdapter() == 0)
184:            this.o.setAdapter(this.q);
187:        this.a((Cursor)p1);
192:        if (this.h < 0)
194:            this.h = 0;
200:        this.o.a(this.h, 0);
203:        if (this.l != 0)
207:            this.e(this.h);
        }
    }

    protected final void a(com.android.ex.photo.a p0) {
        if (p0 != 0) {
            p0.a(com.android.ex.photo.j.a(this.y));
            p0.b(com.android.ex.photo.j.a(this.z));
        }
    }

    public final void a(com.android.ex.photo.b.a p0, boolean p1) {
        if (this.h() && this.p.getVisibility() != 8 && TextUtils.equals(p0.a, this.i)) {
            if (p1 != 0) {
                if (this.h())
                    this.p.setVisibility(8);
                this.o.setVisibility(0);
            }
            else {
                Log.w("PhotoViewController", "Failed to load fragment image");
                if (this.h())
                    this.p.setVisibility(8);
                this.o.setVisibility(0);
            }
            this.c.b_().a(2);
        }
    }

    public final synchronized void a(com.android.ex.photo.h p0) {
        enter this;
        try {
            this.t.add(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(boolean p0) {
        if (p0 != 0)
            this.o();
        else
            this.n();
    }

    protected final void a(boolean p0, boolean p1) {
  6:    v2 = 1;
  7:    v0 = 0;
 14:    if (com.android.ex.photo.e.i.a(this.J)) {
 16:        p1 = 0;
 17:        p0 = 0;
        }
 20:    if (p0 != this.r)
 22:        v1 = 1;
        else
 58:        v1 = 0;
 23:    this.r = p0;
 27:    if (this.r == 0) goto 160;
 31:    if (Build$VERSION.SDK_INT < 16)
 33:        v3 = 1;
        else
 60:        v3 = 0;
 36:    if (this.B == 0) goto 42;
 40:    if (this.A == 0) goto 138;
 42:    if (Build$VERSION.SDK_INT > 19) {
 74:        v0 = 3846;
 76:        if (v3 != 0)
 78:            this.m();
 81:        if (Build$VERSION.SDK_INT >= 11) {
 83:            this.d = v0;
 87:            this.m.setSystemUiVisibility(v0);
            }
 90:        this.o();
 93:        if (v1 != 0) {
101:            v1 = this.s.values().iterator();
105:            while (v1.hasNext())
117:                ((com.android.ex.photo.i)v1.next()).c();
            }
120:        return;
        }
 44:    if (Build$VERSION.SDK_INT != 19) goto 123;
 48:    if (Build$VERSION.SDK_INT != 19)
 57:        throw new IllegalStateException("kitkatIsSecondary user is only callable on KitKat");
 69:    if (Process.myUid() > 100000)
 71:        v4 = 1;
        else
121:        v4 = 0;
 72:    if (v4 != 0) goto 123;
 74:    v0 = 3846;
 76:    if (v3 != 0)
 78:        this.m();
 81:    if (Build$VERSION.SDK_INT >= 11) {
 83:        this.d = v0;
 87:        this.m.setSystemUiVisibility(v0);
        }
 90:    this.o();
 93:    if (v1 != 0) {
101:        v1 = this.s.values().iterator();
105:        while (v1.hasNext())
117:            ((com.android.ex.photo.i)v1.next()).c();
        }
120:    return;
123:    if (Build$VERSION.SDK_INT >= 16)
125:        v0 = 1285;
130:    else if (Build$VERSION.SDK_INT >= 14)
132:        v0 = 1;
134:    else if (Build$VERSION.SDK_INT >= 11)
136:        v0 = 1;
127:    goto 76;
138:    if (Build$VERSION.SDK_INT >= 19)
140:        v0 = 1792;
148:    else if (Build$VERSION.SDK_INT >= 16)
150:        v0 = 1280;
155:    else if (Build$VERSION.SDK_INT < 14 && Build$VERSION.SDK_INT >= 11) {
        }
142:    if (v3 != 0)
144:        this.l();
147:    goto 81;
162:    if (Build$VERSION.SDK_INT >= 16)
188:        v2 = 0;
164:    if (Build$VERSION.SDK_INT >= 19)
166:        v0 = 1792;
190:    else if (Build$VERSION.SDK_INT >= 16)
192:        v0 = 1280;
197:    else if (Build$VERSION.SDK_INT < 14 && Build$VERSION.SDK_INT >= 11) {
        }
168:    if (v2 != 0)
170:        this.l();
173:    if (Build$VERSION.SDK_INT >= 11) {
175:        this.d = v0;
179:        this.m.setSystemUiVisibility(v0);
        }
182:    if (p1 != 0)
184:        this.n();
187:    goto 93;
    }

    public final boolean a(Fragment p0) {
        v0 = 0;
        if (this.o != 0 && this.q != 0 && this.o.getCurrentItem() == this.q.b(p0))
            v0 = 1;
        return v0;
    }

    public final void b() {
        if (this.v == 0)
            this.q.a(0);
    }

    public final void b(int p0) {
        this.h = p0;
        this.e(p0);
    }

    public final synchronized void b(com.android.ex.photo.h p0) {
        enter this;
        try {
            this.t.remove(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final boolean b(Fragment p0) {
        if (this.o == 0 || this.q == 0 || this.q.a() == 0)
            v0 = this.r;
        else if (this.r != 0 || this.o.getCurrentItem() != this.q.b(p0))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void c() {
        if (this.r == 0)
            v0 = 1;
        else
            v0 = 0;
        this.a(v0, 1);
    }

    public final void c(int p0) {
        this.s.remove(Integer.valueOf(p0));
    }

    protected final View d(int p0) {
        return this.c.c(p0);
    }

    public final void d() {
    }

    public final void d_(int p0) {
    }

    public final void e() {
    }

    public final com.android.ex.photo.a.d f() {
        return this.q;
    }

    protected final boolean g() {
        if (this.n != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final boolean h() {
        if (this.p != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.android.ex.photo.u i() {
        v3 = this.s.values().iterator();
        v1 = 0;
        v2 = 0;
        while (v3.hasNext()) {
            v0 = (com.android.ex.photo.i)v3.next();
            if (v2 == 0)
                v2 = v0.e_();
            if (v1 == 0)
                v0 = v0.f_();
            else
                v0 = v1;
            v1 = v0;
        }
        if (v2 != 0) {
            if (v1 != 0)
                v0 = com.android.ex.photo.u.d;
            else
                v0 = com.android.ex.photo.u.b;
        }
        else if (v1 != 0)
            v0 = com.android.ex.photo.u.c;
        else
            v0 = com.android.ex.photo.u.a;
        return v0;
    }

    public final void j() {
  7:    v0 = 0;
  8:    this.A = 1;
 12:    this.o.setVisibility(0);
 19:    if (Build$VERSION.SDK_INT < 16)
 21:        v3 = 1;
        else
 48:        v3 = 0;
 22:    if (this.r == 0) goto 96;
 26:    if (this.B == 0) goto 32;
 30:    if (this.A == 0) goto 96;
 32:    if (Build$VERSION.SDK_INT > 19) {
 62:        v0 = 3846;
 64:        if (v3 != 0)
 66:            this.m();
 69:        if (Build$VERSION.SDK_INT >= 11) {
 71:            this.d = v0;
 75:            this.m.setSystemUiVisibility(v0);
            }
 78:        return;
        }
 34:    if (Build$VERSION.SDK_INT != 19) goto 81;
 38:    if (Build$VERSION.SDK_INT != 19)
 47:        throw new IllegalStateException("kitkatIsSecondary user is only callable on KitKat");
 57:    if (Process.myUid() > 100000)
 59:        v2 = 1;
        else
 79:        v2 = 0;
 60:    if (v2 != 0) goto 81;
 62:    v0 = 3846;
 64:    if (v3 != 0)
 66:        this.m();
 69:    if (Build$VERSION.SDK_INT >= 11) {
 71:        this.d = v0;
 75:        this.m.setSystemUiVisibility(v0);
        }
 78:    return;
 81:    if (Build$VERSION.SDK_INT >= 16)
 83:        v0 = 1285;
 88:    else if (Build$VERSION.SDK_INT >= 14)
 90:        v0 = 1;
 92:    else if (Build$VERSION.SDK_INT >= 11)
 94:        v0 = 1;
 85:    goto 64;
 96:    if (Build$VERSION.SDK_INT >= 19)
 98:        v0 = 1792;
106:    else if (Build$VERSION.SDK_INT >= 16)
108:        v0 = 1280;
113:    else if (Build$VERSION.SDK_INT < 14 && Build$VERSION.SDK_INT >= 11) {
        }
100:    if (v3 != 0)
102:        this.l();
105:    goto 69;
    }

    final void k() {
        v0 = this.m.getMeasuredWidth();
        v1 = this.m.getMeasuredHeight();
        if (this.h())
            this.p.setVisibility(0);
        v2 = Math.max((float)this.E / (float)v0, (float)this.F / (float)v1);
        v0 = com.android.ex.photo.j.a(this.C, this.E, v0, v2);
        v1 = com.android.ex.photo.j.a(this.D, this.F, v1, v2);
        if (Build$VERSION.SDK_INT >= 14) {
            if (this.g()) {
                this.n.setAlpha(0);
                this.n.animate().alpha(1065353216).setDuration(250).start();
                this.n.setVisibility(0);
            }
            if (this.h()) {
                this.p.setScaleX(v2);
                this.p.setScaleY(v2);
                this.p.setTranslationX((float)v0);
                this.p.setTranslationY((float)v1);
                v0 = new com.android.ex.photo.m(this);
                v1 = this.p.animate().scaleX(1065353216).scaleY(1065353216).translationX(0).translationY(0).setDuration(250);
                if (Build$VERSION.SDK_INT >= 16)
                    v1.withEndAction(v0);
                else
                    this.L.postDelayed(v0, 250);
                v1.start();
            }
        }
        else {
            if (this.g()) {
                v3 = new AlphaAnimation(0, 1065353216);
                v3.setDuration(250);
                this.n.startAnimation(v3);
                this.n.setVisibility(0);
            }
            if (this.h()) {
                v3 = new TranslateAnimation((float)v0, (float)v1, 0, 0);
                v3.setDuration(250);
                v0 = new ScaleAnimation(v2, v2, 0, 0);
                v0.setDuration(250);
                v1 = new AnimationSet(1);
                v1.addAnimation(v3);
                v1.addAnimation(v0);
                v1.setAnimationListener(new com.android.ex.photo.n(this));
                this.p.startAnimation(v1);
            }
        }
    }

    public void l() {
        this.c.n().c();
    }

    public void m() {
        this.c.n().d();
    }

}
