package com.google.android.finsky.p232s;

import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.p111d.C2495w;

public final class C4005d {
    public int f20095a;
    public boolean f20096b;
    public final C3366j f20097c;
    public final C3361d f20098d = new C3361d();
    public final Document f20099e;
    public final C2322b f20100f;
    public final C2129c f20101g;

    public C4005d(Document document, C2322b c2322b, C2129c c2129c, C2495w c2495w) {
        this.f20099e = document;
        this.f20100f = c2322b;
        this.f20101g = c2129c;
        this.f20097c = new C3366j(c2495w.m13381c(), document);
    }
}
