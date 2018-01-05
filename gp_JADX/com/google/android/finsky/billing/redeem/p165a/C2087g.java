package com.google.android.finsky.billing.redeem.p165a;

import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.C1925w;
import com.google.android.finsky.billing.redeem.C2088a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.l;
import com.google.wireless.android.finsky.dfe.nano.r;
import com.squareup.leakcanary.C7582R;

public final class C2087g extends C1925w {
    public final ce aj = C2482j.m13283a(885);

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        C1473m.f7980a.aH().m9782a(this.f760q, a, this.i, this.af, null, null, null, ((C2088a) aa()).aF);
        return a;
    }

    public final void mo1405X() {
        if (TextUtils.isEmpty(this.f)) {
            m6694a(886, null);
        } else {
            m6694a(1109, null);
        }
        mo2540Y();
    }

    public final void mo2535Z() {
        m6694a(1108, null);
        C2088a c2088a = (C2088a) aa();
        l lVar = this.g;
        if (lVar == null || !c2088a.m10941a(lVar)) {
            c2088a.m10936Y();
        } else {
            FinskyLog.m21659a("Dialog shown, waiting for user input.", new Object[0]);
        }
    }

    protected final void mo2634a(r rVar) {
        super.mo2634a(rVar);
        int c = C0216d.m1116c(this.h.getContext(), C7582R.color.redeem_success_link_text);
        ((TextView) this.h.findViewById(C7582R.id.message_2)).setLinkTextColor(c);
        ((TextView) this.h.findViewById(C7582R.id.footer_html)).setLinkTextColor(c);
    }

    protected final void mo2540Y() {
        ((C2088a) aa()).m10935X();
    }

    public final ce getPlayStoreUiElement() {
        return this.aj;
    }
}
