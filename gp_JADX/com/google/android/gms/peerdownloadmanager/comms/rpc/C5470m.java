package com.google.android.gms.peerdownloadmanager.comms.rpc;

final /* synthetic */ class C5470m implements Runnable {
    public final CommsRunnable f28210a;
    public final boolean f28211b;

    C5470m(CommsRunnable commsRunnable, boolean z) {
        this.f28210a = commsRunnable;
        this.f28211b = z;
    }

    public final void run() {
        CommsRunnable commsRunnable = this.f28210a;
        commsRunnable.f28128w.mo4972b(commsRunnable, commsRunnable.f28115B, this.f28211b);
    }
}
