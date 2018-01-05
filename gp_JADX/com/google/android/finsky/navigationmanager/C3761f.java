package com.google.android.finsky.navigationmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

final class C3761f implements Creator {
    C3761f() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NavigationState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = true;
        NavigationState navigationState = new NavigationState(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        navigationState.f18908e = parcel.readByte() > (byte) 0;
        if (parcel.readByte() <= (byte) 0) {
            z = false;
        }
        navigationState.f18909f = z;
        navigationState.f18911h = parcel.readInt();
        Object readString = parcel.readString();
        if (TextUtils.isEmpty(readString)) {
            parcel.readString();
        } else {
            navigationState.f18910g = new C3762g(parcel.readString(), readString);
        }
        return navigationState;
    }
}
