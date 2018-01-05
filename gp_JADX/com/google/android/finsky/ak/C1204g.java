package com.google.android.finsky.ak;

import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.utils.p188a.C2918a;
import java.util.concurrent.Executors;

public final class C1204g implements C1203f {
    public final C4817d f7312a;
    public final C1461c f7313b;
    public final Context f7314c;

    public C1204g(Context context, C4817d c4817d, C1461c c1461c) {
        this.f7314c = context;
        this.f7312a = c4817d;
        this.f7313b = c1461c;
    }

    public final C1202e mo1517a(C1198a c1198a, String str, C2918a c2918a, C2918a c2918a2, C2918a c2918a3, int i, C2918a c2918a4) {
        return new C1205h(this.f7313b, c1198a.f7306d, c1198a, str, c2918a, c2918a2, c2918a3, i, ((Long) C0955b.jk.m28964b()).longValue(), c2918a4);
    }

    public final C1202e mo1518a(String str, C1201d c1201d, C2918a c2918a, C2918a c2918a2, C2918a c2918a3, C2918a c2918a4) {
        C1198a a = mo1516a(str, new C1201d[]{c1201d});
        return new C1205h(this.f7313b, a.f7306d, a, c1201d.f7309a, c2918a, c2918a2, c2918a3, 0, ((Long) C0955b.jk.m28964b()).longValue(), c2918a4);
    }

    public final C1198a mo1516a(String str, C1201d[] c1201dArr) {
        return new C1198a(this.f7314c, this.f7312a.mo4399a(Executors.newSingleThreadExecutor()), str, c1201dArr);
    }
}
