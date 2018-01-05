package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardMerchClusterViewV2 extends PlayCardClusterViewV2 implements be {
    public C1612l f23006a;
    public final int f23007b;
    public final int f23008d;
    public View f23009l;
    public FadingEdgeImageView f23010m;
    public int f23011n;
    public final int f23012o;

    public PlayCardMerchClusterViewV2(Context context) {
        this(context, null);
    }

    public PlayCardMerchClusterViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f23007b = resources.getDimensionPixelSize(C7582R.dimen.play_merch_content_vmargin);
        this.f23008d = resources.getDimensionPixelSize(C7582R.dimen.play_merch_content_vpadding);
        this.f23012o = context.getResources().getColor(C7582R.color.play_multi_primary);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1956a(this);
        super.onFinishInflate();
        this.f23009l = findViewById(C7582R.id.merch_fill);
        this.f23010m = (FadingEdgeImageView) findViewById(C7582R.id.merch_image);
    }

    protected int getPlayStoreUiElementType() {
        return 407;
    }

    public final void m21033c() {
        this.f23010m.m16022a(false, true, this.f23010m.getMeasuredWidth() / 4, this.f23011n);
    }

    public final void m21032a(FifeImageView fifeImageView, Bitmap bitmap) {
        m21033c();
    }

    public final void m21031a(FifeImageView fifeImageView) {
    }

    public final void Z_() {
        super.Z_();
        this.f23010m.a();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.g == null || this.g.getVisibility() == 8) {
            i3 = paddingTop;
        } else {
            this.g.measure(i, 0);
            i3 = paddingTop + this.g.getMeasuredHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.c.getLayoutParams();
        this.c.measure(i, 0);
        if (this.f23010m.getVisibility() != 8) {
            paddingTop = this.c.getMeasuredHeight() + (this.f23008d * 2);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(paddingTop, MemoryMappedFileBuffer.DEFAULT_SIZE);
            this.f23009l.measure(i, makeMeasureSpec);
            this.f23010m.measure(MeasureSpec.makeMeasureSpec((int) (1.7777778f * ((float) paddingTop)), MemoryMappedFileBuffer.DEFAULT_SIZE), makeMeasureSpec);
            if (this.f23010m.c()) {
                m21033c();
            } else {
                this.f23010m.m16023b();
            }
            paddingTop = (paddingTop + (this.f23007b * 2)) + i3;
        } else {
            paddingTop = (marginLayoutParams.bottomMargin + (marginLayoutParams.topMargin + this.c.getMeasuredHeight())) + i3;
        }
        setMeasuredDimension(size, paddingTop);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int paddingTop = getPaddingTop();
        if (!(this.g == null || this.g.getVisibility() == 8)) {
            this.g.layout(0, paddingTop, width, this.g.getMeasuredHeight() + paddingTop);
            paddingTop += this.g.getMeasuredHeight();
        }
        if (this.f23010m.getVisibility() != 8) {
            paddingTop += this.f23007b;
            this.f23009l.layout(0, paddingTop, width, this.f23009l.getMeasuredHeight() + paddingTop);
            int measuredWidth = this.f23010m.getMeasuredWidth();
            int measuredHeight = this.f23010m.getMeasuredHeight();
            if (measuredWidth > 0) {
                height = (this.c.mo3605g(width, height) / 2) - ((measuredHeight * 3) / 4);
                this.f23010m.layout(height, paddingTop, measuredWidth + height, measuredHeight + paddingTop);
            } else {
                this.f23010m.layout(0, paddingTop, measuredWidth, measuredHeight + paddingTop);
            }
            paddingTop += this.f23008d;
        }
        this.c.layout(0, paddingTop, width, this.c.getMeasuredHeight() + paddingTop);
    }
}
