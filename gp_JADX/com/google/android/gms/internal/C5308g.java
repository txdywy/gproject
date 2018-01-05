package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.C5165e;

@C5302b
public final class C5308g extends C5165e {
    public C5308g() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    protected final /* synthetic */ Object mo4698a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof C5306e ? (C5306e) queryLocalInterface : new C5307f(iBinder);
    }
}
