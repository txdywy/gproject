package com.google.android.finsky.setup;

import android.net.Uri;

final /* synthetic */ class C4172e implements Runnable {
    public final C4170d f21085a;
    public final Uri f21086b;

    C4172e(C4170d c4170d, Uri uri) {
        this.f21085a = c4170d;
        this.f21086b = uri;
    }

    public final void run() {
        C4170d c4170d = this.f21085a;
        c4170d.f21056b.m19381a(this.f21086b);
    }
}
