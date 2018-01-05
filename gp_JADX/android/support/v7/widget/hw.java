package android.support.v7.widget;

import android.view.View;

final class hw {
    public final hy f3610a;
    public hx f3611b = new hx();

    hw(hy hyVar) {
        this.f3610a = hyVar;
    }

    final View m3849a(int i, int i2, int i3, int i4) {
        int a = this.f3610a.mo867a();
        int b = this.f3610a.mo870b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3610a.mo869a(i);
            this.f3611b.m3853a(a, b, this.f3610a.mo868a(a2), this.f3610a.mo871b(a2));
            if (i3 != 0) {
                this.f3611b.f3612a = 0;
                this.f3611b.m3852a(i3);
                if (this.f3611b.m3854a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3611b.f3612a = 0;
                this.f3611b.m3852a(i4);
                if (this.f3611b.m3854a()) {
                    i += i5;
                    view = a2;
                }
            }
            a2 = view;
            i += i5;
            view = a2;
        }
        return view;
    }

    final boolean m3850a(View view) {
        this.f3611b.m3853a(this.f3610a.mo867a(), this.f3610a.mo870b(), this.f3610a.mo868a(view), this.f3610a.mo871b(view));
        this.f3611b.f3612a = 0;
        this.f3611b.m3852a(24579);
        return this.f3611b.m3854a();
    }
}
