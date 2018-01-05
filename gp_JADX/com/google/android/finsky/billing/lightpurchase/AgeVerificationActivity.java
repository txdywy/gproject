package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.lightpurchase.p159a.C1885h;
import com.google.android.finsky.billing.lightpurchase.p159a.C1895g;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;

public class AgeVerificationActivity extends C1647h implements C1885h {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(C7582R.layout.age_verification_activity, null));
        if (H_().mo283a("AgeVerificationActivity.host_fragment") == null) {
            String str = this.B;
            int intExtra = getIntent().getIntExtra("AgeVerificationActivity.backend", -1);
            String stringExtra = getIntent().getStringExtra("AgeVerificationActivity.docid_str");
            C2495w c2495w = this.E;
            Fragment c1895g = new C1895g();
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", str);
            bundle2.putInt("AgeVerificationHostFragment.backend", intExtra);
            bundle2.putString("AgeVerificationHostFragment.docid_str", stringExtra);
            c2495w.m13380b(str).m13377a(bundle2);
            c1895g.m600f(bundle2);
            aw a = H_().mo284a();
            a.mo326a(C7582R.id.container, c1895g, "AgeVerificationActivity.host_fragment");
            a.mo334c();
        }
    }

    public final void mo2492b(boolean z) {
        setResult(z ? -1 : 0);
        finish();
    }

    protected final int mo2368f() {
        return 1400;
    }
}
