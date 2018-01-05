package org.chromium.base.library_loader;

final class C7896a implements Runnable {
    public final /* synthetic */ long f40535a;

    C7896a(long j) {
        this.f40535a = j;
    }

    public final void run() {
        LegacyLinker.nativeRunCallbackOnUiThread(this.f40535a);
    }
}
