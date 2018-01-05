package com.google.android.finsky.cz;

import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.nano.fw;

public final class C2468b implements C0660x {
    public final /* synthetic */ C1254c f13296a;
    public final /* synthetic */ Runnable f13297b;
    public final /* synthetic */ String f13298c;
    public final /* synthetic */ int f13299d = 1;
    public final /* synthetic */ C2467a f13300e;

    public C2468b(C2467a c2467a, C1254c c1254c, Runnable runnable, String str) {
        this.f13300e = c2467a;
        this.f13296a = c1254c;
        this.f13297b = runnable;
        this.f13298c = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        fw fwVar = (fw) obj;
        this.f13300e.f13294a.mo2796a(this.f13296a.mo1620b(), "revoke", this.f13297b, fwVar.a);
        C2467a c2467a = this.f13300e;
        String str = this.f13298c;
        int i = this.f13299d;
        for (int i2 = 0; i2 < c2467a.f13295b.size(); i2++) {
            ((C1001d) c2467a.f13295b.get(i2)).mo1207a(str, i);
        }
    }
}
