package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.a.w;
import android.util.Log;
import com.google.android.gms.common.util.j;

public final class FirebaseInstanceIdInternalReceiver extends w {
    public static C7138l f34834c;
    public static C7138l f34835d;

    static synchronized C7138l m32357a(Context context, String str) {
        C7138l c7138l;
        synchronized (FirebaseInstanceIdInternalReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f34835d == null) {
                    f34835d = new C7138l(context, str);
                }
                c7138l = f34835d;
            } else {
                if (f34834c == null) {
                    f34834c = new C7138l(context, str);
                }
                c7138l = f34834c;
            }
        }
        return c7138l;
    }

    static boolean m32358a(Context context) {
        return j.c() && context.getApplicationInfo().targetSdkVersion > 25;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                Intent intent2 = (Intent) parcelableExtra;
                if (m32358a(context)) {
                    m32357a(context, intent.getAction()).m32393a(intent2, goAsync());
                    return;
                } else {
                    C7143q.m32400a().m32402a(context, intent.getAction(), intent2);
                    return;
                }
            }
            Log.e("FirebaseInstanceId", "Missing or invalid wrapped intent");
        }
    }
}
