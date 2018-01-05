package com.google.android.finsky.setup.p240a;

import android.content.Context;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.cq.C2363d;

public final class C4126m {
    public final Context f20749a;
    public final C1531a f20750b;
    public final C2363d f20751c;

    public C4126m(Context context, C1531a c1531a, C2363d c2363d) {
        this.f20749a = context;
        this.f20750b = c1531a;
        this.f20751c = c2363d;
    }

    public final C4115b m19176a(String str) {
        return new C4115b(str, m19175a(false));
    }

    public final C4116c m19177b(String str) {
        return new C4116c(m19176a(str), new C4117d());
    }

    public final C4118e m19178c(String str) {
        return new C4118e(str, m19175a(true));
    }

    public final C4124k m19179d(String str) {
        return new C4124k(this.f20749a, str, m19175a(true));
    }

    private final C4121h m19175a(boolean z) {
        return new C4121h(this.f20749a, z, this.f20750b, this.f20751c);
    }
}
