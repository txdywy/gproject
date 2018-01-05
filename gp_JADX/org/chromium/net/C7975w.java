package org.chromium.net;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.io.IOException;

final class C7975w {
    public final ConnectivityManager f40954a;

    C7975w(Context context) {
        this.f40954a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    C7975w() {
        this.f40954a = null;
    }

    final NetworkInfo m38164a(Network network) {
        try {
            return this.f40954a.getNetworkInfo(network);
        } catch (NullPointerException e) {
            try {
                return this.f40954a.getNetworkInfo(network);
            } catch (NullPointerException e2) {
                return null;
            }
        }
    }

    @TargetApi(21)
    final int m38165b(Network network) {
        NetworkInfo a = m38164a(network);
        if (a != null && a.getType() == 17) {
            a = this.f40954a.getActiveNetworkInfo();
        }
        if (a == null || !a.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.m37847a(a.getType(), a.getSubtype());
    }

    @TargetApi(21)
    protected static boolean m38163c(Network network) {
        try {
            network.getSocketFactory().createSocket().close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @TargetApi(21)
    protected final NetworkCapabilities m38166d(Network network) {
        return this.f40954a.getNetworkCapabilities(network);
    }
}
