package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager.GroupInfoListener;
import java.io.IOException;

final class C5428p implements GroupInfoListener {
    public final /* synthetic */ C5427o f28083a;

    C5428p(C5427o c5427o) {
        this.f28083a = c5427o;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup == null) {
            try {
                this.f28083a.f28081a.a(new IOException("unable to get details of created AP"));
            } catch (Throwable th) {
                Context context = this.f28083a.f28082b.f28080a.f28067d;
                BroadcastReceiver broadcastReceiver = this.f28083a;
                if (broadcastReceiver != null) {
                    context.unregisterReceiver(broadcastReceiver);
                }
            }
        } else {
            this.f28083a.f28081a.a(this.f28083a.f28082b.f28080a.m26238a(wifiP2pGroup));
        }
        Context context2 = this.f28083a.f28082b.f28080a.f28067d;
        BroadcastReceiver broadcastReceiver2 = this.f28083a;
        if (broadcastReceiver2 == null) {
            throw null;
        }
        context2.unregisterReceiver(broadcastReceiver2);
    }
}
