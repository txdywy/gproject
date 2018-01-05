package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.C4935a;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5058o;

public final class C4947d implements C4935a {
    public final C4954s mo4478a(C5058o c5058o) {
        Context b = c5058o.mo4552b();
        C4953f.f25437a.m24290a("GoogleSignInCommon", "Revoking access");
        C4953f.m23054a(b);
        return c5058o.mo4553b(new C4956g(c5058o));
    }
}
