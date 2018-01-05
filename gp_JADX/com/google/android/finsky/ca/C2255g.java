package com.google.android.finsky.ca;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;

final class C2255g implements C0657w {
    public final /* synthetic */ String f11196a;
    public final /* synthetic */ Runnable f11197b;
    public final /* synthetic */ C2251c f11198c;

    C2255g(C2251c c2251c, String str, Runnable runnable) {
        this.f11198c = c2251c;
        this.f11196a = str;
        this.f11197b = runnable;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f11198c.m11685a(this.f11196a, 1301, null, 1, volleyError, null);
        ForegroundCoordinator.m16015a(this.f11198c.f11186i);
        if (this.f11197b != null) {
            this.f11197b.run();
        }
    }
}
