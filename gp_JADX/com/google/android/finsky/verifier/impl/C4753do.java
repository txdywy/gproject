package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.C2942x;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import com.google.protobuf.nano.l;

final class C4753do extends ap {
    public final /* synthetic */ C4699c f24624a;
    public final /* synthetic */ C4735g f24625b;
    public final /* synthetic */ String f24626c;
    public final /* synthetic */ dk f24627d;

    C4753do(dk dkVar, ag agVar, C4699c c4699c, C4735g c4735g, String str) {
        this.f24627d = dkVar;
        this.f24624a = c4699c;
        this.f24625b = c4735g;
        this.f24626c = str;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        Object obj = (ab) ag.m15236a(this.f15542f.f15534k.mo3199a().mo1521a(C4691w.m21842a(this.f24624a.f24145d.f24199b)));
        boolean z = obj == null || obj.f24103d == 0;
        if (this.f24625b.f24364a != 0) {
            int i;
            C2942x c2942x = new C2942x();
            c2942x.m15305a(this.f24624a.f24145d.f24199b);
            c2942x.m15303a(C4678i.m21812a());
            c2942x.m15302a(this.f24625b.f24364a);
            c2942x.m15304a(this.f24625b.f24370g);
            c2942x.m15307b(this.f24625b.f24365b);
            c2942x.m15308c(this.f24626c);
            byte[] bArr = this.f24625b.f24367d;
            if (bArr == null || bArr.length == 0) {
                ab abVar = c2942x.f15561a;
                abVar.f24107h = l.l;
                abVar.f24100a &= -65;
            } else {
                ab abVar2 = c2942x.f15561a;
                if (bArr == null) {
                    throw new NullPointerException();
                }
                abVar2.f24100a |= 64;
                abVar2.f24107h = bArr;
            }
            if (this.f24625b.f24374k) {
                i = 3;
            } else {
                i = 2;
            }
            c2942x.m15306b(i);
            return this.f15542f.f15534k.mo3199a().mo1524b(c2942x.f15561a).mo4397a(new dq(z));
        } else if (obj != null) {
            return this.f15542f.f15534k.mo3199a().mo1526c(obj).mo4397a(new dp(z));
        } else {
            return this.f24627d.f24604h.mo4401a(Boolean.valueOf(z));
        }
    }
}
