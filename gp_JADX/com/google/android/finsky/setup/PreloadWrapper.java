package com.google.android.finsky.setup;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.ee;

public class PreloadWrapper implements Parcelable {
    public static final Creator CREATOR = new ae();
    public final ee f20562a;
    public final Document f20563b;

    public PreloadWrapper(ee eeVar) {
        this.f20562a = eeVar;
        this.f20563b = new Document(this.f20562a.n);
    }

    PreloadWrapper(Parcel parcel) {
        this.f20562a = (ee) ParcelableProto.m21674a(parcel);
        this.f20563b = (Document) parcel.readParcelable(Document.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableProto.m21671a(this.f20562a), i);
        parcel.writeParcelable(this.f20563b, i);
    }
}
