package com.google.android.libraries.play.entertainment.story.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class StateSaver implements Parcelable {
    public static final Creator CREATOR = new bf();
    public final int f30523a;
    public Parcelable f30524b;

    public StateSaver(int i) {
        this.f30523a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30523a);
        parcel.writeParcelable(this.f30524b, 0);
    }
}
