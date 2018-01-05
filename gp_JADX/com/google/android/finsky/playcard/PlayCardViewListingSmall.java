package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0361r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.detailscomponents.DetailsTitleFlowLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.d;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public class PlayCardViewListingSmall extends d {
    public DetailsTitleFlowLayout f19479f;
    public View f19480g;
    public TextView f19481h;
    public TextView f19482i;
    public ArrayList f19483j;
    public final boolean f19484k;
    public Drawable f19485l;
    public C1461c f19486m;

    public PlayCardViewListingSmall(Context context) {
        this(context, null);
    }

    public PlayCardViewListingSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19483j = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardViewListingSmall);
        this.f19484k = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1886a(this);
        super.onFinishInflate();
        this.f19479f = (DetailsTitleFlowLayout) findViewById(C7582R.id.rating_downloads_layout);
        this.f19480g = findViewById(C7582R.id.rating_badge_container);
        this.f19481h = (TextView) findViewById(C7582R.id.li_ranking);
        this.f19482i = (TextView) findViewById(C7582R.id.downloads_count);
    }

    public final void m18453b() {
        super.b();
        this.f19479f.setVisibility(8);
        this.ag.setVisibility(8);
    }

    public TextView getRanking() {
        return this.f19481h;
    }

    public void setSnippetVisible(boolean z) {
        boolean z2 = false;
        this.ak.setVisibility(z ? 0 : 8);
        if (!z) {
            z2 = true;
        }
        this.at = z2;
    }

    public void setDownloadsCountVisbility(int i) {
        this.f19482i.setVisibility(i);
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        a(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.V.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.f19479f.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.ah.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = (size2 - paddingTop) - paddingBottom;
        int i4 = 0;
        if (!(this.f19481h == null || this.f19481h.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.f19481h.getLayoutParams();
            this.f19481h.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams6.width, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            i4 = this.f19481h.getMeasuredWidth();
        }
        i3 = Math.min(marginLayoutParams.height, i3);
        marginLayoutParams.width = i3;
        marginLayoutParams.height = i3;
        i3 = MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE);
        this.U.measure(i3, i3);
        this.af.measure(0, 0);
        int i5 = marginLayoutParams.rightMargin + (marginLayoutParams.width + paddingLeft);
        int i6 = ((size - i5) - paddingRight) - i4;
        i3 = (i6 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
        if (this.af.getVisibility() != 8) {
            marginLayoutParams6 = (MarginLayoutParams) this.af.getLayoutParams();
            i4 = Math.min(i3, (((i6 - C0361r.m2049a(marginLayoutParams2)) - this.af.getMeasuredWidth()) - marginLayoutParams6.leftMargin) - marginLayoutParams6.rightMargin);
        } else {
            i4 = i3;
        }
        this.V.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
        if (this.W == null || this.W.getVisibility() == 8) {
            i4 = 0;
        } else {
            marginLayoutParams6 = (MarginLayoutParams) this.W.getLayoutParams();
            this.W.measure(0, 0);
            i4 = marginLayoutParams6.rightMargin + this.W.getMeasuredWidth();
        }
        this.ab.measure(MeasureSpec.makeMeasureSpec(((i6 - i4) - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin, Integer.MIN_VALUE), 0);
        if (this.ac.getVisibility() != 8) {
            this.ac.measure(MeasureSpec.makeMeasureSpec(i6 - k.a(this.ac), Integer.MIN_VALUE), 0);
        }
        this.ah.measure(MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, Integer.MIN_VALUE), 0);
        i4 = (this.ah.getMeasuredWidth() + marginLayoutParams5.rightMargin) + marginLayoutParams5.leftMargin;
        if (this.ag.getVisibility() != 8) {
            this.ag.measure(MeasureSpec.makeMeasureSpec((size - paddingLeft) - paddingRight, Integer.MIN_VALUE), 0);
        }
        if (this.f19480g.findViewById(C7582R.id.li_badge).getVisibility() != 8) {
            setDownloadsCountVisbility(8);
        }
        this.f19479f.measure(MeasureSpec.makeMeasureSpec((((i6 - marginLayoutParams4.leftMargin) - marginLayoutParams4.rightMargin) - this.ag.getMeasuredWidth()) - i4, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        if ((((((marginLayoutParams2.bottomMargin + ((marginLayoutParams2.topMargin + paddingTop) + this.V.getMeasuredHeight())) + marginLayoutParams3.topMargin) + this.ab.getMeasuredHeight()) + marginLayoutParams3.bottomMargin) + marginLayoutParams4.topMargin) + this.f19479f.getMeasuredHeight() > ((getMeasuredHeight() - paddingBottom) - marginLayoutParams5.bottomMargin) - this.ah.getMeasuredHeight()) {
            measuredWidth = (((size - paddingRight) - marginLayoutParams5.leftMargin) - this.ah.getMeasuredWidth()) - marginLayoutParams5.rightMargin;
            int measuredWidth2 = (marginLayoutParams.rightMargin + ((marginLayoutParams.leftMargin + paddingLeft) + this.U.getMeasuredWidth())) + marginLayoutParams4.leftMargin;
            if ((this.f19479f.getMeasuredWidth() + measuredWidth2) + marginLayoutParams4.rightMargin > measuredWidth) {
                this.f19479f.measure(MeasureSpec.makeMeasureSpec((measuredWidth - measuredWidth2) - marginLayoutParams4.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            }
        }
        this.f19479f.setVisibility(0);
        if (this.ak.getVisibility() != 8) {
            this.ak.measure(MeasureSpec.makeMeasureSpec(i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            if (this.ac.getVisibility() != 8) {
                this.f19479f.setVisibility(8);
            }
        }
        if (!(this.aa == null || this.aa.getVisibility() == 8)) {
            marginLayoutParams = (MarginLayoutParams) this.aa.getLayoutParams();
            if (this.ag.getVisibility() != 8) {
                measuredWidth = this.ag.getMeasuredWidth();
            } else {
                measuredWidth = this.ah.getMeasuredWidth();
            }
            this.aa.measure(MeasureSpec.makeMeasureSpec(((((size - i5) - paddingRight) - measuredWidth) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        }
        this.al.measure(0, 0);
        setMeasuredDimension(size, size2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r30, int r31, int r32, int r33, int r34) {
        /*
        r29 = this;
        r6 = android.support.v4.view.ai.f1848a;
        r0 = r29;
        r6 = r6.mo400k(r0);
        if (r6 != 0) goto L_0x04e2;
    L_0x000a:
        r6 = 1;
        r15 = r6;
    L_0x000c:
        r6 = android.support.v4.view.ai.f1848a;
        r0 = r29;
        r16 = r6.mo401l(r0);
        r6 = android.support.v4.view.ai.f1848a;
        r0 = r29;
        r18 = r6.mo402m(r0);
        r19 = r29.getPaddingTop();
        r20 = r29.getPaddingBottom();
        r21 = r29.getWidth();
        r22 = r29.getHeight();
        r17 = 0;
        r0 = r29;
        r6 = r0.U;
        r6 = r6.getLayoutParams();
        r6 = (android.view.ViewGroup.MarginLayoutParams) r6;
        r0 = r29;
        r7 = r0.V;
        r7 = r7.getLayoutParams();
        r7 = (android.view.ViewGroup.MarginLayoutParams) r7;
        r0 = r29;
        r8 = r0.ab;
        r8 = r8.getLayoutParams();
        r8 = (android.view.ViewGroup.MarginLayoutParams) r8;
        r0 = r29;
        r9 = r0.f19479f;
        r9 = r9.getLayoutParams();
        r9 = (android.view.ViewGroup.MarginLayoutParams) r9;
        r0 = r29;
        r10 = r0.ah;
        r10 = r10.getLayoutParams();
        r10 = (android.view.ViewGroup.MarginLayoutParams) r10;
        r0 = r29;
        r11 = r0.ag;
        r11 = r11.getLayoutParams();
        r11 = (android.view.ViewGroup.MarginLayoutParams) r11;
        r0 = r29;
        r12 = r0.af;
        r12 = r12.getLayoutParams();
        r12 = (android.view.ViewGroup.MarginLayoutParams) r12;
        r0 = r29;
        r13 = r0.ak;
        r13 = r13.getLayoutParams();
        r13 = (android.view.ViewGroup.MarginLayoutParams) r13;
        r0 = r29;
        r14 = r0.f19481h;
        if (r14 == 0) goto L_0x0580;
    L_0x0084:
        r0 = r29;
        r14 = r0.f19481h;
        r14 = r14.getVisibility();
        r23 = 8;
        r0 = r23;
        if (r14 == r0) goto L_0x0580;
    L_0x0092:
        r0 = r29;
        r14 = r0.f19481h;
        r14 = r14.getLayoutParams();
        r14 = (android.view.ViewGroup.MarginLayoutParams) r14;
        r0 = r29;
        r0 = r0.f19481h;
        r23 = r0;
        r23 = r23.getMeasuredWidth();
        r0 = r29;
        r0 = r0.f19481h;
        r24 = r0;
        r24 = r24.getMeasuredHeight();
        r0 = r29;
        r0 = r0.U;
        r25 = r0;
        r25 = r25.getPaddingLeft();
        r25 = r25 / 2;
        r0 = r21;
        r1 = r23;
        r2 = r25;
        r25 = com.google.android.play.utils.k.a(r0, r1, r15, r2);
        r26 = r22 - r24;
        r26 = r26 / 2;
        r0 = r29;
        r0 = r0.f19481h;
        r27 = r0;
        r23 = r23 + r25;
        r24 = r24 + r26;
        r0 = r27;
        r1 = r25;
        r2 = r26;
        r3 = r23;
        r4 = r24;
        r0.layout(r1, r2, r3, r4);
        r0 = r14.width;
        r23 = r0;
        r14 = android.support.v4.view.C0361r.m2051b(r14);
        r14 = r14 + r23;
        r14 = r14 + r16;
    L_0x00ed:
        r0 = r29;
        r0 = r0.U;
        r23 = r0;
        r23 = r23.getMeasuredWidth();
        r0 = r29;
        r0 = r0.U;
        r24 = r0;
        r24 = r24.getMeasuredHeight();
        r0 = r21;
        r1 = r23;
        r25 = com.google.android.play.utils.k.a(r0, r1, r15, r14);
        r0 = r29;
        r0 = r0.U;
        r26 = r0;
        r23 = r23 + r25;
        r24 = r24 + r19;
        r0 = r26;
        r1 = r25;
        r2 = r19;
        r3 = r23;
        r4 = r24;
        r0.layout(r1, r2, r3, r4);
        r0 = r6.width;
        r23 = r0;
        r14 = r14 + r23;
        r6 = android.support.v4.view.C0361r.m2051b(r6);
        r23 = r14 + r6;
        r0 = r29;
        r6 = r0.f19483j;
        r6.clear();
        r0 = r29;
        r6 = r0.V;
        r6 = r6.getMeasuredWidth();
        r14 = android.support.v4.view.C0361r.m2049a(r7);
        r0 = r7.topMargin;
        r24 = r0;
        r24 = r24 + r19;
        r14 = r14 + r23;
        r0 = r21;
        r14 = com.google.android.play.utils.k.a(r0, r6, r15, r14);
        r0 = r29;
        r0 = r0.V;
        r25 = r0;
        r6 = r6 + r14;
        r0 = r29;
        r0 = r0.V;
        r26 = r0;
        r26 = r26.getMeasuredHeight();
        r26 = r26 + r24;
        r0 = r25;
        r1 = r24;
        r2 = r26;
        r0.layout(r14, r1, r6, r2);
        r0 = r29;
        r6 = r0.V;
        r6 = r6.getMeasuredHeight();
        r6 = r6 + r24;
        r7 = r7.bottomMargin;
        r14 = r6 + r7;
        r0 = r29;
        r6 = r0.f19483j;
        r0 = r29;
        r7 = r0.V;
        r6.add(r7);
        r0 = r29;
        r6 = r0.af;
        r6 = r6.getMeasuredWidth();
        r7 = android.support.v4.view.C0361r.m2051b(r12);
        r12 = r12.topMargin;
        r12 = r12 + r24;
        r7 = r7 + r18;
        r0 = r21;
        r7 = com.google.android.play.utils.k.b(r0, r6, r15, r7);
        r0 = r29;
        r0 = r0.af;
        r24 = r0;
        r6 = r6 + r7;
        r0 = r29;
        r0 = r0.af;
        r25 = r0;
        r25 = r25.getMeasuredHeight();
        r25 = r25 + r12;
        r0 = r24;
        r1 = r25;
        r0.layout(r7, r12, r6, r1);
        r0 = r29;
        r6 = r0.W;
        if (r6 == 0) goto L_0x057c;
    L_0x01ba:
        r0 = r29;
        r6 = r0.W;
        r6 = r6.getVisibility();
        r7 = 8;
        if (r6 == r7) goto L_0x057c;
    L_0x01c6:
        r0 = r29;
        r6 = r0.W;
        r6 = r6.getLayoutParams();
        r6 = (android.view.ViewGroup.MarginLayoutParams) r6;
        r0 = r29;
        r7 = r0.W;
        r7 = r7.getMeasuredWidth();
        r12 = r6.rightMargin;
        r7 = r7 + r12;
        r0 = r29;
        r12 = r0.W;
        r12 = r12.getMeasuredWidth();
        r17 = android.support.v4.view.C0361r.m2049a(r6);
        r6 = r6.topMargin;
        r6 = r6 + r14;
        r17 = r17 + r23;
        r0 = r21;
        r1 = r17;
        r17 = com.google.android.play.utils.k.a(r0, r12, r15, r1);
        r0 = r29;
        r0 = r0.W;
        r24 = r0;
        r12 = r12 + r17;
        r0 = r29;
        r0 = r0.W;
        r25 = r0;
        r25 = r25.getMeasuredHeight();
        r25 = r25 + r6;
        r0 = r24;
        r1 = r17;
        r2 = r25;
        r0.layout(r1, r6, r12, r2);
    L_0x0211:
        r0 = r29;
        r6 = r0.ab;
        r6 = r6.getVisibility();
        r12 = 8;
        if (r6 == r12) goto L_0x0579;
    L_0x021d:
        r0 = r29;
        r6 = r0.ab;
        r12 = r6.getMeasuredWidth();
        r6 = r8.topMargin;
        r14 = r14 + r6;
        if (r7 == 0) goto L_0x04e6;
    L_0x022a:
        r0 = r29;
        r6 = r0.W;
        r6 = r6.getPaddingTop();
    L_0x0232:
        r6 = r6 + r14;
        r14 = android.support.v4.view.C0361r.m2049a(r8);
        r17 = r7 + r23;
        r14 = r14 + r17;
        r0 = r21;
        r14 = com.google.android.play.utils.k.a(r0, r12, r15, r14);
        r0 = r29;
        r0 = r0.ab;
        r17 = r0;
        r12 = r12 + r14;
        r0 = r29;
        r0 = r0.ab;
        r24 = r0;
        r24 = r24.getMeasuredHeight();
        r24 = r24 + r6;
        r0 = r17;
        r1 = r24;
        r0.layout(r14, r6, r12, r1);
        r0 = r29;
        r12 = r0.ab;
        r12 = r12.getMeasuredHeight();
        r6 = r6 + r12;
        r8 = r8.bottomMargin;
        r6 = r6 + r8;
        r0 = r29;
        r8 = r0.f19483j;
        r0 = r29;
        r12 = r0.ab;
        r8.add(r12);
        r8 = r6;
    L_0x0273:
        r0 = r29;
        r6 = r0.ac;
        r6 = r6.getVisibility();
        r12 = 8;
        if (r6 == r12) goto L_0x02cf;
    L_0x027f:
        r0 = r29;
        r6 = r0.ac;
        r6 = r6.getLayoutParams();
        r6 = (android.view.ViewGroup.MarginLayoutParams) r6;
        r0 = r29;
        r12 = r0.ac;
        r12 = r12.getMeasuredWidth();
        r14 = r6.topMargin;
        r8 = r8 + r14;
        r14 = android.support.v4.view.C0361r.m2049a(r6);
        r7 = r7 + r23;
        r7 = r7 + r14;
        r0 = r21;
        r7 = com.google.android.play.utils.k.a(r0, r12, r15, r7);
        r0 = r29;
        r14 = r0.ac;
        r12 = r12 + r7;
        r0 = r29;
        r0 = r0.ac;
        r17 = r0;
        r17 = r17.getMeasuredHeight();
        r17 = r17 + r8;
        r0 = r17;
        r14.layout(r7, r8, r12, r0);
        r0 = r29;
        r7 = r0.ac;
        r7 = r7.getMeasuredHeight();
        r7 = r7 + r8;
        r6 = r6.bottomMargin;
        r8 = r7 + r6;
        r0 = r29;
        r6 = r0.f19483j;
        r0 = r29;
        r7 = r0.ac;
        r6.add(r7);
    L_0x02cf:
        r0 = r29;
        r6 = r0.aa;
        r6 = r6.getVisibility();
        r7 = 8;
        if (r6 == r7) goto L_0x032a;
    L_0x02db:
        r0 = r29;
        r6 = r0.aa;
        r6 = r6.getLayoutParams();
        r6 = (android.view.ViewGroup.MarginLayoutParams) r6;
        r0 = r29;
        r7 = r0.aa;
        r7 = r7.getMeasuredWidth();
        r12 = android.support.v4.view.C0361r.m2049a(r6);
        r14 = r6.topMargin;
        r8 = r8 + r14;
        r12 = r12 + r23;
        r0 = r21;
        r12 = com.google.android.play.utils.k.a(r0, r7, r15, r12);
        r0 = r29;
        r14 = r0.aa;
        r7 = r7 + r12;
        r0 = r29;
        r0 = r0.aa;
        r17 = r0;
        r17 = r17.getMeasuredHeight();
        r17 = r17 + r8;
        r0 = r17;
        r14.layout(r12, r8, r7, r0);
        r0 = r29;
        r7 = r0.aa;
        r7 = r7.getMeasuredHeight();
        r7 = r7 + r8;
        r6 = r6.bottomMargin;
        r8 = r7 + r6;
        r0 = r29;
        r6 = r0.f19483j;
        r0 = r29;
        r7 = r0.aa;
        r6.add(r7);
    L_0x032a:
        r0 = r29;
        r6 = r0.ah;
        r14 = r6.getMeasuredWidth();
        r0 = r29;
        r6 = r0.ah;
        r17 = r6.getMeasuredHeight();
        r6 = android.support.v4.view.C0361r.m2051b(r10);
        r6 = r6 + r18;
        r0 = r21;
        r12 = com.google.android.play.utils.k.b(r0, r14, r15, r6);
        r6 = r22 - r20;
        r7 = r10.bottomMargin;
        r10 = r6 - r7;
        r7 = r10 - r17;
        r0 = r29;
        r6 = r0.f19479f;
        r6 = r6.getVisibility();
        r24 = 8;
        r0 = r24;
        if (r6 == r0) goto L_0x03c8;
    L_0x035c:
        r0 = r29;
        r6 = r0.f19479f;
        r24 = r6.getMeasuredWidth();
        r25 = android.support.v4.view.C0361r.m2049a(r9);
        r0 = r29;
        r6 = r0.f19486m;
        r6 = r6.dj();
        r26 = 12611703; // 0xc07077 float:1.767276E-38 double:6.231009E-317;
        r0 = r26;
        r6 = r6.mo2294a(r0);
        if (r6 == 0) goto L_0x04e9;
    L_0x037b:
        r0 = r29;
        r6 = r0.ah;
        r6 = r6.getBaseline();
        r6 = r6 + r7;
        r0 = r29;
        r8 = r0.f19482i;
        r8 = r8.getBaseline();
        r6 = r6 - r8;
    L_0x038d:
        r8 = r23 + r25;
        r0 = r21;
        r1 = r24;
        r8 = com.google.android.play.utils.k.a(r0, r1, r15, r8);
        r0 = r29;
        r0 = r0.f19479f;
        r25 = r0;
        r24 = r24 + r8;
        r0 = r29;
        r0 = r0.f19479f;
        r26 = r0;
        r26 = r26.getMeasuredHeight();
        r26 = r26 + r6;
        r0 = r25;
        r1 = r24;
        r2 = r26;
        r0.layout(r8, r6, r1, r2);
        r0 = r29;
        r6 = r0.f19479f;
        r6.getMeasuredHeight();
        r6 = r9.bottomMargin;
        r0 = r29;
        r6 = r0.f19483j;
        r0 = r29;
        r8 = r0.f19479f;
        r6.add(r8);
    L_0x03c8:
        r0 = r29;
        r6 = r0.ak;
        r6 = r6.getVisibility();
        r8 = 8;
        if (r6 == r8) goto L_0x050a;
    L_0x03d4:
        r0 = r29;
        r6 = r0.ab;
        r6 = r6.getVisibility();
        r7 = 8;
        if (r6 == r7) goto L_0x04ee;
    L_0x03e0:
        r0 = r29;
        r6 = r0.ab;
        r6 = r6.getTop();
    L_0x03e8:
        r7 = r6 + r17;
        r0 = r29;
        r8 = r0.ak;
        r8 = r8.getMeasuredWidth();
        r9 = android.support.v4.view.C0361r.m2049a(r13);
        r10 = r22 - r20;
        r13 = r13.bottomMargin;
        r10 = r10 - r13;
        r9 = r9 + r23;
        r0 = r21;
        r9 = com.google.android.play.utils.k.a(r0, r8, r15, r9);
        r0 = r29;
        r13 = r0.ak;
        r0 = r29;
        r0 = r0.ak;
        r17 = r0;
        r17 = r17.getMeasuredHeight();
        r17 = r10 - r17;
        r8 = r8 + r9;
        r0 = r17;
        r13.layout(r9, r0, r8, r10);
        r8 = r12;
        r28 = r7;
        r7 = r6;
        r6 = r28;
    L_0x041f:
        r0 = r29;
        r9 = r0.ah;
        r10 = r8 + r14;
        r9.layout(r8, r7, r10, r6);
        r0 = r29;
        r6 = r0.ag;
        r6 = r6.getVisibility();
        r8 = 8;
        if (r6 == r8) goto L_0x04a1;
    L_0x0434:
        r8 = 0;
        r0 = r29;
        r6 = r0.f19483j;
        r6 = r6.size();
        r6 = r6 + -1;
        r9 = r6;
    L_0x0440:
        if (r9 < 0) goto L_0x0572;
    L_0x0442:
        r0 = r29;
        r6 = r0.f19483j;
        r6 = r6.get(r9);
        r6 = (android.view.View) r6;
        r10 = r6.getBottom();
        if (r10 > r7) goto L_0x0562;
    L_0x0452:
        r7 = r6.getTop();
        r0 = r29;
        r9 = r0.af;
        r9 = r9.getBottom();
        if (r7 < r9) goto L_0x0572;
    L_0x0460:
        if (r6 == 0) goto L_0x0567;
    L_0x0462:
        r0 = r29;
        r7 = r0.ag;
        r7 = r7.getMeasuredWidth();
        r0 = r29;
        r8 = r0.ag;
        r8 = r8.getMeasuredHeight();
        r9 = android.support.v4.view.C0361r.m2051b(r11);
        r9 = r9 + r18;
        r0 = r21;
        r9 = com.google.android.play.utils.k.b(r0, r7, r15, r9);
        r10 = r6.getTop();
        r6 = r6.getHeight();
        r0 = r29;
        r11 = r0.ae;
        r11 = r11.getHeight();
        r6 = java.lang.Math.max(r6, r11);
        r6 = r6 / 2;
        r6 = r6 + r10;
        r10 = r8 / 2;
        r6 = r6 - r10;
        r8 = r8 + r6;
        r0 = r29;
        r10 = r0.ag;
        r7 = r7 + r9;
        r10.layout(r9, r6, r7, r8);
    L_0x04a1:
        r0 = r29;
        r6 = r0.al;
        r6 = r6.getMeasuredWidth();
        r0 = r29;
        r7 = r0.al;
        r7 = r7.getMeasuredHeight();
        r8 = r21 - r16;
        r8 = r8 - r18;
        r6 = r8 - r6;
        r6 = r6 / 2;
        r6 = r6 + r16;
        r8 = r22 - r19;
        r8 = r8 - r20;
        r7 = r8 - r7;
        r7 = r7 / 2;
        r7 = r7 + r19;
        r0 = r29;
        r8 = r0.al;
        r0 = r29;
        r9 = r0.al;
        r9 = r9.getMeasuredWidth();
        r9 = r9 + r6;
        r0 = r29;
        r10 = r0.al;
        r10 = r10.getMeasuredHeight();
        r10 = r10 + r7;
        r8.layout(r6, r7, r9, r10);
        r29.e();
        return;
    L_0x04e2:
        r6 = 0;
        r15 = r6;
        goto L_0x000c;
    L_0x04e6:
        r6 = 0;
        goto L_0x0232;
    L_0x04e9:
        r6 = r9.topMargin;
        r6 = r6 + r8;
        goto L_0x038d;
    L_0x04ee:
        r0 = r29;
        r6 = r0.f19479f;
        r6 = r6.getTop();
        r0 = r29;
        r7 = r0.f19482i;
        r7 = r7.getBaseline();
        r6 = r6 + r7;
        r0 = r29;
        r7 = r0.ah;
        r7 = r7.getBaseline();
        r6 = r6 - r7;
        goto L_0x03e8;
    L_0x050a:
        r0 = r29;
        r6 = r0.f19484k;
        if (r6 == 0) goto L_0x0575;
    L_0x0510:
        if (r15 == 0) goto L_0x054a;
    L_0x0512:
        r0 = r29;
        r6 = r0.af;
        r6 = r6.getLeft();
        r8 = r6 - r14;
        r0 = r29;
        r6 = r0.V;
        r6 = r6.getRight();
        if (r8 < r6) goto L_0x0548;
    L_0x0526:
        r6 = 1;
    L_0x0527:
        if (r6 == 0) goto L_0x0575;
    L_0x0529:
        r0 = r29;
        r6 = r0.af;
        r6 = r6.getTop();
        r0 = r29;
        r7 = r0.af;
        r7 = r7.getHeight();
        r7 = r7 / 2;
        r6 = r6 + r7;
        r7 = r17 / 2;
        r6 = r6 - r7;
        r7 = r6 + r17;
        r28 = r6;
        r6 = r7;
        r7 = r28;
        goto L_0x041f;
    L_0x0548:
        r6 = 0;
        goto L_0x0527;
    L_0x054a:
        r0 = r29;
        r6 = r0.af;
        r8 = r6.getRight();
        r0 = r29;
        r6 = r0.V;
        r6 = r6.getLeft();
        r9 = r8 + r14;
        if (r9 > r6) goto L_0x0560;
    L_0x055e:
        r6 = 1;
        goto L_0x0527;
    L_0x0560:
        r6 = 0;
        goto L_0x0527;
    L_0x0562:
        r6 = r9 + -1;
        r9 = r6;
        goto L_0x0440;
    L_0x0567:
        r0 = r29;
        r6 = r0.ag;
        r7 = 8;
        r6.setVisibility(r7);
        goto L_0x04a1;
    L_0x0572:
        r6 = r8;
        goto L_0x0460;
    L_0x0575:
        r6 = r10;
        r8 = r12;
        goto L_0x041f;
    L_0x0579:
        r8 = r14;
        goto L_0x0273;
    L_0x057c:
        r7 = r17;
        goto L_0x0211;
    L_0x0580:
        r14 = r16;
        goto L_0x00ed;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.playcard.PlayCardViewListingSmall.onLayout(boolean, int, int, int, int):void");
    }

    public int getCardType() {
        return 4;
    }
}
