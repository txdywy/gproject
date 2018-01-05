package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.util.Log;
import com.google.common.f.a.bf;
import java.io.IOException;

final class C5429q implements ActionListener {
    public final /* synthetic */ bf f28084a;

    C5429q(bf bfVar) {
        this.f28084a = bfVar;
    }

    public final void onSuccess() {
        Log.d("WifiHotspotManager", "create: createGroup.onSuccess(): requesting group info");
    }

    public final void onFailure(int i) {
        Log.d("WifiHotspotManager", "create: createGroup.onFailure(" + i + ")");
        this.f28084a.a(new IOException("error creating p2p group: " + i));
    }
}
