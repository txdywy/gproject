package com.google.android.finsky.instantappsquickinstall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.dfemodel.Document;

class QuickInstallState implements Parcelable {
    public static final Creator CREATOR = new C3616p();
    public final Document f17927a;
    public final ValidatedQuickInstallRequest f17928b;
    public final int f17929c;

    QuickInstallState(int i, ValidatedQuickInstallRequest validatedQuickInstallRequest, Document document) {
        this.f17929c = i;
        this.f17928b = validatedQuickInstallRequest;
        this.f17927a = document;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f17929c);
        parcel.writeParcelable(this.f17928b, i);
        parcel.writeParcelable(this.f17927a, i);
    }
}
