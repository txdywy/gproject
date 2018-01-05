package com.google.android.finsky.ba;

import android.os.Build.VERSION;
import com.google.android.finsky.providers.C3947d;

public final class C1556d {
    public C1461c f8336a;

    public C1556d() {
        ((C1346b) C3947d.m18649a(C1346b.class)).mo1712a(this);
    }

    public final boolean m9022a() {
        return this.f8336a.dj().mo2294a(12614201);
    }

    public final boolean m9023b() {
        return this.f8336a.dj().mo2294a(12617693) && m9022a();
    }

    public final boolean m9024c() {
        return this.f8336a.dj().mo2294a(12626952);
    }

    public final boolean m9025d() {
        return this.f8336a.dj().mo2294a(12634791) && VERSION.SDK_INT >= 24;
    }

    public final boolean m9026e() {
        return this.f8336a.dj().mo2294a(12637746) || this.f8336a.dj().mo2294a(12638126) || this.f8336a.dj().mo2294a(12638127) || this.f8336a.dj().mo2294a(12638128);
    }
}
