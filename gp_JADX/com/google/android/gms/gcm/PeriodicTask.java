package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask extends Task {
    public static final Creator CREATOR = new C5209p();
    public long f26225a = -1;
    public long f26226b = -1;

    @Deprecated
    PeriodicTask(Parcel parcel) {
        super(parcel);
        this.f26225a = parcel.readLong();
        this.f26226b = Math.min(parcel.readLong(), this.f26225a);
    }

    public PeriodicTask(C5203i c5203i) {
        super((C5201k) c5203i);
        this.f26225a = c5203i.f26249a;
        this.f26226b = Math.min(c5203i.f26250b, this.f26225a);
    }

    public final void mo4637a(Bundle bundle) {
        super.mo4637a(bundle);
        bundle.putLong("period", this.f26225a);
        bundle.putLong("period_flex", this.f26226b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f26225a);
        parcel.writeLong(this.f26226b);
    }

    public String toString() {
        String obj = super.toString();
        long j = this.f26225a;
        return new StringBuilder(String.valueOf(obj).length() + 54).append(obj).append(" period=").append(j).append(" flex=").append(this.f26226b).toString();
    }
}
