package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.content.BroadcastReceiver;

final class C5425m implements Runnable {
    public final /* synthetic */ BroadcastReceiver f28078a;
    public final /* synthetic */ C5421i f28079b;

    C5425m(C5421i c5421i, BroadcastReceiver broadcastReceiver) {
        this.f28079b = c5421i;
        this.f28078a = broadcastReceiver;
    }

    public final void run() {
        this.f28079b.f28067d.unregisterReceiver(this.f28078a);
    }
}
