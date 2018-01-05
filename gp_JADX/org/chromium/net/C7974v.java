package org.chromium.net;

final class C7974v implements Runnable {
    public final /* synthetic */ NetworkChangeNotifierAutoDetect f40953a;

    C7974v(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f40953a = networkChangeNotifierAutoDetect;
    }

    public final void run() {
        if (!this.f40953a.f40586j) {
            return;
        }
        if (this.f40953a.f40588l) {
            this.f40953a.f40588l = false;
        } else {
            this.f40953a.m37853c();
        }
    }
}
