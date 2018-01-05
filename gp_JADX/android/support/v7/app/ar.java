package android.support.v7.app;

import android.support.v7.widget.eq;

final class ar implements Runnable {
    public final /* synthetic */ aq f2306a;

    ar(aq aqVar) {
        this.f2306a = aqVar;
    }

    public final void run() {
        if ((this.f2306a.f2284R & 1) != 0) {
            this.f2306a.m2436h(0);
        }
        if ((this.f2306a.f2284R & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            this.f2306a.m2436h(108);
        }
        this.f2306a.f2283Q = false;
        this.f2306a.f2284R = 0;
    }
}
