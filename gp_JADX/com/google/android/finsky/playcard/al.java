package com.google.android.finsky.playcard;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.bb;
import com.google.android.play.layout.d;

final class al implements C0983h {
    public final /* synthetic */ ah f19572a;

    al(ah ahVar) {
        this.f19572a = ahVar;
    }

    public final void mo1175b(String str, boolean z) {
    }

    public final void mo1176c(String str, boolean z) {
    }

    public final void mo1177d(String str) {
        ah ahVar = this.f19572a;
        bb.m21791a();
        ahVar.f19567g.m1697b(str);
        ah ahVar2 = this.f19572a;
        bb.m21791a();
        for (d dVar : ahVar2.f19561a) {
            boolean useDarkTheme;
            if (dVar instanceof co) {
                useDarkTheme = ((co) dVar).getUseDarkTheme();
            } else {
                useDarkTheme = false;
            }
            ahVar2.f19562b.m18513a((Document) dVar.getData(), dVar, useDarkTheme);
        }
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
