package com.google.android.play.layout;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.play.g;
import com.google.android.play.utils.C6452k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PlayRatingBadgeContainer extends FrameLayout {
    public View f32206a;
    public View f32207b;

    public PlayRatingBadgeContainer(Context context) {
        this(context, null);
    }

    public PlayRatingBadgeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32206a = findViewById(g.li_rating);
        this.f32207b = findViewById(g.li_badge);
    }

    public int getBaseline() {
        if (this.f32207b.getVisibility() != 8) {
            return this.f32207b.getBaseline();
        }
        if (this.f32206a.getVisibility() != 8) {
            return this.f32206a.getBaseline();
        }
        return getMeasuredHeight();
    }

    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int measuredWidth;
        int size = MeasureSpec.getSize(i);
        if (this.f32206a.getVisibility() != 8) {
            this.f32206a.measure(0, 0);
            if (this.f32206a.getMeasuredWidth() > size) {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE);
                this.f32206a.measure(makeMeasureSpec, makeMeasureSpec);
            }
            measuredWidth = this.f32206a.getMeasuredWidth();
            makeMeasureSpec = this.f32206a.getMeasuredHeight();
        } else {
            makeMeasureSpec = 0;
            measuredWidth = 0;
        }
        if (this.f32207b.getVisibility() != 8) {
            this.f32207b.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0);
            measuredWidth = Math.max(measuredWidth, this.f32207b.getMeasuredWidth());
            makeMeasureSpec = Math.max(makeMeasureSpec, this.f32207b.getMeasuredHeight());
        }
        setMeasuredDimension(measuredWidth, makeMeasureSpec);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.a.k(this) == 0;
        int width = getWidth();
        if (this.f32206a.getVisibility() != 8) {
            int measuredWidth = this.f32206a.getMeasuredWidth();
            int a = C6452k.m29502a(width, measuredWidth, z2, 0);
            this.f32206a.layout(a, 0, measuredWidth + a, this.f32206a.getMeasuredHeight());
        }
        if (this.f32207b.getVisibility() != 8) {
            measuredWidth = this.f32207b.getMeasuredWidth();
            int a2 = C6452k.m29502a(width, measuredWidth, z2, 0);
            this.f32207b.layout(a2, 0, measuredWidth + a2, this.f32207b.getMeasuredHeight());
        }
    }
}
