package com.google.android.finsky.billing.redeem.p165a;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.C1833f;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.billing.redeem.C2088a;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.em;
import com.squareup.leakcanary.C7582R;

public final class C2081a extends C1076h {
    public final ce f10630a = C2482j.m13283a(883);
    public em f10631b;
    public View f10632c;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f10631b = (em) ParcelableProto.m21673a(this.f760q, "ConfirmationStep.challenge");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10632c = layoutInflater.inflate(C7582R.layout.redeem_confirmation_step, viewGroup, false);
        TextView textView = (TextView) this.f10632c.findViewById(C7582R.id.title);
        if (TextUtils.isEmpty(this.f10631b.b)) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f10631b.b);
        }
        TextView textView2 = (TextView) this.f10632c.findViewById(C7582R.id.title_byline);
        if (TextUtils.isEmpty(this.f10631b.c)) {
            textView2.setVisibility(8);
        } else {
            ae.m9217a(textView2, this.f10631b.c);
        }
        FifeImageView fifeImageView = (FifeImageView) this.f10632c.findViewById(C7582R.id.image);
        bd bdVar = this.f10631b.g;
        if (bdVar != null) {
            fifeImageView.setOnLoadedListener(new C2082b(this));
            C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
        } else {
            fifeImageView.setVisibility(8);
        }
        TextView textView3 = (TextView) this.f10632c.findViewById(C7582R.id.price);
        if (TextUtils.isEmpty(this.f10631b.d)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(this.f10631b.d);
        }
        textView2 = (TextView) this.f10632c.findViewById(C7582R.id.price_byline);
        if (TextUtils.isEmpty(this.f10631b.e)) {
            textView2.setVisibility(8);
        } else {
            String str;
            str = this.f10631b.e;
            ae.m9217a(textView2, str);
            if (str.startsWith("<strike>") && str.endsWith("</strike>")) {
                textView2.setPaintFlags(textView2.getPaintFlags() | 16);
            }
            textView2.setContentDescription(m605i().getString(C7582R.string.content_description_full_price, new Object[]{textView2.getText()}));
            textView3.setContentDescription(m605i().getString(C7582R.string.content_description_current_price, new Object[]{textView3.getText()}));
        }
        TextView textView4 = (TextView) this.f10632c.findViewById(C7582R.id.message);
        if (TextUtils.isEmpty(this.f10631b.h)) {
            textView4.setVisibility(8);
        } else {
            ae.m9217a(textView4, this.f10631b.h);
        }
        textView2 = (TextView) this.f10632c.findViewById(C7582R.id.voucher_footer);
        if (TextUtils.isEmpty(this.f10631b.i)) {
            textView2.setVisibility(8);
        } else {
            ae.m9217a(textView2, this.f10631b.i);
        }
        TextView textView5 = (TextView) this.f10632c.findViewById(C7582R.id.tos_footer);
        if (this.f760q.getBoolean("ConfirmationStep.code_screen_skipped", false)) {
            int i;
            str = C1833f.m9860a((String) C0955b.f5904t.m28964b());
            if (m10904Y()) {
                i = C7582R.string.redeem_screen_footer_with_cancel;
            } else {
                i = C7582R.string.redeem_screen_footer;
            }
            ae.m9217a(textView5, m572a(i, str, mo1406a(m605i())));
        } else {
            textView5.setVisibility(8);
        }
        C1473m.f7980a.aH().m9782a(this.f760q, this.f10632c, textView, textView4, textView3, null, textView5, ((C2088a) aa()).aF);
        return this.f10632c;
    }

    private final boolean m10904Y() {
        if (C1473m.f7980a.mo2035O().m8840c()) {
            return false;
        }
        return C1473m.f7980a.mo2249j(((C2088a) aa()).aw.name).mo2294a(12615220);
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f10632c.getContext(), this.f10631b.b, this.f10632c, false);
    }

    public final String mo1406a(Resources resources) {
        return this.f10631b.f;
    }

    public final void mo1405X() {
        m6694a(884, null);
        C2088a c2088a = (C2088a) aa();
        C1089s c1089s = c2088a.f10646d;
        C2495w c2495w = c2088a.aJ;
        if (c1089s.f6948l != 4) {
            FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s.f6948l));
            return;
        }
        ek ekVar = c1089s.f10653b;
        ekVar.a |= 2;
        ekVar.c = true;
        c1089s.m10947a(c2495w);
    }

    public final String mo2536b(Resources resources) {
        return m10904Y() ? resources.getString(C7582R.string.cancel) : null;
    }

    public final void mo2535Z() {
        m6694a(1107, null);
        ((C2088a) aa()).m10936Y();
    }

    public final ce getPlayStoreUiElement() {
        return this.f10630a;
    }
}
