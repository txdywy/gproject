package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.p111d.C2475d;

final class C2024m implements OnClickListener {
    public final /* synthetic */ C2011l f10464a;

    C2024m(C2011l c2011l) {
        this.f10464a = c2011l;
    }

    public final void onClick(View view) {
        this.f10464a.f10321q.m13379b(new C2475d(this.f10464a.f10310f).m13256a(2623));
        this.f10464a.f10308d.m580a(new Intent("android.intent.action.VIEW", C2056m.f10559a));
    }
}
