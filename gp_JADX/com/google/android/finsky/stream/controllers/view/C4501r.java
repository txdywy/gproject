package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.C4290m;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class C4501r extends PlayCardClusterViewV2 {
    public C1164b f22933v;

    public C4501r(Context context) {
        super(context);
    }

    public C4501r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void mo4235a(C1158a c1158a, C2720j c2720j, int i, ad adVar, Bundle bundle, ff ffVar, C1164b c1164b, int i2, C4290m c4290m) {
        this.f22933v = c1164b;
        m13757a(c1158a, c1164b, i, ffVar, bundle, adVar, c2720j.f14908a.f14885a.f12087D, c4290m);
        this.c.mo3606i(i2);
    }

    protected void onMeasure(int i, int i2) {
        int a = (this.f22933v.mo1491a(this.f22933v.mo1492a(MeasureSpec.getSize(i), MeasureSpec.getSize(i2)), 0.0f) + getPaddingTop()) + getPaddingBottom();
        int i3 = (this.g == null || this.g.getVisibility() == 8) ? 0 : 1;
        if (i3 != 0) {
            this.g.measure(i, 0);
            a += this.g.getMeasuredHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(a, MemoryMappedFileBuffer.DEFAULT_SIZE));
    }
}
