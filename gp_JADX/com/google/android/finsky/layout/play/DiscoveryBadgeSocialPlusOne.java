package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeSocialPlusOne extends C3689a {
    public View f18658w;
    public Drawable f18659x;

    public DiscoveryBadgeSocialPlusOne(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeSocialPlusOne(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18659x = C0259a.m1526e(C0216d.m1112a(context, (int) C7582R.drawable.social_pluseone_background).mutate());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18658w = findViewById(C7582R.id.plus_one_container);
    }

    @SuppressLint({"NewApi"})
    public final void mo3583a(cc ccVar, C1294w c1294w, C3748a c3748a, Document document, DfeToc dfeToc, PackageManager packageManager, ad adVar, C2495w c2495w) {
        super.mo3583a(ccVar, c1294w, c3748a, document, dfeToc, packageManager, adVar, c2495w);
        C0259a.m1514a(this.f18659x, getResources().getColor(C7582R.color.discovery_plus_one_background));
        if (VERSION.SDK_INT >= 16) {
            this.f18658w.setBackground(this.f18659x);
        } else {
            this.f18658w.setBackgroundDrawable(this.f18659x);
        }
        findViewById(C7582R.id.plus_one).setContentDescription(null);
    }

    protected int getPlayStoreUiElementType() {
        return 1804;
    }
}
