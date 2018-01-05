package com.google.android.finsky.du;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p111d.C2471a;
import com.squareup.leakcanary.C7582R;

final class C2898f implements C1031w {
    public final /* synthetic */ String f15408a;
    public final /* synthetic */ C2896d f15409b;

    C2898f(C2896d c2896d, String str) {
        this.f15409b = c2896d;
        this.f15408a = str;
    }

    public final void m_() {
        if (this.f15409b.f15405g.m14722b() != null) {
            Document b = this.f15409b.f15405g.m14722b();
            ((ab) this.f15409b.f15404f.mo1a()).mo3791a(this.f15409b.f15399a.getResources().getString(C7582R.string.active_subscriptions_title, new Object[]{b.f14885a.f12100g}), this.f15408a, this.f15409b.f15399a.getResources().getString(C7582R.string.active_subscriptions_body), ((C2471a) this.f15409b.f15400b.mo1a()).m13184a(null));
        }
    }
}
