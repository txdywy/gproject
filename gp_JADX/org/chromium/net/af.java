package org.chromium.net;

import android.content.BroadcastReceiver;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.C7888e;

public abstract class af {
    public NetworkChangeNotifierAutoDetect f40659a;

    protected abstract void mo6587b();

    protected final void m37935a() {
        int i = 0;
        BroadcastReceiver broadcastReceiver = this.f40659a;
        if (!broadcastReceiver.f40586j) {
            if (broadcastReceiver.f40589m) {
                broadcastReceiver.m37853c();
            }
            broadcastReceiver.f40588l = C7888e.f40514a.registerReceiver(broadcastReceiver, broadcastReceiver.f40579c) != null;
            broadcastReceiver.f40586j = true;
            if (broadcastReceiver.f40584h != null) {
                C7976x c7976x = broadcastReceiver.f40584h;
                Network[] a = NetworkChangeNotifierAutoDetect.m37849a(c7976x.f40956b.f40582f, null);
                c7976x.f40955a = null;
                if (a.length == 1) {
                    NetworkCapabilities d = c7976x.f40956b.f40582f.m38166d(a[0]);
                    if (d != null && d.hasTransport(4)) {
                        c7976x.f40955a = a[0];
                    }
                }
                broadcastReceiver.f40582f.f40954a.registerNetworkCallback(broadcastReceiver.f40585i, broadcastReceiver.f40584h);
                if (broadcastReceiver.f40589m) {
                    Network[] a2 = NetworkChangeNotifierAutoDetect.m37849a(broadcastReceiver.f40582f, null);
                    long[] jArr = new long[a2.length];
                    while (i < a2.length) {
                        jArr[i] = NetworkChangeNotifierAutoDetect.m37848a(a2[i]);
                        i++;
                    }
                    broadcastReceiver.f40580d.mo6646a(jArr);
                }
            }
        }
    }

    protected void mo6586a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f40659a = networkChangeNotifierAutoDetect;
    }
}
