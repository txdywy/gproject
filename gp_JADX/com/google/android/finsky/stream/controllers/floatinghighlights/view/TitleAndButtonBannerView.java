package com.google.android.finsky.stream.controllers.floatinghighlights.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class TitleAndButtonBannerView extends C4396h {
    public TextView f22324a;
    public int f22325b;
    public View f22326c;
    public ce f22327d;

    public TitleAndButtonBannerView(Context context) {
        this(context, null);
    }

    public TitleAndButtonBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22327d = C2482j.m13283a(552);
    }

    protected C4397g getGradientConfig() {
        return new C4404l(this.g, this.h, this.i, this.j);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22324a = (TextView) findViewById(C7582R.id.banner_button);
        this.f22326c = findViewById(C7582R.id.title_button_spacer);
    }

    protected final void mo4191b() {
        super.mo4191b();
        if (this.f22324a.getVisibility() == 0) {
            this.f22324a.setTextColor(this.f);
            this.f22325b = getResources().getDimensionPixelSize(C7582R.dimen.floating_highlight_banner_button_stroke_width);
            ((GradientDrawable) this.f22324a.getBackground()).setStroke(this.f22325b, this.f);
        }
    }

    public final void m20609a(C4405m c4405m, ad adVar, C4390j c4390j) {
        super.m20597a(c4405m.f22357a, adVar, c4390j);
        CharSequence charSequence = c4405m.f22358b;
        if (TextUtils.isEmpty(charSequence)) {
            this.f22324a.setVisibility(8);
            this.f22326c.setVisibility(8);
        } else {
            this.f22324a.setVisibility(0);
            this.f22324a.setText(charSequence);
            this.f22326c.setVisibility(0);
        }
        mo4191b();
    }

    public ce getPlayStoreUiElement() {
        return this.f22327d;
    }
}
