package com.google.android.play.drawer;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0216d;
import android.support.v4.widget.C0390w;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.C0415e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.play.C6314e;
import com.google.android.play.C6315f;
import com.google.android.play.C6316g;
import com.google.android.play.utils.PlayCommonLog;

public class C3690g extends DrawerLayout implements C0390w {
    public TextView ak;
    public ViewGroup al;
    public C6290a am;
    public C0415e an;
    public float ao;
    public boolean ap;
    public boolean aq;
    public C3714i ar;
    public boolean as;
    public C0390w at;
    public int f18663o;

    public C3690g(Context context) {
        this(context, null);
    }

    public C3690g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aq = false;
        this.as = false;
        Drawable a = C0216d.m1112a(getContext(), C6315f.drawer_shadow);
        if (!DrawerLayout.f1936d) {
            this.f1944H = a;
            super.m2096a();
            invalidate();
        }
        super.setDrawerListener(this);
    }

    @TargetApi(20)
    protected void onFinishInflate() {
        C6290a akVar;
        super.onFinishInflate();
        this.al = (ViewGroup) findViewById(C6316g.play_drawer_root);
        View findViewById = findViewById(C6316g.play_drawer_list);
        if (findViewById instanceof PlayDrawerRecyclerView) {
            akVar = new ak((PlayDrawerRecyclerView) findViewById);
        } else if (findViewById instanceof ListView) {
            Object c6300o = new C6300o((ListView) findViewById);
        } else {
            String valueOf = String.valueOf(findViewById.getClass());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 31).append("Unknown PlayDrawer view class: ").append(valueOf).toString());
        }
        this.am = akVar;
        this.ak = (TextView) findViewById(C6316g.play_drawer_docked_action);
        this.ak.setVisibility(8);
        if (VERSION.SDK_INT >= 21) {
            this.al.setOnApplyWindowInsetsListener(new C6296h());
        }
    }

    public void setActionBarHeight(int i) {
        m17510k();
        Resources resources = getResources();
        int i2 = resources.getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(C6314e.play_drawer_max_width);
        this.al.getLayoutParams().width = Math.min(dimensionPixelSize, i2 - i);
        this.al.requestLayout();
    }

    public void setIsMiniProfile(boolean z) {
        this.aq = z;
    }

    public void setUseUserProfileEndpoint(boolean z) {
        this.as = z;
    }

    public void setCurrentAvatarClickable(boolean z) {
        m17510k();
        this.am.mo5383a(z);
    }

    public final void m17510k() {
        if (!this.ap) {
            PlayCommonLog.d("Play Drawer configure was not called", new Object[0]);
        }
    }

    public final boolean m17511l() {
        m17510k();
        return DrawerLayout.m2091g(this.al);
    }

    public void setDrawerToggle(C0415e c0415e) {
        this.an = c0415e;
        if (this.an != null) {
            this.an.m2616a();
        }
    }

    public void mo3590d() {
        m17510k();
        if (DrawerLayout.m2091g(this.al)) {
            m2103f(this.al);
        }
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        m17510k();
        if (this.an != null) {
            C0415e c0415e = this.an;
            if (z != c0415e.f2432f) {
                if (z) {
                    c0415e.m2617a(c0415e.f2429c, c0415e.f2428b.m2099b() ? c0415e.f2435i : c0415e.f2434h);
                } else {
                    c0415e.m2617a(c0415e.f2431e, 0);
                }
                c0415e.f2432f = z;
            }
        }
    }

    public void mo3600h() {
        m17510k();
        if (this.an != null) {
            this.an.m2616a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.ap && this.an != null) {
            C0415e c0415e = this.an;
            if (!c0415e.f2433g) {
                c0415e.f2431e = c0415e.m2619b();
            }
            c0415e.m2616a();
        }
    }

    public void a_(View view) {
        if (this.an != null) {
            this.an.a_(view);
        }
        if (this.am != null) {
            this.am.mo5386c();
        }
        if (this.at != null) {
            this.at.a_(view);
        }
    }

    public void b_(View view) {
        if (this.an != null) {
            this.an.b_(view);
        }
        if (this.at != null) {
            this.at.b_(view);
        }
    }

    public final void mo614a(View view, float f) {
        if (this.ap && this.f18663o == 2 && f < this.ao) {
            this.am.mo5386c();
        }
        this.ao = f;
        if (this.an != null) {
            this.an.mo614a(view, f);
        }
        if (this.at != null) {
            this.at.mo614a(view, f);
        }
    }

    public final void g_(int i) {
        this.f18663o = i;
        if (this.at != null) {
            this.at.g_(i);
        }
    }

    public final void setDrawerListener(C0390w c0390w) {
        this.at = c0390w;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public void setAccountNameSanitizer(C3714i c3714i) {
        this.ar = c3714i;
        if (this.am != null) {
            this.am.mo5381a(this.ar);
        }
    }

    public void setDisableRpcRequests(boolean z) {
        if (this.am != null) {
            this.am.mo5384b(z);
        }
    }
}
