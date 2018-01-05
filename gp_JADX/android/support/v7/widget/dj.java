package android.support.v7.widget;

import android.view.View;

final class dj {
    public int f3376a;
    public int f3377b;
    public boolean f3378c;
    public boolean f3379d;
    public final /* synthetic */ LinearLayoutManager f3380e;

    dj(LinearLayoutManager linearLayoutManager) {
        this.f3380e = linearLayoutManager;
        m3506a();
    }

    final void m3506a() {
        this.f3376a = -1;
        this.f3377b = Integer.MIN_VALUE;
        this.f3378c = false;
        this.f3379d = false;
    }

    final void m3508b() {
        int c;
        if (this.f3378c) {
            c = this.f3380e.f2964k.mo833c();
        } else {
            c = this.f3380e.f2964k.mo831b();
        }
        this.f3377b = c;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3376a + ", mCoordinate=" + this.f3377b + ", mLayoutFromEnd=" + this.f3378c + ", mValid=" + this.f3379d + '}';
    }

    public final void m3507a(View view) {
        int a = this.f3380e.f2964k.m3537a();
        if (a >= 0) {
            m3509b(view);
            return;
        }
        this.f3376a = ew.m2979a(view);
        int e;
        if (this.f3378c) {
            a = (this.f3380e.f2964k.mo833c() - a) - this.f3380e.f2964k.mo832b(view);
            this.f3377b = this.f3380e.f2964k.mo833c() - a;
            if (a > 0) {
                e = this.f3377b - this.f3380e.f2964k.mo838e(view);
                int b = this.f3380e.f2964k.mo831b();
                e -= b + Math.min(this.f3380e.f2964k.mo829a(view) - b, 0);
                if (e < 0) {
                    this.f3377b = Math.min(a, -e) + this.f3377b;
                    return;
                }
                return;
            }
            return;
        }
        e = this.f3380e.f2964k.mo829a(view);
        b = e - this.f3380e.f2964k.mo831b();
        this.f3377b = e;
        if (b > 0) {
            a = (this.f3380e.f2964k.mo833c() - Math.min(0, (this.f3380e.f2964k.mo833c() - a) - this.f3380e.f2964k.mo832b(view))) - (e + this.f3380e.f2964k.mo838e(view));
            if (a < 0) {
                this.f3377b -= Math.min(b, -a);
            }
        }
    }

    public final void m3509b(View view) {
        if (this.f3378c) {
            this.f3377b = this.f3380e.f2964k.mo832b(view) + this.f3380e.f2964k.m3537a();
        } else {
            this.f3377b = this.f3380e.f2964k.mo829a(view);
        }
        this.f3376a = ew.m2979a(view);
    }
}
