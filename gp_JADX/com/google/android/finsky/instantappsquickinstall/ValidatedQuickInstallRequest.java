package com.google.android.finsky.instantappsquickinstall;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ValidatedQuickInstallRequest implements Parcelable {
    public static final Creator CREATOR = new C3618r();
    public final String f17930a;
    public final Intent f17931b;

    public ValidatedQuickInstallRequest(String str, Intent intent) {
        this.f17930a = str;
        this.f17931b = intent;
    }

    public String toString() {
        return String.format("ValidatedQuickInstallRequest{requestedPackage='%s', postInstallIntent='%s'}", new Object[]{this.f17930a, this.f17931b});
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17930a);
        parcel.writeParcelable(this.f17931b, i);
    }
}
