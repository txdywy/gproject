package com.google.android.wallet.common.pub;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UiConfig implements Parcelable {
    public static final Creator CREATOR = new C6587h();
    public final int f32712a;
    public final int f32713b;

    UiConfig(int i, int i2) {
        this.f32712a = i;
        this.f32713b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32712a);
        parcel.writeInt(this.f32713b);
    }

    public int describeContents() {
        return 0;
    }
}
