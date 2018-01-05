package com.google.android.finsky.stream.myapps;

import android.content.Context;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4278u;
import p002a.C0002a;

public abstract class C4356r extends C4250b {
    public final C0002a f22023r;
    public C4539f f22024s;

    public C4356r(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22023r = c0002a;
    }

    public abstract C2450w mo4180a(Document document);

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        C2450w a = mo4180a(document);
        C4547l c4547l = (C4547l) this.f22023r.mo1a();
        this.f22024s = new C4539f(this.e, this.f, c4547l.f23251a, c4547l.f23252b, c4547l.f23253c, c4547l.f23254d, c4547l.f23255e, this.i, this, document.f14885a.f12096c, a);
    }

    public final void mo4053a(C4278u c4278u) {
        super.mo4053a(c4278u);
        this.f22024s.f23241k = c4278u;
    }

    public final int mo1508a() {
        return this.f22024s.f23238h.f23260e ? 1 : 0;
    }

    public final void mo4061q() {
        super.mo4061q();
        C4549n c4549n = this.f22024s.f23238h;
        int size = c4549n.f23259d.size();
        for (int i = 0; i < size; i++) {
            ((ad) c4549n.f23259d.get(i)).mo4260b();
        }
    }
}
