package com.google.android.finsky.stream.base.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.C2584j;
import com.google.android.finsky.detailscomponents.C2585k;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.C1418l;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.C4290m;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.android.play.p184e.C2629a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardClusterView extends C3688e implements C0657w, C2584j, C2585k, C1031w, C2621k, C2622l, ad, C2629a {
    public C1461c f18611a;
    public ac f18612b;
    public PlayClusterViewContentV2 f18613c;

    public FlatCardClusterView(Context context) {
        this(context, null);
    }

    public FlatCardClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int[] getImageTypePreference() {
        return C1600a.f8505a;
    }

    public void onFinishInflate() {
        ((C1418l) C3947d.m18649a(C1418l.class)).mo1920a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f18613c = (PlayClusterViewContentV2) findViewById(C7582R.id.cluster_content);
        if (this.f18611a.dj().mo2294a(12632714)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_content_bottom_padding_large_tablet));
        }
    }

    public void Z_() {
        super.Z_();
        this.f18613c.Z_();
    }

    public final void m17486a(int i, String str, String str2, String str3, OnClickListener onClickListener, bd bdVar, CharSequence charSequence, int i2, C1158a c1158a, C1164b c1164b, int i3, int i4, ff ffVar, Bundle bundle, C4290m c4290m) {
        m17480a(i, str, str2, str3, onClickListener, bdVar, charSequence, i2);
        this.f18613c.mo3606i(i4);
        this.f18613c.m17549a(c1158a, c1164b, i3, false, ffVar, bundle, getImageTypePreference(), c4290m);
    }

    public void mo3581a(Bundle bundle) {
        super.mo3581a(bundle);
        this.f18613c.m17547a(bundle);
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f18613c.getLeft()) && f < ((float) this.f18613c.getRight()) && f2 >= ((float) this.f18613c.getTop()) && f2 < ((float) this.f18613c.getBottom());
    }

    public final void as_() {
        this.f18613c.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f18613c.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f18613c.getBottom();
    }

    public final void m_() {
        this.f18613c.m_();
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f18613c.mo1062a(volleyError);
    }

    public void onMeasure(int i, int i2) {
        boolean z = (this.d == null || this.d.getVisibility() == 8) ? false : true;
        if (z) {
            z = this.f18613c.aJ;
            this.d.m17561a(z);
            m17485a(i, i2, true, true);
            boolean z2 = this.f18613c.aJ;
            if (z != z2) {
                this.d.m17561a(z2);
                m17485a(i, i2, true, false);
                return;
            }
            return;
        }
        m17485a(i, i2, false, true);
    }

    private final void m17485a(int i, int i2, boolean z, boolean z2) {
        int measuredHeight;
        if (z) {
            this.d.measure(i, 0);
            measuredHeight = (this.d.getMeasuredHeight() + this.d.getPaddingTop()) + this.d.getPaddingBottom();
        } else {
            measuredHeight = 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f18613c.getLayoutParams();
        if (z2 && marginLayoutParams.height != -1) {
            this.f18613c.measure(i, 0);
        }
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            measuredHeight = MeasureSpec.getSize(i2);
        } else {
            measuredHeight = ((((measuredHeight + getPaddingTop()) + getPaddingBottom()) + marginLayoutParams.topMargin) + this.f18613c.getMeasuredHeight()) + marginLayoutParams.bottomMargin;
        }
        setMeasuredDimension(MeasureSpec.getSize(i), measuredHeight);
        if (marginLayoutParams.height == -1) {
            this.f18613c.measure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.d == null || this.d.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.d.layout(0, paddingTop, width, this.d.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.d.getMeasuredHeight();
        }
        paddingTop = ((MarginLayoutParams) this.f18613c.getLayoutParams()).topMargin + i5;
        this.f18613c.layout(0, paddingTop, width, (this.f18613c.getMeasuredHeight() + paddingTop) + this.f18613c.getPaddingTop());
    }

    public int getMaxItemsPerPage() {
        return this.f18612b.m18477a(getResources());
    }

    public int getMarginOffset() {
        return 0;
    }
}
