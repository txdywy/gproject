package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2659o implements OnClickListener {
    public final /* synthetic */ Document f14705a;
    public final /* synthetic */ String f14706b;
    public final /* synthetic */ C2495w f14707c;
    public final /* synthetic */ C2627n f14708d;

    C2659o(C2627n c2627n, Document document, String str, C2495w c2495w) {
        this.f14708d = c2627n;
        this.f14705a = document;
        this.f14706b = str;
        this.f14707c = c2495w;
    }

    public final void onClick(View view) {
        this.f14708d.f13931b.m13379b(new C2475d(this.f14708d.l).m13256a(2929));
        this.f14708d.k.mo3660a(this.f14705a, this.f14706b, false, this.f14707c);
    }
}
