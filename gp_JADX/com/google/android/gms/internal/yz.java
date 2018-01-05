package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.C5165e;

@C5302b
public final class yz extends C5165e {
    public yz() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof yx ? (yx) queryLocalInterface : new yy(iBinder);
    }
}
