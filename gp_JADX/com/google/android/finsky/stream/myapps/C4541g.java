package com.google.android.finsky.stream.myapps;

import com.google.android.finsky.stream.base.C1169s;

final /* synthetic */ class C4541g implements C4540o {
    public final C4539f f23242a;
    public final C1169s f23243b;

    C4541g(C4539f c4539f, C1169s c1169s) {
        this.f23242a = c4539f;
        this.f23243b = c1169s;
    }

    public final void mo4261a(boolean z) {
        C4539f c4539f = this.f23242a;
        C1169s c1169s = this.f23243b;
        if (c4539f.f23241k == null) {
            return;
        }
        if (z) {
            c4539f.f23241k.mo4086a(c1169s, 0, 1);
        } else {
            c4539f.f23241k.mo4088b(c1169s, 0, 1);
        }
    }
}
