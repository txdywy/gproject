package com.google.android.finsky.billing.common;

import android.os.Parcel;
import java.util.HashMap;

public final class com.google.android.finsky.billing.common.l implements Parcelable$Creator
{

    l() {
    }

    public final Object createFromParcel(Parcel p0) {
        v0 = new HashMap();
        p0.readMap(v0, HashMap.getClassLoader());
        return new PurchaseFlowConfig(v0);
    }

    public final Object[] newArray(int p0) {
        return new PurchaseFlowConfig[p0];
    }

}
