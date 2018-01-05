package com.google.android.finsky.activities.inlineappinstaller.p119a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.inlineappinstaller.C1088a;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1081d extends C1076h {
    public final ce f6932a = C2482j.m13283a(5107);
    public View f6933b;
    public C1084g f6934c = C1473m.f7980a.aw();

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Document document = (Document) this.f760q.getParcelable("InlineConsumptionAppInstallerReadyToReadStep.appDoc");
        this.f6933b = layoutInflater.inflate(C7582R.layout.inline_app_installer_generic_layout, viewGroup, false);
        this.f6934c.m6725a(document, this.f6933b);
        return this.f6933b;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(m601g(), m592c((int) C7582R.string.app_install_success), this.f6933b, false);
    }

    public final String mo1406a(Resources resources) {
        if (C1473m.f7980a.dj().mo2294a(12633045) && this.f760q.getInt("InlineConsumptionAppInstallerReadyToReadStep.mediaDocType") == 64) {
            return resources.getString(C1592a.ak.intValue());
        }
        return resources.getString(C7582R.string.read);
    }

    public final void mo1405X() {
        ((C1088a) aa()).mo1408a(5108, (ad) this);
        ((C1088a) aa()).m6752a(true);
    }

    public final ce getPlayStoreUiElement() {
        return this.f6932a;
    }
}
