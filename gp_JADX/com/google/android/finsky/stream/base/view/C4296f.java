package com.google.android.finsky.stream.base.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.C3146p;

public class C4296f extends BucketRowLayout implements C3146p {
    public boolean f21663a;
    public boolean f21664b;
    public int f21665c;
    public int f21666d;
    public int f21667e;

    public C4296f(Context context) {
        this(context, null);
    }

    public C4296f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setIsFirstRow(boolean z) {
        this.f21663a = z;
    }

    public void setIsLastRow(boolean z) {
        this.f21664b = z;
    }

    public final void m19906a(int i, boolean z) {
        if (z) {
            this.f21665c = i;
        } else {
            this.f21666d = i;
        }
    }

    public void setBottomPadding(int i) {
        this.f21667e = i;
    }

    public final boolean ap_() {
        return this.f21663a;
    }

    public final boolean aq_() {
        return this.f21664b;
    }

    public final int mo4092a(boolean z) {
        return z ? this.f21665c : this.f21666d;
    }

    public int getBottomPadding() {
        return this.f21667e;
    }
}
