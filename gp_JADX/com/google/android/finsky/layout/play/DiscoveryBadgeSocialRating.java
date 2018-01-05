package com.google.android.finsky.layout.play;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.StarRatingBar;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeSocialRating extends C3689a {
    public StarRatingBar f18660w;
    public View f18661x;
    public Drawable f18662y;

    public DiscoveryBadgeSocialRating(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeSocialRating(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18662y = C0259a.m1526e(C0216d.m1112a(context, (int) C7582R.drawable.social_rating_background).mutate());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18660w = (StarRatingBar) findViewById(C7582R.id.user_rating_bar);
        this.f18661x = findViewById(C7582R.id.user_rating_bar_container);
    }

    @TargetApi(16)
    public final void mo3583a(cc ccVar, C1294w c1294w, C3748a c3748a, Document document, DfeToc dfeToc, PackageManager packageManager, ad adVar, C2495w c2495w) {
        super.mo3583a(ccVar, c1294w, c3748a, document, dfeToc, packageManager, adVar, c2495w);
        this.f18660w.setRating((float) ccVar.k);
        C0259a.m1514a(this.f18662y, C1608h.m9243a(getContext(), document.f14885a.f12099f));
        if (VERSION.SDK_INT >= 16) {
            this.f18661x.setBackground(this.f18662y);
        } else {
            this.f18661x.setBackgroundDrawable(this.f18662y);
        }
        this.f18660w.setContentDescription(null);
    }

    protected int getPlayStoreUiElementType() {
        return 1803;
    }
}
