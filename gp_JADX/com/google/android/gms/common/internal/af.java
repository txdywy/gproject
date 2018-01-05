package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5090v;
import com.google.android.gms.tasks.C5587d;
import com.google.android.gms.tasks.C5588e;

public final class af {
    public static final al f25981a = new ag();

    public static C5587d m23724a(C4954s c4954s) {
        return m23726a(c4954s, new aj());
    }

    public static C5587d m23725a(C4954s c4954s, C5090v c5090v) {
        return m23726a(c4954s, new ai(c5090v));
    }

    private static C5587d m23726a(C4954s c4954s, ak akVar) {
        al alVar = f25981a;
        C5588e c5588e = new C5588e();
        c4954s.mo4489a(new ah(c4954s, c5588e, akVar, alVar));
        return c5588e.f28505a;
    }
}
