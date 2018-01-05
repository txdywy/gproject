package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GetAttestationResult implements Parcelable {
    public static final Creator CREATOR = new C6500h();
    public final long f32530a;
    public final long f32531b;

    public GetAttestationResult(long j, long j2) {
        this.f32530a = j;
        this.f32531b = j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f32530a);
        parcel.writeLong(this.f32531b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("\nclientLatencyMs: ").append(this.f32530a);
        stringBuilder.append("\nserverLatencyMs: ").append(this.f32531b);
        return stringBuilder.toString();
    }
}
