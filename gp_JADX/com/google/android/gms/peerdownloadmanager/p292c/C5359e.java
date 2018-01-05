package com.google.android.gms.peerdownloadmanager.p292c;

import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;

final /* synthetic */ class C5359e implements Runnable {
    public final C5355a f27890a;
    public final C5361g f27891b;
    public final C5400g f27892c;

    C5359e(C5355a c5355a, C5361g c5361g, C5400g c5400g) {
        this.f27890a = c5355a;
        this.f27891b = c5361g;
        this.f27892c = c5400g;
    }

    public final void run() {
        C5355a c5355a = this.f27890a;
        C5361g c5361g = this.f27891b;
        C5400g c5400g = this.f27892c;
        c5361g.f27897d++;
        c5355a.f27878k.m26331a(c5400g);
        c5355a.m26097d();
    }
}
