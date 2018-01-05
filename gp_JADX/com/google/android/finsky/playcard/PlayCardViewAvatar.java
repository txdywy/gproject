package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.d;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardViewAvatar extends d {
    public C1503a f19475a;
    public C1461c f19476b;

    public PlayCardViewAvatar(Context context) {
        this(context, null);
    }

    public PlayCardViewAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1885a(this);
        super.onFinishInflate();
        if (this.f19475a.f8184h && this.f19476b.dj().mo2294a(12638116)) {
            setForeground(getResources().getDrawable(C7582R.drawable.person_card_overlay_light_cros));
        }
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31325b;
    }

    public final void m18449a(int i, int i2, int i3, int i4) {
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = (size - paddingLeft) - paddingRight;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        paddingRight = MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE);
        this.U.measure(paddingRight, paddingRight);
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.V.getLayoutParams();
        this.V.measure(MeasureSpec.makeMeasureSpec((i3 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        paddingLeft = (((marginLayoutParams.bottomMargin + (marginLayoutParams.topMargin + this.U.getMeasuredHeight())) + marginLayoutParams2.topMargin) + this.V.getMeasuredHeight()) + marginLayoutParams2.bottomMargin;
        this.al.measure(0, 0);
        setMeasuredDimension(size, (paddingLeft + paddingTop) + paddingBottom);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        int measuredWidth = this.U.getMeasuredWidth();
        int measuredHeight = this.U.getMeasuredHeight();
        int a = k.a(width, measuredWidth, z2, C0361r.m2049a(marginLayoutParams) + l);
        this.U.layout(a, marginLayoutParams.topMargin + paddingTop, measuredWidth + a, (marginLayoutParams.topMargin + paddingTop) + measuredHeight);
        marginLayoutParams = (MarginLayoutParams) this.V.getLayoutParams();
        measuredWidth = (paddingTop + measuredHeight) + marginLayoutParams.topMargin;
        int a2 = C0361r.m2049a(marginLayoutParams) + l;
        measuredHeight = this.V.getMeasuredWidth();
        a = this.V.getMeasuredHeight();
        a2 = k.a(width, measuredHeight, z2, a2);
        this.V.layout(a2, measuredWidth, measuredHeight + a2, a + measuredWidth);
        a2 = this.al.getMeasuredWidth();
        l += (((width - l) - m) - a2) / 2;
        m = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
        int a3 = k.a(width, a2, z2, l);
        this.al.layout(a3, m, a2 + a3, this.al.getMeasuredHeight() + m);
    }

    public int getCardType() {
        return 16;
    }
}
