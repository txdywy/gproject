package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;

final class cg implements an {
    public List f4412a = new ArrayList();
    public float f4413b;
    public float f4414c;
    public ch f4415d = null;
    public boolean f4416e = false;
    public boolean f4417f = true;
    public int f4418g = -1;
    public boolean f4419h;

    public cg(am amVar) {
        if (amVar != null) {
            amVar.m4590a((an) this);
            if (this.f4419h) {
                this.f4415d.m4672a((ch) this.f4412a.get(this.f4418g));
                this.f4412a.set(this.f4418g, this.f4415d);
                this.f4419h = false;
            }
            if (this.f4415d != null) {
                this.f4412a.add(this.f4415d);
            }
        }
    }

    public final void mo1098a(float f, float f2) {
        if (this.f4419h) {
            this.f4415d.m4672a((ch) this.f4412a.get(this.f4418g));
            this.f4412a.set(this.f4418g, this.f4415d);
            this.f4419h = false;
        }
        if (this.f4415d != null) {
            this.f4412a.add(this.f4415d);
        }
        this.f4413b = f;
        this.f4414c = f2;
        this.f4415d = new ch(f, f2, 0.0f, 0.0f);
        this.f4418g = this.f4412a.size();
    }

    public final void mo1102b(float f, float f2) {
        this.f4415d.m4671a(f, f2);
        this.f4412a.add(this.f4415d);
        this.f4415d = new ch(f, f2, f - this.f4415d.f4420a, f2 - this.f4415d.f4421b);
        this.f4419h = false;
    }

    public final void mo1100a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f4417f || this.f4416e) {
            this.f4415d.m4671a(f, f2);
            this.f4412a.add(this.f4415d);
            this.f4416e = false;
        }
        this.f4415d = new ch(f5, f6, f5 - f3, f6 - f4);
        this.f4419h = false;
    }

    public final void mo1099a(float f, float f2, float f3, float f4) {
        this.f4415d.m4671a(f, f2);
        this.f4412a.add(this.f4415d);
        this.f4415d = new ch(f3, f4, f3 - f, f4 - f2);
        this.f4419h = false;
    }

    public final void mo1101a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f4416e = true;
        this.f4417f = false;
        cf.m4642b(this.f4415d.f4420a, this.f4415d.f4421b, f, f2, f3, z, z2, f4, f5, this);
        this.f4417f = true;
        this.f4419h = false;
    }

    public final void mo1097a() {
        this.f4412a.add(this.f4415d);
        mo1102b(this.f4413b, this.f4414c);
        this.f4419h = true;
    }
}
