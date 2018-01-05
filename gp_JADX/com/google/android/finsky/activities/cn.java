package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;

final class cn implements OnClickListener {
    public final /* synthetic */ Document f6631a;
    public final /* synthetic */ Account f6632b;
    public final /* synthetic */ cm f6633c;

    cn(cm cmVar, Document document, Account account) {
        this.f6633c = cmVar;
        this.f6631a = document;
        this.f6632b = account;
    }

    public final void onClick(View view) {
        this.f6633c.m6350d(224);
        if (C1473m.f7980a.bn().mo2703a(this.f6633c.B.getPackageManager(), this.f6631a.f14885a.f12099f)) {
            this.f6633c.B.startActivity(C1473m.f7980a.bn().mo2707b(this.f6633c.B, this.f6631a, this.f6632b.name));
            return;
        }
        this.f6633c.z.mo3684b(this.f6631a.f14885a.f12099f);
    }
}
