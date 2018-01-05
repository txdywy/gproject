package com.google.android.finsky.externalreferrer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.externalreferrer.p197a.C3008a;
import com.google.android.finsky.utils.ParcelableProto;

public class ExternalReferrerStatus implements Parcelable {
    public static final Creator CREATOR = new C3016i();
    public C3008a f15750a;

    public ExternalReferrerStatus(C3008a c3008a) {
        this.f15750a = c3008a;
    }

    protected ExternalReferrerStatus(Parcel parcel) {
        this.f15750a = (C3008a) ParcelableProto.m21674a(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f15750a), i);
    }

    public int describeContents() {
        return 0;
    }

    public final Long m15583a() {
        return Long.valueOf(this.f15750a.f15763e);
    }
}
