package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.h;
import com.squareup.leakcanary.C7582R;

public final class C1923a extends C1076h {
    public final ce f9846a = C2482j.m13283a(1290);
    public h f9847b;

    public final void mo136b(Bundle bundle) {
        this.f9847b = (h) ParcelableProto.m21673a(this.f760q, "AcknowledgementChallengeStep.challenge");
        C2482j.m13285a(this.f9846a, this.f9847b.e);
        super.mo136b(bundle);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.acknowledgement_challenge, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.title);
        textView.setText(this.f9847b.c);
        TextView textView2 = (TextView) inflate.findViewById(C7582R.id.description);
        ae.m9217a(textView2, this.f9847b.d);
        C1473m.f7980a.aH().m9782a(this.f760q, inflate, textView, textView2, null, null, null, ((aq) aa()).ao());
        return inflate;
    }

    public final String mo1406a(Resources resources) {
        if (((this.f9847b.a & 16) != 0 ? 1 : null) != null) {
            return this.f9847b.f;
        }
        return resources.getString(C7582R.string.continue_text);
    }

    public final void mo1405X() {
        ((aq) aa()).mo1408a(1291, this);
        Bundle bundle = new Bundle();
        bundle.putString(this.f9847b.b, "true");
        ((aq) aa()).mo2520a(bundle);
    }

    public final ce getPlayStoreUiElement() {
        return this.f9846a;
    }
}
