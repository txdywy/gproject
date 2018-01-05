package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.google.android.finsky.cv.p177a.ai;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.squareup.leakcanary.C7582R;

public class CancelSubscriptionActivityNew extends bo {
    public ai f10140n;

    protected final void mo2563a(Intent intent) {
        this.f10140n = (ai) ParcelableProto.m21672a(intent, "SubscriptionActionActivity.dialog");
    }

    protected final boolean mo2565a(TextView textView, TextView textView2, PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22) {
        textView.setText(this.f10140n.f11796b);
        if (this.f10140n.aD_()) {
            textView2.setText(this.f10140n.f11797c);
        }
        playActionButtonV2.mo2588a(0, this.f10140n.f11798d, (OnClickListener) this);
        playActionButtonV22.mo2588a(0, this.f10140n.f11799e, (OnClickListener) this);
        return this.f10140n.aD_();
    }

    protected final void mo2564a(br brVar) {
        brVar.f10267b.mo1585a(brVar.f10268c, brVar.f10269d, brVar.f10272g, (C0657w) brVar);
        brVar.m6758b(1, 0);
    }

    protected final int mo2368f() {
        return 304;
    }

    protected final int mo2566h() {
        return 243;
    }

    protected final int mo1274i() {
        return 244;
    }

    protected final int mo2567j() {
        return 851;
    }

    protected final int mo2568k() {
        return 850;
    }

    protected final String mo2569l() {
        return "cancelSubscription";
    }

    protected final int mo2570m() {
        return C7582R.string.cancel_subscription_okay;
    }
}
