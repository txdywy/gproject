package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.support.v4.p013b.p014a.C0259a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.ForegroundLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class JpkrRecommendedCategoriesItem extends ForegroundLinearLayout implements ad, ae {
    public C1612l f22963a;
    public View f22964b;
    public TextView f22965c;
    public FifeImageView f22966d;
    public String f22967e;
    public int f22968f;
    public ip f22969g;
    public C3748a f22970h;
    public DfeToc f22971i;
    public C2495w f22972j;
    public ad f22973k;
    public ce f22974l;

    public JpkrRecommendedCategoriesItem(Context context) {
        super(context);
    }

    public JpkrRecommendedCategoriesItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JpkrRecommendedCategoriesItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1955a(this);
        super.onFinishInflate();
        this.f22965c = (TextView) findViewById(C7582R.id.li_title);
        this.f22966d = (FifeImageView) findViewById(C7582R.id.li_icon);
        this.f22964b = findViewById(C7582R.id.icon_outer_frame);
    }

    public final void Z_() {
        this.f22967e = null;
        this.f22969g = null;
        this.f22970h = null;
        this.f22971i = null;
        this.f22966d.a();
        this.f22972j = null;
        setOnClickListener(null);
        C0259a.m1514a(this.f22964b.getBackground(), 0);
    }

    public ce getPlayStoreUiElement() {
        if (this.f22974l == null) {
            this.f22974l = C2482j.m13283a(100);
        }
        return this.f22974l;
    }

    public ad getParentNode() {
        return this.f22973k;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
