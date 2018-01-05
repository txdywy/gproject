package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager.GroupInfoListener;
import com.google.common.f.a.bf;

final class C5423k implements GroupInfoListener {
    public final /* synthetic */ bf f28075a;

    C5423k(bf bfVar) {
        this.f28075a = bfVar;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        this.f28075a.a(wifiP2pGroup);
    }
}
