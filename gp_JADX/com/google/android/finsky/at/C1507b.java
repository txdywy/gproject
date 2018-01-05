package com.google.android.finsky.at;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

public final class C1507b extends C1128e {
    public boolean af = false;

    public C1507b() {
        m628b(true);
    }

    public static C1507b m8844a(ab abVar, Fragment fragment, String str, String str2, C2495w c2495w, int i) {
        C1507b.m8845b(abVar);
        C1507b c1507b = (C1507b) ((C1509c) ((C1509c) ((C1509c) ((C1509c) ((C1509c) new C1509c().m8859c(str)).m8856b(str2)).m8860d(17039370)).m8851a(fragment, i, null)).m8849a(323, null, 2903, -1, c2495w)).mo2272a();
        c1507b.m625a(abVar, "error_dialog");
        return c1507b;
    }

    public final void m8846a(ab abVar) {
        C1507b.m8845b(abVar);
        super.m625a(abVar, "error_dialog");
    }

    private static void m8845b(ab abVar) {
        abVar.mo291b();
        Fragment fragment = (C1507b) abVar.mo283a("error_dialog");
        if (fragment != null) {
            aw a = abVar.mo284a();
            try {
                fragment.af = true;
                a.mo327a(fragment).mo330a(null).mo334c();
            } catch (IllegalStateException e) {
                String valueOf = String.valueOf(fragment);
                FinskyLog.m21665c(new StringBuilder(String.valueOf(valueOf).length() + 40).append("Double remove of error dialog fragment: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.af) {
            C0998m ac = ac();
            if (ac != null) {
                int Y = m6865Y();
                m6864X();
                ac.f_(Y);
            }
        }
        super.onDismiss(dialogInterface);
    }
}
