package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.AskToDownloadActivity;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.c.a;
import com.google.android.finsky.billing.lightpurchase.c.b;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.e.ac;
import com.google.android.finsky.d.t;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.m;
import java.util.Iterator;
import java.util.Set;

public final class com.google.android.finsky.billing.lightpurchase.q extends com.google.android.finsky.billing.lightpurchase.d.a implements com.google.android.finsky.billing.lightpurchase.e.j
{

    public final com.google.android.finsky.d.t a;
    public com.google.wireless.android.finsky.a.a.m b;
    public Document c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;

    q() {
        com.google.android.finsky.billing.lightpurchase.d.a();
        this.a = com.google.android.finsky.m.a.aP();
        this.h = 0;
    }

    public static com.google.android.finsky.billing.lightpurchase.q a(Account p0, com.google.wireless.android.finsky.a.a.m p1, Document p2, String p3, int p4, int p5, int p6, com.google.android.finsky.d.w p7) {
        v0 = new Bundle();
        v0.putParcelable("MultiStepFragment.account", p0);
        v0.putParcelable("FreePurchaseFragment.challenge", ParcelableProto.a(p1));
        v0.putParcelable("FreePurchaseFragment.document", p2);
        v0.putString("FreePurchaseFragment.docidStr", p3);
        v0.putInt("FreePurchaseFragment.documentType", p4);
        v0.putInt("FreePurchaseFragment.offerType", p6);
        v0.putInt("FreePurchaseFragment.backend", p5);
        p7.a(p0).a(v0);
        v1 = new com.google.android.finsky.billing.lightpurchase.q();
        v1.f(v0);
        return v1;
    }

    protected final int W() {
        return this.f;
    }

    public final void X() {
        if (this.b.m != 0) {
            this.a.b(this.aJ, "purchase_fragment_family_acquisition_challenge");
            v7 = new com.google.android.finsky.billing.lightpurchase.c.a();
            v7.f(com.google.android.finsky.billing.lightpurchase.c.a.a(this.aw, this.b.m, this.c, this.d, this.e, this.f, PurchaseFlowConfig.a));
            this.a(v7);
        }
        else {
            FinskyLog.e("Null family acquisition challenge", new Object[0]);
            this.a(com.google.android.finsky.billing.lightpurchase.e.ac.a(new CheckoutPurchaseError(), 1));
        }
    }

    public final boolean a(Bundle p0) {
        v0 = (AskToDownloadActivity)this.h();
        v2 = new Intent();
        v2.putExtra("AskToDownloadActivity.authMethod", this.h);
        v3 = p0.keySet().iterator();
        while (v3.hasNext()) {
            v1 = (String)v3.next();
            v2.putExtra(v1, p0.getString(v1));
        }
        v0.setResult(-1, v2);
        v0.finish();
        return 1;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.b = (com.google.wireless.android.finsky.a.a.m)ParcelableProto.a(this.q, "FreePurchaseFragment.challenge");
        this.c = (Document)this.q.getParcelable("FreePurchaseFragment.document");
        this.d = this.q.getString("FreePurchaseFragment.docidStr");
        this.e = this.q.getInt("FreePurchaseFragment.documentType");
        this.g = this.q.getInt("FreePurchaseFragment.offerType");
        this.f = this.q.getInt("FreePurchaseFragment.backend");
    }

    public final void e_(int p0) {
        this.h = p0;
    }

    public final void g_() {
        super.g_();
        if (this.ax == 0 && this.b.m != 0) {
            v4 = new com.google.android.finsky.billing.lightpurchase.c.b();
            v4.f(com.google.android.finsky.billing.lightpurchase.c.b.a(this.b.m, this.d, this.g, this.f, PurchaseFlowConfig.a));
            this.a(v4);
        }
    }

}
