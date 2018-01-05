package com.google.android.finsky.billing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.lightpurchase.q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.m;

public class AskToDownloadActivity extends com.google.android.finsky.billing.common.h
{

    AskToDownloadActivity() {
        com.google.android.finsky.billing.common.h();
    }

    protected final int f() {
        return 5213;
    }

    public void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130969060);
    }

    public void onStart() {
        super.onStart();
        if (this.H_().a(2131755313) == 0) {
            v6 = this.getIntent();
            this.H_().a().a(2131755313, com.google.android.finsky.billing.lightpurchase.q.a(com.google.android.finsky.m.a.U().b(this.B), (com.google.wireless.android.finsky.a.a.m)ParcelableProto.a(v6, "AskToDownloadActivity.challenge"), (Document)v6.getParcelableExtra("AskToDownloadActivity.document"), v6.getStringExtra("AskToDownloadActivity.docidStr"), v6.getIntExtra("AskToDownloadActivity.documentType", 0), v6.getIntExtra("AskToDownloadActivity.backend", 0), v6.getIntExtra("AskToDownloadActivity.offerType", 0), this.E)).c();
        }
    }

}
