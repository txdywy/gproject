package com.google.android.finsky.p106a;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.view.Window;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.m;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.play.search.aj;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;

public final class C0948a implements m, aj {
    public PlayHeaderListLayout f5778a;
    public Window f5779b;
    public final Drawable f5780c = new ColorDrawable(0);
    public final Drawable f5781d;
    public Drawable f5782e;
    public boolean f5783f;
    public boolean f5784g;
    public boolean f5785h;
    public int f5786i;
    public ObjectAnimator f5787j;
    public ObjectAnimator f5788k;

    public C0948a(Window window, PlayHeaderListLayout playHeaderListLayout) {
        this.f5779b = window;
        this.f5778a = playHeaderListLayout;
        Resources resources = playHeaderListLayout.getResources();
        int[] iArr = new int[]{this.f5778a.getResources().getColor(C7582R.color.status_bar_overlay), 0};
        this.f5781d = new C0949b(Orientation.TOP_BOTTOM, iArr, PlaySearchToolbar.a(this.f5778a.getContext()));
        this.f5782e = this.f5781d;
        this.f5786i = resources.getColor(C7582R.color.play_search_overlay_color);
        this.f5783f = this.f5778a.e();
        this.f5785h = this.f5778a.d();
        m5719b();
    }

    public final void m5717a() {
        if (this.f5778a != null) {
            boolean e = this.f5778a.e();
            if (this.f5783f != e) {
                this.f5783f = e;
                m5719b();
            }
            e = this.f5778a.d();
            if (this.f5785h != e) {
                this.f5785h = e;
                if (this.f5784g) {
                    m5716f();
                }
            }
        }
    }

    public final void m5718a(boolean z) {
        if (this.f5784g != z) {
            this.f5784g = z;
            if (!this.f5785h) {
                m5716f();
            }
        }
    }

    public final void m5719b() {
        this.f5782e = this.f5783f ? this.f5780c : this.f5781d;
        m5715a(this.f5782e);
    }

    @TargetApi(21)
    private final void m5716f() {
        if (VERSION.SDK_INT >= 21 && this.f5778a != null) {
            int i;
            int i2 = (!this.f5784g || this.f5785h) ? 0 : 1;
            if (this.f5787j != null) {
                this.f5787j.cancel();
            }
            if (i2 != 0) {
                i = this.f5786i;
            } else {
                i = this.f5778a.getResources().getColor(C7582R.color.status_bar_overlay);
            }
            this.f5787j = ObjectAnimator.ofArgb(this.f5779b, "statusBarColor", new int[]{i});
            this.f5787j.setDuration(300).start();
            if (this.f5788k != null) {
                this.f5788k.cancel();
            }
            i2 = i2 != 0 ? 0 : HprofParser.ROOT_UNKNOWN;
            this.f5788k = ObjectAnimator.ofInt(this.f5781d, "alpha", new int[]{i2});
            this.f5788k.setDuration(300).start();
        }
    }

    public final void m5720c() {
        m5718a(true);
    }

    public final void m5721d() {
        m5718a(false);
    }

    public final void m5722e() {
        m5715a(this.f5780c);
        this.f5779b = null;
        this.f5778a = null;
    }

    private final void m5715a(Drawable drawable) {
        if (this.f5778a != null) {
            this.f5778a.getToolbarContainer().setBackgroundDrawable(drawable);
        }
    }
}
