package org.chromium.net;

import android.annotation.TargetApi;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

@TargetApi(21)
final class C7976x extends NetworkCallback {
    public Network f40955a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect f40956b;

    C7976x(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f40956b = networkChangeNotifierAutoDetect;
    }

    private final boolean m38167a(Network network) {
        return (this.f40955a == null || this.f40955a.equals(network)) ? false : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m38168a(android.net.Network r4, android.net.NetworkCapabilities r5) {
        /*
        r3 = this;
        r1 = 1;
        r0 = 0;
        r2 = r3.m38167a(r4);
        if (r2 != 0) goto L_0x0028;
    L_0x0008:
        if (r5 != 0) goto L_0x0012;
    L_0x000a:
        r2 = r3.f40956b;
        r2 = r2.f40582f;
        r5 = r2.m38166d(r4);
    L_0x0012:
        if (r5 == 0) goto L_0x0025;
    L_0x0014:
        r2 = 4;
        r2 = r5.hasTransport(r2);
        if (r2 == 0) goto L_0x002a;
    L_0x001b:
        r2 = r3.f40956b;
        r2 = r2.f40582f;
        r2 = org.chromium.net.C7975w.m38163c(r4);
        if (r2 != 0) goto L_0x002a;
    L_0x0025:
        r2 = r1;
    L_0x0026:
        if (r2 == 0) goto L_0x0029;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        return r0;
    L_0x002a:
        r2 = r0;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.x.a(android.net.Network, android.net.NetworkCapabilities):boolean");
    }

    public final void onAvailable(Network network) {
        NetworkCapabilities d = this.f40956b.f40582f.m38166d(network);
        if (!m38168a(network, d)) {
            boolean hasTransport = d.hasTransport(4);
            if (hasTransport) {
                this.f40955a = network;
            }
            this.f40956b.m37851a(new C7977y(this, NetworkChangeNotifierAutoDetect.m37848a(network), this.f40956b.f40582f.m38165b(network), hasTransport));
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (!m38168a(network, networkCapabilities)) {
            this.f40956b.m37851a(new C7978z(this, NetworkChangeNotifierAutoDetect.m37848a(network), this.f40956b.f40582f.m38165b(network)));
        }
    }

    public final void onLosing(Network network, int i) {
        if (!m38168a(network, null)) {
            this.f40956b.m37851a(new aa(this, NetworkChangeNotifierAutoDetect.m37848a(network)));
        }
    }

    public final void onLost(Network network) {
        if (!m38167a(network)) {
            this.f40956b.m37851a(new ab(this, network));
            if (this.f40955a != null) {
                this.f40955a = null;
                for (Network onAvailable : NetworkChangeNotifierAutoDetect.m37849a(this.f40956b.f40582f, network)) {
                    onAvailable(onAvailable);
                }
                this.f40956b.m37851a(new ac(this, this.f40956b.m37852b().m37927a()));
            }
        }
    }
}
