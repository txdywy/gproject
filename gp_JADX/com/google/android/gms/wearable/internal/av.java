package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class av {
    public final Map f28586a = new HashMap();

    av() {
    }

    public final void m26753a(IBinder iBinder) {
        synchronized (this.f28586a) {
            at atVar;
            if (iBinder == null) {
                atVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                if (queryLocalInterface instanceof at) {
                    atVar = (at) queryLocalInterface;
                } else {
                    Object auVar = new au(iBinder);
                }
            }
            ao bqVar = new bq();
            for (Entry entry : this.f28586a.entrySet()) {
                bv bvVar = (bv) entry.getValue();
                try {
                    atVar.mo5107a(bqVar, new zzd(bvVar));
                    if (Log.isLoggable("WearableClient", 2)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(bvVar);
                        Log.d("WearableClient", new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("onPostInitHandler: added: ").append(valueOf).append("/").append(valueOf2).toString());
                    }
                } catch (RemoteException e) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(bvVar);
                    Log.d("WearableClient", new StringBuilder((String.valueOf(valueOf3).length() + 32) + String.valueOf(valueOf4).length()).append("onPostInitHandler: Didn't add: ").append(valueOf3).append("/").append(valueOf4).toString());
                }
            }
        }
    }
}
