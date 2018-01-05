package io.reactivex.internal.p564g;

import io.reactivex.internal.p557b.C7811n;

final class ad implements Comparable {
    public final Runnable f40384a;
    public final long f40385b;
    public final int f40386c;
    public volatile boolean f40387d;

    ad(Runnable runnable, Long l, int i) {
        this.f40384a = runnable;
        this.f40385b = l.longValue();
        this.f40386c = i;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        ad adVar = (ad) obj;
        int a = C7811n.m37614a(this.f40385b, adVar.f40385b);
        if (a == 0) {
            return C7811n.m37612a(this.f40386c, adVar.f40386c);
        }
        return a;
    }
}
