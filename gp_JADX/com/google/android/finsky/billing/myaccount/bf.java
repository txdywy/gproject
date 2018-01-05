package com.google.android.finsky.billing.myaccount;

import android.support.design.widget.C0138g;
import android.support.design.widget.Snackbar;
import android.view.View;
import com.google.android.finsky.at.C1508k;
import com.google.wireless.android.finsky.dfe.nano.bb;
import com.google.wireless.android.finsky.dfe.nano.bc;
import com.google.wireless.android.finsky.dfe.nano.cl;
import com.squareup.leakcanary.C7582R;

final class bf {
    public final /* synthetic */ ba f10247a;

    bf(ba baVar) {
        this.f10247a = baVar;
    }

    final void m10611a(bc bcVar, boolean z) {
        View view = this.f10247a.f746R;
        if (view != null) {
            if (bcVar.a == 0) {
                C0138g a = Snackbar.m500a(view, bcVar.c, 0);
                cl b = ((an) this.f10247a.e.getAdapter()).m10592b();
                if (z && b != null) {
                    a.m501a((int) C7582R.string.contact_email_undo, new bg(this, b));
                }
                a.m493a();
            } else if (bcVar.d()) {
                bb bbVar;
                C1508k c1508k = new C1508k();
                if (bcVar.a == 1) {
                    bbVar = bcVar.e;
                } else {
                    bbVar = null;
                }
                c1508k.m8859c(bbVar.b).m8856b(bcVar.c).m8860d((int) C7582R.string.got_it_button).m8853a(true).mo2272a().m625a(this.f10247a.f730B, "EmailFragment.PendingVerificationDialog");
            }
        }
    }
}
