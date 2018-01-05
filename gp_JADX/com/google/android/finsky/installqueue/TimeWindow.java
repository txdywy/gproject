package com.google.android.finsky.installqueue;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.installer.p208b.p209a.C3316f;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.j;

public final class TimeWindow implements Parcelable {
    public static final Creator CREATOR = new C3372s();
    public final C3316f f17173a;

    public TimeWindow(long j, long j2) {
        this.f17173a = new C3316f();
        C3316f c3316f = this.f17173a;
        c3316f.f17157a |= 1;
        c3316f.f17158b = j;
        c3316f = this.f17173a;
        c3316f.f17157a |= 2;
        c3316f.f17159c = j2;
    }

    protected TimeWindow(Parcel parcel) {
        this.f17173a = (C3316f) ParcelableProto.m21674a(parcel);
    }

    TimeWindow(C3316f c3316f) {
        this.f17173a = c3316f;
    }

    public final String toString() {
        return j.a(this.f17173a);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f17173a), 0);
    }
}
