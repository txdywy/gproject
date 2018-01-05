package com.google.android.gms.herrevad;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class PredictedNetworkQuality extends zza {
    public static final Creator CREATOR = new C5253j();
    public int f26365a;
    public int f26366b;
    public long f26367c;
    public long f26368d;

    public PredictedNetworkQuality() {
        this.f26366b = -1;
        this.f26367c = -1;
        this.f26368d = -1;
    }

    PredictedNetworkQuality(int i, int i2, long j, long j2) {
        this.f26365a = i;
        this.f26366b = i2;
        this.f26367c = j;
        this.f26368d = j2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName()).append("[\n");
        stringBuilder.append("networkType: ").append(this.f26365a).append("\n");
        stringBuilder.append("predictedLatencyMicros: ").append(this.f26366b).append("\n");
        stringBuilder.append("predictedDownThroughputBps: ").append(this.f26367c).append("\n");
        stringBuilder.append("predictedUpThroughputBps: ").append(this.f26368d).append("\n");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f26365a);
        C5130b.m23854b(parcel, 3, this.f26366b);
        C5130b.m23839a(parcel, 4, this.f26367c);
        C5130b.m23839a(parcel, 5, this.f26368d);
        C5130b.m23853b(parcel, a);
    }
}
