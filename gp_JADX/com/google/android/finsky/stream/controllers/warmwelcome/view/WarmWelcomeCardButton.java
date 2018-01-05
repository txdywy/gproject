package com.google.android.finsky.stream.controllers.warmwelcome.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class WarmWelcomeCardButton extends AccessibleLinearLayout implements OnClickListener, ae {
    public C1612l f23159a;
    public C4523b f23160b;
    public C4526c f23161d;
    public FifeImageView f23162e;
    public TextView f23163f;
    public ad f23164g;

    public WarmWelcomeCardButton(Context context) {
        this(context, null);
    }

    public WarmWelcomeCardButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        ((C1444d) C3947d.m18649a(C1444d.class)).mo1960a(this);
        super.onFinishInflate();
        this.f23162e = (FifeImageView) findViewById(C7582R.id.icon);
        this.f23163f = (TextView) findViewById(C7582R.id.text);
    }

    public final void Z_() {
        this.f23162e.a();
        this.f23160b = null;
        this.f23164g = null;
    }

    public void onClick(View view) {
        this.f23160b.mo4256a(this.f23161d, this.f23164g, this.f23161d.f23175c ? 1231 : 1232);
    }
}
