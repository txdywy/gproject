package com.google.android.finsky.playcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewReEngagement extends C3893r implements ad {
    public TextView f19403a;
    public Drawable f19404b = m18405c(false);
    public FifeImageView f19405c;
    public ad f19406d;
    public C1612l f19407e;

    public FlatCardViewReEngagement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1879a(this);
        super.onFinishInflate();
        this.f19405c = (FifeImageView) findViewById(C7582R.id.cover_image);
        this.af.setImageDrawable(this.f19404b);
        this.f19403a = (TextView) findViewById(C7582R.id.open_button);
        if (this.q.dj().mo2294a(12631598)) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_side_padding_v2);
            setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        }
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int size2 = MeasureSpec.getSize(i);
        int i3 = (size2 - paddingLeft) - paddingRight;
        this.f19405c.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((int) (((float) ((((int) (((float) size2) / 2.0f)) - paddingLeft) - paddingRight)) * 1.0f), MemoryMappedFileBuffer.DEFAULT_SIZE));
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.af.getLayoutParams();
        this.af.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.V.getLayoutParams();
        this.V.measure(MeasureSpec.makeMeasureSpec((i3 - C0361r.m2049a(marginLayoutParams2)) - Math.max(C0361r.m2051b(marginLayoutParams2), C0361r.m2051b(marginLayoutParams) + this.af.getMeasuredWidth()), MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        this.ad.measure(0, 0);
        this.f19403a.measure(0, 0);
        setMeasuredDimension(size2, size);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.ad.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.af.getLayoutParams();
        int measuredWidth = this.f19405c.getMeasuredWidth();
        int measuredHeight = this.f19405c.getMeasuredHeight();
        int a = k.a(width, measuredWidth, z2, l);
        this.f19405c.layout(a, paddingTop, measuredWidth + a, paddingTop + measuredHeight);
        measuredWidth = C0361r.m2049a(marginLayoutParams);
        a = this.V.getMeasuredWidth();
        int i5 = marginLayoutParams.topMargin + (paddingTop + measuredHeight);
        paddingTop = k.a(width, a, z2, l + measuredWidth);
        this.V.layout(paddingTop, i5, paddingTop + a, this.V.getMeasuredHeight() + i5);
        paddingTop = C0361r.m2051b(marginLayoutParams3);
        measuredWidth = this.af.getMeasuredWidth();
        i5 += marginLayoutParams3.topMargin;
        int b = k.b(width, measuredWidth, z2, m + paddingTop);
        this.af.layout(b, i5, measuredWidth + b, this.af.getMeasuredHeight() + i5);
        i5 = k.b(width, this.f19403a.getMeasuredWidth(), z2, m);
        b = height - paddingBottom;
        this.f19403a.layout(i5, b - this.f19403a.getMeasuredHeight(), this.f19403a.getMeasuredWidth() + i5, b);
        i5 = C0361r.m2049a(marginLayoutParams2);
        int measuredWidth2 = this.ad.getMeasuredWidth();
        b = this.f19403a.getBottom();
        i5 = k.a(width, measuredWidth2, z2, i5 + l);
        this.ad.layout(i5, b - this.ad.getMeasuredHeight(), measuredWidth2 + i5, b);
        e();
    }

    public int getCardType() {
        return 43;
    }

    public ce getPlayStoreUiElement() {
        return C2482j.m13283a(554);
    }

    public ad getParentNode() {
        return this.f19406d;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("Unexpected child view");
    }
}
