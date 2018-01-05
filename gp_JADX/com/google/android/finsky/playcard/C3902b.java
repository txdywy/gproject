package com.google.android.finsky.playcard;

import android.content.Context;
import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import java.util.List;

public final class C3902b implements C3900a {
    public C1006c f19618a;
    public Document f19619b;
    public Document f19620c = null;
    public C2495w f19621d;

    public C3902b(C1011h c1011h, C3748a c3748a, Context context, Document document, ad adVar, C2495w c2495w, List list) {
        this.f19618a = c1011h.m5977a(c3748a.mo3709k(), c3748a.mo3711m(), c3748a, context, null, adVar, 0, null, 3, list, true, false, true);
        this.f19619b = document;
        this.f19621d = c2495w;
    }

    public final void mo3863a(DetailsSummaryDynamic detailsSummaryDynamic) {
        this.f19618a.m5959a(this.f19619b, this.f19620c, this.f19621d, detailsSummaryDynamic);
    }

    public final void mo3862a() {
        this.f19618a.m5955a();
    }
}
