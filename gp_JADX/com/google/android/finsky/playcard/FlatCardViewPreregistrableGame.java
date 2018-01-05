package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.p037h.C0320p;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewPreregistrableGame extends C3894u {
    public TextView f19398c;
    public boolean f19399d;
    public ImageView f19400e;
    public Tooltip f19401f;
    public boolean f19402g;

    public FlatCardViewPreregistrableGame(Context context) {
        this(context, null);
    }

    public FlatCardViewPreregistrableGame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19399d = false;
        this.f19402g = false;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19398c = (TextView) findViewById(C7582R.id.li_category);
        this.f19400e = (ImageView) findViewById(C7582R.id.li_prereg_rewards_gift_box);
        this.f19401f = (Tooltip) findViewById(C7582R.id.tooltip);
    }

    public int getCardType() {
        return 42;
    }

    public void setPreregGiftBoxEnabled(boolean z) {
        if (z != this.f19399d) {
            this.f19399d = z;
            if (this.f19400e != null) {
                this.f19400e.setVisibility(this.f19399d ? 0 : 8);
            }
        }
    }

    public void setTooltipEnabled(ct ctVar) {
        if (this.f19400e == null || this.f19400e.getVisibility() == 8 || this.f19402g) {
            this.f19401f.setVisibility(8);
            return;
        }
        this.f19402g = true;
        this.f19401f.setAnchorView(this.f19400e);
        this.f19401f.setVisibility(4);
        this.f19401f.setTooltipText(getContext().getString(C7582R.string.preregistration_rewards_tooltip_text));
        Tooltip tooltip = this.f19401f;
        if (tooltip.f19536a) {
            View findViewById = tooltip.findViewById(C7582R.id.tooltip_close_button);
            findViewById.setOnClickListener(new cq(tooltip));
            findViewById.setVisibility(0);
        }
        this.f19401f.setTooltipDismissListener(ctVar);
        OnScrollChangedListener onScrollChangedListener = this.f19401f;
        if (ai.f1848a.mo409s(onScrollChangedListener.f19537b)) {
            onScrollChangedListener.m18470a();
        } else {
            onScrollChangedListener.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    protected final C0320p mo3841b(int i, int i2, int i3, int i4) {
        if (this.f19400e.getVisibility() != 8) {
            LayoutParams layoutParams = this.f19400e.getLayoutParams();
            this.f19400e.measure(MeasureSpec.makeMeasureSpec(layoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(layoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            if (this.f19401f.getVisibility() != 8) {
                this.f19401f.measure(MeasureSpec.makeMeasureSpec(this.f19401f.getCloseButtonSizeAndMargin() + i2, Integer.MIN_VALUE), 0);
            }
        }
        this.f19398c.measure(i, 0);
        return new C0320p(Integer.valueOf(Math.max(i3, this.f19398c.getMeasuredWidth())), Integer.valueOf(this.f19398c.getMeasuredHeight() + i4));
    }

    protected final void mo3840a(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        int i7 = i4 - i2;
        int i8 = z ? i3 - i : 0;
        int m = ai.f1848a.mo402m(this);
        int paddingBottom = (i7 - getPaddingBottom()) - ((MarginLayoutParams) this.U.getLayoutParams()).bottomMargin;
        int baseline = paddingBottom - this.f19398c.getBaseline();
        m18416a(this.f19398c, baseline, baseline + this.f19398c.getMeasuredHeight(), i5, i5 + i_(this.f19398c.getMeasuredWidth()));
        if (this.f19400e.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f19400e.getLayoutParams();
            i7 = this.f19400e.getMeasuredHeight();
            baseline = (paddingBottom - i7) - marginLayoutParams.bottomMargin;
            int i_ = i8 - i_(C0361r.m2051b(marginLayoutParams) + m);
            int i_2 = i_ - i_(this.f19400e.getMeasuredWidth());
            m18416a(this.f19400e, baseline, baseline + i7, i_2, i_);
            if (this.f19401f.getVisibility() != 8) {
                m18416a(this.f19401f, paddingBottom - this.f19401f.getMeasuredHeight(), paddingBottom, i_2 - i_(this.f19401f.getMeasuredWidth()), i_2);
            }
        }
    }
}
