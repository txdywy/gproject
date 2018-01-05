package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.C1833f;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.eq;
import com.squareup.leakcanary.C7582R;

public final class C1938n extends C1076h implements ad {
    public int f9902a;
    public eq f9903b;
    public final ce f9904c = C2482j.m13283a(1280);

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9902a = bundle2.getInt("ChangeSubscriptionStep.backend");
        this.f9903b = (eq) ParcelableProto.m21673a(bundle2, "ChangeSubscriptionStep.changeSubscription");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.light_purchase_change_subscription, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.title);
        textView.setText(this.f9903b.b);
        TextView textView2 = (TextView) inflate.findViewById(C7582R.id.message);
        ae.m9217a(textView2, C1833f.m9861a(this.f9903b.c, C1608h.m9255c(m603h(), this.f9902a).getDefaultColor()));
        C1473m.f7980a.aH().m9782a(this.f760q, inflate, textView, textView2, null, null, null, ((aq) aa()).ao());
        return inflate;
    }

    public final String mo1406a(Resources resources) {
        return m592c((int) C7582R.string.continue_text);
    }

    public final void mo1405X() {
        m6694a(1281, null);
        ((aq) aa()).mo2515Z();
    }

    public final ce getPlayStoreUiElement() {
        return this.f9904c;
    }
}
