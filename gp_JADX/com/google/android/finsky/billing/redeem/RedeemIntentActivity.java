package com.google.android.finsky.billing.redeem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.wallet.common.util.a;
import com.squareup.leakcanary.C7582R;

public class RedeemIntentActivity extends C1647h implements C2080b {
    public Document f10627n;
    public String f10628o;
    public int f10629p = 0;

    public RedeemIntentActivity() {
        C1473m.f7980a.aJ();
    }

    protected void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (!intent.hasExtra("authAccount")) {
            C1647h.m9344a(intent, C1473m.f7980a.cZ());
        }
        super.onCreate(bundle);
        if (((Boolean) C0955b.aq.m28964b()).booleanValue()) {
            if (a.a(this) == null) {
                FinskyLog.m21665c("Cannot find caller. Did you forget to use startActivityForResult?", new Object[0]);
                this.f10629p = 1;
                finish();
                return;
            } else if (C2744a.m14792b((Activity) this) || ((Boolean) C0955b.ar.m28964b()).booleanValue()) {
                setContentView((int) C7582R.layout.redeem_activity);
                ab H_ = H_();
                if (H_.mo281a((int) C7582R.id.content_frame) == null) {
                    String str = null;
                    H_.mo284a().mo325a((int) C7582R.id.content_frame, C2088a.m10932a(this.B, 8, null, 0, intent.getStringExtra("code"), C2043f.m10743a(null), str, PurchaseFlowConfig.f9283a, intent.getStringExtra("pcampaign_id"))).mo334c();
                    return;
                }
                return;
            } else {
                FinskyLog.m21665c("Calling from untrusted package %s", r4);
                this.f10629p = 1;
                finish();
                return;
            }
        }
        FinskyLog.m21665c("Redeem intent API disabled by Gservices.", new Object[0]);
        this.f10629p = 2;
        finish();
    }

    protected void onStart() {
        super.onStart();
        ((C2088a) H_().mo281a((int) C7582R.id.content_frame)).aJ = this.E;
    }

    public void finish() {
        Intent intent = null;
        if (this.f10627n != null) {
            intent = new Intent().putExtra("redeemed_docid", this.f10627n.f14885a.f12096c);
        } else if (!TextUtils.isEmpty(this.f10628o)) {
            intent = new Intent().putExtra("error_message", this.f10628o);
        }
        setResult(this.f10629p, intent);
        super.finish();
    }

    protected final int mo2368f() {
        return 880;
    }

    public final boolean mo2631a(Document document) {
        this.f10627n = document;
        this.f10629p = -1;
        if (getIntent().getBooleanExtra("show_success", true)) {
            return false;
        }
        return true;
    }

    public final boolean mo2632a(String str) {
        this.f10628o = str;
        this.f10629p = 3;
        return !TextUtils.isEmpty(getIntent().getStringExtra("code"));
    }

    public final void mo2633h() {
        finish();
    }
}
