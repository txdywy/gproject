package com.google.android.finsky.wear;

import android.content.Context;
import android.os.Handler;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bn.C2128a;
import com.google.android.finsky.bn.C2132f;
import com.google.android.finsky.bn.C2134h;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.gms.common.api.C5058o;
import java.util.HashMap;
import java.util.Map;

public final class C4781b {
    public final Context f24854a;
    public final C5058o f24855b;
    public final Handler f24856c;
    public final Handler f24857d;
    public Map f24858e = new HashMap();

    public C4781b(Context context, C5058o c5058o, Handler handler, Handler handler2) {
        C1473m.f7980a.aR();
        this.f24854a = context;
        this.f24855b = c5058o;
        this.f24856c = handler;
        this.f24857d = handler2;
    }

    public final void m22485a(String str, Runnable runnable) {
        Runnable c4782c = new C4782c(runnable);
        m22486b(str).m11204a(c4782c);
        ag.m22436a(this.f24854a, str, this.f24855b).m22440a(c4782c);
    }

    public final C3646a m22484a(String str) {
        return new C3646a(str, m22486b(str), ag.m22436a(this.f24854a, str, this.f24855b), C1473m.f7980a.mo2040T(), C1473m.f7980a.aN());
    }

    public final synchronized C2134h m22486b(String str) {
        C2134h c2134h;
        c2134h = (C2134h) this.f24858e.get(str);
        if (c2134h == null) {
            c2134h = new C2134h(new C2128a(), new C2132f(this.f24854a, str), this.f24857d, this.f24856c);
            this.f24858e.put(str, c2134h);
        }
        return c2134h;
    }
}
