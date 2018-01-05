package com.google.android.finsky.stream.controllers.warmwelcome.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class WarmWelcomeCard extends FrameLayout implements ad, ae {
    public C1612l f23147a;
    public TextView f23148b;
    public TextView f23149c;
    public View f23150d;
    public FifeImageView f23151e;
    public WarmWelcomeCardButton f23152f;
    public WarmWelcomeCardButton f23153g;
    public View f23154h;
    public final boolean f23155i;
    public final int f23156j;
    public ce f23157k;
    public ad f23158l;

    public WarmWelcomeCard(Context context) {
        this(context, null);
    }

    public WarmWelcomeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.WarmWelcomeCard);
        this.f23155i = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.f23156j = context.getResources().getDimensionPixelSize(C7582R.dimen.warm_welcome_title_top_padding);
    }

    protected void onFinishInflate() {
        ((C1444d) C3947d.m18649a(C1444d.class)).mo1959a(this);
        super.onFinishInflate();
        this.f23148b = (TextView) findViewById(C7582R.id.warm_welcome_title);
        this.f23149c = (TextView) findViewById(C7582R.id.warm_welcome_body);
        this.f23150d = findViewById(C7582R.id.warm_welcome_graphic_box);
        this.f23151e = (FifeImageView) this.f23150d.findViewById(C7582R.id.warm_welcome_graphic);
        this.f23152f = (WarmWelcomeCardButton) findViewById(C7582R.id.button_primary);
        this.f23153g = (WarmWelcomeCardButton) findViewById(C7582R.id.button_secondary);
        this.f23154h = findViewById(C7582R.id.button_separator);
    }

    public final void m21103b() {
        if (this.f23153g.getVisibility() == 8) {
            this.f23152f.setGravity(8388627);
            return;
        }
        this.f23152f.setGravity(17);
        this.f23153g.setGravity(17);
    }

    public final void Z_() {
        this.f23151e.a();
        this.f23152f.Z_();
        this.f23153g.Z_();
        this.f23158l = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f23157k;
    }

    public ad getParentNode() {
        return this.f23158l;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }
}
