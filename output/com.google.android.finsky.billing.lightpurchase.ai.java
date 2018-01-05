package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.support.v4.app.u;
import com.google.android.finsky.activities.b;
import com.google.android.finsky.billing.AskToDownloadActivity;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.m;

public final class com.google.android.finsky.billing.lightpurchase.ai implements com.google.android.finsky.billing.d.d
{

    public final WeakReference a;

    ai(LightPurchaseFlowActivity p0) {
        this.a = new WeakReference(p0);
    }

    public final void a(com.google.wireless.android.finsky.a.a.m p0) {
        v0 = (LightPurchaseFlowActivity)this.a.get();
        if (v0 != 0) {
            if (p0.m == 0)
                throw new IllegalStateException("Only the family acquisition challenge is supported for free purchases.");
            v8 = new Intent(com.google.android.finsky.m.a.b, AskToDownloadActivity);
            com.google.android.finsky.billing.common.h.a(v8, v0.I.name);
            v8.putExtra("AskToDownloadActivity.challenge", ParcelableProto.a(p0));
            v8.putExtra("AskToDownloadActivity.document", v0.T);
            v8.putExtra("AskToDownloadActivity.docidStr", v0.J);
            v8.putExtra("AskToDownloadActivity.documentType", v0.K.c);
            v8.putExtra("AskToDownloadActivity.offerType", v0.L);
            v8.putExtra("AskToDownloadActivity.backend", v0.K.d);
            v0.C.a(v0.I).a(v8);
            v0.startActivityForResult(v8, 10);
        }
    }

}
