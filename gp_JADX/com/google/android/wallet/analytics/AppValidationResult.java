package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.android.wallet.common.util.ParcelableProto;

public class AppValidationResult implements Parcelable {
    public static final Creator CREATOR = new C6497e();
    public final c f32502a;
    public final int f32503b;
    public final long f32504c;

    public AppValidationResult(c cVar, int i, long j) {
        this.f32502a = cVar;
        this.f32503b = i;
        this.f32504c = j;
    }

    AppValidationResult(Parcel parcel) {
        this.f32502a = (c) ParcelableProto.m29888a(parcel);
        this.f32503b = parcel.readInt();
        this.f32504c = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m29885a(this.f32502a), 0);
        parcel.writeInt(this.f32503b);
        parcel.writeLong(this.f32504c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("\npackageName: ").append(this.f32502a.c).append("\nresultCode: ").append(this.f32503b).append("\ndurationMs: ").append(this.f32504c);
        return stringBuilder.toString();
    }
}
