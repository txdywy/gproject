package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.play.e;
import com.google.android.play.g;
import com.google.android.play.utils.C6452k;

public class PlayCardViewMini extends C6388d {
    public int f32191d;
    public int f32192e;
    public int f32193f;
    public boolean f32194g;
    public boolean f32195h;
    public View f32196i;

    public PlayCardViewMini(Context context) {
        this(context, null);
    }

    public PlayCardViewMini(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32191d = -1;
        this.f32194g = false;
        Resources resources = context.getResources();
        this.f32191d = resources.getDimensionPixelSize(e.play_mini_card_content_height);
        resources.getDimensionPixelSize(e.play_mini_card_label_threshold);
        this.f32193f = 2;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32196i = findViewById(g.li_ad_label_container);
    }

    public void setTitleMaxLines(int i) {
        if (this.f32193f != i) {
            this.f32193f = i;
            this.V.setMaxLines(i);
        }
    }

    public void setAlwaysShowSubtitle(boolean z) {
        this.f32194g = z;
    }

    public void setTallTextContent(boolean z) {
        this.f32195h = z;
        this.f32191d = -1;
    }

    private final boolean m29313b(int i) {
        return i <= (this.f32195h ? 4 : 3) + -2;
    }

    public final boolean at_() {
        if (m29313b(this.f32193f)) {
            return true;
        }
        return super.at_();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        r13 = this;
        r4 = 1;
        r10 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r12 = 8;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = 0;
        r13.m29309c(r14);
        r0 = r13.U;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r6 = android.view.View.MeasureSpec.getMode(r15);
        r2 = android.view.View.MeasureSpec.getSize(r15);
        r3 = r0.height;
        r1 = r13.f32191d;
        r7 = -1;
        if (r1 != r7) goto L_0x0032;
    L_0x0022:
        r7 = r13.getResources();
        r1 = r13.f32195h;
        if (r1 == 0) goto L_0x0110;
    L_0x002a:
        r1 = com.google.android.play.e.play_mini_card_content_height_tall;
    L_0x002c:
        r1 = r7.getDimensionPixelSize(r1);
        r13.f32191d = r1;
    L_0x0032:
        r1 = r13.f32191d;
        r1 = r1 + r3;
        r3 = r13.getPaddingTop();
        r1 = r1 + r3;
        r3 = r13.getPaddingBottom();
        r3 = r3 + r1;
        if (r6 != r11) goto L_0x0114;
    L_0x0041:
        if (r2 <= 0) goto L_0x0114;
    L_0x0043:
        r1 = r2;
    L_0x0044:
        r6 = android.view.View.MeasureSpec.getSize(r14);
        r2 = r3 - r1;
        r2 = r2 / 3;
        r2 = java.lang.Math.max(r5, r2);
        r13.f32192e = r2;
        r2 = r13.getPaddingLeft();
        r3 = r13.getPaddingRight();
        r2 = r6 - r2;
        r3 = r2 - r3;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r11);
        r7 = r13.U;
        r0 = r0.height;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r11);
        r7.measure(r2, r0);
        r0 = r13.V;
        r0 = com.google.android.play.utils.C6452k.m29503a(r0);
        r2 = r13.ab;
        r7 = com.google.android.play.utils.C6452k.m29503a(r2);
        r2 = r13.ah;
        r2 = com.google.android.play.utils.C6452k.m29503a(r2);
        r8 = r13.f32196i;
        if (r8 == 0) goto L_0x00ac;
    L_0x0083:
        r8 = r13.W;
        if (r8 == 0) goto L_0x0117;
    L_0x0087:
        r8 = r13.W;
        r8 = r8.getVisibility();
        if (r8 == r12) goto L_0x0117;
    L_0x008f:
        r8 = r13.f32196i;
        r8.setVisibility(r5);
        r8 = r13.U;
        r8 = r8.getPaddingLeft();
        r8 = r3 - r8;
        r9 = r13.U;
        r9 = r9.getPaddingRight();
        r8 = r8 - r9;
        r9 = r13.f32196i;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10);
        r9.measure(r8, r5);
    L_0x00ac:
        r8 = r13.ah;
        r8 = r8.getVisibility();
        if (r8 == r12) goto L_0x011d;
    L_0x00b4:
        r8 = r3 - r2;
        r9 = r13.ah;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10);
        r9.measure(r8, r5);
    L_0x00bf:
        r8 = r13.ah;
        r8 = r8.getMeasuredWidth();
        r8 = r8 + r2;
        r2 = r13.af;
        r2.measure(r5, r5);
        r2 = r3 - r0;
        r0 = r13.af;
        r0 = r0.getVisibility();
        if (r0 == r12) goto L_0x01a0;
    L_0x00d5:
        r0 = r13.V;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r9 = r13.af;
        r9 = r9.getMeasuredWidth();
        r9 = r3 - r9;
        r10 = r13.af;
        r10 = com.google.android.play.utils.C6452k.m29503a(r10);
        r9 = r9 - r10;
        r0 = android.support.v4.view.r.a(r0);
        r0 = r9 - r0;
        r0 = java.lang.Math.min(r2, r0);
    L_0x00f6:
        r2 = r13.V;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r11);
        r2.measure(r0, r5);
        r0 = r13.al;
        r0.measure(r5, r5);
        r13.setMeasuredDimension(r6, r1);
        r0 = r13.al;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0127;
    L_0x010f:
        return;
    L_0x0110:
        r1 = com.google.android.play.e.play_mini_card_content_height;
        goto L_0x002c;
    L_0x0114:
        r1 = r3;
        goto L_0x0044;
    L_0x0117:
        r8 = r13.f32196i;
        r8.setVisibility(r12);
        goto L_0x00ac;
    L_0x011d:
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11);
        r9 = r13.ah;
        r9.measure(r8, r5);
        goto L_0x00bf;
    L_0x0127:
        r0 = r13.ab;
        r0 = r0.getVisibility();
        if (r0 == r12) goto L_0x0182;
    L_0x012f:
        r0 = r4;
    L_0x0130:
        r1 = r13.ad;
        r1 = r1.getVisibility();
        if (r1 == r12) goto L_0x0184;
    L_0x0138:
        r1 = r4;
    L_0x0139:
        if (r0 == 0) goto L_0x0153;
    L_0x013b:
        r2 = r13.V;
        r2 = r2.getLineCount();
        r2 = r13.m29313b(r2);
        if (r2 == 0) goto L_0x0153;
    L_0x0147:
        r0 = r3 - r7;
        r2 = r13.ab;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r11);
        r2.measure(r0, r5);
        r0 = r5;
    L_0x0153:
        r2 = r3 - r8;
        if (r0 == 0) goto L_0x0186;
    L_0x0157:
        r2 = r2 - r7;
        r2 = java.lang.Math.max(r2, r5);
        r4 = r13.f32194g;
        if (r4 != 0) goto L_0x0166;
    L_0x0160:
        r3 = r3 * 3;
        r3 = r3 / 10;
        if (r2 < r3) goto L_0x019e;
    L_0x0166:
        r0 = r13.ab;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11);
        r0.measure(r2, r5);
    L_0x016f:
        r0 = r5;
        r5 = r1;
    L_0x0171:
        if (r0 == 0) goto L_0x0179;
    L_0x0173:
        r0 = r13.ab;
        r1 = 4;
        r0.setVisibility(r1);
    L_0x0179:
        if (r5 == 0) goto L_0x010f;
    L_0x017b:
        r0 = r13.ad;
        r1 = 4;
        r0.setVisibility(r1);
        goto L_0x010f;
    L_0x0182:
        r0 = r5;
        goto L_0x0130;
    L_0x0184:
        r1 = r5;
        goto L_0x0139;
    L_0x0186:
        if (r1 == 0) goto L_0x019c;
    L_0x0188:
        r3 = r13.ad;
        r3.measure(r5, r5);
        r3 = r13.ad;
        r3 = r3.getMeasuredWidth();
        r4 = r13.ad;
        r4 = com.google.android.play.utils.C6452k.m29503a(r4);
        r3 = r3 + r4;
        if (r3 <= r2) goto L_0x0171;
    L_0x019c:
        r5 = r1;
        goto L_0x0171;
    L_0x019e:
        r5 = r0;
        goto L_0x016f;
    L_0x01a0:
        r0 = r2;
        goto L_0x00f6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.PlayCardViewMini.onMeasure(int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int measuredHeight;
        int measuredWidth;
        if (ai.a.k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int l = ai.a.l(this);
        int m = ai.a.m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.ad.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ah.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.af.getLayoutParams();
        MarginLayoutParams marginLayoutParams6 = this.f32196i != null ? (MarginLayoutParams) this.f32196i.getLayoutParams() : null;
        int measuredWidth2 = this.U.getMeasuredWidth();
        int measuredHeight2 = this.U.getMeasuredHeight();
        int a = C6452k.m29502a(width, measuredWidth2, z2, l);
        this.U.layout(a, paddingTop, measuredWidth2 + a, paddingTop + measuredHeight2);
        if (!(this.f32196i == null || this.f32196i.getVisibility() == 8)) {
            measuredWidth2 = this.f32196i.getMeasuredWidth();
            a = r.a(marginLayoutParams6);
            int i6 = paddingTop + measuredHeight2;
            if (this.ax) {
                i5 = 0;
            } else {
                i5 = this.U.getPaddingTop();
            }
            i5 = (i6 - i5) - this.f32196i.getMeasuredHeight();
            measuredWidth2 = C6452k.m29502a(width, measuredWidth2, z2, a + (ai.a.l(this.U) + l));
            this.f32196i.layout(measuredWidth2, i5, this.f32196i.getMeasuredWidth() + measuredWidth2, this.f32196i.getMeasuredHeight() + i5);
        }
        i5 = r.a(marginLayoutParams);
        measuredWidth2 = this.V.getMeasuredWidth();
        measuredHeight2 = ((measuredHeight2 + paddingTop) + marginLayoutParams.topMargin) - this.f32192e;
        i5 = C6452k.m29502a(width, measuredWidth2, z2, i5 + l);
        this.V.layout(i5, measuredHeight2, measuredWidth2 + i5, this.V.getMeasuredHeight() + measuredHeight2);
        i5 = r.b(marginLayoutParams5);
        measuredWidth2 = this.af.getMeasuredWidth();
        int i7 = marginLayoutParams5.topMargin + measuredHeight2;
        i5 = C6452k.m29506b(width, measuredWidth2, z2, i5 + m);
        this.af.layout(i5, i7, measuredWidth2 + i5, this.af.getMeasuredHeight() + i7);
        i7 = r.b(marginLayoutParams4);
        i5 = this.ah.getMeasuredWidth();
        int i8 = ((height - paddingBottom) - marginLayoutParams4.bottomMargin) + this.f32192e;
        i7 = C6452k.m29506b(width, i5, z2, i7 + m);
        this.ah.layout(i7, i8 - this.ah.getMeasuredHeight(), i5 + i7, i8);
        if (this.ab.getVisibility() == 0) {
            i7 = r.a(marginLayoutParams2);
            i5 = this.ab.getMeasuredWidth();
            i7 = C6452k.m29502a(width, i5, z2, i7 + l);
            if (m29313b(this.V.getLineCount())) {
                measuredHeight = (marginLayoutParams.bottomMargin + (this.V.getMeasuredHeight() + measuredHeight2)) + marginLayoutParams2.topMargin;
                this.ab.layout(i7, measuredHeight, i7 + i5, this.ab.getMeasuredHeight() + measuredHeight);
            } else {
                measuredHeight = ((i8 - this.ah.getMeasuredHeight()) + this.ah.getBaseline()) - this.ab.getBaseline();
                this.ab.layout(i7, measuredHeight, i7 + i5, this.ab.getMeasuredHeight() + measuredHeight);
            }
        }
        if (this.ad.getVisibility() == 0) {
            measuredHeight = r.a(marginLayoutParams3);
            measuredWidth = this.ad.getMeasuredWidth();
            int top = (this.ah.getTop() + this.ah.getBaseline()) - this.ad.getBaseline();
            measuredHeight = C6452k.m29502a(width, measuredWidth, z2, measuredHeight + l);
            this.ad.layout(measuredHeight, top, measuredWidth + measuredHeight, this.ad.getMeasuredHeight() + top);
        }
        measuredHeight = ((((width - l) - m) - this.al.getMeasuredWidth()) / 2) + l;
        measuredWidth = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
        this.al.layout(measuredHeight, measuredWidth, this.al.getMeasuredWidth() + measuredHeight, this.al.getMeasuredHeight() + measuredWidth);
        m29312e();
    }

    public int getCardType() {
        return 0;
    }
}
