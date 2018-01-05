package com.google.android.finsky.stream.controllers.merchbanner.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.C2630c;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatMerchBannerView extends C2630c implements OnClickListener, ad, ae, be {
    public C1612l f22551a;
    public View f22552b;
    public TextView f22553c;
    public TextView f22554d;
    public View f22555e;
    public C4441a f22556f;
    public FadingEdgeImageView f22557g;
    public int f22558h;
    public final int f22559i;
    public ce f22560j;
    public ad f22561k;

    public FlatMerchBannerView(Context context) {
        this(context, null);
    }

    public FlatMerchBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22560j = C2482j.m13283a(409);
        this.f22559i = C0216d.m1116c(context, C7582R.color.play_multi_primary);
    }

    protected void onFinishInflate() {
        ((C1435c) C3947d.m18649a(C1435c.class)).mo1938a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22557g = (FadingEdgeImageView) findViewById(C7582R.id.merch_image);
        this.f22557g.setOnLoadedListener(this);
        this.f22552b = findViewById(C7582R.id.banner_title_group);
        this.f22553c = (TextView) findViewById(C7582R.id.banner_title);
        this.f22554d = (TextView) findViewById(C7582R.id.banner_button);
        this.f22555e = findViewById(C7582R.id.title_button_spacer);
        setOnClickListener(this);
    }

    public final void m20778b() {
        this.f22557g.m16022a(true, false, this.f22557g.getMeasuredWidth() / 2, this.f22558h);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.f22553c.measure(MeasureSpec.makeMeasureSpec(Math.round(((float) paddingLeft) * 0.45f), Integer.MIN_VALUE), 0);
        if (this.f22553c.getLineCount() >= getResources().getInteger(C7582R.integer.flat_merch_banner_title_text_max_lines)) {
            this.f22554d.measure(0, MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE));
            this.f22555e.measure(0, MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        int max = Math.max(ai.f1848a.mo395g(this), m20774c());
        this.f22557g.measure(MeasureSpec.makeMeasureSpec(Math.min(Math.min(Math.max((int) (2.0f * ((float) max)), (int) (0.5f * ((float) paddingLeft))), (int) (((float) paddingLeft) * 0.7f)), (int) (2.6f * ((float) max))), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(max, MemoryMappedFileBuffer.DEFAULT_SIZE));
        setMeasuredDimension(size, (getPaddingTop() + max) + getPaddingBottom());
        this.f22557g.setScaleX(ai.f1848a.mo400k(this) == 0 ? 1.0f : -1.0f);
    }

    private final int m20774c() {
        return (((this.f22553c.getMeasuredHeight() + this.f22555e.getMeasuredHeight()) + this.f22554d.getMeasuredHeight()) + this.f22552b.getPaddingTop()) + this.f22552b.getPaddingBottom();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - paddingTop) - paddingBottom;
        int c = m20774c();
        this.f22552b.layout(paddingLeft, ((measuredHeight - c) / 2) + paddingTop, getPaddingLeft() + this.f22552b.getMeasuredWidth(), ((measuredHeight + c) / 2) + getPaddingTop());
        if (ai.f1848a.mo400k(this) == 0) {
            paddingRight = getMeasuredWidth() - paddingRight;
            paddingLeft = paddingRight - this.f22557g.getMeasuredWidth();
        } else {
            paddingRight = this.f22557g.getMeasuredWidth() + paddingLeft;
        }
        this.f22557g.layout(paddingLeft, paddingTop, paddingRight, getMeasuredHeight() - paddingBottom);
    }

    public final void Z_() {
        this.f22556f = null;
        this.f22561k = null;
        this.f22557g.a();
    }

    public final void m20777a(FifeImageView fifeImageView, Bitmap bitmap) {
        m20778b();
    }

    public final void m20776a(FifeImageView fifeImageView) {
    }

    public ce getPlayStoreUiElement() {
        return this.f22560j;
    }

    public ad getParentNode() {
        return this.f22561k;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public void onClick(View view) {
        this.f22556f.mo4210a((ad) view);
    }
}
