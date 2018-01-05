package android.support.v7.app;

import android.support.v4.view.ai;
import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.view.Menu;
import android.view.MenuItem;

final class az implements C0409c {
    public C0409c f2314a;
    public final /* synthetic */ aq f2315b;

    public az(aq aqVar, C0409c c0409c) {
        this.f2315b = aqVar;
        this.f2314a = c0409c;
    }

    public final boolean mo556a(C0412b c0412b, Menu menu) {
        return this.f2314a.mo556a(c0412b, menu);
    }

    public final boolean mo558b(C0412b c0412b, Menu menu) {
        return this.f2314a.mo558b(c0412b, menu);
    }

    public final boolean mo557a(C0412b c0412b, MenuItem menuItem) {
        return this.f2314a.mo557a(c0412b, menuItem);
    }

    public final void mo555a(C0412b c0412b) {
        this.f2314a.mo555a(c0412b);
        if (this.f2315b.f2270D != null) {
            this.f2315b.f.getDecorView().removeCallbacks(this.f2315b.f2271E);
        }
        if (this.f2315b.f2269C != null) {
            this.f2315b.m2442q();
            this.f2315b.f2272F = ai.m1852h(this.f2315b.f2269C).m1993a(0.0f);
            this.f2315b.f2272F.m1995a(new ba(this));
        }
        if (this.f2315b.i != null) {
            ab abVar = this.f2315b.i;
            C0412b c0412b2 = this.f2315b.f2268B;
            abVar.C_();
        }
        this.f2315b.f2268B = null;
    }
}
