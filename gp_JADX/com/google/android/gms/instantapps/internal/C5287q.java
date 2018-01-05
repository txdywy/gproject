package com.google.android.gms.instantapps.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

public final class C5287q {
    public static C5287q f26471a;
    public final Context f26472b;

    private C5287q(Context context) {
        this.f26472b = context;
    }

    public static synchronized C5287q m24167a(Context context) {
        Object obj = null;
        C5287q c5287q = null;
        synchronized (C5287q.class) {
            if (f26471a == null) {
                Context applicationContext = context.getApplicationContext();
                if (VERSION.SDK_INT >= 16) {
                    obj = 1;
                }
                if (obj != null) {
                    if (C5295y.m24173a(applicationContext)) {
                        ProviderInfo resolveContentProvider = applicationContext.getPackageManager().resolveContentProvider(C5288r.f26473a.getAuthority(), 0);
                        if (resolveContentProvider != null) {
                            if (resolveContentProvider.packageName.equals("com.google.android.gms")) {
                                c5287q = new C5287q(applicationContext);
                            } else {
                                String str = resolveContentProvider.packageName;
                                Log.e("IAMetadataClient", new StringBuilder(String.valueOf(str).length() + 85).append("Package ").append(str).append(" is invalid for instant apps content provider; instant apps will be disabled.").toString());
                            }
                        }
                    }
                }
                f26471a = c5287q;
            }
            c5287q = f26471a;
        }
        return c5287q;
    }

    @TargetApi(16)
    final Bundle m24168a(String str, Bundle bundle) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Bundle call = this.f26472b.getContentResolver().call(C5288r.f26473a, str, null, bundle);
            if (call != null) {
                return call;
            }
            throw new RemoteException();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
