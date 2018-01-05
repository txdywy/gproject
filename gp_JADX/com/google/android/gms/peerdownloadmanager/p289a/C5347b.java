package com.google.android.gms.peerdownloadmanager.p289a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.google.android.gms.common.p282a.C5050a;
import com.google.android.gms.peerdownloadmanager.service.PdmTransferIntentReceiver;

public final class C5347b {
    public static C5050a f27859a;

    public static void m26071a(Context context) {
        Log.d("PdmCleanup", "Cancelling cleanup.");
        C5347b.m26072a(context, false);
        C5050a c = C5347b.m26074c(context);
        Intent intent = new Intent(context, PdmTransferIntentReceiver.class);
        intent.setAction("RESET_STATE");
        c.m23266a(PendingIntent.getBroadcast(context, 1, intent, 134217728));
    }

    public static Editor m26073b(Context context) {
        return context.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).edit();
    }

    public static void m26072a(Context context, boolean z) {
        C5347b.m26073b(context).putBoolean("peerdownloadmanager_needs_cleanup", z).apply();
    }

    public static C5050a m26074c(Context context) {
        return f27859a != null ? f27859a : new C5050a(context);
    }
}
