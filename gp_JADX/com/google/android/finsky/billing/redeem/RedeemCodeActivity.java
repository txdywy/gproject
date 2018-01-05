package com.google.android.finsky.billing.redeem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import com.squareup.leakcanary.C7582R;

public class RedeemCodeActivity extends C1647h implements C2080b {
    public C2088a f10626n;

    @Deprecated
    public static Intent m10895a(String str, int i, String str2, String str3, C2495w c2495w) {
        C1473m c1473m = C1473m.f7980a;
        Context context = c1473m.f7981b;
        if (c1473m.mo2249j(str).mo2294a(12632678)) {
            eb ebVar = new eb();
            if (!TextUtils.isEmpty(str3)) {
                if (str3 == null) {
                    throw new NullPointerException();
                }
                ebVar.a |= 2;
                ebVar.c = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    throw new NullPointerException();
                }
                ebVar.a |= 1;
                ebVar.b = str2;
            }
            ebVar.e = i;
            ebVar.a |= 8;
            return C1473m.f7980a.bo().mo2726a(c1473m.mo2041U().mo1183b(str), context, c1473m.mo2249j(str), null, c2495w, null, ebVar, false, false);
        }
        Intent intent = new Intent(context, RedeemCodeActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("RedeemCodeActivity.redemption_context", i);
        intent.putExtra("RedeemCodeActivity.prefill_code", str2);
        intent.putExtra("RedeemCodeActivity.partner_payload", str3);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }

    public static Intent m10894a(String str, int i, ax axVar, int i2, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w) {
        Intent intent = new Intent(C1473m.f7980a.f7981b, RedeemCodeActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("RedeemCodeActivity.redemption_context", i);
        intent.putExtra("RedeemCodeActivity.docid", ParcelableProto.m21671a((C0757i) axVar));
        intent.putExtra("RedeemCodeActivity.offer_type", i2);
        C1797m.m9776a(intent, purchaseFlowConfig);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.redeem_activity);
        if (bundle == null) {
            Intent intent = getIntent();
            ax axVar = (ax) ParcelableProto.m21672a(intent, "RedeemCodeActivity.docid");
            H_().mo284a().mo325a((int) C7582R.id.content_frame, C2088a.m10932a(this.B, intent.getIntExtra("RedeemCodeActivity.redemption_context", 0), axVar, intent.getIntExtra("RedeemCodeActivity.offer_type", 0), intent.getStringExtra("RedeemCodeActivity.prefill_code"), C2043f.m10743a(null), intent.getStringExtra("RedeemCodeActivity.partner_payload"), C1797m.m9773a(intent), null)).mo334c();
        }
    }

    protected void onStart() {
        super.onStart();
        this.f10626n = (C2088a) H_().mo281a((int) C7582R.id.content_frame);
        this.f10626n.aJ = this.E;
    }

    public void finish() {
        if (this.f10626n == null || this.f10626n.f10648f == null) {
            setResult(0);
        } else {
            Intent intent = new Intent();
            Object obj = this.f10626n.f10648f;
            intent.putExtra("redeem_code_result", obj);
            this.E.m13376a(intent);
            setResult(-1, intent);
            if (!(obj == null || obj.f9309c)) {
                C1473m.f7980a.cw().m9406a(this.B);
            }
        }
        super.finish();
    }

    protected final int mo2368f() {
        return 880;
    }

    public final boolean mo2631a(Document document) {
        return false;
    }

    public final boolean mo2632a(String str) {
        return false;
    }

    public final void mo2633h() {
        finish();
    }
}
