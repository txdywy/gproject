package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.lu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.play.WarmWelcomeV2Card;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.squareup.leakcanary.C7582R;

public final class ci extends cg {
    public ci(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, c4808a, adVar, c1611k, c1556d, c2495w);
    }

    protected final int mo4176b() {
        return C7582R.layout.flat_warm_welcome_v2_card_single_column;
    }

    protected final int mo4177c() {
        return C7582R.layout.flat_warm_welcome_v2_card_double_column;
    }

    protected final void mo4175a(View view, Document document, bd bdVar) {
        int g;
        ad adVar = (WarmWelcomeV2Card) view;
        lu luVar = document.aW() ? document.bg().f12940s : null;
        CharSequence charSequence = document.f14885a.f12100g;
        CharSequence A = document.m14612A();
        int i = document.f14885a.f12099f;
        boolean z = luVar.f13063c;
        ad adVar2 = this.h;
        byte[] bArr = document.f14885a.f12087D;
        adVar.f18743a.setText(charSequence);
        adVar.f18744b.setText(A);
        if (z) {
            adVar.f18743a.setTextColor(C0216d.m1116c(adVar.getContext(), C7582R.color.play_fg_primary));
            adVar.f18744b.setTextColor(C0216d.m1116c(adVar.getContext(), C7582R.color.play_fg_secondary));
            adVar.f18754l.getCardViewGroupDelegate().mo3864a(adVar.f18754l, C0216d.m1116c(adVar.getContext(), C7582R.color.play_white));
            g = C1608h.m9262g(i);
            adVar.f18748f.setTextColor(C0216d.m1116c(adVar.getContext(), C7582R.color.play_white));
            adVar.f18748f.setBackgroundResource(g);
            adVar.f18749g.setTextColor(C1608h.m9243a(adVar.getContext(), i));
        } else {
            g = (i == 0 || i == 9) ? 0 : 1;
            if (g != 0) {
                g = C1608h.m9256d(i);
            } else {
                g = C7582R.color.status_bar_multi;
            }
            adVar.f18754l.getCardViewGroupDelegate().mo3864a(adVar.f18754l, adVar.getResources().getColor(g));
            adVar.f18748f.setTextColor(C0216d.m1116c(adVar.getContext(), C7582R.color.play_white));
            adVar.f18748f.setBackgroundResource(C7582R.drawable.warm_welcome_v2_primary_button);
            adVar.f18749g.setTextColor(C0216d.m1116c(adVar.getContext(), C7582R.color.play_white));
        }
        if (bdVar != null) {
            C1473m.f7980a.ar().m9288a(adVar.f18745c, bdVar.f11860f, bdVar.f11863i);
            adVar.f18746d.setVisibility(0);
        } else {
            adVar.f18746d.setVisibility(8);
        }
        adVar.f18752j = C2482j.m13283a(516);
        C2482j.m13285a(adVar.f18752j, bArr);
        adVar.f18753k = adVar2;
        adVar.f18748f.setVisibility(8);
        adVar.f18749g.setVisibility(8);
        adVar.f18747e.setVisibility(8);
        adVar.getParentNode().mo1219a(adVar);
        g = 0;
        while (g < luVar.f13062b.length) {
            ah ahVar = luVar.f13062b[g];
            String str = ahVar.f11791d;
            OnClickListener a = m20421a(document, ahVar, adVar);
            TextView textView = (g == 0 ? 1 : 0) != 0 ? adVar.f18748f : adVar.f18749g;
            textView.setVisibility(0);
            textView.setText(str.toUpperCase());
            textView.setOnClickListener(a);
            adVar.f18747e.setVisibility(0);
            g++;
        }
        if (luVar.f13064d != null) {
            OnClickListener a2 = m20421a(document, luVar.f13064d, adVar);
            adVar.f18750h.setVisibility(0);
            adVar.f18750h.setOnClickListener(a2);
        }
        bd b = document.m14642b(21);
        if (adVar.f18751i == null) {
            return;
        }
        if (b == null) {
            adVar.f18751i.setVisibility(8);
            return;
        }
        adVar.f18751i.setVisibility(0);
        C1473m.f7980a.ar().m9288a(adVar.f18751i, b.f11860f, b.f11863i);
    }
}
