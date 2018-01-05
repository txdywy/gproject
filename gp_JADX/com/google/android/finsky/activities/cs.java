package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.br.C2162a;

final class cs implements OnClickListener {
    public final /* synthetic */ Account f6641a;
    public final /* synthetic */ cq f6642b;

    cs(cq cqVar, Account account) {
        this.f6642b = cqVar;
        this.f6641a = account;
    }

    public final void onClick(View view) {
        C2162a bn = C1473m.f7980a.bn();
        this.f6642b.m6350d(285);
        int i = this.f6642b.D.f14885a.f12099f;
        if (bn.mo2703a(this.f6642b.B.getPackageManager(), i)) {
            Intent a = bn.mo2686a(this.f6642b.B, this.f6642b.D, this.f6641a.name);
            a.addFlags(268435456);
            this.f6642b.B.startActivity(a);
            return;
        }
        this.f6642b.z.mo3684b(i);
    }
}
