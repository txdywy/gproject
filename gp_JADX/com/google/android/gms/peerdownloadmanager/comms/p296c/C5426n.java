package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.content.BroadcastReceiver;
import android.net.wifi.p2p.WifiP2pGroup;
import android.util.Log;
import com.google.common.f.a.ak;
import com.google.common.f.a.au;
import com.google.common.f.a.bf;
import com.google.common.f.a.y;

final class C5426n implements y {
    public final /* synthetic */ C5421i f28080a;

    C5426n(C5421i c5421i) {
        this.f28080a = c5421i;
    }

    public final /* synthetic */ au m26242a(Object obj) {
        WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) obj;
        if (wifiP2pGroup != null) {
            String valueOf = String.valueOf(wifiP2pGroup);
            Log.d("WifiHotspotManager", new StringBuilder(String.valueOf(valueOf).length() + 52).append("create: onGroupInfoAvailable: group already exists: ").append(valueOf).toString());
            return ak.a(this.f28080a.m26238a(wifiP2pGroup));
        }
        Log.d("WifiHotspotManager", "create: onGroupInfoAvailable: group does not exist, creating...");
        au bfVar = new bf();
        BroadcastReceiver c5427o = new C5427o(this, bfVar);
        String valueOf2 = String.valueOf(this.f28080a.f28067d);
        String valueOf3 = String.valueOf(c5427o);
        Log.d("WifiHotspotManager", new StringBuilder((String.valueOf(valueOf2).length() + 28) + String.valueOf(valueOf3).length()).append("calling registerReceiver: ").append(valueOf2).append(", ").append(valueOf3).toString());
        this.f28080a.f28067d.registerReceiver(c5427o, C5421i.f28066c);
        this.f28080a.f28069f.createGroup(this.f28080a.f28070g, new C5429q(bfVar));
        return bfVar;
    }
}
