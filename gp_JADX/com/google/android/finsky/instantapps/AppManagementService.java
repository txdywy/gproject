package com.google.android.finsky.instantapps;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.bm;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.instantapps.appmanagement.C3396o;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.gms.instantapps.p288b.C5261a;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.common.b.at;

public class AppManagementService extends bm {
    public C3396o f17281i;
    public C5785k f17282j;

    public AppManagementService() {
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3505a(this);
    }

    public static void m16829a(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.PACKAGE_NAME", str);
        bm.m1346a(context, AppManagementService.class, 164504881, intent);
    }

    protected final void mo3486a(Intent intent) {
        String valueOf = String.valueOf(intent);
        Log.i("AppManagementService", new StringBuilder(String.valueOf(valueOf).length() + 16).append("Executing work: ").append(valueOf).toString());
        valueOf = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
        if (TextUtils.isEmpty(valueOf)) {
            Log.e("AppManagementService", "No package name, quitting");
            return;
        }
        String str = "AppManagementService";
        String str2 = "Uninstalling package: ";
        String valueOf2 = String.valueOf(valueOf);
        Log.i(str, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        if (!this.f17281i.m16897a(at.a(valueOf))) {
            this.f17282j.m27188a(C5261a.m24088a(valueOf, 0), false, new C3378a(valueOf));
        }
        Log.i("AppManagementService", "Completed service @ " + SystemClock.elapsedRealtime());
    }
}
