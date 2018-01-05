package com.google.android.gms.peerdownloadmanager.comms.p294a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class C5399b extends BroadcastReceiver {
    public final /* synthetic */ C5398a f28026a;

    C5399b(C5398a c5398a) {
        this.f28026a = c5398a;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                case 10:
                    Log.d("BluetoothActivator", "State changed to STATE_OFF");
                    this.f28026a.f28024d.a(Boolean.valueOf(false));
                    return;
                case 11:
                    Log.d("BluetoothActivator", "State changed to STATE_TURNING_ON");
                    return;
                case 12:
                    Log.d("BluetoothActivator", "State changed to STATE_ON");
                    this.f28026a.f28024d.a(Boolean.valueOf(true));
                    return;
                case 13:
                    Log.d("BluetoothActivator", "State changed to STATE_TURNING_OFF");
                    return;
                default:
                    return;
            }
        }
    }
}
