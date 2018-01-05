package com.google.android.finsky.stream.controllers.musicmerchbanner.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.C2630c;
import com.google.android.finsky.frameworkviews.FadingEdgeImageView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class MusicMerchBannerView extends C2630c implements OnClickListener, ad, ae, be {
    public C1612l f22659a;
    public View f22660b;
    public ImageButton f22661c;
    public FifeImageView f22662d;
    public TextView f22663e;
    public TextView f22664f;
    public TextView f22665g;
    public View f22666h;
    public View f22667i;
    public int f22668j;
    public C4457a f22669k;
    public FadingEdgeImageView f22670l;
    public int f22671m;
    public final int f22672n;
    public ce f22673o;
    public ad f22674p;

    public MusicMerchBannerView(Context context) {
        this(context, null);
    }

    public MusicMerchBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22673o = C2482j.m13283a(465);
        this.f22672n = C0216d.m1116c(context, C7582R.color.play_multi_primary);
    }

    protected void onFinishInflate() {
        ((C1437c) C3947d.m18649a(C1437c.class)).mo1941a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22670l = (FadingEdgeImageView) findViewById(C1592a.f8440O.intValue());
        this.f22670l.setOnLoadedListener(this);
        this.f22660b = findViewById(C1592a.f8432G.intValue());
        this.f22661c = (ImageButton) findViewById(C1592a.f8435J.intValue());
        this.f22662d = (FifeImageView) findViewById(C1592a.f8439N.intValue());
        this.f22663e = (TextView) findViewById(C1592a.f8436K.intValue());
        this.f22664f = (TextView) findViewById(C1592a.f8437L.intValue());
        this.f22665g = (TextView) findViewById(C1592a.f8438M.intValue());
        this.f22666h = findViewById(C1592a.f8434I.intValue());
        this.f22667i = findViewById(C1592a.f8433H.intValue());
        this.f22668j = getResources().getDimensionPixelSize(C1592a.f8441P.intValue());
        setOnClickListener(this);
        this.f22661c.setOnClickListener(this);
    }

    public static void m20835a(TextView textView, View view, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
        view.setVisibility(0);
    }

    public final void m20839b() {
        boolean z;
        boolean z2 = true;
        if (ai.f1848a.mo400k(this) == 0) {
            z = true;
        } else {
            z = false;
        }
        FadingEdgeImageView fadingEdgeImageView = this.f22670l;
        if (z) {
            z2 = false;
        }
        fadingEdgeImageView.m16022a(z, z2, this.f22670l.getMeasuredWidth() / 2, this.f22671m);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.f22660b.measure(MeasureSpec.makeMeasureSpec(Math.round(((float) paddingLeft) * 0.45f), MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        int max = Math.max(ai.f1848a.mo395g(this), this.f22660b.getMeasuredHeight());
        this.f22670l.measure(MeasureSpec.makeMeasureSpec(Math.min(Math.min(Math.max((int) (2.0f * ((float) max)), (int) (0.5f * ((float) paddingLeft))), (int) (((float) paddingLeft) * 0.7f)), (int) (2.6f * ((float) max))), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(max, MemoryMappedFileBuffer.DEFAULT_SIZE));
        this.f22661c.measure(MeasureSpec.makeMeasureSpec(this.f22661c.getLayoutParams().width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(this.f22661c.getLayoutParams().height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        setMeasuredDimension(size, (getPaddingTop() + max) + getPaddingBottom());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int measuredHeight = (getMeasuredHeight() - paddingTop) - getPaddingBottom();
        int measuredWidth = getMeasuredWidth();
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        measuredHeight = ((measuredHeight - this.f22660b.getMeasuredHeight()) / 2) + paddingTop;
        int a = k.a(measuredWidth, this.f22660b.getMeasuredWidth(), z2, ai.f1848a.mo401l(this));
        this.f22660b.layout(a, measuredHeight, this.f22660b.getMeasuredWidth() + a, this.f22660b.getMeasuredHeight() + measuredHeight);
        measuredHeight = k.b(measuredWidth, this.f22670l.getMeasuredWidth(), z2, ai.f1848a.mo402m(this));
        this.f22670l.layout(measuredHeight, paddingTop, this.f22670l.getMeasuredWidth() + measuredHeight, this.f22670l.getMeasuredHeight() + paddingTop);
        int b = k.b(measuredWidth, this.f22661c.getMeasuredWidth(), z2, ai.f1848a.mo402m(this));
        this.f22661c.layout(b, paddingTop, this.f22661c.getMeasuredWidth() + b, this.f22661c.getMeasuredHeight() + paddingTop);
    }

    public final void Z_() {
        this.f22669k = null;
        this.f22674p = null;
        this.f22670l.a();
        this.f22662d.a();
    }

    public final void m20838a(FifeImageView fifeImageView, Bitmap bitmap) {
        m20839b();
    }

    public final void m20837a(FifeImageView fifeImageView) {
    }

    public ce getPlayStoreUiElement() {
        return this.f22673o;
    }

    public ad getParentNode() {
        return this.f22674p;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public void onClick(View view) {
        if (view.getId() == C1592a.f8435J.intValue()) {
            this.f22669k.mo4215b(this.f22674p);
        } else {
            this.f22669k.mo4214a((ad) view);
        }
    }
}
