package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WebViewPageLoadEvent implements Parcelable {
    public static final Creator CREATOR = new C6507o();
    public String f32535a;
    public boolean f32536b;
    public long f32537c;
    public int f32538d;
    public String f32539e = "";
    public int f32540f;
    public int f32541g;
    public int f32542h;
    public float f32543i;
    public float f32544j;

    WebViewPageLoadEvent(Parcel parcel) {
        this.f32535a = parcel.readString();
        this.f32536b = parcel.readInt() != 0;
        this.f32537c = parcel.readLong();
        this.f32538d = parcel.readInt();
        this.f32539e = parcel.readString();
        this.f32540f = parcel.readInt();
        this.f32541g = parcel.readInt();
        this.f32542h = parcel.readInt();
        this.f32543i = parcel.readFloat();
        this.f32544j = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32535a);
        parcel.writeInt(this.f32536b ? 1 : 0);
        parcel.writeLong(this.f32537c);
        parcel.writeInt(this.f32538d);
        parcel.writeString(this.f32539e);
        parcel.writeInt(this.f32540f);
        parcel.writeInt(this.f32541g);
        parcel.writeInt(this.f32542h);
        parcel.writeFloat(this.f32543i);
        parcel.writeFloat(this.f32544j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("url: ").append(this.f32535a).append("\nisTopLevelUrl: ").append(this.f32536b).append("\nstartTimestampMs: ").append(this.f32537c).append("\nerrorCode: ").append(this.f32538d).append("\nerrorDescription: ").append(this.f32539e).append("\norientation: ").append(this.f32540f).append("\nscreenWidthPx: ").append(this.f32541g).append("\nscreenHeightPx: ").append(this.f32542h).append("\nscreenXDpi: ").append(this.f32543i).append("\nscreenYDpi: ").append(this.f32544j);
        return stringBuilder.toString();
    }
}
