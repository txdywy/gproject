package com.google.android.finsky.activities.inlineappinstaller.p119a;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.inlineappinstaller.C1088a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.p;
import com.squareup.leakcanary.C7582R;

public final class C1082e extends C1076h {
    public final ce f6935a = C2482j.m13283a(5101);
    public View f6936b;
    public cv f6937c;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = this.f760q;
        this.f6937c = (cv) ParcelableProto.m21673a(bundle2, "mediaDoc");
        p pVar = (p) ParcelableProto.m21673a(bundle2, "installStep");
        this.f6936b = layoutInflater.inflate(C7582R.layout.inline_consumption_app_installer, viewGroup, false);
        View view = (TextView) this.f6936b.findViewById(C7582R.id.top_info_text);
        View view2 = (TextView) this.f6936b.findViewById(C7582R.id.body_text);
        int e = C1473m.f7980a.bn().mo2718e(this.f6937c.f12099f);
        if (pVar != null) {
            view.setText(Html.fromHtml(pVar.b));
            view2.setText(Html.fromHtml(m592c(e)));
        } else {
            view.setText(Html.fromHtml(m592c(e)));
            view2.setVisibility(8);
            view2 = view;
        }
        view2.setOnClickListener(new C1083f(this));
        return this.f6936b;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(m601g(), m592c(C1473m.f7980a.bn().mo2715c(this.f6937c.f12099f)), this.f6936b, false);
    }

    public final String mo1406a(Resources resources) {
        return resources.getString(C7582R.string.install);
    }

    public final void mo1405X() {
        ((C1088a) aa()).mo1408a(5102, (ad) this);
        C1088a c1088a = (C1088a) aa();
        Document document = c1088a.f6940a.f6951c;
        if (VERSION.SDK_INT <= 22 || document.ai() <= 22) {
            c1088a.f6940a.m6758b(6, 0);
        } else {
            c1088a.m6749X();
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f6935a;
    }
}
