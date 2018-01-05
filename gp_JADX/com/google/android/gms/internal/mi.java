package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.internal.C4951c;
import com.google.android.gms.common.internal.bd;

public final class mi extends C4951c {
    public final Context f27178k;

    public mi(Context context, Looper looper, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, 45, bdVar, c1632q, c1634r);
        this.f27178k = context;
    }

    protected final /* synthetic */ IInterface mo4482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof lw ? (lw) queryLocalInterface : new lx(iBinder);
    }

    final String m25158a(String str) {
        try {
            PackageManager packageManager = this.f27178k.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f27178k.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            return bundle == null ? null : (String) bundle.get(str);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    protected final String mo4483b() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    protected final String cu_() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
