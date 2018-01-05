package com.google.android.finsky.ia2;

import com.google.android.finsky.utils.ac;

final class C3237m implements Runnable {
    public final /* synthetic */ C3236l f16693a;

    C3237m(C3236l c3236l) {
        this.f16693a = c3236l;
    }

    public final void run() {
        if (this.f16693a.f16682i && this.f16693a.f16678e >= 0 && this.f16693a.f16678e < this.f16693a.f16675b.size()) {
            this.f16693a.m16342b().mo3391b(0);
            this.f16693a.f16678e = -1;
            ac acVar = new ac();
            for (int i = 0; i < this.f16693a.f16675b.size(); i++) {
                ((C3238o) this.f16693a.f16675b.get(i)).f16694a.mo3392b(acVar);
            }
        }
    }
}
