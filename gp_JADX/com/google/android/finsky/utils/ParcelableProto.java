package com.google.android.finsky.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.protobuf.nano.C0757i;

public class ParcelableProto implements Parcelable {
    public static final Creator CREATOR = new ag();
    public final C0757i f24025a;
    public byte[] f24026b = null;

    ParcelableProto(C0757i c0757i) {
        this.f24025a = c0757i;
    }

    public static ParcelableProto m21671a(C0757i c0757i) {
        return new ParcelableProto(c0757i);
    }

    public static C0757i m21672a(Intent intent, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) intent.getParcelableExtra(str);
        if (parcelableProto != null) {
            return parcelableProto.f24025a;
        }
        return null;
    }

    public static C0757i m21674a(Parcel parcel) {
        ParcelableProto parcelableProto = (ParcelableProto) parcel.readParcelable(ParcelableProto.class.getClassLoader());
        if (parcelableProto != null) {
            return parcelableProto.f24025a;
        }
        return null;
    }

    public static C0757i m21673a(Bundle bundle, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) bundle.getParcelable(str);
        if (parcelableProto != null) {
            return parcelableProto.f24025a;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f24025a == null) {
            parcel.writeInt(-1);
            return;
        }
        if (this.f24026b == null) {
            this.f24026b = C0757i.m4909a(this.f24025a);
        }
        parcel.writeInt(this.f24026b.length);
        parcel.writeByteArray(this.f24026b);
        parcel.writeString(this.f24025a.getClass().getName());
    }
}
