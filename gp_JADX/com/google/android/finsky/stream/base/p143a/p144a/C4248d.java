package com.google.android.finsky.stream.base.p143a.p144a;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.ab;
import com.google.android.finsky.bg.ac;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class C4248d extends PlayRecyclerView implements ac, ad, ae, C2621k, C2622l {
    public C1611k aG;
    public ce aH;
    public ad aI;
    public Bundle aJ;
    public boolean aK;
    public ab aL;
    public int aM;

    public C4248d(Context context) {
        this(context, null);
    }

    public abstract int getPlayStoreUiElementType();

    public C4248d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutManager(new LinearLayoutManager(0, false));
    }

    public void onFinishInflate() {
        ((C1416f) C3947d.m18649a(C1416f.class)).mo1913a(this);
        super.onFinishInflate();
        this.aM = this.aG.m9275a(getResources());
        this.aM -= getResources().getDimensionPixelSize(C7582R.dimen.quicklinks_pill_padding);
        setPadding(this.aM, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        mo2964u();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!mo2965v()) {
            return;
        }
        if (this.aJ == null || !(this.aJ == null || this.aK)) {
            this.aL.m9204a(this, this.aM, getMeasuredWidth());
            measureChildren(i, i2);
            Bundle bundle = this.aJ;
            if (bundle != null) {
                this.aK = true;
                post(new C4249e(this, bundle));
            }
        }
    }

    public void mo2964u() {
        if (this.aL == null) {
            this.aL = new ab(false, 0, 0, 0);
        }
    }

    public final void m19714a(byte[] bArr, ad adVar) {
        if (this.aH == null) {
            this.aH = C2482j.m13283a(getPlayStoreUiElementType());
            C2482j.m13285a(this.aH, bArr);
        }
        this.aI = adVar;
        if (this.aI != null) {
            this.aI.mo1219a(this);
        }
    }

    public final void m19713a(Bundle bundle) {
        this.aK = false;
        bundle.putParcelable("PlayLinksBannerRecyclerBaseView.scrollPosition", ((LinearLayoutManager) getLayoutManager()).mo742d());
    }

    public void Z_() {
        this.aI = null;
        C2482j.m13285a(this.aH, null);
    }

    public boolean mo2965v() {
        return true;
    }

    public int getPeekableChildCount() {
        return getChildCount();
    }

    public final int mo3019a(int i) {
        return ((C4245a) getChildAt(i)).getOriginalWidth();
    }

    public final void mo3020a(int i, int i2) {
        ((C4245a) getChildAt(i)).setAdditionalWidth(i2);
    }

    public final void a_(int i, int i2) {
        setPadding(i, getPaddingTop(), i2, getPaddingBottom());
    }

    public final int mo3022b(int i) {
        return ai.f1848a.mo401l(getChildAt(i));
    }

    public final void bX_() {
    }

    public final boolean mo3023b() {
        return true;
    }
}
