package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.frameworkviews.ThumbnailImageView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewLiveReengagement extends RelativeLayout implements ad, ae {
    public ce f19379a;
    public ad f19380b;
    public DetailsSummaryDynamic f19381c;
    public PlayTextView f19382d;
    public C3900a f19383e;
    public float f19384f;
    public PlayCardThumbnail f19385g;
    public PlayTextView f19386h;

    public FlatCardViewLiveReengagement(Context context) {
        this(context, null);
    }

    public FlatCardViewLiveReengagement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19379a = C2482j.m13283a(547);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19381c = (DetailsSummaryDynamic) findViewById(C7582R.id.title_details_summary_dynamic);
        this.f19382d = (PlayTextView) findViewById(C7582R.id.live_reengagement_text);
        this.f19385g = (PlayCardThumbnail) findViewById(C7582R.id.thumbnail_frame);
        this.f19386h = (PlayTextView) findViewById(C7582R.id.title);
    }

    protected void onMeasure(int i, int i2) {
        float f;
        float aspectRatio = ((ThumbnailImageView) this.f19385g.getImageView()).getAspectRatio();
        if (Float.isNaN(aspectRatio)) {
            f = this.f19384f;
        } else {
            f = aspectRatio;
        }
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f19385g.getLayoutParams();
        int i3 = marginLayoutParams.width;
        int i4 = (int) (f * ((float) i3));
        this.f19385g.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE));
        paddingLeft = ((paddingLeft + marginLayoutParams.leftMargin) + i3) + marginLayoutParams.rightMargin;
        i3 = MeasureSpec.getSize(i);
        paddingLeft = (i3 - paddingLeft) - paddingRight;
        paddingRight = MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE);
        this.f19386h.measure(paddingRight, 0);
        this.f19382d.measure(paddingRight, 0);
        this.f19381c.measure(MeasureSpec.makeMeasureSpec(paddingLeft + this.f19381c.getXStartOffset(), MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        paddingTop += marginLayoutParams.topMargin;
        setMeasuredDimension(i3, View.getDefaultSize((Math.max((this.f19386h.getMeasuredHeight() + this.f19382d.getMeasuredHeight()) + this.f19381c.getMeasuredHeight(), marginLayoutParams.bottomMargin + i4) + paddingTop) + paddingBottom, i2));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int measuredWidth = getMeasuredWidth();
        int paddingTop = getPaddingTop();
        int l = ai.f1848a.mo401l(this);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f19385g.getLayoutParams();
        int measuredWidth2 = this.f19385g.getMeasuredWidth();
        paddingTop += marginLayoutParams.topMargin;
        int measuredHeight = this.f19385g.getMeasuredHeight() + paddingTop;
        int a = k.a(measuredWidth, measuredWidth2, z2, C0361r.m2049a(marginLayoutParams) + l);
        this.f19385g.layout(a, paddingTop, a + measuredWidth2, measuredHeight);
        int i5 = (marginLayoutParams.rightMargin + (measuredWidth2 + marginLayoutParams.leftMargin)) + l;
        l = this.f19382d.getMeasuredWidth();
        measuredWidth2 = this.f19382d.getMeasuredHeight() + paddingTop;
        measuredHeight = k.a(measuredWidth, l, z2, i5);
        this.f19382d.layout(measuredHeight, paddingTop, l + measuredHeight, measuredWidth2);
        paddingTop = this.f19386h.getMeasuredWidth();
        l = this.f19386h.getMeasuredHeight() + measuredWidth2;
        measuredHeight = k.a(measuredWidth, paddingTop, z2, i5);
        this.f19386h.layout(measuredHeight, measuredWidth2, paddingTop + measuredHeight, l);
        paddingTop = this.f19381c.getMeasuredWidth();
        measuredWidth2 = this.f19381c.getMeasuredHeight() + l;
        measuredHeight = this.f19381c.getXStartOffset();
        i5 = k.a(measuredWidth, paddingTop, z2, i5 - measuredHeight);
        this.f19381c.layout(i5, l, (i5 + paddingTop) + measuredHeight, measuredWidth2);
    }

    public View[] getTransitionViews() {
        return new View[]{this.f19385g.getImageView()};
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public ad getParentNode() {
        return this.f19380b;
    }

    public ce getPlayStoreUiElement() {
        return this.f19379a;
    }

    public final void Z_() {
        if (this.f19385g != null) {
            ((ThumbnailImageView) this.f19385g.getImageView()).a();
        }
        if (this.f19383e != null) {
            this.f19383e.mo3862a();
        }
        this.f19380b = null;
    }
}
