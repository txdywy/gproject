package com.google.android.finsky.playcard;

import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.bb;
import com.google.android.play.layout.d;

final class ak implements C0999d {
    public final /* synthetic */ ah f19571a;

    ak(ah ahVar) {
        this.f19571a = ahVar;
    }

    public final void mo1204a(C2197a c2197a) {
        this.f19571a.m18485b();
        ah ahVar = this.f19571a;
        bb.m21791a();
        for (d dVar : ahVar.f19561a) {
            boolean useDarkTheme;
            if (dVar instanceof co) {
                useDarkTheme = ((co) dVar).getUseDarkTheme();
            } else {
                useDarkTheme = false;
            }
            ahVar.f19562b.m18513a((Document) dVar.getData(), dVar, useDarkTheme);
        }
    }

    public final void ab_() {
    }
}
