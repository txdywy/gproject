package com.google.android.finsky.billing.payments;

import a.a;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import com.android.volley.r;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.wallet.common.c.a;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.instrumentmanager.c.a;
import com.google.android.wallet.nfc.b;

protected class com.google.android.finsky.billing.payments.c extends com.google.android.finsky.billing.common.h implements com.google.android.wallet.common.pub.d
{

    public a.a n;
    public a.a o;
    public com.google.android.finsky.accounts.a p;
    public int q;

    c() {
        com.google.android.finsky.billing.common.h();
        new com.google.android.wallet.common.pub.e();
    }

    public static void a(String p0, byte[] p1, byte[] p2, Bundle p3, Intent p4, int p5) {
        com.google.android.finsky.billing.common.h.a(p4, p0);
        p4.putExtra("common_token", p1);
        p4.putExtra("action_token", p2);
        p4.putExtra("instrument_manager_args", p3);
        p4.putExtra("InstrumentManagerBaseActivitybackendId", p5);
    }

    private final void c(int p0, Bundle p1) {
  0:    switch (p0) {
            case 50:
 32:            v0 = new Intent();
 43:            v0.putExtra("instrument_id", p1.getString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID"));
 54:            v0.putExtra("instrument_token", p1.getByteArray("com.google.android.wallet.instrumentmanager.INSTRUMENT_TOKEN"));
 65:            v0.putExtra("callback_data", p1.getByteArray("com.google.android.wallet.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN"));
 70:            this.E.a(v0);
 74:            this.setResult(-1, v0);
 77:            return;
            case 51:
 83:            break;
            case 52:
 83:            break;
            default:
 29:            throw new IllegalStateException(52 + "Unexpected InstrumentManager resultCode: " + p0);
        }
 79:    this.setResult(0);
 82:    goto 77;
    }

    private final Fragment i() {
        return this.H_().a(2131755313);
    }

    public final void a(int p0, Bundle p1) {
        this.c(p0, p1);
        this.finish();
    }

    public final void b(int p0, Bundle p1) {
        this.c(p0, p1);
    }

    protected int h() {
        return com.google.android.finsky.billing.payments.f.a(this.q);
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130969017);
        ((com.google.android.finsky.billing.payments.b)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.payments.b)).a(this);
        com.google.android.wallet.common.pub.a.a.a = new com.google.android.finsky.billing.payments.g(this, this.E);
        com.google.android.wallet.common.c.a.a((com.android.volley.r)this.n.a());
        com.google.android.wallet.common.c.a.b((com.android.volley.r)this.o.a());
        if (this.i() == 0) {
            this.q = this.getIntent().getIntExtra("InstrumentManagerBaseActivitybackendId", 0);
            this.H_().a().a(2131755313, com.google.android.wallet.instrumentmanager.c.a.a(this.p.b(this.B), this.getIntent().getByteArrayExtra("common_token"), this.getIntent().getByteArrayExtra("action_token"), new com.google.android.wallet.common.pub.i(this.h()).a(), (Bundle)this.getIntent().getParcelableExtra("instrument_manager_args"))).c();
        }
    }

    protected void onDestroy() {
        com.google.android.wallet.common.pub.a.a.a = 0;
        super.onDestroy();
    }

    protected void onNewIntent(Intent p0) {
        super.onNewIntent(p0);
        v0 = this.i();
        if (v0 instanceof com.google.android.wallet.nfc.b)
            com.google.android.wallet.common.pub.e.a((com.google.android.wallet.nfc.b)v0, p0);
    }

}
