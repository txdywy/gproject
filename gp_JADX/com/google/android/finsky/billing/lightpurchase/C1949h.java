package com.google.android.finsky.billing.lightpurchase;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.fa;

final class C1949h implements Creator {
    C1949h() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CheckoutPurchaseError[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CheckoutPurchaseError(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (fa) ParcelableProto.m21674a(parcel), (ip) ParcelableProto.m21674a(parcel));
    }
}
