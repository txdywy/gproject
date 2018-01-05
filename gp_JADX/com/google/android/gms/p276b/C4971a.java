package com.google.android.gms.p276b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.C5105f;
import com.google.android.gms.common.C5109i;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.p282a.C5051b;
import com.google.android.gms.internal.co;
import com.google.android.gms.internal.cp;
import java.io.IOException;

public final class C4971a {
    public static C5109i m23112a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                C5105f.m23695e(context);
                Object c5109i = new C5109i();
                Intent intent = new Intent("com.google.android.gms.checkin.BIND_TO_SERVICE");
                intent.setPackage("com.google.android.gms");
                C5051b.m23267a();
                if (C5051b.m23269b(context, intent, c5109i, 1)) {
                    return c5109i;
                }
                throw new IOException("Connection failure.");
            } catch (Throwable e) {
                throw new IOException(e);
            }
        } catch (NameNotFoundException e2) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    public static String m23113a(Context context, C5109i c5109i) {
        try {
            co coVar;
            IBinder a = c5109i.m23712a();
            if (a == null) {
                coVar = null;
            } else {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
                coVar = queryLocalInterface instanceof co ? (co) queryLocalInterface : new cp(a);
            }
            String a2 = coVar.mo4708a();
            try {
                C5051b.m23267a();
                context.unbindService(c5109i);
            } catch (Throwable e) {
                Log.i("CheckinServiceClient", "unbind failed: ", e);
            }
            return a2;
        } catch (Throwable e2) {
            Log.i("CheckinServiceClient", "GMS remote exception: ", e2);
            throw new IOException("Remote exception.");
        } catch (InterruptedException e3) {
            throw new IOException("Interrupted exception.");
        } catch (Throwable th) {
            try {
                C5051b.m23267a();
                context.unbindService(c5109i);
            } catch (Throwable e4) {
                Log.i("CheckinServiceClient", "unbind failed: ", e4);
            }
        }
    }
}
