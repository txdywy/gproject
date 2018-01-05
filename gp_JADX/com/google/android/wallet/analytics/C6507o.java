package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C6507o implements Creator {
    C6507o() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebViewPageLoadEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new WebViewPageLoadEvent(parcel);
    }
}
