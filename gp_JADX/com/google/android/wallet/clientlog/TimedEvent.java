package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.p443h.p451c.p455b.p456a.C7156e;

public class TimedEvent implements Parcelable {
    public static final Creator CREATOR = new C6546j();
    public final C7156e f32625a;
    public final long f32626b;

    TimedEvent(C7156e c7156e) {
        this.f32625a = c7156e;
        this.f32626b = SystemClock.elapsedRealtime();
    }

    TimedEvent(Parcel parcel) {
        this.f32625a = (C7156e) ParcelableProto.m29888a(parcel);
        this.f32626b = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m29885a(this.f32625a), i);
        parcel.writeLong(this.f32626b);
    }
}
