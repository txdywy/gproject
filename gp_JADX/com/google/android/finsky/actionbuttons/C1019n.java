package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class C1019n implements OnClickListener {
    public final /* synthetic */ C3748a f6252a;
    public final /* synthetic */ C2454a f6253b;
    public final /* synthetic */ C2495w f6254c;
    public final /* synthetic */ ad f6255d;

    C1019n(C3748a c3748a, C2454a c2454a, C2495w c2495w, ad adVar) {
        this.f6252a = c3748a;
        this.f6253b = c2454a;
        this.f6254c = c2495w;
        this.f6255d = adVar;
    }

    public final void onClick(View view) {
        this.f6252a.mo3657a(this.f6253b.f13237h, this.f6254c);
        this.f6254c.m13379b(new C2475d(this.f6255d));
    }
}
