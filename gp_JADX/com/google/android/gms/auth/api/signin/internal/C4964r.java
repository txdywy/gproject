package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C4924a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C5105f;
import com.google.android.gms.common.api.C5055d;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;

public final class C4964r extends C4961m {
    public final Context f25462a;

    public C4964r(Context context) {
        this.f25462a = context;
    }

    public final void mo4498a() {
        if (C5105f.m23690a(this.f25462a, Binder.getCallingUid())) {
            C4966t a = C4966t.m23100a(this.f25462a);
            GoogleSignInAccount a2 = a.m23105a();
            C5055d c5055d = GoogleSignInOptions.f25377d;
            if (a2 != null) {
                c5055d = a.m23107b();
            }
            C5058o b = new C5089p(this.f25462a).m23648a(C4924a.f25343g, c5055d).m23652b();
            try {
                if (b.mo4558f().m23264b()) {
                    if (a2 != null) {
                        C4924a.f25344h.mo4478a(b);
                    } else {
                        b.mo4561i();
                    }
                }
                b.mo4559g();
            } catch (Throwable th) {
                b.mo4559g();
            }
        } else {
            throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
        }
    }
}
