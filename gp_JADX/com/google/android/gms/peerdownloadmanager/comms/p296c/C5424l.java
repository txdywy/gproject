package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.util.Log;
import com.google.common.f.a.bf;

final class C5424l extends BroadcastReceiver {
    public final /* synthetic */ WifiConfiguration f28076a;
    public final /* synthetic */ bf f28077b;

    C5424l(WifiConfiguration wifiConfiguration, bf bfVar) {
        this.f28076a = wifiConfiguration;
        this.f28077b = bfVar;
    }

    public final void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifiInfo");
        String valueOf = String.valueOf(networkInfo);
        String valueOf2 = String.valueOf(wifiInfo);
        Log.d("WifiHotspotManager", new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("joinInternal.onReceive: ").append(valueOf).append(" and ").append(valueOf2).toString());
        if (wifiInfo == null || networkInfo == null) {
            Log.d("WifiHotspotManager", "joinInternal.onReceive: both null");
        } else if (!wifiInfo.getSSID().equals(this.f28076a.SSID)) {
            String ssid = wifiInfo.getSSID();
            String str = this.f28076a.SSID;
            Log.d("WifiHotspotManager", new StringBuilder((String.valueOf(ssid).length() + 48) + String.valueOf(str).length()).append("joinInternal.onReceive: ssids don't match: ").append(ssid).append(" and ").append(str).toString());
        } else if (networkInfo.isConnected()) {
            Log.d("WifiHotspotManager", "joinInternal.onReceive: the network is up, setting result");
            this.f28077b.a(Boolean.valueOf(true));
        } else {
            Log.d("WifiHotspotManager", "joinInternal.onReceive: not connected");
        }
    }
}
