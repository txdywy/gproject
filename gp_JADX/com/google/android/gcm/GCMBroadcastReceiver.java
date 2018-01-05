package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;

public class GCMBroadcastReceiver extends BroadcastReceiver {
    public static boolean f25234a = false;

    public final void onReceive(Context context, Intent intent) {
        Log.v("GCMBroadcastReceiver", "onReceive: " + intent.getAction());
        if (!f25234a) {
            f25234a = true;
            String name = getClass().getName();
            if (!name.equals(GCMBroadcastReceiver.class.getName())) {
                Log.v("GCMRegistrar", "Setting the name of retry receiver class to " + name);
                C4882b.f25236b = name;
            }
        }
        String str = context.getPackageName() + ".GCMIntentService";
        Log.v("GCMBroadcastReceiver", "GCM IntentService class: " + str);
        synchronized (C0624a.f4001c) {
            if (C0624a.f4000b == null) {
                C0624a.f4000b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        Log.v("GCMBaseIntentService", "Acquiring wakelock");
        C0624a.f4000b.acquire();
        intent.setClassName(context, str);
        context.startService(intent);
        setResult(-1, null, null);
    }
}
