package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class br {
    public static br f891a;
    public final Object f892b = new Object();
    public final Handler f893c = new Handler(Looper.getMainLooper(), new bs(this));
    public bu f894d;
    public bu f895e;

    public static br m708a() {
        if (f891a == null) {
            f891a = new br();
        }
        return f891a;
    }

    private br() {
    }

    public final void m709a(bt btVar) {
        synchronized (this.f892b) {
            if (m716e(btVar) && !this.f894d.f899c) {
                this.f894d.f899c = true;
                this.f893c.removeCallbacksAndMessages(this.f894d);
            }
        }
    }

    public final void m713b(bt btVar) {
        synchronized (this.f892b) {
            if (m716e(btVar) && this.f894d.f899c) {
                this.f894d.f899c = false;
                m710a(this.f894d);
            }
        }
    }

    public final boolean m714c(bt btVar) {
        boolean e;
        synchronized (this.f892b) {
            e = m716e(btVar);
        }
        return e;
    }

    public final boolean m715d(bt btVar) {
        boolean z;
        synchronized (this.f892b) {
            z = m716e(btVar) || m717f(btVar);
        }
        return z;
    }

    final void m712b() {
        if (this.f895e != null) {
            this.f894d = this.f895e;
            this.f895e = null;
            bt btVar = (bt) this.f894d.f897a.get();
            if (btVar != null) {
                btVar.mo185a();
            } else {
                this.f894d = null;
            }
        }
    }

    final boolean m711a(bu buVar, int i) {
        bt btVar = (bt) buVar.f897a.get();
        if (btVar == null) {
            return false;
        }
        this.f893c.removeCallbacksAndMessages(buVar);
        btVar.mo186a(i);
        return true;
    }

    final boolean m716e(bt btVar) {
        return this.f894d != null && this.f894d.m720a(btVar);
    }

    final boolean m717f(bt btVar) {
        return this.f895e != null && this.f895e.m720a(btVar);
    }

    final void m710a(bu buVar) {
        if (buVar.f898b != -2) {
            int i = 2750;
            if (buVar.f898b > 0) {
                i = buVar.f898b;
            } else if (buVar.f898b == -1) {
                i = 1500;
            }
            this.f893c.removeCallbacksAndMessages(buVar);
            this.f893c.sendMessageDelayed(Message.obtain(this.f893c, 0, buVar), (long) i);
        }
    }
}
