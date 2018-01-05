package com.google.android.finsky.nestedrecyclerviews;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3763a;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3765b;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3766c;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3767d;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public class NestedChildRecyclerView extends PlayRecyclerView implements C3763a {
    public final List aG;
    public C3766c aH;
    public C3767d aI;
    public boolean aJ;
    public C3765b aK;

    public NestedChildRecyclerView(Context context) {
        this(context, null);
    }

    public NestedChildRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aG = new ArrayList();
        ((C1402b) C3947d.m18649a(C1402b.class)).mo1867a(this);
        setNestedScrollingEnabled(true);
    }

    public final void mo2964u() {
        if (this.aK != null) {
            this.aK.mo3735a(this);
        }
    }

    public void setChildRecyclerViewDelegate(C3765b c3765b) {
        this.aK = c3765b;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.aI == null) {
            this.aI = C3766c.m17912a(this);
            if (this.aI != null) {
                m17905v();
            }
            this.aJ = this.aI == null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.aI == null && this.aJ) {
            this.aJ = false;
            this.aI = C3766c.m17912a(this);
            if (this.aI != null) {
                m17905v();
            } else {
                FinskyLog.m21669e("A NestedChildRecyclerView must be under a ParentRecyclerView in the view hierarchy.", new Object[0]);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.aI != null) {
            this.aI.mo3734a(this);
            this.aI = null;
        }
    }

    private final void m17905v() {
        for (int size = this.aG.size() - 1; size >= 0; size--) {
            ((C3777a) this.aG.get(size)).mo4206a();
        }
    }
}
