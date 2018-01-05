package com.google.android.finsky.instantappscompatibility;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class InstantAppInfo implements Parcelable {
    public static final Creator CREATOR = new C3599a();
    public final ApplicationInfo f17909a;
    public final String f17910b;
    public final CharSequence f17911c;
    public final String[] f17912d;
    public final String[] f17913e;

    InstantAppInfo(Parcel parcel) {
        this.f17910b = parcel.readString();
        this.f17911c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f17912d = parcel.createStringArray();
        this.f17913e = parcel.createStringArray();
        this.f17909a = (ApplicationInfo) parcel.readParcelable(null);
    }

    public final String m17188a() {
        if (this.f17909a != null) {
            return this.f17909a.packageName;
        }
        return this.f17910b;
    }

    public final CharSequence m17187a(C3600b c3600b) {
        if (this.f17909a != null) {
            return this.f17909a.loadLabel(c3600b.f17918e);
        }
        return this.f17911c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17910b);
        TextUtils.writeToParcel(this.f17911c, parcel, i);
        parcel.writeStringArray(this.f17912d);
        parcel.writeStringArray(this.f17913e);
        parcel.writeParcelable(this.f17909a, i);
    }
}
