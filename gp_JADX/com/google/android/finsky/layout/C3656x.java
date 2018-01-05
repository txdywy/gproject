package com.google.android.finsky.layout;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C3150x;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public abstract class C3656x extends LinearLayout implements ad, C3150x {
    public Document f18136d;
    public cc[] f18137e;
    public C1294w f18138f;
    public C3748a f18139g;
    public DfeToc f18140h;
    public PackageManager f18141i;
    public LinearLayout f18142j;
    public boolean f18143k = C1473m.f7980a.dj().mo2294a(12631888);
    public C2495w f18144l;
    public boolean f18145m = false;
    public ad f18146n;
    public ce f18147o = C2482j.m13283a(1800);

    public C3656x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void mo3557a();

    public abstract void setupBadgePlaceholder(LayoutInflater layoutInflater);

    public abstract void setupEmptyPlaceholder(LayoutInflater layoutInflater);

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18142j = (LinearLayout) findViewById(C7582R.id.badge_container);
    }

    public ce getPlayStoreUiElement() {
        return this.f18147o;
    }

    public ad getParentNode() {
        return this.f18146n;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public int getScrollPosition() {
        return 0;
    }

    public void mo3558a(boolean z, int i) {
    }
}
