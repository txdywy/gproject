package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.util.Log;
import com.google.common.f.a.bf;

final class C5422j implements ActionListener {
    public final /* synthetic */ bf f28074a;

    C5422j(bf bfVar) {
        this.f28074a = bfVar;
    }

    public final void onSuccess() {
        Log.d("WifiHotspotManager", "removeAP: removeGroup.onSuccess");
        this.f28074a.a(Boolean.valueOf(true));
    }

    public final void onFailure(int i) {
        Log.d("WifiHotspotManager", "removeAP: removeGroup.onFailure");
        this.f28074a.a(Boolean.valueOf(false));
    }
}
