package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

public final class C3727t implements OnClickListener {
    public final /* synthetic */ C3748a f18845a;
    public final /* synthetic */ Document f18846b;
    public final /* synthetic */ C2495w f18847c;
    public final /* synthetic */ ad f18848d;

    public C3727t(C3748a c3748a, Document document, C2495w c2495w, ad adVar) {
        this.f18845a = c3748a;
        this.f18846b = document;
        this.f18847c = c2495w;
        this.f18848d = adVar;
    }

    public final void onClick(View view) {
        this.f18845a.mo3691b(this.f18846b.f14885a.f12116w);
        this.f18847c.m13379b(new C2475d(this.f18848d).m13256a(207));
    }
}
