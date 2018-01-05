package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.android.volley.C0657w;
import com.google.android.finsky.cv.p177a.hv;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.c.a.dy;
import com.squareup.leakcanary.C7582R;

public class ReactivateSubscriptionActivityNew extends bo {
    public hv f10156n;

    protected final void mo2563a(Intent intent) {
        this.f10156n = (hv) ParcelableProto.m21672a(intent, "SubscriptionActionActivity.dialog");
    }

    protected final boolean mo2565a(TextView textView, TextView textView2, PlayActionButtonV2 playActionButtonV2, PlayActionButtonV2 playActionButtonV22) {
        textView.setText(this.f10156n.f12624b);
        if (this.f10156n.bl_()) {
            textView2.setText(this.f10156n.f12625c);
        }
        playActionButtonV2.mo2588a(0, this.f10156n.f12626d, (OnClickListener) this);
        playActionButtonV22.mo2588a(0, this.f10156n.f12627e, (OnClickListener) this);
        return this.f10156n.bl_();
    }

    protected final void mo2564a(br brVar) {
        dy dyVar = new dy();
        dyVar.a = brVar.f10269d;
        brVar.f10267b.mo1566a(dyVar, brVar.ah, (C0657w) brVar);
        brVar.m6758b(1, 0);
    }

    protected final int mo2368f() {
        return 330;
    }

    protected final int mo2566h() {
        return 2941;
    }

    protected final int mo1274i() {
        return 2942;
    }

    protected final int mo2567j() {
        return 1431;
    }

    protected final int mo2568k() {
        return 1430;
    }

    protected final String mo2569l() {
        return "reactivateSubscription";
    }

    protected final int mo2570m() {
        return C7582R.string.reactivate_subscription_okay;
    }
}
