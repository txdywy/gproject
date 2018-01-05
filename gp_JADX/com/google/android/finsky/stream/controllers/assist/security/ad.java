package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.verifier.C4726d;

public final class ad {
    public final Context f21782a;
    public final C3646a f21783b;
    public final C3851f f21784c;
    public final SecurityUtils f21785d;
    public final C4726d f21786e;

    public ad(Context context, C3646a c3646a, C3851f c3851f, SecurityUtils securityUtils, C4726d c4726d) {
        this.f21782a = context;
        this.f21783b = c3646a;
        this.f21784c = c3851f;
        this.f21785d = securityUtils;
        this.f21786e = c4726d;
    }

    final C4326g m20066a() {
        return new C4326g(this, this.f21782a, this.f21786e);
    }

    final C4328i m20069b() {
        return new C4328i(this, this.f21782a, this.f21786e);
    }

    final C4330k m20068a(String str, boolean z, long j) {
        return new C4330k(this, this.f21782a, this.f21786e, str, z, j);
    }

    final C4329j m20067a(long j) {
        return new C4329j(this, this.f21782a, this.f21786e, j);
    }
}
