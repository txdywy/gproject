package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ap implements Creator {
    ap() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }
}
