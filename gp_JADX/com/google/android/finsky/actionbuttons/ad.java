package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;

final class ad extends C0996o implements OnClickListener {
    public final C3748a f6026f;
    public final Document f6027g;
    public final Account f6028h;
    public final boolean f6029i;
    public final C2162a f6030j;

    ad(Context context, int i, C3748a c3748a, Document document, com.google.android.finsky.p111d.ad adVar, Account account, C2495w c2495w, boolean z, C2162a c2162a) {
        super(context, i, c2495w, adVar);
        this.f6027g = document;
        this.f6026f = c3748a;
        this.f6028h = account;
        this.f6029i = z;
        this.f6030j = c2162a;
    }

    public final void mo1201a(PlayActionButtonV2 playActionButtonV2) {
        String string;
        int i = this.f6027g.f14885a.f12099f;
        if (this.f6029i) {
            string = this.a.getResources().getString(C1592a.f8476y.intValue());
        } else {
            string = this.a.getResources().getString(C7582R.string.all_access_button_free_trial);
        }
        playActionButtonV2.mo2588a(i, string, (OnClickListener) this);
        playActionButtonV2.setActionStyle(this.b);
        if (this.f6029i) {
            m5893b();
        }
    }

    public final void onClick(View view) {
        m5894c();
        if (this.f6030j.mo2702a(this.a.getPackageManager())) {
            String str;
            C0955b.ea.m28964b();
            if (this.f6029i) {
                str = (String) C0955b.ec.m28964b();
            } else {
                str = this.f6030j.mo2692a();
            }
            this.a.startActivity(this.f6030j.mo2683a(2, str, this.f6028h.name));
            return;
        }
        this.f6026f.mo3684b(2);
    }

    public final int mo1200a() {
        return 286;
    }
}
