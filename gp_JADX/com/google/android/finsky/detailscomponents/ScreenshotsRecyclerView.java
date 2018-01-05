package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v7.widget.ew;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C2575b;
import com.squareup.leakcanary.C7582R;

public class ScreenshotsRecyclerView extends C2575b {
    public C1612l aG;
    public C2577b aH;
    public C2593t aI;
    public int aJ;

    public ScreenshotsRecyclerView(Context context) {
        this(context, null);
    }

    public ScreenshotsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ew c2590p = new C2590p(this, ai.f1848a.mo400k(this) == 1);
        c2590p.f2950F = context.obtainStyledAttributes(attributeSet, C0629a.ScreenshotsRecyclerView).getBoolean(0, true);
        setLayoutManager(c2590p);
    }

    public final void m13618a(C2595v c2595v, C1058q c1058q, ad adVar) {
        this.aJ = c2595v.f13819f;
        if (this.aI == null) {
            this.aI = new C2593t(this, c2595v.f13814a, c2595v.f13815b, c2595v.f13816c, c2595v.f13817d, c2595v.f13818e, adVar, c1058q, this.aH, this.aG);
            setAdapter(this.aI);
        } else {
            C2593t c2593t = this.aI;
            c2593t.f13802e = c2595v.f13814a;
            c2593t.f13803f = c2595v.f13815b;
            c2593t.f13804g = c2595v.f13816c;
            c2593t.f13805h = c2595v.f13817d;
            c2593t.f13801d.clear();
            c2593t.f13801d.addAll(c2595v.f13818e);
            c2593t.f13806i = adVar;
            c2593t.f13807j = c1058q;
            this.aI.f3433a.m3638b();
        }
        if (getHeight() == 0 && VERSION.SDK_INT <= 16) {
            C2589o c2589o = new C2589o(this, this);
        }
    }

    protected int getTrailingSpacerCount() {
        return this.aI.mo1039a() < 2 ? 0 : 1;
    }

    protected int getLeadingSpacerCount() {
        return 0;
    }

    protected void onFinishInflate() {
        ((C1375d) C3947d.m18649a(C1375d.class)).mo1804a(this);
        super.onFinishInflate();
    }

    public int getHeightId() {
        C2593t c2593t = this.aI;
        if (!c2593t.f13811n) {
            return C7582R.dimen.screenshots_height;
        }
        if (c2593t.f13810m) {
            return C7582R.dimen.screenshots_height_portrait;
        }
        return C7582R.dimen.screenshots_height_mixed;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getLayoutManager().mo745e()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
