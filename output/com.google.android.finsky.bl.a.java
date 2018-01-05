package com.google.android.finsky.bl;

import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.ab;
import com.google.wireless.android.finsky.dfe.nano.gp;

public final class com.google.android.finsky.bl.a
{

    public final com.google.android.finsky.as.a a;
    public final com.google.android.finsky.ba.c b;
    public final com.google.android.finsky.dfemodel.ab c;

    a(com.google.android.finsky.as.a p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.dfemodel.ab p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final boolean a() {
        return this.a(this.c.dn());
    }

    public final boolean a(DfeToc p0) {
        v0 = 1;
        if (p0 == 0)
            p0 = this.c.dn();
        if (!this.b.dj().a(12628642) || p0.a.u == 1)
            v0 = 0;
        return v0;
    }

    public final int b() {
        if (this.b.dj().a(12628782))
            v0 = 0;
        else
            v0 = 4;
        return v0;
    }

    public final int c() {
        if (this.b.dj().a(12634245))
            v0 = 1;
        else if (this.b.dj().a(12634246))
            v0 = 2;
        else
            v0 = 0;
        return v0;
    }

    public final boolean d() {
        if (this.a() && this.b.dj().a(12637220))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        if (this.a() && this.b.dj().a(12640667))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean f() {
        if (this.a() && this.b.dj().a(12640671))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean g() {
        if (this.b.dj().a(12638391) && this.a.h != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean h() {
        if (this.a() && this.b.dj().a(12642395))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
