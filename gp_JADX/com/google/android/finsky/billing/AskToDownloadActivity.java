package com.google.android.finsky.billing;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.lightpurchase.C1958q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.m;
import com.squareup.leakcanary.C7582R;

public class AskToDownloadActivity extends C1647h {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.light_purchase_activity);
    }

    public void onStart() {
        super.onStart();
        if (H_().mo281a((int) C7582R.id.content_frame) == null) {
            Account b = C1473m.f7980a.mo2041U().mo1183b(this.B);
            Intent intent = getIntent();
            H_().mo284a().mo325a((int) C7582R.id.content_frame, C1958q.m10406a(b, (m) ParcelableProto.m21672a(intent, "AskToDownloadActivity.challenge"), (Document) intent.getParcelableExtra("AskToDownloadActivity.document"), intent.getStringExtra("AskToDownloadActivity.docidStr"), intent.getIntExtra("AskToDownloadActivity.documentType", 0), intent.getIntExtra("AskToDownloadActivity.backend", 0), intent.getIntExtra("AskToDownloadActivity.offerType", 0), this.E)).mo334c();
        }
    }

    protected final int mo2368f() {
        return 5213;
    }
}
