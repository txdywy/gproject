package org.chromium.net;

import android.net.Network;

final class ab implements Runnable {
    public final /* synthetic */ Network f40651a;
    public final /* synthetic */ C7976x f40652b;

    ab(C7976x c7976x, Network network) {
        this.f40652b = c7976x;
        this.f40651a = network;
    }

    public final void run() {
        this.f40652b.f40956b.f40580d.mo6648b(NetworkChangeNotifierAutoDetect.m37848a(this.f40651a));
    }
}
