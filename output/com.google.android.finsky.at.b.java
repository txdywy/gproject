package com.google.android.finsky.at;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.at.b extends com.google.android.finsky.at.e
{

    public boolean af;

    b() {
        com.google.android.finsky.at.e();
        this.af = 0;
        this.b(1);
    }

    public static com.google.android.finsky.at.b a(android.support.v4.app.ab p0, Fragment p1, String p2, String p3, com.google.android.finsky.d.w p4, int p5) {
        com.google.android.finsky.at.b.b(p0);
        v0 = ((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)new com.google.android.finsky.at.c().c(p2)).b(p3)).d(17039370)).a(p1, p5, 0)).a(323, 0, 2903, -1, p4)).a();
        ((com.google.android.finsky.at.b)v0).a(p0, "error_dialog");
        return (com.google.android.finsky.at.b)v0;
    }

    private static void b(android.support.v4.app.ab p0) {
        p0.b();
        v0 = (com.google.android.finsky.at.b)p0.a("error_dialog");
        if (v0 != 0) {
            try {
                v0.af = 1;
                p0.a().a(v0).a(0).c();
            }
            catch (IllegalStateException ex) {
                v0 = String.valueOf(v0);
                FinskyLog.c((String.valueOf(v0).length() + 40) + "Double remove of error dialog fragment: " + v0, new Object[0]);
            }
        }
    }

    public final void a(android.support.v4.app.ab p0) {
        com.google.android.finsky.at.b.b(p0);
        super.a(p0, "error_dialog");
    }

    public final void onDismiss(DialogInterface p0) {
        if (this.af == 0) {
            v0 = this.ac();
            if (v0 != 0) {
                this.X();
                v0.f_(this.Y());
            }
        }
        super.onDismiss(p0);
    }

}
