package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.C5165e;

@C5302b
public final class xu extends C5165e {
    public xu() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof ya ? (ya) queryLocalInterface : new yb(iBinder);
    }
}
