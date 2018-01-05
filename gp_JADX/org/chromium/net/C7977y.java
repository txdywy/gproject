package org.chromium.net;

final class C7977y implements Runnable {
    public final /* synthetic */ long f40957a;
    public final /* synthetic */ int f40958b;
    public final /* synthetic */ boolean f40959c;
    public final /* synthetic */ C7976x f40960d;

    C7977y(C7976x c7976x, long j, int i, boolean z) {
        this.f40960d = c7976x;
        this.f40957a = j;
        this.f40958b = i;
        this.f40959c = z;
    }

    public final void run() {
        this.f40960d.f40956b.f40580d.mo6645a(this.f40957a, this.f40958b);
        if (this.f40959c) {
            this.f40960d.f40956b.f40580d.mo6643a(this.f40958b);
            this.f40960d.f40956b.f40580d.mo6646a(new long[]{this.f40957a});
        }
    }
}
