package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.p037h.C0320p;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewListingSmall extends C3894u implements cn {
    public TextView f19375c;
    public TextView f19376d;
    public View f19377e;
    public TextView f19378f;

    public FlatCardViewListingSmall(Context context) {
        this(context, null);
    }

    public FlatCardViewListingSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19375c = (TextView) findViewById(C7582R.id.li_alternate_format);
        this.f19376d = (TextView) findViewById(C7582R.id.li_app_download_size);
        this.f19377e = findViewById(C7582R.id.details_section);
        this.f19378f = (TextView) findViewById(C7582R.id.li_format);
        Resources resources = getResources();
        if (this.q.dj().mo2294a(12630160) && resources.getBoolean(C7582R.bool.flat_use_extended_margin_listing)) {
            ((MarginLayoutParams) this.f19377e.getLayoutParams()).bottomMargin = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_extended_inner_margin);
        }
        if (this.q.dj().mo2294a(12631771)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.ah.getLayoutParams();
            C0361r.m2052b(marginLayoutParams, resources.getDimensionPixelSize(C7582R.dimen.flat_listing_label_margin_large));
            this.ah.setLayoutParams(marginLayoutParams);
        }
    }

    public final void mo3836a(CharSequence charSequence) {
        this.f19376d.setVisibility(0);
        this.f19376d.setText(charSequence);
    }

    public final void ar_() {
        this.f19376d.setVisibility(8);
    }

    public final void mo3837a(boolean z) {
    }

    public final boolean mo3839b(boolean z) {
        return true;
    }

    protected final C0320p mo3841b(int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5 = 0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.ah.measure(MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), makeMeasureSpec);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.af.getLayoutParams();
        int i6 = i2 + (marginLayoutParams.rightMargin + (marginLayoutParams.leftMargin + marginLayoutParams.width));
        if (this.ah.getVisibility() != 8) {
            measuredWidth = this.ah.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (this.f19375c.getVisibility() != 8) {
            this.f19375c.measure(i, makeMeasureSpec);
            i5 = this.f19375c.getMeasuredWidth();
        }
        this.f19377e.measure(MeasureSpec.makeMeasureSpec(i6 - Math.max(measuredWidth, i5), Integer.MIN_VALUE), makeMeasureSpec);
        i5 = Math.max(i3, this.f19377e.getMeasuredWidth());
        measuredWidth = this.ah.getBaseline() + i4;
        if (this.ac.getVisibility() != 8) {
            this.ac.measure(i, makeMeasureSpec);
            i5 = Math.max(i5, this.ac.getMeasuredWidth());
            measuredWidth += this.ac.getMeasuredHeight();
        }
        if (this.f19378f.getVisibility() != 8) {
            this.f19378f.measure(i, makeMeasureSpec);
            i5 = Math.max(i5, this.f19378f.getMeasuredWidth());
            measuredWidth += this.f19378f.getMeasuredHeight();
        }
        if (this.aa.getVisibility() != 8) {
            this.aa.measure(i, makeMeasureSpec);
            i5 = Math.max(i5, this.aa.getMeasuredWidth());
            i6 = this.aa.getMeasuredHeight() + measuredWidth;
            marginLayoutParams = (MarginLayoutParams) this.aa.getLayoutParams();
            measuredWidth = (marginLayoutParams.bottomMargin + marginLayoutParams.topMargin) + i6;
        }
        if (this.ak.getVisibility() != 8) {
            this.ak.measure(i, makeMeasureSpec);
            i5 = Math.max(i5, this.ak.getMeasuredWidth());
            measuredWidth += this.ak.getMeasuredHeight();
        }
        if (this.f19375c.getVisibility() != 8) {
            measuredWidth += this.f19375c.getMeasuredHeight();
        }
        return new C0320p(Integer.valueOf(i5), Integer.valueOf(measuredWidth));
    }

    protected final void mo3840a(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        int i7;
        int i8 = i4 - i2;
        int i9 = z ? i3 - i : 0;
        int m = ai.f1848a.mo402m(this);
        int paddingBottom = getPaddingBottom();
        if (this.ac.getVisibility() != 8) {
            int measuredHeight = i6 + this.ac.getMeasuredHeight();
            m18416a(this.ac, i6, measuredHeight, i5, i5 + i_(this.ac.getMeasuredWidth()));
            i7 = measuredHeight;
        } else {
            i7 = i6;
        }
        if (this.f19378f.getVisibility() != 8) {
            measuredHeight = i7 + this.f19378f.getMeasuredHeight();
            m18416a(this.f19378f, i7, measuredHeight, i5, i5 + i_(this.f19378f.getMeasuredWidth()));
        } else {
            measuredHeight = i7;
        }
        if (this.aa.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.aa.getLayoutParams();
            i7 = measuredHeight + marginLayoutParams.topMargin;
            measuredHeight = i7 + this.aa.getMeasuredHeight();
            m18416a(this.aa, i7, measuredHeight, i5, i5 + i_(this.aa.getMeasuredWidth()));
            i7 = measuredHeight + marginLayoutParams.bottomMargin;
        } else {
            i7 = measuredHeight;
        }
        if (this.ak.getVisibility() != 8) {
            m18416a(this.ak, i7, i7 + this.ak.getMeasuredHeight(), i5, i5 + i_(this.ak.getMeasuredWidth()));
        }
        i8 = (i8 - paddingBottom) - ((MarginLayoutParams) this.U.getLayoutParams()).bottomMargin;
        i7 = i8 - this.ah.getBaseline();
        m18416a(this.f19377e, i7, i7 + this.f19377e.getMeasuredHeight(), i5, i5 + i_(this.f19377e.getMeasuredWidth()));
        int i_ = i9 - i_(C0361r.m2051b((MarginLayoutParams) this.ah.getLayoutParams()) + m);
        int i10 = 0;
        if (this.f19375c.getVisibility() != 8) {
            int measuredHeight2 = this.f19375c.getMeasuredHeight();
            i7 = i8 - this.f19375c.getBaseline();
            m18416a(this.f19375c, i7, i7 + measuredHeight2, i_ - i_(this.f19375c.getMeasuredWidth()), i_);
            i10 = measuredHeight2;
        }
        i7 = (i8 - this.ah.getBaseline()) - i10;
        m18416a(this.ah, i7, i7 + this.ah.getMeasuredHeight(), i_ - i_(this.ah.getMeasuredWidth()), i_);
    }

    public int getCardType() {
        return 32;
    }

    public final void m18423b(CharSequence charSequence) {
        this.f19375c.setText(charSequence);
        this.f19375c.setVisibility(0);
    }

    public final void m18418a() {
        this.f19375c.setVisibility(8);
    }

    public final void m18425c(CharSequence charSequence) {
        this.f19378f.setText(charSequence);
        this.f19378f.setVisibility(0);
    }
}
