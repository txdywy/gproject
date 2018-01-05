package com.google.android.finsky.stream.controllers.floatinghighlights.view;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class TitleAndSubtitleBannerView extends C4396h {
    public final int f22328a;
    public final int f22329b;
    public TextView f22330c;
    public ce f22331d;

    public TitleAndSubtitleBannerView(Context context) {
        this(context, null);
    }

    public TitleAndSubtitleBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22331d = C2482j.m13283a(551);
        this.f22328a = C0216d.m1116c(context, C7582R.color.floating_highlights_banner_dark_theme_subtitle_text_color);
        this.f22329b = C0216d.m1116c(context, C7582R.color.floating_highlights_banner_light_theme_subtitle_text_color);
    }

    protected C4397g getGradientConfig() {
        return new C4404l(this.g, this.h, this.i, this.j);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22330c = (TextView) findViewById(C7582R.id.banner_subtitle);
    }

    protected final void mo4191b() {
        super.mo4191b();
        if (this.f22330c.getVisibility() == 0) {
            this.f22330c.setTextColor(this.j ? this.f22328a : this.f22329b);
        }
    }

    public final void m20611a(C4406n c4406n, ad adVar, C4390j c4390j) {
        super.m20597a(c4406n.f22359a, adVar, c4390j);
        if (TextUtils.isEmpty(c4406n.f22360b)) {
            this.f22330c.setVisibility(8);
            return;
        }
        this.f22330c.setVisibility(0);
        this.f22330c.setText(c4406n.f22360b);
    }

    public ce getPlayStoreUiElement() {
        return this.f22331d;
    }
}
