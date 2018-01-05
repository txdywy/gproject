package com.google.android.finsky.stream.controllers.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.finsky.stream.base.playcluster.C4281c;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewContent;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardRateAndSuggestContentScroller extends ViewGroup {
    public PlayCardClusterViewContent f23027a;
    public boolean f23028b;
    public final Handler f23029c;

    public PlayCardRateAndSuggestContentScroller(Context context) {
        this(context, null);
    }

    public PlayCardRateAndSuggestContentScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23029c = new Handler(Looper.myLooper());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f23027a = (PlayCardClusterViewContent) findViewById(C7582R.id.cluster_content);
    }

    public final void m21045a() {
        if (this.f23027a.getCardChildCount() != 0) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "scrollX", new int[]{this.f23027a.m19876b(0).getWidth()});
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(200);
            ofInt.start();
            this.f23027a.m19876b(0).animate().alpha(0.0f);
        }
    }

    public final void m21046b() {
        this.f23028b = true;
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        C4281c metadata = this.f23027a.getMetadata();
        if (metadata == null) {
            super.onMeasure(i, i2);
            return;
        }
        int cardContentHorizontalPadding = this.f23027a.getCardContentHorizontalPadding() * 2;
        int size = MeasureSpec.getSize(i) - cardContentHorizontalPadding;
        this.f23027a.measure(MeasureSpec.makeMeasureSpec(((int) (((float) metadata.f21626a) * (((float) size) / ((float) metadata.f21628c)))) + cardContentHorizontalPadding, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        setMeasuredDimension(size, this.f23027a.getMeasuredHeight());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int measuredWidth = this.f23027a.getMeasuredWidth();
        int a = k.a(width, measuredWidth, z2, 0);
        this.f23027a.layout(a, 0, measuredWidth + a, this.f23027a.getMeasuredHeight());
        if (this.f23028b) {
            this.f23028b = false;
            this.f23029c.post(new ad(this));
        }
    }
}
