package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class au implements Creator {
    au() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }
}
