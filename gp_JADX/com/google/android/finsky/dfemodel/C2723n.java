package com.google.android.finsky.dfemodel;

import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.iv;
import com.google.wireless.android.finsky.dfe.nano.bm;
import com.google.wireless.android.finsky.dfe.nano.ft;

public final class C2723n extends C2711x implements C0660x {
    public C1254c f14933a;
    public boolean f14934b = false;
    public boolean f14935c = false;
    public int f14936d;
    public int f14937e = 0;
    public int f14938f;
    public bm f14939g;
    public iv f14940k;

    C2723n(C1254c c1254c, String str, int i, boolean z) {
        super(str, z);
        this.f14933a = c1254c;
        this.f14936d = i;
        this.f14938f = -1;
    }

    public final void mo3119b() {
        ac_();
        m14699n();
    }

    public final void m14738a(boolean z, boolean z2) {
        this.f14934b = z;
        this.f14935c = z2;
    }

    protected final C0656n mo3123b(String str) {
        return this.f14933a.mo1596a(str, this.f14935c, this.f14934b ? this.f14936d : -1, this.f14937e, this.f14938f, (C0660x) this, (C0657w) this);
    }

    public final void ac_() {
        super.ac_();
        this.f14940k = null;
    }

    protected final void mo3125f() {
        throw new IllegalStateException("not supported");
    }

    protected final /* synthetic */ Object[] mo3124c(Object obj) {
        ft ftVar = (ft) obj;
        if (ftVar.c != null) {
            this.f14939g = ftVar.c;
            return this.f14939g.h;
        } else if (ftVar.b == null) {
            return new iu[0];
        } else {
            if (m14698m() == 0) {
                this.f14940k = ftVar.b.c;
            }
            return ftVar.b.b;
        }
    }

    protected final /* synthetic */ String mo3120b(Object obj) {
        return ((ft) obj).d;
    }
}
