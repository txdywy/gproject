package android.support.v7.view;

import android.support.v4.view.by;
import android.view.View;

final class C0463m extends by {
    public boolean f2618a = false;
    public int f2619b = 0;
    public final /* synthetic */ C0462l f2620c;

    C0463m(C0462l c0462l) {
        this.f2620c = c0462l;
    }

    public final void mo440a(View view) {
        if (!this.f2618a) {
            this.f2618a = true;
            if (this.f2620c.f2615d != null) {
                this.f2620c.f2615d.mo440a(null);
            }
        }
    }

    public final void mo441b(View view) {
        int i = this.f2619b + 1;
        this.f2619b = i;
        if (i == this.f2620c.f2612a.size()) {
            if (this.f2620c.f2615d != null) {
                this.f2620c.f2615d.mo441b(null);
            }
            this.f2619b = 0;
            this.f2618a = false;
            this.f2620c.f2616e = false;
        }
    }
}
