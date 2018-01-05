package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GetPropertiesResult implements Parcelable {
    public static final Creator CREATOR = new C6501i();
    public final String f32532a;
    public final long f32533b;
    public final long f32534c;

    public GetPropertiesResult(String str, long j, long j2) {
        this.f32532a = str;
        this.f32533b = j;
        this.f32534c = j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32532a);
        parcel.writeLong(this.f32533b);
        parcel.writeLong(this.f32534c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("\noperatorPackageName: ").append(this.f32532a).append("\nclientLatencyMs: ").append(this.f32533b).append("\nserverLatencyMs: ").append(this.f32534c);
        return stringBuilder.toString();
    }
}
