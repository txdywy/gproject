package com.google.android.finsky.stream.base.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.C3075q;
import com.squareup.leakcanary.C7582R;

public class C4298h extends C4296f implements C3075q {
    public int f21670g;
    public int f21671h;

    public C4298h(Context context) {
        this(context, null);
    }

    public C4298h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21671h = context.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    public void setDividerSize(int i) {
        this.f21670g = i;
    }

    public int getDividerSize() {
        return this.f21670g;
    }

    public int getSectionBottomSpacerSize() {
        return this.f21671h;
    }
}
