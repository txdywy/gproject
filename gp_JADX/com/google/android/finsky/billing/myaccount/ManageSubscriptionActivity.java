package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.billing.updatesubscriptioninstrument.UpdateSubscriptionInstrumentActivity;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.ez;
import com.google.android.finsky.cv.p177a.fa;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public final class ManageSubscriptionActivity extends C1647h {
    public C1612l f10141n;
    public Account f10142o;
    public Document f10143p;
    public fa f10144q;

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1747a(this);
        Intent intent = getIntent();
        this.f10142o = (Account) intent.getParcelableExtra("ManageSubscriptionDialog.account");
        this.f10143p = (Document) intent.getParcelableExtra("ManageSubscriptionDialog.document");
        this.f10144q = (fa) ParcelableProto.m21672a(intent, "ManageSubscriptionDialog.dialog");
        setContentView((int) C7582R.layout.manage_subscription_activity);
        TextView textView = (TextView) findViewById(C7582R.id.title);
        textView.setText(this.f10144q.f12348b);
        textView.setTypeface(textView.getTypeface(), 1);
        textView = (TextView) findViewById(C7582R.id.subtitle);
        if (((this.f10144q.f12347a & 4) != 0 ? 1 : null) != null) {
            textView.setText(Html.fromHtml(this.f10144q.f12350d));
            textView.setTextColor(getResources().getColor(C7582R.color.account_manage_subscriptions_error_subtitle));
            textView.setVisibility(0);
        } else {
            if (((this.f10144q.f12347a & 2) != 0 ? 1 : null) != null) {
                textView.setText(Html.fromHtml(this.f10144q.f12349c));
                textView.setVisibility(0);
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C7582R.id.action_list);
        for (ez ezVar : this.f10144q.f12351e) {
            int i;
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(C7582R.layout.billing_profile_entry, linearLayout, false);
            ((TextView) inflate.findViewById(C7582R.id.title)).setText(ezVar.f12341e);
            this.f10141n.m9287a((FifeImageView) inflate.findViewById(C7582R.id.image_icon), ezVar.f12340d, -1);
            Object obj = null;
            switch (ezVar.f12339c) {
                case 1:
                    obj = 1;
                    break;
                case 2:
                    inflate.setOnClickListener(new bi(this, CancelSubscriptionActivity.m10502a(this, this.f10142o, this.f10143p, ezVar.f12342f, this.E)));
                    continue;
                case 3:
                    break;
                default:
                    break;
            }
            String str = this.B;
            ax d = this.f10143p.m14646d();
            if (obj != null) {
                i = 1;
            } else {
                i = 2;
            }
            inflate.setOnClickListener(new bj(this, UpdateSubscriptionInstrumentActivity.m10967a(this, str, d, 0, i, null, this.E)));
            linearLayout.addView(inflate);
        }
        if (linearLayout.getChildCount() > 0) {
            ((SeparatorLinearLayout) linearLayout.getChildAt(linearLayout.getChildCount() - 1)).m10858a();
        }
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            switch (i) {
                case 1:
                case 2:
                    setResult(i2);
                    break;
            }
            finish();
        }
    }

    protected final int mo2368f() {
        return 331;
    }
}
