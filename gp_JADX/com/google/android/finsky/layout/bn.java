package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.nano.bm;

public final class bn implements OnClickListener {
    public final /* synthetic */ C3748a f18529a;
    public final /* synthetic */ bm f18530b;
    public final /* synthetic */ DfeToc f18531c;
    public final /* synthetic */ C2495w f18532d;
    public final /* synthetic */ RottenTomatoesReviewsHeader f18533e;

    public bn(RottenTomatoesReviewsHeader rottenTomatoesReviewsHeader, C3748a c3748a, bm bmVar, DfeToc dfeToc, C2495w c2495w) {
        this.f18533e = rottenTomatoesReviewsHeader;
        this.f18529a = c3748a;
        this.f18530b = bmVar;
        this.f18531c = dfeToc;
        this.f18532d = c2495w;
    }

    public final void onClick(View view) {
        this.f18529a.mo3639a(this.f18530b.g, this.f18531c, this.f18533e.getContext().getPackageManager(), this.f18532d);
    }
}
