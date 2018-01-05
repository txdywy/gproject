package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.fa;

public final class com.google.android.finsky.billing.lightpurchase.h implements Parcelable$Creator
{

    h() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new CheckoutPurchaseError(p0.readInt(), p0.readString(), p0.readString(), p0.readString(), p0.readString(), (com.google.wireless.android.finsky.dfe.nano.fa)ParcelableProto.a(p0), (com.google.android.finsky.cv.a.ip)ParcelableProto.a(p0));
    }

    public final Object[] newArray(int p0) {
        return new CheckoutPurchaseError[p0];
    }

}
