package com.google.android.finsky.instantappsquickinstall;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.dfemodel.Document;

final class C3616p implements Creator {
    C3616p() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QuickInstallState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new QuickInstallState(parcel.readInt(), (ValidatedQuickInstallRequest) parcel.readParcelable(ValidatedQuickInstallRequest.class.getClassLoader()), (Document) parcel.readParcelable(Document.class.getClassLoader()));
    }
}
