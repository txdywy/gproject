package com.google.android.libraries.flowlayoutmanager;

import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;

final class C5928j extends C5924h {
    public static final C0321q f29562a = new C0322r(10);
    public C5926f f29563b;
    public boolean f29564c;
    public int f29565d;
    public int f29566i;
    public int f29567j;
    public int f29568k;
    public int f29569l;
    public C5929l f29570m;
    public int f29571n;

    C5928j() {
        mo5211d();
    }

    public final void mo5206a() {
        if (this.f29563b != null) {
            this.f29563b.f29537o = false;
        }
        if (this.f29570m != null) {
            this.f29570m.m27522c();
        }
    }

    public final int mo5208b() {
        if (this.f29563b == null) {
            return this.f;
        }
        if (this.f29570m == null) {
            return this.f + 1;
        }
        return this.f29570m.mo5208b();
    }

    protected final int mo5205a(boolean z, int i) {
        int i2 = 1;
        if (this.f29563b == null) {
            return 0;
        }
        int i3 = this.f == 0 ? 1 : 0;
        if (this.f + 1 != i) {
            i2 = 0;
        }
        this.f29563b.f29538p = i3 != 0 ? this.f29563b.f29528f : this.f29563b.f29527e;
        i2 = Math.max(0, (i2 != 0 ? this.f29563b.f29532j : this.f29563b.f29531i) + (this.f29563b.f29535m + this.f29563b.f29538p));
        if (this.f29570m != null) {
            i3 = this.f29570m.m27475c(i);
        } else {
            i3 = 0;
        }
        if (this.f29564c) {
            this.f29571n = Math.max(0, ((this.f29568k + i3) + this.f29569l) - this.f29563b.f29535m);
            i3 = Math.max(this.f29566i, i3) + this.f29569l;
        } else {
            this.f29571n = 0;
            i3 = Math.max(this.f29566i + this.f29569l, i3);
        }
        return Math.max(i2, i3 + (this.f29563b.f29538p + this.f29568k));
    }

    public final int mo5204a(int i) {
        if (i == this.f) {
            return this.f29563b.f29538p;
        }
        if (this.f29570m != null) {
            return (this.f29563b.f29538p + this.f29568k) + this.f29570m.m27526f(i);
        }
        return 0;
    }

    protected final boolean mo5209b(int i) {
        if (this.f29570m == null) {
            return false;
        }
        switch (this.f29570m.m27476d(i)) {
            case 0:
                return false;
            case 2:
                this.f29570m.m27524e();
                this.f29570m = null;
                return true;
            default:
                return true;
        }
    }

    public final void mo5212e(int i) {
        super.mo5212e(i);
        if (this.f29570m != null) {
            this.f29570m.mo5212e(i);
        }
    }

    public final void mo5210c() {
        mo5211d();
        f29562a.mo382a(this);
    }

    protected final void mo5211d() {
        super.mo5211d();
        if (this.f29563b != null) {
            this.f29563b.m27493a();
            this.f29563b = null;
        }
        this.f29565d = 0;
        this.f29566i = 0;
        this.f29567j = 0;
        this.f29568k = 0;
        this.f29569l = 0;
        this.f29571n = 0;
        if (this.f29570m != null) {
            this.f29570m.m27524e();
            this.f29570m = null;
        }
    }

    final void mo5207a(StringBuilder stringBuilder) {
        stringBuilder.append('@').append(this.f).append("(flow");
        if (this.f29570m != null) {
            this.f29570m.m27519a(stringBuilder);
        } else {
            stringBuilder.append("{}");
        }
        stringBuilder.append(')');
    }
}
