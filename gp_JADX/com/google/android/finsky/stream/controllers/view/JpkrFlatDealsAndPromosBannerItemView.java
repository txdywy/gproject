package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.b;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class JpkrFlatDealsAndPromosBannerItemView extends b implements OnClickListener, ad, ae {
    public static final int[] f22895a = new int[]{14, 2};
    public C1612l f22896b;
    public af f22897c;
    public float f22898d;
    public int f22899e;
    public FifeImageView f22900f;
    public TextView f22901g;
    public ce f22902h;
    public ad f22903i;
    public Document f22904j;
    public C3748a f22905k;
    public C2495w f22906l;

    public JpkrFlatDealsAndPromosBannerItemView(Context context) {
        this(context, null);
    }

    public JpkrFlatDealsAndPromosBannerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public JpkrFlatDealsAndPromosBannerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
        this.f22899e = -1;
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31325b;
    }

    public View getImageView() {
        return this.f22900f;
    }

    public Document getDoc() {
        return this.f22904j;
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1951a(this);
        super.onFinishInflate();
        this.f22900f = (FifeImageView) findViewById(C7582R.id.merch_image);
        this.f22901g = (TextView) findViewById(C7582R.id.banner_title);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (this.f22899e <= 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        this.f22900f.getLayoutParams().height = (int) (((float) ((size - ai.f1848a.mo401l(this)) - ai.f1848a.mo402m(this))) * this.f22898d);
        super.onMeasure(i, i2);
    }

    public final void Z_() {
        this.f22900f.setOnLoadedListener(null);
        this.f22900f.a();
        setOnClickListener(null);
        this.f22902h = null;
        this.f22903i = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22902h;
    }

    public ad getParentNode() {
        return this.f22903i;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public void onClick(View view) {
        this.f22905k.mo3655a(this.f22904j, (ad) this, this.f22906l);
    }
}
