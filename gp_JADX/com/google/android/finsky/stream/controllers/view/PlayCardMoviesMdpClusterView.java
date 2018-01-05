package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.playcard.PlayCardMoviesMdpView;
import com.google.android.finsky.stream.base.playcluster.C2628h;
import com.squareup.leakcanary.C7582R;

public class PlayCardMoviesMdpClusterView extends C2628h {
    public PlayCardMoviesMdpView f23013a;

    public PlayCardMoviesMdpClusterView(Context context) {
        this(context, null);
    }

    public PlayCardMoviesMdpClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f23013a = (PlayCardMoviesMdpView) findViewById(C7582R.id.play_card);
    }

    protected int getPlayStoreUiElementType() {
        return 432;
    }

    public final void Z_() {
        super.Z_();
        PlayCardMoviesMdpView playCardMoviesMdpView = this.f23013a;
        if (playCardMoviesMdpView.f19456h != null) {
            playCardMoviesMdpView.f19456h.m5955a();
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.g == null || this.g.getVisibility() == 8) {
            i3 = 0;
        } else {
            this.g.measure(i, 0);
            i3 = this.g.getMeasuredHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f23013a.getLayoutParams();
        setMeasuredDimension(MeasureSpec.getSize(i), marginLayoutParams.bottomMargin + ((((i3 + getPaddingTop()) + getPaddingBottom()) + marginLayoutParams.topMargin) + this.f23013a.getMeasuredHeight()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        if (this.g != null) {
            if (this.g.getVisibility() == 0) {
                this.g.layout(0, paddingTop, getWidth(), this.g.getMeasuredHeight() + paddingTop);
            }
            if (this.g.getVisibility() != 8) {
                measuredHeight = paddingTop + this.g.getMeasuredHeight();
                paddingTop = ((MarginLayoutParams) this.f23013a.getLayoutParams()).topMargin + measuredHeight;
                this.f23013a.layout(paddingLeft, paddingTop, this.f23013a.getMeasuredWidth() + paddingLeft, this.f23013a.getMeasuredHeight() + paddingTop);
            }
        }
        measuredHeight = paddingTop;
        paddingTop = ((MarginLayoutParams) this.f23013a.getLayoutParams()).topMargin + measuredHeight;
        this.f23013a.layout(paddingLeft, paddingTop, this.f23013a.getMeasuredWidth() + paddingLeft, this.f23013a.getMeasuredHeight() + paddingTop);
    }
}
