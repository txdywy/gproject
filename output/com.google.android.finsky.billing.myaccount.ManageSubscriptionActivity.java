package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.cr;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.updatesubscriptioninstrument.UpdateSubscriptionInstrumentActivity;
import com.google.android.finsky.cv.a.ez;
import com.google.android.finsky.cv.a.fa;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;

protected final class ManageSubscriptionActivity extends com.google.android.finsky.billing.common.h
{

    public com.google.android.finsky.bg.l n;
    public Account o;
    public Document p;
    public com.google.android.finsky.cv.a.fa q;

    ManageSubscriptionActivity() {
        com.google.android.finsky.billing.common.h();
    }

    protected final int f() {
        return 331;
    }

    protected final void onActivityResult(int p0, int p1, Intent p2) {
        if (p1 == -1) {
            switch (p0) {
                case 1:
                    this.setResult(p1);
                    break;
                case 2:
                    this.setResult(p1);
                    break;
                default:
                    break;
            }
            this.finish();
        }
    }

    protected final void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        v1 = this.getIntent();
        this.o = (Account)v1.getParcelableExtra("ManageSubscriptionDialog.account");
        this.p = (Document)v1.getParcelableExtra("ManageSubscriptionDialog.document");
        this.q = (com.google.android.finsky.cv.a.fa)ParcelableProto.a(v1, "ManageSubscriptionDialog.dialog");
        this.setContentView(2130969092);
        v0 = (TextView)this.findViewById(2131755114);
        v0.setText(this.q.b);
        v0.setTypeface(v0.getTypeface(), 1);
        v0 = (TextView)this.findViewById(2131755307);
        if (this.q.a & 4)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            v0.setText(Html.fromHtml(this.q.d));
            v0.setTextColor(this.getResources().getColor(2131558413));
            v0.setVisibility(0);
        }
        else {
            if (this.q.a & 2)
                v1 = 1;
            else
                v1 = 0;
            if (v1 != 0) {
                v0.setText(Html.fromHtml(this.q.c));
                v0.setVisibility(0);
            }
        }
        v0 = (LinearLayout)this.findViewById(2131756226);
        v9 = 0;
        while (v9 < this.q.e.length) {
            v12 = LayoutInflater.from(v0.getContext()).inflate(2130968652, v0, 0);
            ((TextView)v12.findViewById(2131755114)).setText(this.q.e[v9].e);
            this.n.a((FifeImageView)v12.findViewById(2131755305), this.q.e[v9].d, -1);
            v1 = 0;
            switch (this.q.e[v9].c) {
                case 1:
                    v1 = 1;
                    if (v1 != 0)
                        v6 = 1;
                    else
                        v6 = 2;
                    v12.setOnClickListener(new com.google.android.finsky.billing.myaccount.bj(this, UpdateSubscriptionInstrumentActivity.a(this, this.B, this.p.d(), 0, v6, 0, this.E)));
                    break;
                case 2:
                    v12.setOnClickListener(new com.google.android.finsky.billing.myaccount.bi(this, CancelSubscriptionActivity.a(this, this.o, this.p, this.q.e[v9].f, this.E)));
                    break;
                case 3:
                    if (v1 != 0)
                        v6 = 1;
                    else
                        v6 = 2;
                    v12.setOnClickListener(new com.google.android.finsky.billing.myaccount.bj(this, UpdateSubscriptionInstrumentActivity.a(this, this.B, this.p.d(), 0, v6, 0, this.E)));
                    break;
                default:
                    break;
            }
            v0.addView(v12);
            v9 = v9 + 1;
        }
        if (v0.getChildCount() > 0)
            ((SeparatorLinearLayout)v0.getChildAt(v0.getChildCount() - 1)).a();
    }

}
