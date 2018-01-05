package com.google.android.finsky.layout;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C3728u implements OnClickListener {
    public final /* synthetic */ Document f18849a;
    public final /* synthetic */ Account f18850b;
    public final /* synthetic */ C2495w f18851c;
    public final /* synthetic */ C3748a f18852d;
    public final /* synthetic */ DetailsSummaryWishlistView f18853e;

    C3728u(DetailsSummaryWishlistView detailsSummaryWishlistView, Document document, Account account, C2495w c2495w, C3748a c3748a) {
        this.f18853e = detailsSummaryWishlistView;
        this.f18849a = document;
        this.f18850b = account;
        this.f18851c = c2495w;
        this.f18852d = c3748a;
    }

    public final void onClick(View view) {
        int i;
        C1254c ap = C1473m.f7980a.ap();
        if (this.f18853e.f18128c.m15402a(this.f18849a, this.f18850b)) {
            i = 205;
        } else {
            i = 204;
        }
        this.f18851c.m13379b(new C2475d(this.f18852d.mo3712n()).m13256a(i));
        this.f18853e.f18128c.m15398a(this.f18853e, this.f18849a, ap);
    }
}
