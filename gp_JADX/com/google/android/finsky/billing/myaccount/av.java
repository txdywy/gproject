package com.google.android.finsky.billing.myaccount;

import android.support.design.widget.Snackbar;
import android.view.View;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.bc;
import com.squareup.leakcanary.C7582R;

final class av implements C0660x {
    public final /* synthetic */ au f10227a;

    av(au auVar) {
        this.f10227a = auVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        bc bcVar = (bc) obj;
        if (bcVar.d()) {
            bf bfVar = this.f10227a.f10226c.f10208q;
            CharSequence string = this.f10227a.f10226c.f10206o.getString(C7582R.string.contact_email_verification_sent, new Object[]{this.f10227a.f10224a.b});
            View view = bfVar.f10247a.f746R;
            if (view != null) {
                Snackbar.m500a(view, string, 0).m493a();
                return;
            }
            return;
        }
        this.f10227a.f10226c.f10208q.m10611a(bcVar, false);
    }
}
