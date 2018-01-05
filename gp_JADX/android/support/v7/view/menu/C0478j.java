package android.support.v7.view.menu;

import android.os.SystemClock;
import android.support.v7.widget.dy;
import android.view.MenuItem;

final class C0478j implements dy {
    public final /* synthetic */ C0475g f2788a;

    C0478j(C0475g c0475g) {
        this.f2788a = c0475g;
    }

    public final void mo691a(C0471p c0471p, MenuItem menuItem) {
        this.f2788a.f2765f.removeCallbacksAndMessages(c0471p);
    }

    public final void mo692b(C0471p c0471p, MenuItem menuItem) {
        int i;
        this.f2788a.f2765f.removeCallbacksAndMessages(null);
        int size = this.f2788a.f2767h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c0471p == ((C0480l) this.f2788a.f2767h.get(i2)).f2794b) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            C0480l c0480l;
            i++;
            if (i < this.f2788a.f2767h.size()) {
                c0480l = (C0480l) this.f2788a.f2767h.get(i);
            } else {
                c0480l = null;
            }
            this.f2788a.f2765f.postAtTime(new C0479k(this, c0480l, menuItem, c0471p), c0471p, SystemClock.uptimeMillis() + 200);
        }
    }
}
