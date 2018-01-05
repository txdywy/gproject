package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.support.v7.widget.fe;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ah;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.google.android.finsky.stream.controllers.ca;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardMerchClusterView extends FlatCardClusterView {
    public C1612l f22876j;
    public FadingEdgeImageView f22877k;
    public boolean f22878l;
    public View f22879m;
    public int f22880n;
    public final int f22881o;
    public fe f22882p;
    public int f22883q;
    public float f22884r;

    public FlatCardMerchClusterView(Context context) {
        this(context, null);
    }

    public FlatCardMerchClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22883q = 2;
        this.f22881o = C0216d.m1116c(context, C7582R.color.play_multi_primary);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1949a(this);
        super.onFinishInflate();
        this.f22877k = (FadingEdgeImageView) findViewById(C7582R.id.merch_image);
        this.f22879m = findViewById(C7582R.id.gradient_overlay);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f22878l) {
            int measuredHeight = getMeasuredHeight();
            this.f22877k.measure(MeasureSpec.makeMeasureSpec((int) (((float) measuredHeight) * 1.3333334f), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
            this.f22879m.measure(MeasureSpec.makeMeasureSpec((int) ((((float) this.c.getDefaultChildCardWidth()) * this.c.getPrimaryAspectRatio()) * 1.7f), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE));
            return;
        }
        measuredHeight = this.c.getLeadingGapForSnapping() - this.c.getContentHorizontalPadding();
        this.f22877k.measure(MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((int) (((float) measuredHeight) / 1.3333334f), MemoryMappedFileBuffer.DEFAULT_SIZE));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int i6 = 0;
        super.onLayout(z, i, i2, i3, i4);
        int k = ai.f1848a.mo400k(this);
        int i7 = k == 0 ? 1 : 0;
        this.f22877k.setScaleX(i7 != 0 ? 1.0f : -1.0f);
        if (i7 != 0) {
            measuredWidth = this.f22877k.getMeasuredWidth() + 0;
            i5 = 0;
        } else {
            measuredWidth = i3 - i;
            i5 = measuredWidth - this.f22877k.getMeasuredWidth();
        }
        if (this.f22878l) {
            int measuredWidth2;
            int i8;
            int measuredHeight = this.f22877k.getMeasuredHeight();
            if (i7 != 0) {
                measuredWidth2 = measuredWidth - this.f22879m.getMeasuredWidth();
                i8 = measuredWidth;
            } else {
                i8 = this.f22879m.getMeasuredWidth() + i5;
                measuredWidth2 = i5;
            }
            this.f22879m.layout(measuredWidth2, 0, i8, measuredHeight);
            if (this.f22883q != k) {
                this.f22883q = k;
                ah.m9227a(this.f22879m, new GradientDrawable(i7 != 0 ? Orientation.LEFT_RIGHT : Orientation.RIGHT_LEFT, new int[]{0, this.f22880n}));
            }
            i7 = measuredHeight;
        } else {
            i7 = i4 - i2;
            i6 = i7 - this.f22877k.getMeasuredHeight();
        }
        this.f22877k.layout(i5, i6, measuredWidth, i7);
    }

    public final void m21000a(boolean z) {
        float f = (-(((float) this.c.getLeadingGapForSnapping()) * this.f22884r)) * 0.15f;
        if (ai.f1848a.mo400k(this) == 1) {
            f = -f;
        }
        this.f22877k.setTranslationX((float) Math.ceil((double) f));
        this.f22879m.setTranslationX((float) Math.ceil((double) f));
        if (z) {
            f = 0.85f;
        } else {
            f = 1.1f;
        }
        this.f22877k.setAlpha(1.0f - (f * this.f22884r));
    }

    public final void Z_() {
        super.Z_();
        this.f22877k.a();
        this.c.mo2952b(this.f22882p);
    }

    public final void mo3581a(Bundle bundle) {
        super.mo3581a(bundle);
        bundle.putFloat("FlatCardMerchClusterView.interpolationAmount", this.f22884r);
    }

    protected int getPlayStoreUiElementType() {
        return 407;
    }
}
