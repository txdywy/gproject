package com.google.android.gms.peerdownloadmanager.comms.rpc;

final /* synthetic */ class C5471n implements Runnable {
    public final CommsRunnable f28212a;
    public final boolean f28213b;

    C5471n(CommsRunnable commsRunnable, boolean z) {
        this.f28212a = commsRunnable;
        this.f28213b = z;
    }

    public final void run() {
        CommsRunnable commsRunnable = this.f28212a;
        commsRunnable.f28128w.mo4971a(commsRunnable, commsRunnable.f28115B, this.f28213b);
    }
}
