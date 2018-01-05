package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class ai extends C0996o implements OnClickListener {
    public final C3748a f6048f;
    public final Document f6049g;
    public final Account f6050h;
    public final boolean f6051i;
    public final C2162a f6052j;

    ai(Context context, int i, C3748a c3748a, Document document, ad adVar, Account account, C2495w c2495w, boolean z, C2162a c2162a) {
        super(context, i, c2495w, adVar);
        this.f6049g = document;
        this.f6048f = c3748a;
        this.f6050h = account;
        this.f6051i = z;
        this.f6052j = c2162a;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        playActionButtonV2.mo2588a(this.f6049g.f14885a.f12099f, this.a.getResources().getString(C7582R.string.listen), (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        if (this.f6051i) {
            m5893b();
        }
    }

    public final void onClick(View view) {
        m5894c();
        int i = this.f6049g.f14885a.f12099f;
        if (this.f6052j.mo2703a(this.a.getPackageManager(), i)) {
            Intent a = this.f6052j.mo2686a(this.a, this.f6049g, this.f6050h.name);
            a.addFlags(268435456);
            this.a.startActivity(a);
            return;
        }
        this.f6048f.mo3684b(i);
    }

    public final int mo1200a() {
        return 285;
    }
}
