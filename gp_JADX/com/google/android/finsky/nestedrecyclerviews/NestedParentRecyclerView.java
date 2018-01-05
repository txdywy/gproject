package com.google.android.finsky.nestedrecyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.finsky.nestedrecyclerviews.p115a.C1062m;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3763a;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3764n;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3766c;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3769f;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3772o;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3773i;
import com.google.android.finsky.nestedrecyclerviews.p115a.C3776k;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;

public class NestedParentRecyclerView extends PlayRecyclerView implements C3764n {
    public C3766c aG;
    public C3772o aH;

    public NestedParentRecyclerView(Context context) {
        this(context, null);
    }

    public NestedParentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C1402b) C3947d.m18649a(C1402b.class)).mo1868a(this);
        if (!(this instanceof RecyclerView)) {
            FinskyLog.m21669e("The passed argument must be a RecyclerView", new Object[0]);
        }
        if (!(this instanceof C3764n)) {
            FinskyLog.m21669e("The passed argument must implement ParentRecyclerView", new Object[0]);
        }
        C3769f c3769f = new C3769f(this);
        setRecyclerViewDelegate(new C3776k(c3769f));
        setParentRecyclerViewDelegate(new C3773i(c3769f));
    }

    public void setParentChildScrollOffset(int i) {
        if (this.aH != null) {
            this.aH.mo3738a(i);
        }
    }

    public final void m17909a(C1062m c1062m) {
        if (this.aH != null) {
            this.aH.mo3739a(c1062m);
        }
    }

    public final void m17910b(C1062m c1062m) {
        if (this.aH != null) {
            this.aH.mo3741b(c1062m);
        }
    }

    public void setParentRecyclerViewDelegate(C3772o c3772o) {
        this.aH = c3772o;
    }

    public final C3769f mo3732a(C3763a c3763a) {
        if (this.aH != null) {
            return this.aH.mo3737a(c3763a);
        }
        return null;
    }
}
