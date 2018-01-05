package com.google.android.gms.peerdownloadmanager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

final class C5497a extends BroadcastReceiver {
    public final /* synthetic */ PdmTransferIntentOperation f28263a;

    C5497a(PdmTransferIntentOperation pdmTransferIntentOperation) {
        this.f28263a = pdmTransferIntentOperation;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            C5498b c5498b = this.f28263a.f28261d;
            if (c5498b != null) {
                Log.d("PdmTransfer", "StopReceiver: received screen on event and requireScreenOff=" + c5498b.f28265b);
                if (c5498b.f28265b) {
                    c5498b.m26385a();
                }
            }
        }
    }
}
