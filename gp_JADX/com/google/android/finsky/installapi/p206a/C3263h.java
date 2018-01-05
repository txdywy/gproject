package com.google.android.finsky.installapi.p206a;

import android.accounts.Account;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installapi.C3272g;

final class C3263h implements C1091e {
    public final /* synthetic */ C3262g f16810a;

    C3263h(C3262g c3262g) {
        this.f16810a = c3262g;
    }

    public final void mo1425a(Account account, Document document) {
        C3260e c3260e = this.f16810a.f16809c;
        C3272g c3272g = this.f16810a.f16808b;
        c3260e.f16799c.mo3440a(c3260e.f16803g, c3272g.f16844c.getBoolean("show_progress", true), c3272g.f16844c.getBoolean("show_errors", true), c3272g.f16844c.getBoolean("show_completion", true));
        c3260e.f16799c.mo3433a(c3260e.f16803g, document.m14653h(), account.name, document.f14885a.f12100g, 2, document.m14671z(), c3272g.f16842a, c3260e.f16797a.m13184a("isotope_install"));
    }

    public final void S_() {
    }
}
