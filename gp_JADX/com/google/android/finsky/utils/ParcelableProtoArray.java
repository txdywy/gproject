package com.google.android.finsky.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.protobuf.nano.C0757i;
import java.lang.reflect.Array;

public class ParcelableProtoArray implements Parcelable {
    public static final Creator CREATOR = new ah();
    public final C0757i[] f24027a;

    private ParcelableProtoArray(C0757i[] c0757iArr) {
        this.f24027a = c0757iArr;
    }

    ParcelableProtoArray(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f24027a = null;
            return;
        }
        C0757i[] c0757iArr = (C0757i[]) Array.newInstance(Class.forName(parcel.readString()), readInt);
        for (int i = 0; i < readInt; i++) {
            c0757iArr[i] = ParcelableProto.m21674a(parcel);
        }
        this.f24027a = c0757iArr;
    }

    public static ParcelableProtoArray m21675a(C0757i[] c0757iArr) {
        return new ParcelableProtoArray(c0757iArr);
    }

    public static C0757i[] m21676a(Intent intent, String str) {
        ParcelableProtoArray parcelableProtoArray = (ParcelableProtoArray) intent.getParcelableExtra(str);
        if (parcelableProtoArray != null) {
            return parcelableProtoArray.f24027a;
        }
        return null;
    }

    public static C0757i[] m21677a(Bundle bundle, String str) {
        ParcelableProtoArray parcelableProtoArray = (ParcelableProtoArray) bundle.getParcelable(str);
        if (parcelableProtoArray != null) {
            return parcelableProtoArray.f24027a;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f24027a == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(this.f24027a.length);
        parcel.writeString(this.f24027a.getClass().getComponentType().getName());
        for (C0757i a : this.f24027a) {
            parcel.writeParcelable(ParcelableProto.m21671a(a), i);
        }
    }
}
