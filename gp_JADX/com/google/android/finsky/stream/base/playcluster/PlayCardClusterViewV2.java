package com.google.android.finsky.stream.base.playcluster;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.playcard.ad;
import com.google.android.play.p184e.C2629a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardClusterViewV2 extends C2628h implements C0657w, C1031w, ad, C2629a {
    public PlayClusterViewContentV2 f13954c;

    public PlayCardClusterViewV2(Context context) {
        this(context, null);
    }

    public PlayCardClusterViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int[] getImageTypePreference() {
        return C1600a.f8505a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13954c = (PlayClusterViewContentV2) findViewById(C7582R.id.cluster_content);
    }

    public void Z_() {
        super.Z_();
        this.f13954c.Z_();
    }

    public final boolean m13759a(int i) {
        return this.f13954c.mo3606i(i);
    }

    public final void m13757a(C1158a c1158a, C1164b c1164b, int i, ff ffVar, Bundle bundle, com.google.android.finsky.p111d.ad adVar, byte[] bArr, C4290m c4290m) {
        m13752a(bArr, adVar);
        this.f13954c.m17549a(c1158a, c1164b, i, false, ffVar, bundle, getImageTypePreference(), c4290m);
    }

    public String getContentId() {
        return this.f13954c.getChildContentSourceId();
    }

    public final void mo2995a(Bundle bundle) {
        super.mo2995a(bundle);
        this.f13954c.m17547a(bundle);
    }

    public final void as_() {
        this.f13954c.aT = true;
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f13954c.getLeft()) && f < ((float) this.f13954c.getRight()) && f2 >= ((float) this.f13954c.getTop()) && f2 < ((float) this.f13954c.getBottom());
    }

    public int getHorizontalScrollerTop() {
        return this.f13954c.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f13954c.getBottom();
    }

    public final void m_() {
        this.f13954c.m_();
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f13954c.mo1062a(volleyError);
    }

    public void onMeasure(int i, int i2) {
        boolean z = (this.g == null || this.g.getVisibility() == 8) ? false : true;
        if (z) {
            z = this.f13954c.aJ;
            this.g.m19882a(z);
            m13754a(i, i2, true, true);
            boolean z2 = this.f13954c.aJ;
            if (z != z2) {
                this.g.m19882a(z2);
                m13754a(i, i2, true, false);
                return;
            }
            return;
        }
        m13754a(i, i2, false, true);
    }

    private final void m13754a(int i, int i2, boolean z, boolean z2) {
        int measuredHeight;
        if (z) {
            this.g.measure(i, 0);
            measuredHeight = this.g.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f13954c.getLayoutParams();
        if (z2 && marginLayoutParams.height != -1) {
            this.f13954c.measure(i, 0);
        }
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            measuredHeight = MeasureSpec.getSize(i2);
        } else {
            measuredHeight = ((((measuredHeight + getPaddingTop()) + getPaddingBottom()) + marginLayoutParams.topMargin) + this.f13954c.getMeasuredHeight()) + marginLayoutParams.bottomMargin;
        }
        setMeasuredDimension(MeasureSpec.getSize(i), measuredHeight);
        if (marginLayoutParams.height == -1) {
            this.f13954c.measure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.g == null || this.g.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.g.layout(0, paddingTop, width, this.g.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.g.getMeasuredHeight();
        }
        paddingTop = ((MarginLayoutParams) this.f13954c.getLayoutParams()).topMargin + i5;
        this.f13954c.layout(0, paddingTop, width, this.f13954c.getMeasuredHeight() + paddingTop);
    }
}
