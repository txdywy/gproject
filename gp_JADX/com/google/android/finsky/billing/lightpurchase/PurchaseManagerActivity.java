package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.billing.payments.C2044g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.a.a;
import com.google.android.wallet.common.pub.d;
import com.google.android.wallet.common.pub.i;
import com.squareup.leakcanary.C7582R;

public class PurchaseManagerActivity extends C1647h implements d {
    public Account f9680n;
    public boolean f9681o;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.purchase_manager_activity);
        Intent intent = getIntent();
        this.f9680n = (Account) intent.getParcelableExtra("PurchaseManagerActivity.account");
        a.a = new C2044g(this, this.E);
        com.google.android.wallet.common.c.a.a(C1473m.f7980a.bl());
        com.google.android.wallet.common.c.a.b(C1473m.f7980a.bm());
        if (H_().mo283a("PurchaseManagerActivity.fragment") == null) {
            H_().mo284a().mo326a(C7582R.id.content_frame, com.google.android.wallet.c.b.a.a(this.f9680n, (SecurePaymentsPayload) intent.getParcelableExtra("PurchaseManagerActivity.securePaymentPayload"), new i(C2043f.m10742a(intent.getIntExtra("PurchaseManagerActivity.backend", 0))).a(), Bundle.EMPTY), "PurchaseManagerActivity.fragment").mo334c();
            this.E.m13367a(new C2474c(774));
        }
        if (bundle != null) {
            this.f9681o = bundle.getBoolean("PurchaseManagerActivity.isChallengeFinishedEventLogged");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("PurchaseManagerActivity.isChallengeFinishedEventLogged", this.f9681o);
    }

    protected void onDestroy() {
        a.a = null;
        super.onDestroy();
    }

    protected final int mo2368f() {
        return 1619;
    }

    public final void m10103a(int i, Bundle bundle) {
        m10102c(i, bundle);
        finish();
    }

    public final void m10104b(int i, Bundle bundle) {
        m10102c(i, bundle);
    }

    private final void m10102c(int i, Bundle bundle) {
        switch (i) {
            case 50:
                Intent intent = new Intent();
                String str = "challenge_response";
                C1473m.f7980a.aG();
                Bundle bundle2 = new Bundle();
                SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) bundle.getParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD");
                if (securePaymentsPayload != null) {
                    bundle2.putParcelable("extra_secure_payments_payload", securePaymentsPayload);
                }
                intent.putExtra(str, bundle2);
                setResult(-1, intent);
                i = 0;
                break;
            case 51:
            case 52:
                setResult(0);
                break;
            default:
                throw new IllegalStateException("Unexpected Orchestration Result: " + i);
        }
        if (!this.f9681o) {
            this.f9681o = true;
            this.E.m13367a(new C2474c(775).m13210a(i));
        }
    }
}
