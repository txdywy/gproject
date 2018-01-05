package com.google.android.finsky.billing.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;

final class C1796l implements Creator {
    C1796l() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PurchaseFlowConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        HashMap hashMap = new HashMap();
        parcel.readMap(hashMap, HashMap.class.getClassLoader());
        return new PurchaseFlowConfig(hashMap);
    }
}
