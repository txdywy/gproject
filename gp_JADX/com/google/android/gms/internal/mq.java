package com.google.android.gms.internal;

import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5085j;
import com.google.android.gms.common.api.Scope;

public final class mq {
    public static C5085j f27191a = new C5085j();
    public static C5085j f27192b = new C5085j();
    public static final C4931e f27193c = new mr();
    public static C4931e f27194d = new ms();
    public static final C5053a f27195e = new C5053a("SignIn.API", f27193c, f27191a);

    static {
        Scope scope = new Scope("profile");
        scope = new Scope("email");
        C5053a c5053a = new C5053a("SignIn.INTERNAL_API", f27194d, f27192b);
    }
}
