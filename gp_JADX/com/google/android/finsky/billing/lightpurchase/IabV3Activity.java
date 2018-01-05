package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.iab.C1868x;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.wallet.common.util.a;

public class IabV3Activity extends PurchaseActivity {
    public final C2471a f9647q = C1473m.f7980a.aR();

    public static Intent m10048a(Account account, PurchaseParams purchaseParams) {
        Intent a = PurchaseActivity.m10037a(account, purchaseParams, null, null);
        a.setClass(C1473m.f7980a.f7981b, IabV3Activity.class);
        return a;
    }

    public void onCreate(Bundle bundle) {
        this.w = this.f9647q.m13180a(bundle, getIntent());
        this.u = (PurchaseParams) getIntent().getParcelableExtra("PurchaseActivity.params");
        if (bundle == null && this.u.f9304t != 3) {
            this.w.m13371a(m10049c(600).f13342a, null);
        }
        super.onCreate(bundle);
    }

    protected final void mo2494a(am amVar) {
        Bundle bundle;
        int i = 0;
        C1868x a = C1867w.m9984a(amVar.ak, amVar.aj);
        C2495w m = m10046m();
        m.m13371a(m10049c(601).m13239a(a == C1868x.RESULT_OK).m13210a(a.f9566l).f13342a, null);
        Context applicationContext = getApplicationContext();
        PurchaseParams purchaseParams = this.u;
        if (amVar.al != null) {
            bundle = amVar.al;
        } else {
            bundle = amVar.f9754c.am;
        }
        this.x = C1867w.m9979a(applicationContext, purchaseParams, bundle, a, m, C1473m.f7980a.dj());
        if (a == C1868x.RESULT_OK) {
            i = -1;
        }
        this.y = i;
    }

    protected final void mo2495k() {
        C1868x c1868x = C1868x.RESULT_USER_CANCELED;
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", c1868x.f9566l);
        this.x = intent;
        this.y = 0;
    }

    private final C2474c m10049c(int i) {
        return new C2474c(i).m13247c(a.a(this)).m13236a(this.u.f9286b).m13213a(this.u.f9285a).m13241b(this.u.f9288d).m13245b(true);
    }
}
