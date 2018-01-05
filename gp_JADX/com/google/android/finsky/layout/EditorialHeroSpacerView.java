package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.utils.k;

public class EditorialHeroSpacerView extends View {
    public boolean f18160a;
    public float f18161b;

    public EditorialHeroSpacerView(Context context) {
        this(context, null);
    }

    public EditorialHeroSpacerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1862a(this);
        super.onFinishInflate();
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int a = C2581g.m13635a(getContext(), size, this.f18160a, this.f18161b, C1611k.m9272n(getContext().getResources()));
        if (InsetsFrameLayout.f14024a) {
            a -= k.e(getContext());
        }
        setMeasuredDimension(size, a);
    }
}
