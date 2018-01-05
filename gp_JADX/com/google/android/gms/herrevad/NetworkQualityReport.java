package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class NetworkQualityReport extends zza {
    public static final Creator CREATOR = new C5252i();
    public int f26355a = -1;
    public long f26356b = -1;
    public long f26357c = -1;
    public long f26358d = -1;
    public int f26359e = -1;
    public Bundle f26360f = new Bundle();
    public boolean f26361g = false;
    public int f26362h = -1;
    public boolean f26363i = false;
    public boolean f26364j = false;

    static {
        C5251h c5251h = new C5251h();
    }

    NetworkQualityReport(int i, long j, long j2, long j3, int i2, Bundle bundle, boolean z, int i3, boolean z2, boolean z3) {
        this.f26355a = i;
        this.f26356b = j;
        this.f26357c = j2;
        this.f26358d = j3;
        this.f26359e = i2;
        this.f26360f = bundle;
        this.f26361g = z;
        this.f26362h = i3;
        this.f26363i = z2;
        this.f26364j = z3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName()).append("[\n");
        stringBuilder.append("mLatencyMicros: ").append(this.f26355a).append("\n");
        stringBuilder.append("mDurationMicros: ").append(this.f26356b).append("\n");
        stringBuilder.append("mBytesDownloaded: ").append(this.f26357c).append("\n");
        stringBuilder.append("mBytesUploaded: ").append(this.f26358d).append("\n");
        stringBuilder.append("mMeasurementType: ").append(this.f26359e).append("\n");
        stringBuilder.append("mIsNoConnectivity: ").append(this.f26361g).append("\n");
        stringBuilder.append("mConnectivityType: ").append(this.f26362h).append("\n");
        stringBuilder.append("mIsCaptivePortal: ").append(this.f26363i).append("\n");
        stringBuilder.append("mHighPriority: ").append(this.f26364j).append("\n");
        for (String str : this.f26360f.keySet()) {
            stringBuilder.append("custom param: ").append(str).append("/").append(this.f26360f.getString(str)).append("\n");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f26355a);
        C5130b.m23839a(parcel, 3, this.f26356b);
        C5130b.m23839a(parcel, 4, this.f26357c);
        C5130b.m23839a(parcel, 5, this.f26358d);
        C5130b.m23854b(parcel, 6, this.f26359e);
        C5130b.m23840a(parcel, 7, this.f26360f);
        C5130b.m23846a(parcel, 8, this.f26361g);
        C5130b.m23854b(parcel, 9, this.f26362h);
        C5130b.m23846a(parcel, 10, this.f26363i);
        C5130b.m23846a(parcel, 11, this.f26364j);
        C5130b.m23853b(parcel, a);
    }
}
