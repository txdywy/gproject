package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.dynamic.C5164d;
import com.google.android.gms.dynamic.C5165e;
import com.google.android.gms.dynamic.zzq;

@C5302b
public final class tl extends C5165e {
    public static final tl f27504c = new tl();

    private tl() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static tm m25610a(String str, Context context) {
        if (C5095d.m23655a(context) == 0) {
            tm b = f27504c.m25611b(str, context);
            if (b != null) {
                return b;
            }
        }
        return new tk(str, context);
    }

    private final tm m25611b(String str, Context context) {
        try {
            IBinder a = ((tp) m23908a(context)).mo4879a(str, C5164d.m23906a((Object) context));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return queryLocalInterface instanceof tm ? (tm) queryLocalInterface : new to(a);
        } catch (RemoteException e) {
            return null;
        } catch (zzq e2) {
            return null;
        }
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof tp ? (tp) queryLocalInterface : new tq(iBinder);
    }
}
