package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.adapters.C1174q;
import com.google.android.finsky.adapters.C1176s;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.C2584j;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.layout.HorizontalStrip;
import com.google.android.finsky.layout.ap;
import com.google.android.finsky.layoutswitcher.C1043h;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.p184e.C2629a;
import com.squareup.leakcanary.C7582R;

public class ScreenshotsModuleLayout extends FrameLayout implements C1176s, C2584j, ae, C2621k, C2622l, ap, C1043h, C2629a {
    public C2577b f14048a;
    public C1611k f14049b;
    public C3166e f14050c;
    public HorizontalStrip f14051d;
    public C1174q f14052e;
    public ed f14053f;
    public ee f14054g;

    public ScreenshotsModuleLayout(Context context) {
        super(context);
    }

    public ScreenshotsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        int i;
        super.onFinishInflate();
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1807a(this);
        this.f14051d = (HorizontalStrip) findViewById(C7582R.id.strip);
        Resources resources = getResources();
        boolean k = this.f14049b.m9286k(resources);
        if (k) {
            int i2 = this.f14048a.m13626a(resources, k).f13772a;
            int max = Math.max(i2 - resources.getDimensionPixelSize(C7582R.dimen.screenshots_leading_peek), 0);
            LayoutParams layoutParams = (LayoutParams) findViewById(C7582R.id.strip_background).getLayoutParams();
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            i = max;
        } else {
            i = 0;
        }
        this.f14051d.m17313a(i, resources.getDimensionPixelOffset(C7582R.dimen.screenshots_spacing));
        this.f14050c = new C3166e(this, this);
        this.f14050c.m16126a(500);
    }

    public final void mo3010a(int i) {
        if (this.f14053f != null) {
            this.f14053f.mo3079d(i);
        }
    }

    public final void n_() {
        if (this.f14053f != null) {
            this.f14053f.mo3077b();
        }
    }

    public final void Z_() {
        if (this.f14052e != null) {
            this.f14052e.f7225d.unregisterAll();
        }
        this.f14051d.setAdapter(null);
        this.f14052e = null;
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f14051d.getLeft()) && f < ((float) this.f14051d.getRight()) && f2 >= ((float) this.f14051d.getTop()) && f2 < ((float) this.f14051d.getBottom());
    }

    public final void as_() {
    }

    public int getHorizontalScrollerTop() {
        return this.f14051d.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f14051d.getBottom();
    }

    public final void mo3011c() {
        if (this.f14054g != null) {
            this.f14054g.mo3078c();
        }
    }
}
