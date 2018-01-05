package com.google.android.gms.peerdownloadmanager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.f.a.bf;

final class C5498b extends BroadcastReceiver {
    public final bf f28264a;
    public final boolean f28265b;

    public C5498b(bf bfVar, boolean z) {
        this.f28264a = bfVar;
        this.f28265b = z;
    }

    public final void onReceive(Context context, Intent intent) {
        String str = "PdmTransfer";
        String str2 = "StopReceiver: received broadcast: ";
        String valueOf = String.valueOf(intent.getAction());
        Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        m26385a();
    }

    final boolean m26385a() {
        Log.d("PdmTransfer", "StopReceiver.finishFuture(): is already finished? " + this.f28264a.isDone());
        return this.f28264a.a(null);
    }
}
