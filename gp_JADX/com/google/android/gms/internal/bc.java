package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.C5164d;
import com.google.android.gms.dynamic.C5165e;
import com.google.android.gms.dynamic.zzq;

@C5302b
public final class bc extends C5165e {
    public static final bc f26501c = new bc();

    private bc() {
        super("com.google.android.gms.ads.measurement.GmpMeasurementReporterCreatorImpl");
    }

    public static bd m24199b(Context context) {
        int a = C5095d.m23655a(context);
        if (a == 2) {
            try {
                if (dr.f26667b.m24299a(context).m24298b("com.google.android.gms", 64).versionCode / 1000 < 8200000) {
                    throw new GooglePlayServicesNotAvailableException(2);
                }
            } catch (NameNotFoundException e) {
                throw new GooglePlayServicesNotAvailableException(1);
            }
        }
        if (a == 0 || a == 2) {
            bd c = f26501c.m24200c(context);
            if (c != null) {
                return c;
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
        throw new GooglePlayServicesNotAvailableException(1);
    }

    private final bd m24200c(Context context) {
        Throwable e;
        try {
            IBinder a = ((bf) m23908a(context)).mo4700a(C5164d.m23906a((Object) context));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporter");
            return queryLocalInterface instanceof bd ? (bd) queryLocalInterface : new be(a);
        } catch (RemoteException e2) {
            e = e2;
            ap.m24189a("Could not create remote GmpMeasurementReporter.", e);
            return null;
        } catch (zzq e3) {
            e = e3;
            ap.m24189a("Could not create remote GmpMeasurementReporter.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.internal.IGmpMeasurementReporterCreator");
        return queryLocalInterface instanceof bf ? (bf) queryLocalInterface : new bg(iBinder);
    }
}
