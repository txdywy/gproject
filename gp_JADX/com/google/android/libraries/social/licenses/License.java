package com.google.android.libraries.social.licenses;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class License implements Parcelable, Comparable {
    public static final Creator CREATOR = new C6182a();
    public final String f30713a;
    public final long f30714b;
    public final int f30715c;
    public final String f30716d;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30713a);
        parcel.writeLong(this.f30714b);
        parcel.writeInt(this.f30715c);
        parcel.writeString(this.f30716d);
    }

    public final String toString() {
        return this.f30713a;
    }

    License(String str, long j, int i, String str2) {
        this.f30713a = str;
        this.f30714b = j;
        this.f30715c = i;
        this.f30716d = str2;
    }

    License(Parcel parcel) {
        this.f30713a = parcel.readString();
        this.f30714b = parcel.readLong();
        this.f30715c = parcel.readInt();
        this.f30716d = parcel.readString();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f30713a.compareToIgnoreCase(((License) obj).f30713a);
    }
}
