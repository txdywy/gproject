package com.google.android.instantapps.common.p217e;

import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.phenotype.C5553l;
import com.google.android.gms.phenotype.Configurations;

final class C5745g extends C5553l {
    public final /* synthetic */ C5744f f29142d;

    C5745g(C5744f c5744f, C5058o c5058o, String str) {
        this.f29142d = c5744f;
        super(c5058o, str);
    }

    protected final void mo5159a(Configurations configurations) {
        C5553l.m26537a(this.f29142d.f29140a.getSharedPreferences("phenotypeConfigurations", 0), configurations);
    }
}
