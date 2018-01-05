package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.billing.payments.g;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.wallet.c.b.a;
import com.google.android.wallet.common.c.a;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.pub.i;

public class PurchaseManagerActivity extends com.google.android.finsky.billing.common.h implements com.google.android.wallet.common.pub.d
{

    public Account n;
    public boolean o;

    PurchaseManagerActivity() {
        com.google.android.finsky.billing.common.h();
    }

    private final void c(int p0, Bundle p1) {
        switch (p0) {
            case 50:
                v2 = new Intent();
                com.google.android.finsky.m.a.aG();
                v4 = new Bundle();
                v0 = (SecurePaymentsPayload)p1.getParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD");
                if (v0 != 0)
                    v4.putParcelable("extra_secure_payments_payload", v0);
                v2.putExtra("challenge_response", v4);
                this.setResult(-1, v2);
                p0 = 0;
                break;
            case 51:
                this.setResult(0);
                break;
            case 52:
                this.setResult(0);
                break;
            default:
                throw new IllegalStateException(44 + "Unexpected Orchestration Result: " + p0);
        }
        if (this.o == 0) {
            this.o = 1;
            this.E.a(new com.google.android.finsky.d.c(775).a(p0));
        }
    }

    public final void a(int p0, Bundle p1) {
        this.c(p0, p1);
        this.finish();
    }

    public final void b(int p0, Bundle p1) {
        this.c(p0, p1);
    }

    protected final int f() {
        return 1619;
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130969316);
        v1 = this.getIntent();
        this.n = (Account)v1.getParcelableExtra("PurchaseManagerActivity.account");
        com.google.android.wallet.common.pub.a.a.a = new com.google.android.finsky.billing.payments.g(this, this.E);
        com.google.android.wallet.common.c.a.a(com.google.android.finsky.m.a.bl());
        com.google.android.wallet.common.c.a.b(com.google.android.finsky.m.a.bm());
        if (this.H_().a("PurchaseManagerActivity.fragment") == 0) {
            this.H_().a().a(2131755313, com.google.android.wallet.c.b.a.a(this.n, (SecurePaymentsPayload)v1.getParcelableExtra("PurchaseManagerActivity.securePaymentPayload"), new com.google.android.wallet.common.pub.i(com.google.android.finsky.billing.payments.f.a(v1.getIntExtra("PurchaseManagerActivity.backend", 0))).a(), Bundle.EMPTY), "PurchaseManagerActivity.fragment").c();
            this.E.a(new com.google.android.finsky.d.c(774));
        }
        if (p0 != 0)
            this.o = p0.getBoolean("PurchaseManagerActivity.isChallengeFinishedEventLogged");
    }

    protected void onDestroy() {
        com.google.android.wallet.common.pub.a.a.a = 0;
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putBoolean("PurchaseManagerActivity.isChallengeFinishedEventLogged", this.o);
    }

}
