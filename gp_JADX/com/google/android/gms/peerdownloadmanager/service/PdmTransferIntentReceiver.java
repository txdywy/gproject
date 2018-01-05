package com.google.android.gms.peerdownloadmanager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class PdmTransferIntentReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = "PdmReceiver";
        if (C5499c.f28266a == null) {
            WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str);
            C5499c.f28266a = newWakeLock;
            newWakeLock.setReferenceCounted(true);
        }
        C5499c.f28266a.acquire();
        intent.setClass(context, PdmTransferIntentOperation.class);
        context.startService(intent);
    }
}
