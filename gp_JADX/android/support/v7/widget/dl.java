package android.support.v7.widget;

import android.view.View;
import java.util.List;

final class dl {
    public boolean f3385a = true;
    public int f3386b;
    public int f3387c;
    public int f3388d;
    public int f3389e;
    public int f3390f;
    public int f3391g;
    public int f3392h = 0;
    public int f3393i;
    public List f3394j = null;
    public boolean f3395k;

    dl() {
    }

    final boolean m3512a(fo foVar) {
        return this.f3388d >= 0 && this.f3388d < foVar.m3705a();
    }

    final View m3510a(fh fhVar) {
        if (this.f3394j != null) {
            int size = this.f3394j.size();
            int i = 0;
            while (i < size) {
                View view = ((fr) this.f3394j.get(i)).f3211a;
                fa faVar = (fa) view.getLayoutParams();
                if (faVar.f3356c.m3276m() || this.f3388d != faVar.f3356c.m3266c()) {
                    i++;
                } else {
                    m3511a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = fhVar.m3683a(this.f3388d, Long.MAX_VALUE).f3211a;
        this.f3388d += this.f3389e;
        return view2;
    }

    public final void m3511a(View view) {
        View view2;
        int size = this.f3394j.size();
        View view3 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            int c;
            View view4;
            view2 = ((fr) this.f3394j.get(i2)).f3211a;
            fa faVar = (fa) view2.getLayoutParams();
            if (!(view2 == view || faVar.f3356c.m3276m())) {
                c = (faVar.f3356c.m3266c() - this.f3388d) * this.f3389e;
                if (c >= 0 && c < i) {
                    if (c == 0) {
                        break;
                    }
                    view4 = view2;
                    i2++;
                    view3 = view4;
                    i = c;
                }
            }
            c = i;
            view4 = view3;
            i2++;
            view3 = view4;
            i = c;
        }
        view2 = view3;
        if (view2 == null) {
            this.f3388d = -1;
        } else {
            this.f3388d = ((fa) view2.getLayoutParams()).f3356c.m3266c();
        }
    }
}
