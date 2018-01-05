package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class av implements Creator {
    av() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FragmentState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }
}
