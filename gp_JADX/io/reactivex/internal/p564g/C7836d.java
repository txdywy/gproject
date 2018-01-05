package io.reactivex.internal.p564g;

import java.util.concurrent.ThreadFactory;

final class C7836d {
    public final int f40405a;
    public final C7838e[] f40406b;
    public long f40407c;

    C7836d(int i, ThreadFactory threadFactory) {
        this.f40405a = i;
        this.f40406b = new C7838e[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f40406b[i2] = new C7838e(threadFactory);
        }
    }

    public final C7838e m37691a() {
        int i = this.f40405a;
        if (i == 0) {
            return C7834b.f40397d;
        }
        C7838e[] c7838eArr = this.f40406b;
        long j = this.f40407c;
        this.f40407c = 1 + j;
        return c7838eArr[(int) (j % ((long) i))];
    }

    public final void m37692b() {
        for (C7837r a : this.f40406b) {
            a.mo6530a();
        }
    }
}
