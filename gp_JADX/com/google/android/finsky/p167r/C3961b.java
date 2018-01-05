package com.google.android.finsky.p167r;

import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.p111d.C2495w;

public final class C3961b {
    public final Document f19983a;
    public final C2322b f19984b;
    public final C2129c f19985c;
    @Deprecated
    public final C2495w f19986d;
    public C3366j f19987e;
    public C3361d f19988f = new C3361d();
    public int f19989g;
    public int f19990h;
    @Deprecated
    public int f19991i;
    public int f19992j;
    public int f19993k;
    public int f19994l;

    public C3961b(Document document, C2322b c2322b, C2129c c2129c, C2495w c2495w) {
        this.f19983a = document;
        this.f19984b = c2322b;
        this.f19985c = c2129c;
        this.f19986d = c2495w;
        this.f19987e = new C3366j(c2495w, document);
    }

    public final String toString() {
        C2441n N = this.f19983a.m14625N();
        return String.format("%s v:%d", new Object[]{N.f13171k, Integer.valueOf(N.f13163c)});
    }
}
