package com.google.android.finsky.activities;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.br.C2162a;

final class cr implements OnClickListener {
    public final /* synthetic */ Account f6639a;
    public final /* synthetic */ cq f6640b;

    cr(cq cqVar, Account account) {
        this.f6640b = cqVar;
        this.f6639a = account;
    }

    public final void onClick(View view) {
        this.f6640b.m6350d(286);
        C2162a bn = C1473m.f7980a.bn();
        if (bn.mo2702a(this.f6640b.B.getPackageManager())) {
            String str;
            C0955b.ea.m28964b();
            if (this.f6640b.f6637a) {
                str = (String) C0955b.ec.m28964b();
            } else {
                str = bn.mo2692a();
            }
            this.f6640b.B.startActivity(bn.mo2683a(2, str, this.f6639a.name));
            return;
        }
        this.f6640b.z.mo3684b(2);
    }
}
