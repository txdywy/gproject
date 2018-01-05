package com.google.android.finsky.inlinedetails;

import android.content.Intent;
import com.google.android.finsky.activities.ej;
import com.google.android.finsky.utils.FinskyLog;

final class C3253h implements Runnable {
    public final /* synthetic */ Intent f16767a;
    public final /* synthetic */ C3251f f16768b;

    C3253h(C3251f c3251f, Intent intent) {
        this.f16768b = c3251f;
        this.f16767a = intent;
    }

    public final void run() {
        boolean z = true;
        C3254j c3254j = new C3254j(false, false, null, this.f16767a);
        try {
            ej ejVar = this.f16768b.f16756b;
            Intent intent = this.f16768b.f16755a.getIntent();
            C3251f c3251f = this.f16768b;
            if (!c3251f.f16765k && c3251f.f16758d.mo2294a(12632316)) {
                z = false;
            }
            C3254j a = ejVar.m6521a(intent, z, this.f16768b.f16764j);
            if (a.m16368a() != null) {
                if (this.f16768b.f16758d.mo2294a(12639141) && this.f16768b.f16765k && a.f16770b) {
                    FinskyLog.m21665c("This activity launch is a duplicate instance of %s. Exiting...", a.f16771c);
                    this.f16768b.f16755a.finish();
                    return;
                }
                c3254j = a;
            }
            this.f16768b.f16757c.mo1254a(c3254j);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Error while processing launch URL", new Object[0]);
            this.f16768b.f16757c.mo1254a(c3254j);
        }
    }
}
