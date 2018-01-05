package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class C7142p extends BroadcastReceiver {
    public /* synthetic */ C7129b f34887a;

    C7142p(C7129b c7129b) {
        this.f34887a = c7129b;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 44).append("Received GSF callback via dynamic receiver: ").append(valueOf).toString());
        }
        this.f34887a.m32385a(intent);
    }
}
