package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.C5165e;

@C5302b
public final class yj extends C5165e {
    public yj() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof yg ? (yg) queryLocalInterface : new yh(iBinder);
    }
}
