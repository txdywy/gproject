package com.google.android.finsky.activities.inlineappinstaller.p119a;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.inlineappinstaller.C1088a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1079b extends C1076h {
    public final ce f6923a = C2482j.m13283a(5109);
    public String f6924b;
    public View f6925c;
    public C1084g f6926d = C1473m.f7980a.aw();

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6925c = layoutInflater.inflate(C7582R.layout.inline_app_installer_generic_layout, viewGroup, false);
        Bundle bundle2 = this.f760q;
        this.f6924b = bundle2.getString("errorMsg");
        ((TextView) this.f6925c.findViewById(C7582R.id.title)).setText(this.f6924b);
        this.f6926d.m6725a((Document) bundle2.getParcelable("appDoc"), this.f6925c);
        return this.f6925c;
    }

    public final void mo979u() {
        super.mo979u();
        if (TextUtils.isEmpty(this.f6924b)) {
            C1601a.m9199a(m601g(), this.f6924b, this.f6925c, false);
        }
    }

    public final String mo1406a(Resources resources) {
        return resources.getString(C7582R.string.close);
    }

    public final void mo1405X() {
        ((C1088a) aa()).mo1408a(5110, (ad) this);
        ((C1088a) aa()).m6752a(false);
    }

    public final ce getPlayStoreUiElement() {
        return this.f6923a;
    }
}
