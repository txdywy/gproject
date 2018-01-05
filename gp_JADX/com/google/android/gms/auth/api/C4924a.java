package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.signin.C4935a;
import com.google.android.gms.auth.api.signin.internal.C4947d;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5085j;
import com.google.android.gms.internal.bh;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bp;

public final class C4924a {
    public static final C5085j f25337a = new C5085j();
    public static final C5085j f25338b = new C5085j();
    public static final C5085j f25339c = new C5085j();
    public static final C4931e f25340d = new C4932d();
    public static final C4931e f25341e = new C4933e();
    public static final C4931e f25342f = new C4934f();
    public static final C5053a f25343g = new C5053a("Auth.GOOGLE_SIGN_IN_API", f25342f, f25339c);
    public static final C4935a f25344h = new C4947d();

    static {
        C5053a c5053a = new C5053a("Auth.CREDENTIALS_API", f25340d, f25337a);
        c5053a = new C5053a("Auth.ACCOUNT_STATUS_API", f25341e, f25338b);
        bp bpVar = new bp();
        bl blVar = new bl();
        bh bhVar = new bh();
    }
}
