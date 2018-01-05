package org.chromium.net.impl;

import org.chromium.net.ax;
import org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener;

final class C7959s implements Runnable {
    public final /* synthetic */ UrlRequestStatusListener f40932a;
    public final /* synthetic */ int f40933b;

    C7959s(UrlRequestStatusListener urlRequestStatusListener, int i) {
        this.f40932a = urlRequestStatusListener;
        this.f40933b = i;
    }

    public final void run() {
        ax axVar = this.f40932a;
        switch (this.f40933b) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                axVar.mo6609a();
                return;
            default:
                throw new IllegalArgumentException("No request status found.");
        }
    }
}
