package com.google.android.finsky.stream.controllers.floatinghighlights.view;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.PlayCardLabelView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class AppInfoBannerView extends C4396h {
    public final int f22310a;
    public final int f22311b;
    public FifeImageView f22312c;
    public PlayCardLabelView f22313d;
    public ce f22314e;

    public AppInfoBannerView(Context context) {
        this(context, null);
    }

    public AppInfoBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22314e = C2482j.m13283a(553);
        this.f22310a = C0216d.m1116c(context, C7582R.color.floating_highlights_banner_dark_theme_subtitle_text_color);
        this.f22311b = C0216d.m1116c(context, C7582R.color.floating_highlights_banner_light_theme_subtitle_text_color);
    }

    protected C4397g getGradientConfig() {
        return new C4398a(this.g, this.h, this.i, this.j);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22313d = (PlayCardLabelView) findViewById(C7582R.id.banner_label);
        this.f22312c = (FifeImageView) findViewById(C7582R.id.banner_thumbnail);
    }

    public final void m20601a(C4399b c4399b, ad adVar, C4390j c4390j) {
        int i;
        int i2;
        super.m20597a(c4399b.f22334a, adVar, c4390j);
        if (c4399b.f22335b != null) {
            this.l.m9288a(this.f22312c, c4399b.f22335b.f11860f, c4399b.f22335b.f11863i);
        } else {
            FinskyLog.m21667d("Missing thumbnail for Floating Highlights Banner.", new Object[0]);
        }
        if (TextUtils.isEmpty(c4399b.f22336c)) {
            i = 0;
        } else {
            i = 1;
        }
        if (TextUtils.isEmpty(c4399b.f22337d)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i2 != 0 && i != 0) {
            int i3;
            this.f22313d.setVisibility(0);
            String string = getResources().getString(C7582R.string.content_description_on_sale_price, new Object[]{c4399b.f22337d, c4399b.f22336c});
            PlayCardLabelView playCardLabelView = this.f22313d;
            String str = c4399b.f22336c;
            int i4 = this.f;
            String str2 = c4399b.f22337d;
            if (this.j) {
                i3 = this.f22310a;
            } else {
                i3 = this.f22311b;
            }
            playCardLabelView.a(str, i4, str2, i3, string);
        } else if (i != 0) {
            this.f22313d.setVisibility(0);
            this.f22313d.a(c4399b.f22336c, this.f, null, this.f, getResources().getString(C7582R.string.list_price, new Object[]{c4399b.f22336c}));
        } else {
            this.f22313d.setVisibility(8);
        }
    }

    public ce getPlayStoreUiElement() {
        return this.f22314e;
    }
}
