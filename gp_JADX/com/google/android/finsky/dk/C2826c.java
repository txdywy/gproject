package com.google.android.finsky.dk;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.List;

public final class C2826c {
    public final C3851f f15199a;
    public final C0983h f15200b;
    public final List f15201c = new ArrayList();
    public final C2830g f15202d;
    public long f15203e = -1;
    public long f15204f = -1;
    public long f15205g = -1;
    public long f15206h = -1;
    public boolean f15207i = false;

    public C2826c(C3851f c3851f, C2830g c2830g) {
        this.f15199a = c3851f;
        this.f15202d = c2830g;
        this.f15200b = new C2827d(this);
    }

    public final void m14951a(C2829f c2829f) {
        bb.m21791a();
        if (this.f15201c.isEmpty()) {
            this.f15199a.mo3818a(this.f15200b);
        }
        this.f15201c.add(c2829f);
    }

    public final void m14954b(C2829f c2829f) {
        bb.m21791a();
        this.f15201c.remove(c2829f);
        if (this.f15201c.isEmpty()) {
            this.f15199a.mo3819b(this.f15200b);
        }
    }

    public final boolean m14952a() {
        return (this.f15205g == -1 || this.f15204f == -1 || this.f15206h == -1) ? false : true;
    }

    public final int m14953b() {
        if (!m14952a()) {
            return -1;
        }
        if (this.f15205g < this.f15206h) {
            return 2;
        }
        if (this.f15205g < ((Long) C0955b.hL.m28964b()).longValue()) {
            return 1;
        }
        return 0;
    }

    public final void m14955c() {
        if (this.f15203e == -1 || this.f15203e < C4678i.m21813b() - ((Long) C0955b.hK.m28964b()).longValue()) {
            m14956d();
        }
    }

    final void m14956d() {
        if (!this.f15207i) {
            this.f15207i = true;
            bb.m21792a(new C2828e(this), new Void[0]);
        }
    }
}
