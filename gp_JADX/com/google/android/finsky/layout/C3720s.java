package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

public final class C3720s implements OnClickListener {
    public final /* synthetic */ C3748a f18812a;
    public final /* synthetic */ C2495w f18813b;
    public final /* synthetic */ ad f18814c;

    public C3720s(C3748a c3748a, C2495w c2495w, ad adVar) {
        this.f18812a = c3748a;
        this.f18813b = c2495w;
        this.f18814c = adVar;
    }

    public final void onClick(View view) {
        this.f18812a.mo3662a((String) C0955b.ih.m28964b());
        this.f18813b.m13379b(new C2475d(this.f18814c).m13256a(1861));
    }
}
