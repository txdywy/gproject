package com.google.android.finsky.playcard;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.utils.bb;
import com.google.android.play.layout.d;

final class aj implements C1003o {
    public final /* synthetic */ ah f19570a;

    aj(ah ahVar) {
        this.f19570a = ahVar;
    }

    public final void mo1205a(C3369m c3369m) {
        ah ahVar = this.f19570a;
        String a = c3369m.m16819a();
        bb.m21791a();
        ahVar.f19567g.m1697b(a);
        ah ahVar2 = this.f19570a;
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
}
