package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.a;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeFamilyAgeRange extends C3689a {
    public FifeImageView f18645w;

    public DiscoveryBadgeFamilyAgeRange(Context context) {
        super(context, null);
    }

    public DiscoveryBadgeFamilyAgeRange(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18645w = (FifeImageView) findViewById(C7582R.id.overlay_icon);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.q) {
            m17493a(canvas);
        }
    }

    @SuppressLint({"NewApi"})
    public final void mo3583a(cc ccVar, C1294w c1294w, C3748a c3748a, Document document, DfeToc dfeToc, PackageManager packageManager, ad adVar, C2495w c2495w) {
        super.mo3583a(ccVar, c1294w, c3748a, document, dfeToc, packageManager, adVar, c2495w);
        C1473m.f7980a.ar().m9288a(this.f18645w, ccVar.e.f11860f, ccVar.e.f11863i);
    }

    protected final void mo3587a(cc ccVar) {
        if (this.q) {
            C3689a.m17491a(this.b);
            return;
        }
        this.b.setBitmapTransformation(a.b(getResources(), this.e));
    }

    protected int getPlayStoreUiElementType() {
        return 1801;
    }

    protected int getBadgeRadiusResId() {
        return C7582R.dimen.discovery_badge_family_age_range_radius;
    }
}
