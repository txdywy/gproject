package com.google.android.finsky.dfemodel;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.nano.y;

public class C2717g extends C2335k implements C0660x {
    public y f14921a;

    public C2717g(C1254c c1254c, String str) {
        c1254c.mo1584a(str, (C0660x) this, (C0657w) this);
    }

    public final boolean mo2861a() {
        return this.f14921a != null;
    }

    public void mo3374a(y yVar) {
        mo3129i();
        this.f14921a = yVar;
        m11927l();
    }

    public final boolean m14717b() {
        if (this.f14921a != null) {
            boolean z;
            if ((this.f14921a.a & 512) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void b_(Object obj) {
        mo3374a((y) obj);
    }
}
