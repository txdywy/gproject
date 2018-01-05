package org.chromium.net;

final class C7927a implements Runnable {
    public final /* synthetic */ AndroidCellularSignalStrength f40648a;

    C7927a(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.f40648a = androidCellularSignalStrength;
    }

    public final void run() {
        C7928b c7928b = new C7928b(this.f40648a);
    }
}
