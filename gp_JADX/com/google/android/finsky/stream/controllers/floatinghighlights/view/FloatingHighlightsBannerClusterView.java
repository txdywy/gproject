package com.google.android.finsky.stream.controllers.floatinghighlights.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4269h;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4275j;
import com.google.android.finsky.stream.base.horizontalclusters.view.HorizontalClusterRecyclerView;
import com.google.android.play.p184e.C2629a;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class FloatingHighlightsBannerClusterView extends RelativeLayout implements ad, ae, C4269h, C4275j, C2629a {
    public C1611k f22315a;
    public HorizontalClusterRecyclerView f22316b;
    public C4393f f22317c;
    public int f22318d;
    public C4400c f22319e;
    public TextView f22320f;
    public int f22321g;
    public final ce f22322h;
    public ad f22323i;

    public FloatingHighlightsBannerClusterView(Context context) {
        this(context, null);
    }

    public FloatingHighlightsBannerClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22321g = 474;
        this.f22322h = C2482j.m13283a(this.f22321g);
    }

    protected void onFinishInflate() {
        ((C1430k) C3947d.m18649a(C1430k.class)).mo1931a(this);
        super.onFinishInflate();
        this.f22316b = (HorizontalClusterRecyclerView) findViewById(C7582R.id.cluster_content);
        this.f22320f = new TextView(getContext());
        this.f22320f.setLayoutParams(new LayoutParams(-2, -2));
        this.f22320f.setMaxLines(Integer.MAX_VALUE);
    }

    public final void m20605a(Bundle bundle) {
        this.f22316b.m19812a(bundle);
    }

    public static int m20602a(TextView textView, int i, float f, float f2, float f3, float f4, float f5, float f6, List list) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i, MemoryMappedFileBuffer.DEFAULT_SIZE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = 0;
        for (C4402e c4402e : list) {
            int i3;
            textView.setTextSize(0, f);
            textView.setText(c4402e.f22346a);
            textView.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredHeight = textView.getMeasuredHeight();
            CharSequence charSequence = c4402e.f22347b;
            if (TextUtils.isEmpty(charSequence)) {
                i3 = measuredHeight;
            } else {
                float f7;
                textView.setTextSize(0, f2);
                textView.setText(charSequence);
                textView.measure(makeMeasureSpec, makeMeasureSpec2);
                int measuredHeight2 = textView.getMeasuredHeight() + measuredHeight;
                i3 = c4402e.f22348c;
                if (i3 == 2) {
                    f7 = ((2.0f * f4) + f3) + (2.0f * f5);
                } else if (i3 == 1 || i3 == 3) {
                    f7 = f6;
                } else {
                    f7 = 0.0f;
                }
                i3 = ((int) f7) + measuredHeight2;
            }
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f22316b.getLeft()) && f < ((float) this.f22316b.getRight()) && f2 >= ((float) this.f22316b.getTop()) && f2 < ((float) this.f22316b.getBottom());
    }

    public final void as_() {
        this.f22316b.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f22316b.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f22316b.getBottom();
    }

    public final int mo4085a(int i) {
        return this.f22318d;
    }

    public final void mo4190c() {
        this.f22317c.mo4187a(this);
    }

    public final int mo4084a() {
        throw new IllegalStateException("Not supported with this cluster");
    }

    public ce getPlayStoreUiElement() {
        return this.f22322h;
    }

    public ad getParentNode() {
        return this.f22323i;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void Z_() {
        this.f22317c = null;
        this.f22323i = null;
        this.f22316b.Z_();
    }
}
