package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

final class C1092d implements C1091e {
    public final /* synthetic */ C1473m f6956a;
    public final /* synthetic */ C1090c f6957b;

    C1092d(C1090c c1090c, C1473m c1473m) {
        this.f6957b = c1090c;
        this.f6956a = c1473m;
    }

    public final void mo1425a(Account account, Document document) {
        C2713b k = this.f6956a.mo2251k(account.name);
        if (k != null) {
            k.m14711a(document.f14885a.f12096c);
        }
        this.f6957b.m6762a(account, document);
    }

    public final void S_() {
        this.f6957b.m6765a(this.f6957b.m592c((int) C7582R.string.generic_get_app_error));
    }
}
