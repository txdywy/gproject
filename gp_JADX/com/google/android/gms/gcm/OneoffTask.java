package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask extends Task {
    public static final Creator CREATOR = new C5207n();
    public final long f26222a;
    public final long f26223b;

    @Deprecated
    OneoffTask(Parcel parcel) {
        super(parcel);
        this.f26222a = parcel.readLong();
        this.f26223b = parcel.readLong();
    }

    OneoffTask(C5202h c5202h) {
        super((C5201k) c5202h);
        this.f26222a = c5202h.f26247a;
        this.f26223b = c5202h.f26248b;
    }

    public final void mo4637a(Bundle bundle) {
        super.mo4637a(bundle);
        bundle.putLong("window_start", this.f26222a);
        bundle.putLong("window_end", this.f26223b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f26222a);
        parcel.writeLong(this.f26223b);
    }

    public String toString() {
        String obj = super.toString();
        long j = this.f26222a;
        return new StringBuilder(String.valueOf(obj).length() + 64).append(obj).append(" windowStart=").append(j).append(" windowEnd=").append(this.f26223b).toString();
    }
}
