package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.view.C0361r;
import android.support.v4.view.p039b.C0344b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.layout.b;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class PlayHighlightsBannerItemView extends b implements OnClickListener, ad, ae, be {
    public static final int[] f18714a = new int[]{2};
    public static StringBuilder f18715s;
    public TextView f18716b;
    public TextView f18717c;
    public View f18718d;
    public View f18719e;
    public Document f18720f;
    public DocImageView f18721g;
    public View f18722h;
    public C3748a f18723i;
    public C2495w f18724j;
    public TextView f18725k;
    public be f18726l;
    public int f18727m;
    public final Rect f18728n;
    public final Interpolator f18729o;
    public final OnScrollChangedListener f18730p;
    public ce f18731q;
    public ad f18732r;

    public static void m17566b() {
        StringBuilder stringBuilder = new StringBuilder();
        f18715s = stringBuilder;
        stringBuilder.append("transition_generic_circle:");
    }

    public PlayHighlightsBannerItemView(Context context) {
        this(context, null);
    }

    public PlayHighlightsBannerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHighlightsBannerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18728n = new Rect();
        this.f18729o = new C0344b();
        this.f18730p = new am(this);
        this.f18731q = C2482j.m13283a(523);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
        if (InsetsFrameLayout.f14024a) {
            k.e(getContext());
        }
        context.getResources();
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18716b = (TextView) findViewById(C7582R.id.li_title);
        this.f18717c = (TextView) findViewById(C7582R.id.li_subtitle);
        this.f18722h = findViewById(C7582R.id.highlight_overlay_title);
        this.f18721g = (DocImageView) findViewById(C7582R.id.li_thumbnail);
        this.f18719e = findViewById(C7582R.id.gradient_overlay);
        this.f18725k = (TextView) findViewById(C7582R.id.index);
        Resources resources = getResources();
        if (!InsetsFrameLayout.f14024a) {
            k.e(getContext());
        }
        this.f18718d = findViewById(C7582R.id.background);
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_highlight_banner_item_card_xmargin);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        if (C1473m.f7980a.bT().m11025d()) {
            marginLayoutParams.setMargins(dimensionPixelSize, resources.getDimensionPixelSize(C7582R.dimen.ia2_stream_highlight_banner_item_card_top_margin), dimensionPixelSize, resources.getDimensionPixelSize(C7582R.dimen.ia2_stream_highlight_banner_item_card_bottom_margin));
        } else {
            C0361r.m2050a(marginLayoutParams, dimensionPixelSize);
            C0361r.m2052b(marginLayoutParams, dimensionPixelSize);
        }
        setLayoutParams(marginLayoutParams);
        if (C1473m.f7980a.aN().dj().mo2294a(12632714)) {
            if (this.f18716b != null) {
                this.f18716b.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.highlight_banner_item_card_title_size_large_tablet));
            }
            if (this.f18717c != null) {
                this.f18717c.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.highlight_banner_item_card_subtitle_size_large_tablet));
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (i4 != this.f18727m) {
            this.f18727m = i4;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f18730p);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f18730p);
    }

    public ce getPlayStoreUiElement() {
        return this.f18731q;
    }

    public ad getParentNode() {
        return this.f18732r;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public final void m17569a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (this.f18726l != null) {
            this.f18726l.a(fifeImageView, bitmap);
        }
    }

    public final void m17568a(FifeImageView fifeImageView) {
        if (this.f18726l != null) {
            this.f18726l.a(fifeImageView);
        }
    }

    public final void Z_() {
        this.f18721g.setOnLoadedListener(null);
        this.f18721g.a();
        this.f18726l = null;
        setOnClickListener(null);
    }

    public void onClick(View view) {
        this.f18723i.mo3654a(this.f18720f, (ad) this, this.f18721g, this.f18724j);
    }

    static {
        if (C3760e.m17903a()) {
            m17566b();
        }
    }
}
