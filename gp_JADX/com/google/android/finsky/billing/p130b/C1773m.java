package com.google.android.finsky.billing.p130b;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.p153c.C1779a;
import com.google.android.finsky.dialogbuilder.C1765f;
import com.google.android.finsky.dialogbuilder.C2796h;
import com.google.android.finsky.dialogbuilder.p154b.C1686l;
import com.google.android.finsky.dialogbuilder.p154b.C2786a;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.play.dfe.api.DfeResponseVerifier;

public final class C1773m implements LoaderCallbacks {
    public final Context f9174a;
    public final C1254c f9175b;
    public final C1763d f9176c;
    public final C1779a f9177d;
    public final C1774n f9178e;
    public final C2786a f9179f;
    public final C2792h f9180g;
    public final C1764f f9181h;
    public final C1686l f9182i;
    public final DfeResponseVerifier f9183j;
    public final C1552e f9184k;
    public C1765f f9185l;
    public C2796h f9186m;

    public C1773m(Context context, C1254c c1254c, DfeResponseVerifier dfeResponseVerifier, C1763d c1763d, C1779a c1779a, C1774n c1774n, C2786a c2786a, C2792h c2792h, C1764f c1764f, C1686l c1686l, C1552e c1552e) {
        this.f9174a = context;
        this.f9175b = c1254c;
        this.f9176c = c1763d;
        this.f9177d = c1779a;
        this.f9178e = c1774n;
        this.f9179f = c2786a;
        this.f9180g = c2792h;
        this.f9181h = c1764f;
        this.f9182i = c1686l;
        this.f9183j = dfeResponseVerifier;
        this.f9184k = c1552e;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new C1769i(this.f9174a, this.f9175b, this.f9183j, this.f9176c, this.f9177d, this.f9178e, this.f9179f, this.f9180g, this.f9181h, this.f9182i, this.f9184k);
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        if (this.f9186m == null) {
            return;
        }
        if ((loader instanceof C1769i) && ((C1769i) loader).m9716a()) {
            this.f9185l.mo2451g();
        } else {
            this.f9186m.mo3137a();
        }
    }
}
