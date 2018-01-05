package com.google.android.finsky.dfemodel;

import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.nano.fy;
import com.google.wireless.android.finsky.dfe.nano.ga;

public final class C2724o extends C2335k implements C0660x {
    public C1254c f14941a;
    public String f14942b;
    public String f14943c;
    public ga f14944d;

    public C2724o(C1254c c1254c, String str, String str2) {
        this.f14941a = c1254c;
        this.f14942b = str;
        this.f14943c = str2;
    }

    public final boolean mo2861a() {
        return this.f14944d != null;
    }

    public final String m14745b() {
        fy fyVar = this.f14944d.f;
        if (fyVar != null) {
            return fyVar.b;
        }
        return this.f14944d.c;
    }

    public final boolean m14746c() {
        fy fyVar = this.f14944d.f;
        if (fyVar != null) {
            return fyVar.c;
        }
        return this.f14944d.d;
    }

    public final /* synthetic */ void b_(Object obj) {
        ga gaVar = (ga) obj;
        mo3129i();
        this.f14944d = gaVar;
        m11927l();
    }
}
