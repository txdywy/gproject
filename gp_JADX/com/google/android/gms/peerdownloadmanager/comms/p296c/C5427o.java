package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pInfo;
import android.util.Log;
import com.google.common.f.a.bf;

final class C5427o extends BroadcastReceiver {
    public final /* synthetic */ bf f28081a;
    public final /* synthetic */ C5426n f28082b;

    C5427o(C5426n c5426n, bf bfVar) {
        this.f28082b = c5426n;
        this.f28081a = bfVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            Log.d("WifiHotspotManager", "create: on WIFI_P2P_CONNECTION_CHANGED_ACTION");
            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (wifiP2pInfo.groupFormed && wifiP2pInfo.isGroupOwner && networkInfo.isConnected()) {
                this.f28082b.f28080a.f28069f.requestGroupInfo(this.f28082b.f28080a.f28070g, new C5428p(this));
            }
        }
    }
}
