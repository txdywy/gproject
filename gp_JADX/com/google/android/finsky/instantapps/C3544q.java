package com.google.android.finsky.instantapps;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5265d;

final class C3544q implements C1643x {
    public final /* synthetic */ SettingsActivity f17803a;

    C3544q(SettingsActivity settingsActivity) {
        this.f17803a = settingsActivity;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5265d c5265d = (C5265d) c4980w;
        if (c5265d.mo4505b().m23271a()) {
            this.f17803a.f17331q.post(new C3545r(this, c5265d));
        }
    }
}
