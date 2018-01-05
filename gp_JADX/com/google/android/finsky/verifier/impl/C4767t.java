package com.google.android.finsky.verifier.impl;

import android.content.Intent;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.verifier.impl.p261b.C4740a;

public final class C4767t extends C4740a {
    public final PackageVerificationService f24703a;
    public final Intent f24704b;
    public C1461c f24705c;
    public C4817d f24706d;

    public C4767t(PackageVerificationService packageVerificationService, Intent intent) {
        this.f24703a = packageVerificationService;
        this.f24704b = intent;
        ((ac) C3947d.m18649a(ac.class)).mo1995a(this);
    }

    protected final boolean mo4343a() {
        String stringExtra = this.f24704b.getStringExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        byte[] byteArrayExtra = this.f24704b.getByteArrayExtra("digest");
        this.f24703a.f24308a.m15231c(stringExtra, byteArrayExtra);
        if (ag.m15237a(this.f24705c.dj())) {
            ag agVar = this.f24703a.f24309b;
            ag.m15236a(agVar.m15242b(new C4768u(this, agVar, byteArrayExtra)));
        }
        return false;
    }
}
