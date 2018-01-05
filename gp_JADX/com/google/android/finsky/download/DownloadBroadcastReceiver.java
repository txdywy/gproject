package com.google.android.finsky.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;

public class DownloadBroadcastReceiver extends BroadcastReceiver {
    public static C2850m f15245a;
    public static C2171b f15246b;
    public static C0988c f15247c;
    public static C3982a f15248d;

    public static void m14995a(C2850m c2850m, C2171b c2171b, C0988c c0988c, C3982a c3982a) {
        f15245a = c2850m;
        f15246b = c2171b;
        f15247c = c0988c;
        f15248d = c3982a;
    }

    public void onReceive(Context context, Intent intent) {
        if (f15248d.mo3875b()) {
            FinskyLog.m21659a("Recovery Mode is active. Bail out.", new Object[0]);
        } else {
            m14994a(context, intent);
        }
    }

    protected static void m14994a(Context context, Intent intent) {
        FinskyLog.m21659a("Intent received at DownloadBroadcastReceiver", new Object[0]);
        Uri a = C2863z.m15098a(intent);
        boolean equals = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED".equals(intent.getAction());
        boolean z = "android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction()) || "android.intent.action.DOWNLOAD_COMPLETED".equals(intent.getAction());
        if (f15245a.mo3170a(a) == null) {
            FinskyLog.m21659a("DownloadBroadcastReceiver could not find %s in queue.", a);
            if (equals && f15247c.cY() != null) {
                Intent a2 = f15246b.mo2734a(context);
                a2.setFlags(268435456);
                context.startActivity(a2);
                return;
            }
            return;
        }
        new C2840c(a, equals, z).execute(new Void[0]);
    }
}
