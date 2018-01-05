package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C0247l implements Creator {
    C0247l() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BackStackState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }
}
