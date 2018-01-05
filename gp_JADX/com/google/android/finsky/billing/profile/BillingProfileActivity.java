package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.flushlogs.C3129a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.squareup.leakcanary.C7582R;

public class BillingProfileActivity extends aa implements C2045j {
    public C2471a f10515q;
    public C3129a f10516r;
    public C1797m f10517s;
    public Account f10518t;
    public String f10519u;
    public ax f10520v;
    public C2495w f10521w;
    public PurchaseFlowConfig f10522x;
    public Intent f10523y;

    public static Intent m10752a(Context context, Account account, String str, ax axVar, int i, u uVar, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w, int i2) {
        Intent intent = new Intent(context, BillingProfileActivity.class);
        intent.putExtra("BillingProfileActiivty.account", account);
        intent.putExtra("BillingProfileActiivty.purchaseContextToken", str);
        intent.putExtra("BillingProfileActiivty.docid", ParcelableProto.m21671a((C0757i) axVar));
        intent.putExtra("BillingProfileActiivty.offerType", i);
        intent.putExtra("BillingProfileActiivty.prefetchedBillingProfile", ParcelableProto.m21671a((C0757i) uVar));
        C1797m.m9776a(intent, purchaseFlowConfig);
        intent.putExtra("BillingProfileActiivty.redemption_context", i2);
        intent.putExtra("BillingProfileActiivty.using_cached_billing_profile", false);
        c2495w.m13366a(account).m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1358l) C3947d.m18649a(C1358l.class)).mo1768a(this);
        setContentView((int) C7582R.layout.billing_profile_activity);
        Intent intent = getIntent();
        this.f10518t = (Account) intent.getParcelableExtra("BillingProfileActiivty.account");
        this.f10519u = intent.getStringExtra("BillingProfileActiivty.purchaseContextToken");
        this.f10520v = (ax) ParcelableProto.m21672a(intent, "BillingProfileActiivty.docid");
        u uVar = (u) ParcelableProto.m21672a(intent, "BillingProfileActiivty.prefetchedBillingProfile");
        boolean booleanExtra = intent.getBooleanExtra("BillingProfileActiivty.using_cached_billing_profile", false);
        this.f10522x = C1797m.m9773a(intent);
        this.f10521w = this.f10515q.m13180a(bundle, intent);
        TextView textView = (TextView) findViewById(C7582R.id.title);
        if (uVar != null && !TextUtils.isEmpty(uVar.h)) {
            textView.setText(uVar.h);
        } else if (booleanExtra) {
            textView.setText(C7582R.string.cached_fop_options_title);
        } else {
            textView.setText(C7582R.string.payment_methods);
        }
        if ((uVar != null && uVar.j) || booleanExtra) {
            findViewById(C7582R.id.logo).setVisibility(0);
        }
        TextView textView2 = (TextView) findViewById(C7582R.id.account);
        textView2.setText(this.f10518t.name);
        textView2.setVisibility(0);
        if (H_().mo283a("BillingProfileActiivty.fragment") == null) {
            H_().mo284a().mo326a(C7582R.id.content_frame, C2048c.m10782a(this.f10518t, this.f10519u, this.f10520v, intent.getIntExtra("BillingProfileActiivty.offerType", 12), intent.getIntExtra("BillingProfileActiivty.redemption_context", 1), uVar, this.f10522x, this.f10521w, booleanExtra), "BillingProfileActiivty.fragment").mo334c();
        }
        C1797m c1797m = this.f10517s;
        Bundle a = this.f10517s.m9781a(this.f10522x);
        c1797m.m9784a("ALL_TITLE", textView, a);
        c1797m.m9784a("ALL_FOP", textView2, a);
    }

    protected void onResume() {
        super.onResume();
        this.f10516r.m16010c();
    }

    protected void onPause() {
        super.onPause();
        this.f10516r.m16007a();
    }

    public final void mo2595a(String str, byte[] bArr) {
        Intent intent = new Intent();
        intent.putExtra("BillingProfileActivity.selectedInstrumentId", str);
        this.f10523y = intent;
        setResult(-1, intent);
        finish();
    }

    public final void mo2594a(RedeemCodeResult redeemCodeResult) {
        Intent intent = new Intent();
        intent.putExtra("BillingProfileActivity.redeemPromoCodeResult", redeemCodeResult);
        this.f10523y = intent;
        setResult(-1, intent);
        finish();
    }

    public final void mo2596k() {
        setResult(0);
        finish();
    }

    public void finish() {
        C2046a c2046a = (C2046a) H_().mo283a("BillingProfileActiivty.fragment");
        if (c2046a != null) {
            u uVar = c2046a.f10535e.al;
            C0757i c0757i = (uVar == null || (c2046a.f10535e.f6948l == 4 ? 1 : 0) != 0) ? null : uVar.k;
            if (this.f10523y == null && c0757i != null) {
                this.f10523y = new Intent();
                this.f10523y.putExtra("BillingProfileActiivty.catchAbandonmentDialog", ParcelableProto.m21671a(c0757i));
                setResult(0, this.f10523y);
            }
        }
        super.finish();
    }
}
