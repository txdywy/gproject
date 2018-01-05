package com.google.android.finsky.ec;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import com.google.android.finsky.utils.FinskyLog;

final class C2972e extends NetworkCallback {
    C2972e() {
    }

    public final void onAvailable(Network network) {
        FinskyLog.m21659a("onAvailable", new Object[0]);
    }

    public final void onLost(Network network) {
        FinskyLog.m21659a("onLost", new Object[0]);
    }
}
