package com.google.android.finsky.activities.myapps;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.nano.gj;

final class C1104c implements OnClickListener {
    public final /* synthetic */ C3748a f6996a;
    public final /* synthetic */ gj f6997b;
    public final /* synthetic */ DfeToc f6998c;
    public final /* synthetic */ C2495w f6999d;

    C1104c(C3748a c3748a, gj gjVar, DfeToc dfeToc, C2495w c2495w) {
        this.f6996a = c3748a;
        this.f6997b = gjVar;
        this.f6998c = dfeToc;
        this.f6999d = c2495w;
    }

    public final void onClick(View view) {
        this.f6996a.mo3693b(this.f6997b.e, this.f6997b.d, 3, this.f6998c, this.f6999d);
    }
}
